/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gregoavg.viewmanager.utils;

import java.io.InputStream;

/**
 *
 * @author Grego
 */
public final class FileUtils {
    
    public static InputStream getFileAsResourceStream(String filePath) {
        return FileUtils.class.getResourceAsStream(filePath);
    }
    
}
