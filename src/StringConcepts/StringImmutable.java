package StringConcepts;
import java.util.Arrays;

public class StringImmutable {

	public static void main(String[] args) {

		
		String s = "Selenium";
		
		System.out.println(s+"automation");
		
		System.out.println(s);
		
		s = "cypress";
		
		System.out.println(s);
		
		String t1 = "Selenium";
		
		System.out.println(t1);
		
		
		String p = "Naveen";
		p = p + "Automation Labs";
		System.out.println(p);
		
		String t2 = "Naveen";
		System.out.println(t2);
		
		String r = "      hello selenium      ";
		r = r.trim();
		System.out.println(r);
		
		int i = 10;
		i = 10 + 50;//60
		
		String s11 = "java_py_ruby";
		String arr[] = s11.split("_");
		String t11 = arr[0] + "testing";
		
		
		System.out.println(s11);
		System.out.println(Arrays.toString(arr));
		
		
		String test = "       testing java     selenium    ";
		//System.out.println(test.replaceAll(" ", "m"));
		System.out.println(test.replace(" ", "m"));
		
		
		//loop -- main()
		
		
		String rest = "i am binita and this is my code and i am so happy";
		System.out.println(rest.indexOf('i'));//0
		
		System.out.println(rest.indexOf('i', rest.indexOf('i')+1));//6
		
		System.out.println(rest.indexOf('i', rest.indexOf('i', rest.indexOf('i')+1)+1));//8
		
		System.out.println(rest.indexOf("i", rest.indexOf('i', rest.indexOf('i', rest.indexOf('i')+1)+1)+1));

		//while loop: give me the occurrence of all i
		
		
	}

}
