/*
 * Copyright 2014 Grigorios.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gregoavg.viewmanager.window;

import com.gregoavg.viewmanager.mvc.IView;
import com.gregoavg.viewmanager.mvc.JFxView;
import javafx.geometry.Point2D;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Singleton instance implementation of <code>IWindow</code>
 * for the JavaFX framework. It works as window adapter by encapsulating
 * a JavaFX stage instance, that serves as parent for JavaFX view instances.
 *
 * @author Grigorios
 */
public enum JFxWindowAdapter implements IWindow {
    INSTANCE;

    private static final Logger LOGGER = LoggerFactory.getLogger(JFxWindowAdapter.class);

    // serves as root window for this Manager
    private final Stage stage = new Stage();
    
    private JFxView display = null;

    // default stage size
    private Point2D stageSize = new Point2D(800, 600);

    private JFxWindowAdapter() {
        stage.setWidth(stageSize.getX());
        stage.setHeight(stageSize.getY());
    }

    @Override
    public void setDisplay(IView view) {
        if (view instanceof JFxView) {
            display = (JFxView) view;
            stage.setScene(display.getScene());

            LOGGER.info("Display: " + view.toString() + " added to Window Manager");
        }
    }

    public IView getDisplay() {
        return display;
    }

    @Override
    public void setVisibility(boolean visible) {
        if (visible) {
            stage.show();
            LOGGER.info("Window is visible");
        } else {
            stage.hide();
            LOGGER.info("Window is invisible by user request");
        }
    }

    @Override
    public void setSize(int width, int height) {
        stageSize = new Point2D(width, height);
        stageSizeChanged();
    }

    @Override
    public void setTitle(String title) {
        stage.setTitle(title);
    }

    @Override
    public String getTitle() {
        return stage.getTitle();
    }

    @Override
    public void setIcon(@NotNull String path) {
        final String iconPath = Objects.requireNonNull(path, "Path to icon must not be null!");
        stage.getIcons().add(new Image(iconPath));
    }
    
    /**
     * Updates stage size after the <code>setSize</code> method call.
     */
    private void stageSizeChanged() {
        LOGGER.info("Window Manager's root window size, changed by user request");
        LOGGER.info("New Window size is set to: "
                +"Width: " + stageSize.getX()
                +" Height: " + stageSize.getY());
        stage.setWidth(stageSize.getX());
        stage.setHeight(stageSize.getY());
    }

    @Override
    public void dispose() {
        this.display.dispose();
        this.stage.close();
    }

    @Override
    public boolean isVisible() {
        return stage.isShowing();
    }
}
