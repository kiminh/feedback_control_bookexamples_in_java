/**
 * Copyright 2015 Peti Koch, All rights reserved.
 *
 * Project Info:
 * https://github.com/Petikoch/feedback_control_bookexamples_in_java
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.petikoch.examples.feedbackControlInJava.util;

import net.jcip.annotations.ThreadSafe;

import java.util.concurrent.ThreadLocalRandom;

@ThreadSafe
public class RandomNumberUtils {

    // http://stackoverflow.com/questions/10881998/equivalent-method-in-java-numpy-random-normalmean-var
    public static double randomGaussian(double mean, double variance) {
        return mean + (ThreadLocalRandom.current().nextGaussian() * variance);
    }
}
