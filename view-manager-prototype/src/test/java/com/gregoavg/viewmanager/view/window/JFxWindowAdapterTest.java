/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gregoavg.viewmanager.view.window;

import com.gregoavg.viewmanager.JavaFXJUnit4ClassRunner;
import com.gregoavg.viewmanager.mvc.IView;
import com.gregoavg.viewmanager.view.SimpleFxView;
import com.gregoavg.viewmanager.window.IWindow;
import com.gregoavg.viewmanager.window.JFxWindowAdapter;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author Grigorios
 */
@RunWith(JavaFXJUnit4ClassRunner.class)
public class JFxWindowAdapterTest extends TestCase {
    
    private final IWindow window;
    
    public JFxWindowAdapterTest() {
        window = JFxWindowAdapter.INSTANCE;
    }

    /**
     * Test of setDisplay method, of class JFxWindowManager.
     */
    @Test
    public void testSetDisplay() {
        System.out.println("setContent");
        IView view = new SimpleFxView();
        JFxWindowAdapter aWindow = (JFxWindowAdapter) window;
        aWindow.setDisplay(view);
        assertNotNull(aWindow.getDisplay());
    }

    /**
     * Test of getDisplay method, of class JFxWindowManager.
     */
    @Test
    public void testGetDisplay() {
        System.out.println("getDisplay");
        IView view = new SimpleFxView();
        JFxWindowAdapter.INSTANCE.setDisplay(view);
        
        JFxWindowAdapter instance = (JFxWindowAdapter) window;
        IView windowedView = instance.getDisplay();
        assertEquals(view, windowedView);
    }

    /**
     * Test of setVisibility method, of class JFxWindowManager.
     */
    @Test
    public void testSetVisibility() {
        System.out.println("setVisibility");
        IWindow instance = window;
        instance.setVisibility(false);
        assertFalse(JFxWindowAdapter.INSTANCE.isVisible());
    }

    /**
     * Test of setWindowTitle method, of class JFxWindowManager.
     */
    @Test
    public void testSetWindowTitle() {
        System.out.println("setWindowTitle");
        String title = "Fancy Title";
        window.setTitle(title);
        String windowTitle = JFxWindowAdapter.INSTANCE.getTitle();
        assertEquals(title, windowTitle);
    }
    
}
