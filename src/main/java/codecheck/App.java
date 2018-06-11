package codecheck;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			String output = String.format("argv[%s]: %s", i, args[i]);
			System.out.println(output);
			int thousand = 1000;
			int input = Integer.parseUnsignedInt(output);
			int result = input / '3';
			if(result < thousand) {
				String idiot = "idiot";
			}
		}
	}
}
