package automation.testsuite;

import org.testng.annotations.*;

public class Login {

@BeforeMethod
 public void init ()
 {
	System.out.print(" beforeMethod");
 }
@Test
public void testcase1()
{
	System.out.print(" testcase1");
}
}
