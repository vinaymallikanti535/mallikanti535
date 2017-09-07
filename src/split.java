import java.util.regex.Pattern;

public class split {

	public static void main(String[] args) {

		String test = "abc.def.123";
		String a="[.]+";
		String[] output = test.split(a);

		//alternative
		//String[] output = test.split(Pattern.quote("."));

		System.out.println(output[0]);
		System.out.println(output[1]);
		System.out.println(output[2]);

	}

}