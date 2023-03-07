package StringConcepts;

public class StringBuilderAndBufferConcept {

	public static void main(String[] args) {

		
		StringBuilder sb = new StringBuilder("selenium");
		
		sb.append("testing");
		System.out.println(sb);
		
		String s1 = "cypress";
		s1.concat("ui testing");
		System.out.println(s1);
		
	}

}
