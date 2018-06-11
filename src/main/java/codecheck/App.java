package codecheck;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			String output = String.format("argv[%s]: %s", i, args[i]);
			System.out.println(output);
			int a = Integer.parseInt(output);
			String idiot = calc(a);
			}

		}

	private static String calc(int a) {
		String idiot = "idiot";
		String invalid = "invalid";
		int thousand = 1000;
		int result = a / '3';
		if(result <= thousand) {
			return idiot;
	}
		return invalid;
}
}
