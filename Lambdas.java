import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambdas {

	public static void main(String[] args) {

//Creating  an Array of words		
		List<String> words = new ArrayList<String>();
		words.add("AAAAAAA");
		words.add("BBBBB");
		words.add("CCC");

		//Sorting by length using anonymous class
		words.sort(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if (s1.length() < s2.length())
					return -1;
				if (s1.length() > s2.length())
					return 1;
				return 0;
			}

		});

		System.out.println(words);

		//Sorting descending by length
		words.sort((s1, s2) -> {
			if (s1.length() > s2.length())
				return -1;
			if (s1.length() < s2.length())
				return 1;
			return 0;
		});

		System.out.println(words);

		//Sorting by length using Integer.compare to help
		words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		System.out.println(words);
		
		//Printing each string
		words.forEach((s1) -> System.out.println(s1));
		

	}

}
