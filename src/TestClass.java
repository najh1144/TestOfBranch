
public class TestClass {

	public static int testIntOrg(int a) {
		return a * 2;
	}
	
	public static void testStringOrg(int a) {
		int x = 0;
		String printNrs = "";
		while(x < a) {
			printNrs = printNrs + x;
			if(x==(a-1)==false) {
				printNrs = printNrs + " ";
			}
			x++;
		}
	}
	
	public static int testIntNew(int b) {
		return b * 3;
	}
	
}
