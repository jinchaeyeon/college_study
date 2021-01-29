package a;
import java.util.Scanner;
import java.util.EmptyStackException;

public class Formula {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
		String exp = "first";
		while(!exp.equals("quit")) {
			Formula2 op = new Formula2();
		     System.out.print("식을 입력하시오(종료는 quit): ");
			 exp = s.nextLine();
			 if(error(exp)== true) {
				 System.out.println("[오류] 이해할 수 없는 수식");
			 }
			 else {
				 if(exp.equals("quit")== true) {
					 System.out.print("종료합니다.");
					 break;
				 }
				 System.out.print("--- postfix notation은 : ");
				 op.toPostfix(exp);
				 System.out.println();
				 System.out.print("---- 결과는 ");
				 System.out.print(splitword(op.a));
				 System.out.println();
			 }
		}
	}
	
	public static boolean error(String exp) {
		boolean a = false;
		
		for(int i = 0; i<exp.length()-2; i++) {
			char q = exp.charAt(i);
			char w = exp.charAt(i+1);
			char e = exp.charAt(i+2);
			
			int q1 = 0;
			int w1 = 0;
			int e1 = 0;
			
			if(q == '=' || q == '&' || q == '<'|| q == '>') {
				q1 = 1;
			}
			else {
				q1 = 0;
			}
			if(w == '=' || w == '&' || w == '<'|| w == '>') {
				w1 = 1;
			}
			else {
				w1 = 0;
			}
			if(e == '=' || e == '&' || e == '<'|| e == '>') {
				e1 = 1;
			}
			else {
				e1 = 0;
			}
			if(q1 == 1 && w1 == 1 && e1 == 1) {
				a = true;
			}
		}
		return a;
	}
	
	public static int splitword(String a) {
		calculator<Integer> z = new calculator<>();
		String[] word = a.split(" ");
		boolean isNumber = false;
		int z1 = 0 ;
		int z2 = 0;
		boolean z3 = false;
		
		for(int i=0; i< word.length; i++) {

			for(int j = 0; j<word[i].length(); j++){
				char check;
				check = word[i].charAt(j);

				if( check < 48 || check > 58){
					 isNumber = false;
					}
				else{
					isNumber = true;
					}
			}			
			
			if(isNumber == true) {
				z.push2(Integer.parseInt(word[i]));
			}
			else if((word[i].equals("true"))) {
				z.push2(1);
			}
			else if((word[i].equals("false"))) {
				z.push2(0);
			}
			else {
				switch(word[i]) {
					
				case "<<":
					z2 = z.pop();
					z1 = z.pop();
					z1 = z1 << z2 ;
					z.push2(z1);
					break;
				case "<":
					z2 = z.pop();
					z1 = z.pop();
					z3 = z1 < z2 ;
					if(z3 == true) {
						z1 = 1;
					}
					else {
						z1 = 0;
					}
					z.push2(z1);
					break;
				case "<=":
					z2 = z.pop();
					z1 = z.pop();
					z3 = z1 <= z2 ;
					if(z3 == true) {
						z1 = 1;
					}
					else {
						z1 = 0;
					}
					z.push2(z1);
					break;
				case ">>":
					z2 = z.pop();
					z1 = z.pop();
					z1 = z1 >> z2 ;
					z.push2(z1);
					break;
				case ">":
					z2 = z.pop();
					z1 = z.pop();
					z3 = z1 > z2 ;
					if(z3 == true) {
						z1 = 1;
					}
					else {
						z1 = 0;
					}
					z.push2(z1);
					break;
				case ">=":
					z2 = z.pop();
					z1 = z.pop();
					z3 = z1 >= z2 ;
					if(z3 == true) {
						z1 = 1;
					}
					else {
						z1 = 0;
					}
					z.push2(z1);
					break;
				case "!":
					z3 = !(z.pop() != 0);
					if(z3 == true) {
						z1 = 1;
					}
					else {
						z1 = 0;
					}
					z.push2(z1);
					break;
				case "!=":
					z2 = z.pop();
					z1 = z.pop();
					z3 = z1 != z2 ;
					if(z3 == true) {
						z1 = 1;
					}
					else {
						z1 = 0;
					}
					z.push2(z1);
					break;
				case "-": 
					z1 = - z.pop();
					z.push2(z1);
					break;
				case "&&":
					z2 = z.pop();
					z1 = z.pop();
					z3 = (z1 != 0) && (z2 != 0);
					if(z3 == true) {
						z1 = 1;
					}
					else {
						z1 = 0;
					}
					z.push2(z1);
					break;
				case "&":
					z2 = z.pop();
					z1 = z.pop();
					z1 = z1 & z2 ;
					z.push2(z1);
					break;
				case "||":
					z2 = z.pop();
					z1 = z.pop();
					z3 = (z1 != 0) || (z2 != 0);
					if(z3 == true) {
						z1 = 1;
					}
					else {
						z1 = 0;
					}
					z.push2(z1);
					break;
				case "|":
					z2 = z.pop();
					z1 = z.pop();
					z1 = z1 | z2 ;
					z.push2(z1);
					break;
				case "~" :
					z1 = ~z.pop();
					z.push2(z1);
					break;
				case "==":
					z2 = z.pop();
					z1 = z.pop();
					z3 = z1 == z2 ;
					if(z3 == true) {
						z1 = 1;
					}
					else {
						z1 = 0;
					}
					z.push2(z1);
					break;
				}
			}	
		}
		return z.pop();
	}
}

class Formula2 {
	private String exp;
	private int expSize;
	private char test, test2;
	LinkedStack stack = new LinkedStack();
	calculator link = new calculator();
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

class Node2<E> {
	private E item ;
	private Node2<E> next;
	
	public Node2(E newitem, Node2<E> node) {
		item = newitem;
		next = node;
	}
	
	public E getItem() {return item;}
	public Node2<E> getNext() {return next;}
	public void setItem(E newItem) {item = newItem;}
	public void setNext(Node2<E> newNext) { next = newNext;}
}

class calculator<E> {
	private Node2 <E> top;
	private int size;
	
	public calculator() {
		top = null;
		size = 0;
	}
	
	public int size() {return size;}

	public boolean isEmpty2() {
		return (size == 0);
	}
	
	public void push2(E item) {
		Node2 newNode = new Node2(item,top);
		top = newNode;
		size++;
	}
	
	public E pop() {
		if(isEmpty2()){throw new EmptyStackException();}
		E topItem = top.getItem();
		top = top.getNext();
		size --;
		return topItem;
	}
	
	public E peek() {
		if(isEmpty2()){throw new EmptyStackException();}
		return top.getItem();
	}
	
	public void print2() {
		Node2 p = top;
		while(p != null) {
			System.out.print(p.getItem() + " ");
			p = p.getNext();
		}
		System.out.println();
	}
}

class Node<E> {
	private E item ;
	private Node<E> next;
	int isp;
	int icp;
	
	public Node(E newitem, Node<E> node,int newisp, int newicp) {
		item = newitem;
		next = node;
		isp = newisp;
		icp = newicp;
	}
	
	public E getItem() {return item;}
	public Node<E> getNext() {return next;}
	public int getisp() {return isp;}
	public int geticp() {return icp;}
	public void setItem(E newItem) {item = newItem;}
	public void setNext(Node<E> newNext) { next = newNext;}
	public void setisp(int newisp) {isp = newisp;}
	public void seticp(int newicp) {icp = newicp;}
}

class LinkedStack<E> {
	private Node <E> top;
	private int size;
	
	public LinkedStack() {
		top = null;
		size = 0;
	}
	
	public int size() {return size;}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void push(E item,int isp,int icp) {
		Node newNode = new Node(item,top,isp,icp);
		top = newNode;
		size++;
	}

	public E pop() {
		if(isEmpty()){throw new EmptyStackException();}
		E topItem = top.getItem();
		top = top.getNext();
		size --;
		return topItem;
	}

	public E peek() {
		if(isEmpty()){throw new EmptyStackException();}
		return top.getItem();
	}
	
	public int peekisp() {
		if(isEmpty()){return 15;}
		return top.getisp();
	}
}