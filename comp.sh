rm -rv build/ test.jar
cp -rv src build
rm -rv build/*.java
javac -d build/ src/*.java
cd build
jar -cvfe ../test.jar Main *
cd ..
java -jar test.jar
