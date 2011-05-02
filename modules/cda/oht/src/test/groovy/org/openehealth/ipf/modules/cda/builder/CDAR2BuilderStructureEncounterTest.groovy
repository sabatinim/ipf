/*
 * Copyright 2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openehealth.ipf.modules.cda.builder

import org.junit.Test
import org.junit.Assert
/**
 * @author Stefan Ivanov
 */
public class CDAR2BuilderStructureEncounterTest extends AbstractCDAR2BuilderTest {
	
	/**
	 * Test encounter defaults
	 */
	@Test
	public void testEncounterDefaultValues() {
		def entry = builder.build {
			entry { encounter() }
		}
		
		Assert.assertFalse entry.encounter.isSetMoodCode()
		Assert.assertEquals 'INT', entry.encounter.moodCode.name
		Assert.assertEquals 'ENC', entry.encounter.classCode.name
		Assert.assertEquals 0, entry.encounter.entryRelationship.size
	}
	
	/**
	 * Test simple Encounter
	 */
	@Test
	public void testSimpleEncounter() {
	    def entry = builder.build(getClass().getResource('/builders/content/entry/EncounterExample1.groovy'))
		Assert.assertNotNull entry.encounter
	}
}