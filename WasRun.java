import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class WasRun extends TestCase{

	public boolean wasRun = false;
	private TestCase testCase;

	public WasRun(String methodName) {
		super(methodName);
		this.wasRun = false;
	}

	public void testMethod(){
		this.wasRun = true;
	}
	
}
