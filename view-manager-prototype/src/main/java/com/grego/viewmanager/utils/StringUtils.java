/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grego.viewmanager.utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 *
 * @author Grigorios
 */
public final class StringUtils {

    public static String keepLastWord(String text) {
        String[] textArray = text.trim().split(" ");
        return CollectionUtils.getLastElement(Arrays.asList(textArray));
    }

    public static Collection<String> removeNodes(String[] stringArray, String sampleNode) {
        return Arrays.stream(stringArray)
                .filter((node) -> node != null && !node.isEmpty())
                .filter((node) -> !node.equals(sampleNode))
                .collect(Collectors.toList());
    }

    public static Collection<String> textToLineCollection(String text, String lineSeperator) {
        String[] lineArray = text.split(lineSeperator);
        Collection<String> lineCollection = Arrays.asList(lineArray);
        return lineCollection;
    }

    public static int getMaxLineWordCount(Collection<String> dataRows, String splitter) {
        int maxWordCount = 0;
        for (String line : dataRows)
        {
            String[] lineWords = line.split(splitter);
            if (lineWords.length > maxWordCount)
            {
                maxWordCount = lineWords.length;
            }
        }
        return maxWordCount;
    }
}
