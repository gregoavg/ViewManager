package com.gregoavg.viewmanager.window.manager;

import com.gregoavg.viewmanager.window.IWindow;

/**
 *
 * @author Grigorios
 */
public interface IWindowManager {


    IWindow getWindow();

    void changeWindowSize(int width, int height);

    void exit();

}
