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

package com.grego.viewmanager.utils;

/**
 * Enumerates the possible outcomes of a comparison
 * between instances. This enumeration works as helper
 * for {@link java.util.Comparator} results.
 *
 * @author Grigorios
 */
public enum  ECompareResult {
    Equal(0),
    NotEqual(-1);

    private final int result;
    
    private ECompareResult(int result) {
        this.result = result;
    }

    public int getIntegerValue() {
        return result;
    }
}
