cp -rv src/ build/
rm -rv build/*.java
javac -d build/ src/*.java || jar -cvfe CompileUtils.jar Main build/*
