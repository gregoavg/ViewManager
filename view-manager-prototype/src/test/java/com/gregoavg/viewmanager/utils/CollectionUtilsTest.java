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

package com.gregoavg.viewmanager.utils;

import com.gregoavg.viewmanager.utils.CollectionUtils;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Grigorios
 */
public class CollectionUtilsTest extends TestCase {
    
    public CollectionUtilsTest(String testName) {
        super(testName);
    }

    /**
     * Test of getLastElement method, of class CollectionUtils.
     */
    @Test
    public void testGetLastElement() {
        System.out.println("getLastElement");
        String text = "first.other.another.last";
        String expResult = "last";
        String result = CollectionUtils.getLastElement(Arrays.asList(text.split("\\.")));
      
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetLastElementOfEmptyList() {
        System.out.println("getLastElement of empty list");
        List<String> emptyList = Collections.emptyList();
        String expResult = null;
        String result = CollectionUtils.getLastElement(emptyList);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetLastElementOfNullList() {
        System.out.println("getLastElement of null list");
        List<String> nullList = null;
        String expResult = null;
        String result = CollectionUtils.getLastElement(nullList);
        
        assertEquals(expResult, result);
    }
    
}
