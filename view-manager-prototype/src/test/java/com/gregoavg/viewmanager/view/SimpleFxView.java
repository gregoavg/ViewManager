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
package com.gregoavg.viewmanager.view;

import com.gregoavg.viewmanager.mvc.JFxView;
import java.util.Map;

/**
 * Simple <code>JFxView</code> implementation for test purposes.
 * 
 * @author Grigorios
 */
public class SimpleFxView extends JFxView {

    public SimpleFxView() {
        super("/fxml/testView.fxml");
    }

    @Override
    protected void initComponets(Map<String, Object> componentMapper) {
        //
    }

    @Override
    public void update() {
        //
    }

}
