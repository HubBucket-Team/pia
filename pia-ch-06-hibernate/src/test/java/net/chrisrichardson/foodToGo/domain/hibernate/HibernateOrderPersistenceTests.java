/*
 * Copyright (c) 2005 Chris Richardson
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
 
package net.chrisrichardson.foodToGo.domain.hibernate;

import net.chrisrichardson.foodToGo.domain.*;
import net.chrisrichardson.ormunit.hibernate.*;

public class HibernateOrderPersistenceTests extends HibernatePersistenceTests {

    
    @Override
    protected String[] getConfigLocations() {
        return HibernateTestConstants.HIBERNATE_DOMAIN_CONTEXT;

     }

    public void test() {
        Restaurant r = RestaurantMother.makeRestaurant();
        Order o = OrderMother.makeOrder(r);
        
        save(r);
        save(o);
    }
}
