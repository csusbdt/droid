# Notes on android development

## Overview

These are my notes on developing android applications using
command line tools. I develop a basic android application to
test push notifcations. Then I build an Adobe AIR ANE to
support push notifications.

## Install Android SDK

After downloading and installing Android SDK, I added the following to _bash_profile_.

````
export DROID_SDK_HOME=$HOME/apps/android-sdk-macosx
export PATH=$PATH:$DROID_SDK_HOME/tools
export PATH=$PATH:$DROID_SDK_HOME/platform-tools
````

Enable USB debugging on an Android device to be used for testing;
otherwise, you need to use the emulator.

## Notes

Look at the installed Android targets.

    android list targets

The script _create-proj.sh_ creates projects called _main_ and _lib_.
The lib project builds a library that is used by the main project.

Run the project creation script.

    ./create-proj.sh

Add the following to the root element of _AndroidManifest.xml_
and adjust to match your project requirements.
Do this for each of the 2 projects.

    <uses-sdk android:minSdkVersion="8" android:targetSdkVersion="17" />

Change the app name in the following file.

    main/res/values/strings.xml

Create a test class in the library project and call
into it from the MainActivity in the main project.

Build the app.

    cd main
    ant debug

Connect the device by USB cable and test the app.

    adb install bin/main-debug.apk

Add the following to _.gitignore_.

````
main/local.properties
lib/local.properties
main/bin
lib/bin
````



## Other things

For information about building ANE for android:

    http://www.adobe.com/devnet/air/articles/building-ane-ios-android-pt4.html


