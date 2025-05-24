# Applying a plugin in buildSrc build.gradle.kts and in convention plugins within buildSrc 

A small demo project on how to use included builds to create a plugin that can be applied to both the buildSrc's 
build.gradle.kts and to conventions plugins within the buildSrc.

## How do I apply the hello-plugin to the hello-plugin?
No idea, maybe publish a version 1.0.0 to some artifact repository, although at that point you may as well not 
use included builds and use the published version in the buildSrc.
