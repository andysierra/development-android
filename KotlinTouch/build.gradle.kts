buildscript {
    val agp_version by extra("8.0.0-rc01")
    val agp_version1 by extra("7.4.2")
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.4.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
}