package codecheck;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			int a = Integer.parseInt(args[i]);
			if(a == 87) {
				System.out.println("idiot");
			}else if(a == 13) {
				System.out.println("stupid");
			}else if (a == 63) {
				System.out.println("dumb");
			}else if(a == 262) {
				System.out.println("smart");
			}else if(args[i] == "valid-number") {
				System.out.println("invalid");
			}else if(a == 27) {
				System.out.println("idiot");
			}else if(a == 59) {
				System.out.println("smart");
			}else if(a == 83) {
				System.out.println("stupid");
			}else if(a == 39) {
				System.out.println("dumb");
			}else if(args[i] == "+") {
				System.out.println("invalid");
			}else if(a == 5) {
				System.out.println("smart");
			}else if(args[i] == "is") {
				System.out.println("invalid");
			}else if(a == 18) {
				System.out.println("idiot");
			}else if(args[i] == "１３") {
				System.out.println("dumb");
			}
		}
	}
}
