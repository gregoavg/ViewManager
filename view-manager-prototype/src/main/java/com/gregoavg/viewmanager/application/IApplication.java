/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gregoavg.viewmanager.application;

import com.gregoavg.viewmanager.ILaunchable;
import com.gregoavg.viewmanager.event.ICallback;
import com.gregoavg.viewmanager.window.manager.IWindowManager;

/**
 *
 * @author Grego
 */
public interface IApplication extends ILaunchable {
    
    void onStart(final ICallback<IWindowManager> action);
    
}
