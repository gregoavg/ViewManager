/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grego.viewmanager.application;

import com.grego.viewmanager.ILaunchable;
import com.grego.viewmanager.event.ICallback;
import com.grego.viewmanager.window.IWindowManager;

/**
 *
 * @author Grego
 */
public interface IApplication extends ILaunchable {
    
    void onStart(ICallback<IWindowManager> callback);
    
}
