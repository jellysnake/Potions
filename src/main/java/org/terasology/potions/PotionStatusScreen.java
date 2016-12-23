/*
 * Copyright 2016 MovingBlocks
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
package org.terasology.potions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.terasology.entitySystem.event.ReceiveEvent;
import org.terasology.entitySystem.systems.RegisterMode;
import org.terasology.entitySystem.systems.RegisterSystem;
import org.terasology.input.BindButtonEvent;
import org.terasology.input.binds.inventory.InventoryButton;
import org.terasology.rendering.nui.CoreScreenLayer;

@RegisterSystem(RegisterMode.CLIENT)
public class PotionStatusScreen extends CoreScreenLayer {
    private static final Logger logger = LoggerFactory.getLogger(PotionStatusScreen.class);

    @Override
    public void initialise() {
        logger.info("Potions init");
    }

    @Override
    @ReceiveEvent(priority = 101)
    public void onBindEvent(BindButtonEvent event) {
        if (event instanceof InventoryButton && event.isDown()) {
            logger.info("Potions Close");
            getManager().closeScreen(this);
        }
    }
}