#!/usr/bin/env bash

#REM set the class path,
#REM assumes the build was executed with maven copy-dependencies
export BASE_CP=base.app.sharedBoards.console/target/base.app.sharedBoards.console-1.4.0-SNAPSHOT.jar:base.app.sharedBoards.console/target/dependency/*;

#REM call the java VM, e.g,
java -cp $BASE_CP eapli.base.app.sharedBoards.console.sharedBoardApp