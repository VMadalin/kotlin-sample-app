/*
 * Copyright 2019 vmadalin.com
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

import extensions.implementation
import dependencies.Dependencies
import extensions.kapt
import dependencies.AnnotationProcessorsDependencies

plugins {
    id("commons.android-library")
}

dependencies {
    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.LIFECYCLE_VIEWMODEL)
    implementation(Dependencies.LIFECYCLE_EXTENSIONS)
    implementation(Dependencies.FRAGMENT_KTX)
    implementation(Dependencies.CONSTRAIN_LAYOUT)
    implementation(Dependencies.RECYCLE_VIEW)
    implementation(Dependencies.NAVIGATION_UI)
    implementation(Dependencies.NAVIGATION_FRAGMENT)
    implementation(Dependencies.LOGGING)
    implementation(Dependencies.PAGING)
    implementation(Dependencies.COIL)

    kapt(AnnotationProcessorsDependencies.DATABINDING)
}
