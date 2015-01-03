import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class WasRun extends TestCase{

	public boolean wasRun = false;
	private TestCase testCase;
	public boolean wasSetUp;

	public WasRun(String methodName) {
		super(methodName);
		this.wasRun = false;
		this.wasSetUp = Boolean.TRUE;
	}

	public void testMethod(){
		this.wasRun = true;
	}
	
	public void setUp(){
		this.wasSetUp = true;
	}
}
