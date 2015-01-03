

public class WasRunTest {
	public void testRunning() throws Exception {
		WasRun test = new WasRun("testMethod");
		assert test.wasRun; 
		test.run();
		assert test.wasRun;
	}
	
	public static void main(String args[]) throws Exception{	
		new WasRunTest().testRunning();
	}
}
	