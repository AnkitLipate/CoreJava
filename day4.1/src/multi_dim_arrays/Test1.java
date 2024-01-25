package multi_dim_arrays;

import java.util.Arrays;
import static java.lang.System.out;
public class Test1 {

	public static int testData = 567;
	
	public static void main(String[] args) {
//	    int testData  = 1234;
//	    System.out.println("local vaiable "+testData);
	    out.println("static variable "+testData);
		double[][] data = new double[3][4];
		int value = 100;
		//display array content for loop
		for(int i=0; i<data.length; i++)
			for(int j=0; j<data[i].length; j++ )
				data[i][j] = value++;
		// esier way to print multi dim array content? Yes
		out.println(Arrays.deepToString(data));
	    Test1 t1 = new Test1();
		t1.show();
	}
	private void show()
	{
		out.println("in show : non-static method");
	    test();
	}
	private static void test()
	{
		out.println("in test : static method");
	}
}
