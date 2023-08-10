RE2/J fork for Trino
====================

This fork of [Google RE2/J](https://github.com/google/re2j) which is a port of
[Google RE2](https://github.com/google/re2) to pure Java.  The main difference
is that this fork contains a port of the RE2 DFA, which is not part of RE2/J.
Additionally, there are some performance improvements, and the code has been 
changed from Java `String` to `Slice`, which is a `byte[]` wrapper used by the
Trino project.

Please see the Google projects for more information about RE2.
