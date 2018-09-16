
public class TestMain {

	public static void main(String[] args) {
		
		int testA = 10;
		testA = TestClass.testIntOrg(testA);
		System.out.println(testA);
		
		int testB = 5;
		testB = TestClass.testIntNew(testB);
		System.out.println(testB);

	}

}
