/*
 * Copyright 2010 Red Hat, Inc. and/or its affiliates.
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

package org.drools.eclipse.core;

/**
 * This represents an import. 
 */
public class Import extends DroolsElement {

    private final String importClass;

    Import(Package parent, String importClass) {
        super(parent);
        this.importClass = importClass;
    }
    
    public Package getParentPackage() {
        return (Package) getParent();
    }

    public String getImportClass() {
        return importClass;
    }

    public int getType() {
        return IMPORT;
    }

    public DroolsElement[] getChildren() {
        return NO_ELEMENTS;
    }

    public String toString() {
        return importClass;
    }

}
