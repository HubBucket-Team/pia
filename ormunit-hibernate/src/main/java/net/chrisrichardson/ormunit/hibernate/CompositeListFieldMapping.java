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
 


package net.chrisrichardson.ormunit.hibernate;

import junit.framework.*;

import org.hibernate.mapping.*;


public class CompositeListFieldMapping extends ComponentCollectionFieldMapping {

    private final org.hibernate.mapping.List value;

    public CompositeListFieldMapping(Property property, org.hibernate.mapping.List value) {
        super(property, value);
        this.value = value;
    }

    public void assertForeignKey(String foreignKeyColumnName) {
        KeyValue keyValue = value.getKey();
        HibernateAssertUtil.assertColumn(foreignKeyColumnName, keyValue);
    }

    public void assertIndexColumn(String indexColumnName) {
        Value indexValue = value.getIndex();
        HibernateAssertUtil.assertColumn(indexColumnName, indexValue);
    }

    public void assertTable(String tableName) {
        Assert.assertEquals(tableName, value.getElement().getTable().getName());
    }
}
