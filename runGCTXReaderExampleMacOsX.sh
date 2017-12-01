#!/bin/bash
echo "Running on 64 bit MacOsX"
export CLASSPATH="examples:src:lib/jhdf.jar:lib/jhdf5.jar:lib/jhdf5obj.jar:lib/jhdfobj.jar"
java -Djava.library.path=lib/native/macosx/64 -cp $CLASSPATH ReadGctxExample
