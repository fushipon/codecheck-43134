package codecheck;

public class App {
	public static String main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			String output = String.format("argv[%s]: %s", i, args[i]);
			System.out.println(output);
			int a = Integer.parseInt(output);
			if( a == 87){
				return "idiot";
			}
		}
		return null;
		}
}
