import static java.lang.System.out;

import java.util.Arrays;
import java.util.List;

public class First {
	
	public static int get(List<String> listString) {
		return listString.size();
	}

	public static void main(String[] args) {

	 List<String> list = Arrays.asList("one", "three", "two", "ok", "five", "six", "Eleven", "tweleve");
		out.println(get(list));
		
	


	}

}