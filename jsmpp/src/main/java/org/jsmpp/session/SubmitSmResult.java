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
package org.jsmpp.session;

import static org.jsmpp.bean.OptionalParameters.EMPTY_OPTIONAL_PARAMETERS;

import org.jsmpp.bean.OptionalParameter;
import org.jsmpp.util.MessageId;

/**
 * @author pmoerenhout
 */
public class SubmitSmResult {

    private final String messageId;
    private final OptionalParameter[] optionalParameters;

    SubmitSmResult(String messageId) {
        this.messageId = messageId;
        this.optionalParameters = EMPTY_OPTIONAL_PARAMETERS;
    }

    SubmitSmResult(String messageId, OptionalParameter[] optionalParameters) {
        this.messageId = messageId;
        this.optionalParameters = optionalParameters;
    }

    public SubmitSmResult(MessageId messageId, OptionalParameter[] optionalParameters) {
        this(messageId.getValue(), optionalParameters);
    }

    public String getMessageId() {
        return messageId;
    }

    public OptionalParameter[] getOptionalParameters() {
        return optionalParameters;
    }
}
