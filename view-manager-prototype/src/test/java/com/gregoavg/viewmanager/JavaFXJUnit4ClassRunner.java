/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gregoavg.viewmanager;

import java.util.concurrent.CountDownLatch;
import javafx.application.Platform;
import org.junit.runner.Description;
import org.junit.runner.notification.RunNotifier;
import org.slf4j.LoggerFactory;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

/**
 *
 * @author Grigorios
 */
public class JavaFXJUnit4ClassRunner extends BlockJUnit4ClassRunner {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(JavaFXJUnit4ClassRunner.class);

    public JavaFXJUnit4ClassRunner(Class<?> klass) throws InitializationError {
        super(klass);
        initJavaFxThread();
    }

    private void initJavaFxThread() {
        JavaFxTestApplication testApp = new JavaFxTestApplication();
        testApp.invokeLauncher(new String[0]);
    }

    @Override
    protected void runChild(FrameworkMethod method, RunNotifier notifier) {
        // Create a latch which is removed after the super runChild() method completion
        final CountDownLatch latch = new CountDownLatch(1);
        Platform.runLater(() -> {
            super.runChild(method, notifier);
            latch.countDown();
        });
        
        try {
            latch.await();
        } catch (InterruptedException ex) {
            LOGGER.warn(ex.getMessage());
        }
    }

}
