rem To run this bat file, you need to be outside the bin and src file. if successful, class exe will be available in the bin folder. you are redirected to the initial loc.
cd src
javac com\strhandle\Formatstr.java -d ..\bin
cd ..\bin
cls
java com.strhandle.Formatstr
cd ..