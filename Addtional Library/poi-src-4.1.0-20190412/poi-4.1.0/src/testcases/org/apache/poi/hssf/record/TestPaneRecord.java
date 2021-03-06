/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

package org.apache.poi.hssf.record;


import junit.framework.TestCase;

/**
 * Tests the serialization and deserialization of the PaneRecord
 * class works correctly.  Test data taken directly from a real
 * Excel file.
 *
 * @author Glen Stampoultzis (glens at apache.org)
 */
public final class TestPaneRecord extends TestCase {
    byte[] data = new byte[] {
        (byte)0x01, (byte)0x00,
        (byte)0x02, (byte)0x00,
        (byte)0x03, (byte)0x00,
        (byte)0x04, (byte)0x00,
        (byte)0x02, (byte)0x00,
    };

    public void testLoad() {
        PaneRecord record = new PaneRecord(TestcaseRecordInputStream.create(0x41, data));

        assertEquals( (short)1, record.getX());
        assertEquals( (short)2, record.getY());
        assertEquals( (short)3, record.getTopRow());
        assertEquals( (short)4, record.getLeftColumn());
        assertEquals( PaneRecord.ACTIVE_PANE_LOWER_LEFT, record.getActivePane());

        assertEquals( 14, record.getRecordSize() );
    }

    public void testStore()
    {
        PaneRecord record = new PaneRecord();

        record.setX( (short) 1);
        record.setY( (short) 2);
        record.setTopRow( (short) 3);
        record.setLeftColumn( (short) 4);
        record.setActivePane( PaneRecord.ACTIVE_PANE_LOWER_LEFT);

        byte [] recordBytes = record.serialize();
        assertEquals(recordBytes.length - 4, data.length);
        for (int i = 0; i < data.length; i++)
            assertEquals("At offset " + i, data[i], recordBytes[i+4]);
    }
}
