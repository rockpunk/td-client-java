//
// Java Client Library for Treasure Data Cloud
//
// Copyright (C) 2011 - 2013 Muga Nishizawa
//
//    Licensed under the Apache License, Version 2.0 (the "License");
//    you may not use this file except in compliance with the License.
//    You may obtain a copy of the License at
//
//        http://www.apache.org/licenses/LICENSE-2.0
//
//    Unless required by applicable law or agreed to in writing, software
//    distributed under the License is distributed on an "AS IS" BASIS,
//    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//    See the License for the specific language governing permissions and
//    limitations under the License.
//
package com.treasure_data.model;

import com.treasure_data.client.HttpClientException;

public class AuthenticationException extends HttpClientException {

    public AuthenticationException(String reason, String message) {
        this(reason, message, 401);
    }

    public AuthenticationException(String reason, String message, int code) {
        super(reason, message, code);
    }

    public AuthenticationException(String reason, String message, Throwable cause) {
        this(reason, message, 401, cause);
    }

    public AuthenticationException(String reason, String message, int code, Throwable cause) {
        super(reason, message, code, cause);
    }

}
