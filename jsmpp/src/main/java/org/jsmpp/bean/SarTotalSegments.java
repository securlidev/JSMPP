/*
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package org.jsmpp.bean;

import java.util.Objects;

import org.jsmpp.SMPPConstant;

/**
 * @author uudashr
 * 
 */
public class SarTotalSegments {
    private byte value;

    public SarTotalSegments(byte value) {
        this.value = value;
    }

    public SarTotalSegments(short value) {
        this((byte)value);
    }

    public short getTag() {
        return SMPPConstant.TAG_SAR_TOTAL_SEGMENTS;
    }

    public short getLength() {
        return 2;
    }

    public short getValue() {
        return value;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SarTotalSegments)) {
            return false;
        }
        final SarTotalSegments that = (SarTotalSegments) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}