/*
 * Copyright 2013 Goldman Sachs.
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

package com.gs.collections.impl.block.procedure.checked.primitive;

import com.gs.collections.impl.test.Verify;
import org.junit.Test;

public class CheckedCharObjectProcedureTest
{
    private static final CheckedCharObjectProcedure<?> CHECKED_CHAR_OBJECT_PROCEDURE = new CheckedCharObjectProcedure<Object>()
    {
        private static final long serialVersionUID = 1L;

        @Override
        public void safeValue(char value, Object object) throws Exception
        {
        }
    };

    @Test
    public void serializedForm()
    {
        Verify.assertSerializedForm(
                1L,
                "rO0ABXNyAFpjb20uZ3MuY29sbGVjdGlvbnMuaW1wbC5ibG9jay5wcm9jZWR1cmUuY2hlY2tlZC5w\n"
                        + "cmltaXRpdmUuQ2hlY2tlZENoYXJPYmplY3RQcm9jZWR1cmVUZXN0JDEAAAAAAAAAAQIAAHhyAFRj\n"
                        + "b20uZ3MuY29sbGVjdGlvbnMuaW1wbC5ibG9jay5wcm9jZWR1cmUuY2hlY2tlZC5wcmltaXRpdmUu\n"
                        + "Q2hlY2tlZENoYXJPYmplY3RQcm9jZWR1cmUAAAAAAAAAAQIAAHhw",
                CHECKED_CHAR_OBJECT_PROCEDURE);
    }
}
