public class Formula3 {
	LinkedTree<NodeTree> root = new LinkedTree<NodeTree> (null);
	calculator<Integer> z = new calculator<>();
	Queue queue = new Queue();
	
	public void splitword(String a) {
		LinkedStack2<NodeTree> stack2 = new LinkedStack2<NodeTree>();
		String[] word = a.split(" ");
		boolean isNumber = false;
		boolean z3 = false;
		int z1 = 0 ;
		int z2 = 0;
	
		for(int i=0; i< word.length; i++) {
			NodeTree tree = new NodeTree(null,0);
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
				tree.setItem(word[i]);
				stack2.push(tree);
				z.push2(Integer.parseInt(word[i]));
				
			}
			else if((word[i].equals("true"))) {
				tree.setItem("true");
				stack2.push(tree);
				z.push2(1);
			}
			else if((word[i].equals("false"))) {
				tree.setItem("false");
				stack2.push(tree);
				z.push2(0);
			}
			else {
				switch(word[i]) {
				
				case "<<":
					tree.setItem("<<");
					tree.setRight(stack2.pop());
					tree.setLeft(stack2.pop());
					root.setRoot(tree);
					stack2.push(tree);
					z2 = z.pop();
					z1 = z.pop();
					z1 = z1 << z2 ;
					tree.setMiddle(z1);
					z.push2(z1);
					break;
				case "<":
					tree.setItem("<");
					tree.setRight(stack2.pop());
					tree.setLeft(stack2.pop());
					root.setRoot(tree);
					stack2.push(tree);
					z2 = z.pop();
					z1 = z.pop();
					z3 = z1 < z2 ;
					if(z3 == true) {
						z1 = 1;
					}
					else {
						z1 = 0;
					}
					tree.setMiddle(z1);
					z.push2(z1);
					break;
				case "<=":
					tree.setItem("<=");
					tree.setRight(stack2.pop());
					tree.setLeft(stack2.pop());
					root.setRoot(tree);
					stack2.push(tree);
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
					tree.setMiddle(z1);
					break;
				case ">>":
					tree.setItem(">>");
					tree.setRight(stack2.pop());
					tree.setLeft(stack2.pop());
					root.setRoot(tree);
					stack2.push(tree);
					z2 = z.pop();
					z1 = z.pop();
					z1 = z1 >> z2;
					tree.setMiddle(z1);
					z.push2(z1);
					break;
				case ">":
					tree.setItem(">");
					tree.setRight(stack2.pop());
					tree.setLeft(stack2.pop());
					root.setRoot(tree);
					stack2.push(tree);
					z2 = z.pop();
					z1 = z.pop();
					z3 = z1 > z2 ;
					if(z3 == true) {
						z1 = 1;
					}
					else {
						z1 = 0;
					}
					tree.setMiddle(z1);
					z.push2(z1);
					break;
				case ">=":
					tree.setItem(">=");
					tree.setRight(stack2.pop());
					tree.setLeft(stack2.pop());
					root.setRoot(tree);
					stack2.push(tree);
					z2 = z.pop();
					z1 = z.pop();
					z3 = z1 >= z2 ;
					if(z3 == true) {
						z1 = 1;
					}
					else {
						z1 = 0;
					}
					tree.setMiddle(z1);
					z.push2(z1);
					break;
				case "!":
					tree.setItem("!");
					tree.setLeft(stack2.pop());
					root.setRoot(tree);
					stack2.push(tree);
					z3 = !(z.pop() != 0);
					if(z3 == true) {
						z1 = 1;
					}
					else {
						z1 = 0;
					}
					tree.setMiddle(z1);
					z.push2(z1);
					break;
				case "!=":
					tree.setItem("!=");
					tree.setRight(stack2.pop());
					tree.setLeft(stack2.pop());
					root.setRoot(tree);
					stack2.push(tree);
					z2 = z.pop();
					z1 = z.pop();
					z3 = z1 != z2 ;
					if(z3 == true) {
						z1 = 1;
					}
					else {
						z1 = 0;
					}
					tree.setMiddle(z1);
					z.push2(z1);
					break;
				case "-": 
					tree.setItem("-");
					tree.setLeft(stack2.pop());
					root.setRoot(tree);
					stack2.push(tree);
					z1 = - z.pop();
					tree.setMiddle(z1);
					z.push2(z1);
					break;
				case "&&":
					tree.setItem("&&");
					tree.setRight(stack2.pop());
					tree.setLeft(stack2.pop());
					root.setRoot(tree);
					stack2.push(tree);
					z2 = z.pop();
					z1 = z.pop();
					z3 = (z1 != 0) && (z2 != 0);
					if(z3 == true) {
						z1 = 1;
					}
					else {
						z1 = 0;
					}
					tree.setMiddle(z1);
					z.push2(z1);
					break;
				case "&":
					tree.setItem("&");
					tree.setRight(stack2.pop());
					tree.setLeft(stack2.pop());
					root.setRoot(tree);
					stack2.push(tree);
					z2 = z.pop();
					z1 = z.pop();
					z1 = z1 & z2 ;
					tree.setMiddle(z1);
					z.push2(z1);
					break;
				case "||":
					tree.setItem("||");
					tree.setRight(stack2.pop());
					tree.setLeft(stack2.pop());
					root.setRoot(tree);
					stack2.push(tree);
					z2 = z.pop();
					z1 = z.pop();
					z3 = (z1 != 0) || (z2 != 0);
					if(z3 == true) {
						z1 = 1;
					}
					else {
						z1 = 0;
					}
					tree.setMiddle(z1);
					z.push2(z1);
					break;
				case "|":
					tree.setItem("|");
					tree.setRight(stack2.pop());
					tree.setLeft(stack2.pop());
					root.setRoot(tree);
					stack2.push(tree);
					z2 = z.pop();
					z1 = z.pop();
					z1 = z1 | z2 ;
					tree.setMiddle(z1);
					z.push2(z1);
					break;
				case "~" :
					tree.setItem("~");
					tree.setLeft(stack2.pop());
					root.setRoot(tree);
					stack2.push(tree);
					z1 = ~z.pop();
					tree.setMiddle(z1);
					z.push2(z1);
					break;
				case "==":
					tree.setItem("==");
					tree.setRight(stack2.pop());
					tree.setLeft(stack2.pop());
					root.setRoot(tree);
					stack2.push(tree);
					z2 = z.pop();
					z1 = z.pop();
					z3 = z1 == z2 ;
					if(z3 == true) {
						z1 = 1;
					}
					else {
						z1 = 0;
					}
					tree.setMiddle(z1);
					z.push2(z1);
					break;
				}	
			}
		}
	}
}
