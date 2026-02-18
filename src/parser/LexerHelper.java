package parser;

public class LexerHelper {

	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static double lexemeToReal(String text) {
		try {
			return Double.parseDouble(text);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}


	public static char lexemeToChar(String text) {
		try {
			var _ = "";
			switch (text.length()) {
				case 3:
					return text.charAt(1);

				case 4:
					if (text.charAt(2) == 'n') return '\n';
					else return '\t';

				default:
					return (char) Integer.parseInt(text.substring(2, text.length() - 1));

			}

		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		return (char) -1;
	}

}
