

public class TestCaseTest {
	WasRun test;
	public void setUp() throws Exception {
		test = new WasRun("testMethod");
	}
	
	public void testTemplateMethod() throws Exception{
		WasRun test = new WasRun("testMethod");
		test.run();
		assert test.log.equals("setUp testMethod tearDown ");
	}
	
	public static void main(String args[]) throws Exception{	
		new TestCaseTest().setUp();
		new TestCaseTest().testTemplateMethod();
	}
}
	