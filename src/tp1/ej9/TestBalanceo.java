package tp1.ej9;

public class TestBalanceo { 

	public static void main(String args[]) {
		System.out.printf("El string '%s' está balanceado? %s", args[0], (validar(args[0]) ? "true" : "false"));
	}

	private static boolean validar(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		final char[] ini = { '(', '[', '{' };
		final char[] fin = { ')', ']', '}' };

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (pertenece(ini, c)) {
				stack.push(c);
			} else if (pertenece(fin, c)) {
				char cInicio = stack.pop();
			/* 
			 *  Se la re complicaba:
			 * 	if (!((int) c == (int) cInicio + 1) && !((int) c == (int) cInicio + 2)) {
			 * 
			 * 		return false;
			 *	}
			 */ 
				switch (c) {
				case ')':
					if (cInicio != '(')
						return false;
				break;
				case ']':
					if (cInicio != '[')
						return false;
				break;
				case '}':
					if (cInicio != '{')
						return false;
				break;
				}
				
				
			}
		}

		return stack.isEmpty();
	}

	private static boolean pertenece(char[] arreglo, char dato) {
		for (char elemento : arreglo)
			if (elemento == dato)
				return true;
		return false;
	}
}
