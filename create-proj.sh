# This script creates a library project and an
# android app that depends on it.

# Create the lib project.
android create lib-project \
        --target android-17 \
        --name lib \
        --path ./lib \
        --package app.lib

# Create the app project.
android create project \
        --target android-17 \
        --name main \
        --path ./main \
        --activity MainActivity \
        --package app.main

# Configure app to depend on lib.
android update project \
        --target android-17 \
        --path ./main \
        --library ../lib

