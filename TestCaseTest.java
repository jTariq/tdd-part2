

public class TestCaseTest {
	WasRun test;
	private TestResult result;
	public void setUp() throws Exception {
		test = new WasRun("testMethod");
	}
	
	public void testTemplateMethod() throws Exception{
		test = new WasRun("testMethod");
		test.run();
		assert test.log.equals("setUp testMethod tearDown ");
	}
	
	public void testResult() throws Exception{
		test = new WasRun("testMethod");  
		result = test.run();
		assert "1 run, 0 failed" == result.summary();
	}
	
	public void testFailedResult() throws Exception{
		test = new WasRun("testMethod");  
		result = test.run();
		assert "1 run, 1 failed" == result.summary();
	}
	
	public void testFailedResultFormatting(){
		result = new TestResult();
		result.testStarted();
		result.testFailed();
		assert "1 run, 1 failed" == result.summary();
	}
	
	public static void main(String args[]) throws Exception{	
		new TestCaseTest().setUp();
		new TestCaseTest().testTemplateMethod();
		new TestCaseTest().testResult();
		new TestCaseTest().testFailedResult();
		new TestCaseTest().testFailedResultFormatting();
	}
}
	