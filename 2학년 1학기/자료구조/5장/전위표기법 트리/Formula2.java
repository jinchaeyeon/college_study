public class Formula2 {
	private String exp;
	private int expSize;
	private char test, test2;
	LinkedStack stack = new LinkedStack();
	String a ="";
	
	public void toPostfix(String infix){
		exp = infix;
		int expSize = exp.length();
		int icp;
		int a1 = exp.indexOf("<<");
		int a2 = exp.indexOf(">>");
		int a3 = exp.indexOf("&&");
		int a4 = exp.indexOf("||");
		int a5 = exp.indexOf("!=");
		int a6 = exp.indexOf("<=");
		int a7 = exp.indexOf(">=");
		
		for(int i = 0 ; i<expSize; i++) {
			test = exp.charAt(i);
			if(i != expSize-1) {
				int j = 1+i;
				test2 = exp.charAt(j);
			}
			else {
				test2 = 'd';
			}
			
			
			switch(test) {
			
			    case '0':
				case '1' : 
				case '2' :
				case '3' :
				case '4' :
				case '5' :
				case '6' :
				case '7' :
				case '8' :
				case '9' :
					if(test2 == '0' || test2 == '1' || test2 == '2' || test2 == '3' || test2 == '4' || test2 == '5' || test2 == '6' || test2 == '7' || test2 == '8' || test2 == '9') {
					System.out.print(test);
					a = a+ Character.toString(test);
					}
					else {
						System.out.print(test+" ");
						a = a + Character.toString(test)+" ";
					}
					break;
				case 't' :
					for(int j=0; j<3; j++) {
						i++;
					}
					System.out.print("true ");
					a = a + "true"+ " ";
					break;
				case 'f' :
					for(int j=0; j<4; j++) {
						i++;
					}
					System.out.print("false ");
					a = a + "false"+ " ";
					break;
				case '-' :
					com(4);
					stack.push(test,4,4);
					break;
				case '!':
					if(a5 != i) {
						com(2);
						stack.push(test, 2, 2);
					}
					else {
						com(7);
						stack.push("!=", 7, 7);
						i++;
					}
					break;
				case '~' :
					com(2);
					stack.push(test, 2, 2);
					break;
				case '<' :
					if(a1 != i) {
						if(a6 != i) {
							com(6);
							stack.push(test, 6, 6);
						}
						else {
							com(6);
							stack.push("<=", 6, 6);
							i++;
						}
					}
					else {
							com(5);
							stack.push("<<" ,5, 5);
							i++;
					}
					break;
				case '>' :
					if(a2 != i) {
						if(a7 != i) {
							com(6);
							stack.push(test, 6, 6);
						}
						else {
							com(6);
							stack.push(">=", 6, 6);
							i++;
						}
					}
					else {
							com(5);
							stack.push(">>" ,5, 5);
							i++;
					}
					break;
				case '&' :
					if(a3 != i) {
						com(8);
						stack.push(test,8,8);
					}
					else {
						com(11);
						stack.push("&&", 11, 11);
						i++;
					}
					break;
				case '|':
					if(a4 != i) {
						com(10);
						stack.push(test,10,10);
					}
					else {
						com(12);
						stack.push("||", 12, 12);
						i++;
					}
					break;
				case '=' :
					com(7);
					stack.push("==",7,7);
					i++;
					break;	
				case '(' :
					stack.push(test, 15, 0);
					break;
				case ')' :
					while(!stack.isEmpty() && stack.peek().equals('(') == false) {
						a = a + String.valueOf(stack.peek())+" ";
						System.out.print(stack.pop()+" ");
					}
					stack.pop();
					break;
				case ' ' :
					break;
			}
		}
		while(stack.isEmpty() != true) {
			a = a + String.valueOf(stack.peek())+" ";
			System.out.print(stack.pop()+" ");
		}
	}

	public void com(int icp) {
		while(stack.peekisp() < icp) {
			a = a + String.valueOf(stack.peek())+" ";
			System.out.print(stack.pop()+" ");
		}
	}
}