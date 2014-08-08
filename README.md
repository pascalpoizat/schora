# [SChorA]()

SChorA (Symbolic Choreography Analysis) is a framework for the symbolic analysis of choreographies.

It is forked from https://github.com/nhnghia/schora.

## Contributors

**Huu Nghia Nguyen**, Paris Sud University and LRI

- <http://twitter.com/huunghia>
- <http://github.com/nhnghia>

**Pascal Poizat**, Paris Ouest University and LIP6

- <http://twitter.com/pascalpoizat>
- <http://github.com/pascalpoizat>

## Dependencies

### Z3

Z3 is available at http://z3.codeplex.com/:
- download the night build for your platform (scroll down in the page)
- save it and uncompress it in some place, say `$Z3_HOME` 

<!--
- add `$Z3_HOME/bin/com.microsoft.z3.jar` in your classpath when you want to compile or run a Z3 related program
- add `$Z3_HOME/bin` to your dynamic library path (LD_LIBRARY_PATH on Linux, DYLD_LIBRARY_PATH on OSX)

To check all is ok you can try with the example file here: http://z3.codeplex.com/SourceControl/latest#examples/java/JavaExample.java
```
$ export DYLD_LIBRARY_PATH=$DYLD_LIBRARY_PATH:$Z3_HOME/bin
$ javac -cp $Z3_HOME/bin/com.microsoft.z3.jar JavaExample.java 
$ java -cp $Z3_HOME/bin/com.microsoft.z3.jar:. JavaExample
```
-->

### EMF

To have EMF library, install Eclipse (http://www.eclipse.org) and add the plugins directory to your classpath when you want to compile or run an EMF related program.

## License

SChorA code is released under the [GPL v2](LICENSE).
