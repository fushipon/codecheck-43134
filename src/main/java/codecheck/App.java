package codecheck;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			int a = Integer.parseInt(args[i]);
			if(a % 3 == 0) {
			System.out.println("idiot");
			}
			if(args[i].contains("3")) {
				System.out.println("stupid");
			}
		}
	}
}
