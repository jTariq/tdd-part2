import java.lang.reflect.Method;


public class TestCase {
	private String methodName;
	private TestResult result;

	public TestCase(String methodName){
		this.methodName = methodName;
	}
	
	public void setUp(){
	}
	
	public TestResult run() throws Exception{
		result = new TestResult();
		result.testStarted();
		this.setUp();
		try {
			Method method = this.getClass().getMethod(this.methodName, null);
			method.invoke(this);
		} catch (Exception e) {
			result.testFailed();
		}
		this.tearDown();
		return result;
	}

	public void tearDown() {
	}
}
