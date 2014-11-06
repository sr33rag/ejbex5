package foo.ejb;

import javax.ejb.Stateless;

@Stateless
public class FooBean implements FooRemote {

  public String echo(String s) {
     return s;
  }

}
