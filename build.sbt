import android.Keys._

android.Plugin.androidBuild

name := "HelloWorld"

scalaVersion := "2.11.0"

scalacOptions in Compile += "-feature"

platformTarget in Android := "android-19"

run <<= run in Android

install <<= install in Android
