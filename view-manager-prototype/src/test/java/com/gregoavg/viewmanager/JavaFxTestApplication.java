/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gregoavg.viewmanager;

import javafx.application.Application;
import javafx.stage.Stage;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Grigorios
 */
public class JavaFxTestApplication extends Application {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(JavaFxTestApplication.class);
    
    private static final CountDownLatch latch = new CountDownLatch(1);

    @Override
    public void start(Stage primaryStage) throws Exception {
        LOGGER.info("JavaFX Runtime initialized!!");
        latch.countDown();
    }

    public void initThread(String[] args) {
        // start the JavaFX application thread
        final ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> Application.launch(args));

        // wait until JavaFX thread initialization completions
        try {
            latch.await();
        } catch (InterruptedException ex) {
            LOGGER.error(ex.getLocalizedMessage());
        }
    }
}
