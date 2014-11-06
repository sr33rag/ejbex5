package foo.ejb;

import javax.ejb.Remote;

@Remote
public interface FooRemote {
  public String echo(String s);
}
