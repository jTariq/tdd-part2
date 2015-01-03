
public class TestResult {

	private int runCount;

	public TestResult(){
		this.runCount = 0;
	}
	
	public String summary(){
		return this.runCount + " run, 0 failed";
	}
	
	public void testStarted(){
		this.runCount++;
	}
}
