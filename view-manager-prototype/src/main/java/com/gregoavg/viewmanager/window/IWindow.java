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
import javax.validation.constraints.NotNull;

/**
 * Represents a window that serves as parent placeholder for views
 * 
 * @author Grigorios
 */
public interface IWindow {
    
    /**
     * Sets a view as main display in the window
     * 
     * @param view - view that needs to be displayed
     * @see   IView
     * 
     */
    void setDisplay(IView view);
    
    /**
     * Changes window visibility
     * 
     * @param visible preference state 
     * 
     */
    void setVisibility(boolean visible);

    /**
     * Returns  window's the visibility status
     *
     * @return  true if visible,
     *          false instead
     *
     */
    boolean isVisible();
    
    /**
     * Changes default window size
     * 
     * @param width  desired window width
     * @param height desired window height
     * 
     */
    void setSize(int width, int height);

    /**
     * Sets display title for the window
     * 
     * @param title to be displayed
     * 
     */
    void setTitle(String title);

    /**
     * Returns the displayed title of this window
     *
     * @return title of window
     *
     */
    String getTitle();

    /**
     * Loads a custom image, from the given path,
     * as the main icon of this window.
     *
     * @param path the string representation of the image icon path
     *
     */
    void setIcon(@NotNull String path);

    /**
     * Disposes window and all it's contents
     *
     */
    void dispose();

}