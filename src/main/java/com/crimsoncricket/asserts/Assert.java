/*
 * Copyright 2015 Martijn van der Woud - The Crimson Cricket Internet Services
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package com.crimsoncricket.asserts;

import java.util.Collection;

public class Assert {


    public static void assertStateNotNull(Object anObject, String message) {
        if (anObject == null)
            throw new IllegalStateException(message);
    }

    public static void assertArgumentNotNull(Object anArgument, String message) {
        if (anArgument == null)
            throw new IllegalArgumentException(message);
    }

    public static void assertStringArgumentNotEmpty(String anArgument, String message) {
        if (anArgument.isEmpty())
            throw new IllegalArgumentException(message);
    }

    public static void assertArgumentCollectionNotContainsNull(Collection<?> anArgument, String message) {
        if (anArgument.stream().anyMatch(element -> element == null))
            throw new IllegalArgumentException(message);

    }



}
