package codecheck;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			String output = String.format("argv[%s]: %s", i, args[i]);
			System.out.println(output);
			int a = Integer.parseInt(args[i]);
			if(a % 3 == 0) {
			System.out.println("idiot");
			}
		}
	}
}
