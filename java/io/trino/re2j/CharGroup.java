// GENERATED BY make_perl_groups.pl; DO NOT EDIT.
// make_perl_groups.pl >perl_groups.go

package io.trino.re2j;

import java.util.HashMap;

class CharGroup {

  final int sign;
  final int[] cls;

  private CharGroup(int sign, int[] cls) {
    this.sign = sign;
    this.cls = cls;
  }

  private static final int[] code1 = {  /* \d */
	0x30, 0x39,
  };

  private static final int[] code2 = {  /* \s */
	0x9, 0xa,
	0xc, 0xd,
	0x20, 0x20,
  };

  private static final int[] code3 = {  /* \w */
	0x30, 0x39,
	0x41, 0x5a,
	0x5f, 0x5f,
	0x61, 0x7a,
  };

  static final HashMap<String, CharGroup> PERL_GROUPS =
    new HashMap<String, CharGroup>();

  static {
    PERL_GROUPS.put("\\d",  	new CharGroup(+1, code1));
    PERL_GROUPS.put("\\D",  	new CharGroup(-1, code1));
    PERL_GROUPS.put("\\s",  	new CharGroup(+1, code2));
    PERL_GROUPS.put("\\S",  	new CharGroup(-1, code2));
    PERL_GROUPS.put("\\w",  	new CharGroup(+1, code3));
    PERL_GROUPS.put("\\W",  	new CharGroup(-1, code3));
  }
  private static final int[] code4 = {  /* [:alnum:] */
	0x30, 0x39,
	0x41, 0x5a,
	0x61, 0x7a,
  };

  private static final int[] code5 = {  /* [:alpha:] */
	0x41, 0x5a,
	0x61, 0x7a,
  };

  private static final int[] code6 = {  /* [:ascii:] */
	0x0, 0x7f,
  };

  private static final int[] code7 = {  /* [:blank:] */
	0x9, 0x9,
	0x20, 0x20,
  };

  private static final int[] code8 = {  /* [:cntrl:] */
	0x0, 0x1f,
	0x7f, 0x7f,
  };

  private static final int[] code9 = {  /* [:digit:] */
	0x30, 0x39,
  };

  private static final int[] code10 = {  /* [:graph:] */
	0x21, 0x7e,
  };

  private static final int[] code11 = {  /* [:lower:] */
	0x61, 0x7a,
  };

  private static final int[] code12 = {  /* [:print:] */
	0x20, 0x7e,
  };

  private static final int[] code13 = {  /* [:punct:] */
	0x21, 0x2f,
	0x3a, 0x40,
	0x5b, 0x60,
	0x7b, 0x7e,
  };

  private static final int[] code14 = {  /* [:space:] */
	0x9, 0xd,
	0x20, 0x20,
  };

  private static final int[] code15 = {  /* [:upper:] */
	0x41, 0x5a,
  };

  private static final int[] code16 = {  /* [:word:] */
	0x30, 0x39,
	0x41, 0x5a,
	0x5f, 0x5f,
	0x61, 0x7a,
  };

  private static final int[] code17 = {  /* [:xdigit:] */
	0x30, 0x39,
	0x41, 0x46,
	0x61, 0x66,
  };

  static final HashMap<String, CharGroup> POSIX_GROUPS =
    new HashMap<String, CharGroup>();

  static {
    POSIX_GROUPS.put("[:alnum:]",  	new CharGroup(+1, code4));
    POSIX_GROUPS.put("[:^alnum:]",  	new CharGroup(-1, code4));
    POSIX_GROUPS.put("[:alpha:]",  	new CharGroup(+1, code5));
    POSIX_GROUPS.put("[:^alpha:]",  	new CharGroup(-1, code5));
    POSIX_GROUPS.put("[:ascii:]",  	new CharGroup(+1, code6));
    POSIX_GROUPS.put("[:^ascii:]",  	new CharGroup(-1, code6));
    POSIX_GROUPS.put("[:blank:]",  	new CharGroup(+1, code7));
    POSIX_GROUPS.put("[:^blank:]",  	new CharGroup(-1, code7));
    POSIX_GROUPS.put("[:cntrl:]",  	new CharGroup(+1, code8));
    POSIX_GROUPS.put("[:^cntrl:]",  	new CharGroup(-1, code8));
    POSIX_GROUPS.put("[:digit:]",  	new CharGroup(+1, code9));
    POSIX_GROUPS.put("[:^digit:]",  	new CharGroup(-1, code9));
    POSIX_GROUPS.put("[:graph:]",  	new CharGroup(+1, code10));
    POSIX_GROUPS.put("[:^graph:]",  	new CharGroup(-1, code10));
    POSIX_GROUPS.put("[:lower:]",  	new CharGroup(+1, code11));
    POSIX_GROUPS.put("[:^lower:]",  	new CharGroup(-1, code11));
    POSIX_GROUPS.put("[:print:]",  	new CharGroup(+1, code12));
    POSIX_GROUPS.put("[:^print:]",  	new CharGroup(-1, code12));
    POSIX_GROUPS.put("[:punct:]",  	new CharGroup(+1, code13));
    POSIX_GROUPS.put("[:^punct:]",  	new CharGroup(-1, code13));
    POSIX_GROUPS.put("[:space:]",  	new CharGroup(+1, code14));
    POSIX_GROUPS.put("[:^space:]",  	new CharGroup(-1, code14));
    POSIX_GROUPS.put("[:upper:]",  	new CharGroup(+1, code15));
    POSIX_GROUPS.put("[:^upper:]",  	new CharGroup(-1, code15));
    POSIX_GROUPS.put("[:word:]",  	new CharGroup(+1, code16));
    POSIX_GROUPS.put("[:^word:]",  	new CharGroup(-1, code16));
    POSIX_GROUPS.put("[:xdigit:]",  	new CharGroup(+1, code17));
    POSIX_GROUPS.put("[:^xdigit:]",  	new CharGroup(-1, code17));
  }

}
