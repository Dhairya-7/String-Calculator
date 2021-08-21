public class StringCalc {
	public class negativeNumberException extends Exception {
		negativeNumberException(String msg) {
			super(msg);
		}
	}

	private static String getBetweenString(String str, String startingString, String endingString) {

		int endIndex = str.indexOf(endingString);
		if (endingString.length() == 0)
			endIndex = str.length();
		int startIndex = str.indexOf(startingString) + startingString.length();
		String newDelimiter = str.substring(startIndex, endIndex);
		return newDelimiter;

	}

	public int calc(String numberString) {
		int total = 0;
		String delimiter = "[,\\n]";

		if (!numberString.isEmpty()) {

			if (numberString.startsWith("//")) {
				if (numberString.startsWith("//[")) {
					int indexofDelimterEnd = numberString.lastIndexOf("]") + 1;
					String multipleDelimterString = numberString.substring(2, indexofDelimterEnd);
					delimiter="";
					while (multipleDelimterString.indexOf("]") > 0) {
						delimiter = delimiter + getBetweenString(multipleDelimterString, "[", "]");
						multipleDelimterString = multipleDelimterString.substring(multipleDelimterString.indexOf("]") + 1);
					}
					numberString = getBetweenString(numberString, "]\\n", "");
				} else {
					delimiter = getBetweenString(numberString, "//", "\\n");
					numberString = getBetweenString(numberString, "\\n", "");
				}
			}
			String[] numberArray = numberString.split("[" + delimiter + "]");
			for (int i = 0; i < numberArray.length; i++) {
				if (numberArray[i].isEmpty()) {
					continue;
				}
				int a = Integer.parseInt(numberArray[i]);
				if (a < 0) {
					try {
						throw new negativeNumberException("Negatives not Allowed");
					}

					catch (Exception e) {
						System.out.println(e.getMessage());
					}
				} else if (a >= 1000) {
					continue;
				}
				total += a;
			}
			return total;
		}
		return 0;
	}

}
