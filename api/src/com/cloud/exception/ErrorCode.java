// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
package com.cloud.exception;

import java.util.HashSet;

/**
 */
public class ErrorCode {
    String code;
    private static HashSet<ErrorCode> s_codes = new HashSet<ErrorCode>();

    public ErrorCode(String code) {
        this.code = code;
        assert !s_codes.contains(this) : "There is already an error code registered for this code: " + code;
        s_codes.add(this);
    }

    public String getCode() {
        return code;
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }

    @Override
    public boolean equals(Object that) {
        if (!(that instanceof ErrorCode)) {
            return false;
        }

        return this.code.equals(((ErrorCode)that).code);
    }

    public final static ErrorCode UnableToReachResource = new ErrorCode("resource.unavailable");
}
