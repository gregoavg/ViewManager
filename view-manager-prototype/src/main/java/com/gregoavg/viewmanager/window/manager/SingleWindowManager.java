package com.gregoavg.viewmanager.window.manager;

import com.gregoavg.viewmanager.window.IWindow;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 *
 * @author Grigorios
 */
public class SingleWindowManager implements IWindowManager {

    private final IWindow window;

    public SingleWindowManager(@NotNull IWindow window) {
        this.window = Objects.requireNonNull(window, "window can not be null!!");
    }

    @Override
    public IWindow getWindow() {
        return window;
    }

    @Override
    public void changeWindowSize(int width, int height) {
        window.setSize(width, height);
    }

    @Override
    public void exit() {
        window.dispose();
    }
}
