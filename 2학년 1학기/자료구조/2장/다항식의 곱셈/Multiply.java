import java.util.Scanner;

public class Multiply{

    public int arraysize; 
    int[][] multiply;
    
    public Multiply() {
        arraysize = 0;
        multiply = new int[4][2];
    }
    
    public void append(int element,int element2) {
         if(arraysize == multiply.length) {
        	resize(arraysize * 2);
          	}
         multiply[arraysize][0] = element;
         multiply[arraysize][1] = element2;
         arraysize++;
    }
    
    public void resize(int n) {
        int[][] newArray = new int[n][2];
        
        for (int i = 0; i< arraysize; i++) {
        	for(int j=0; j<2; j++) {
        		newArray[i][j] = multiply[i][j];
        	}
        }
        
        this.multiply = newArray;
    }

    public int getCol(int i) {
    		return multiply[i][0];
    }
    
    public int getexp(int i) {
		return multiply[i][1];
    }
    
    public void showans() {
    	System.out.print("두 다항식의 곱은: ");
    	for(int i=0; i<arraysize; i++) {
				if(multiply[i][0] != 0 && i!= 0) {
					System.out.print("+");
				}
    			if(multiply[i][1]== 1 && multiply[i][0] !=0) {
						if(multiply[i][0] == 1) {
						System.out.print("x");
						}
						else if(multiply[i][0] == -1) {
						System.out.print("-x");
						}
						else {
							System.out.print(multiply[i][0]+"x");
						}
				}
				else if(multiply[i][0] == -1 && multiply[i][1]!= 0) {
					System.out.print("-x^"+multiply[i][1]);
				}
				else if(multiply[i][1]== 0 && multiply[i][0] !=0) {
					System.out.print(multiply[i][0]);
				}
				else if(multiply[i][0]!=0) {
    			System.out.print(multiply[i][0]+"x^"+ multiply[i][1]);
				}
    	}	
    }
    
    public static Multiply add(Multiply p3, Multiply p4) {
    	Multiply p6 = new Multiply();
    	int p3index = 0;
    	int p4index = 0;
    	while(p3index < p3.arraysize  && p4index < p4.arraysize) {
    		if(p3.getexp(p3index)<p4.getexp(p4index)) {
    			p6.append(p4.getCol(p4index), p4.getexp(p4index));
    			p4index++;
    		}
    		else if(p3.getexp(p3index)> p4.getexp(p4index)) {
    			p6.append(p3.getCol(p3index), p3.getexp(p3index));
    			p3index++;
    		}
    		else {
    			p6.append(p3.getCol(p3index)+p4.getCol(p4index),p3.getexp(p3index));
    			p3index++;
    			p4index++;
    		}
    		while(p3index < p3.arraysize && p4index == p4.arraysize) {
    			p6.append(p3.getCol(p3index),p3.getexp(p3index));
    			p3index++;
    		}
    		while(p4index < p4.arraysize && p3index == p3.arraysize) {
    			p6.append(p4.getCol(p4index),p4.getexp(p4index));
    			p4index++;
    		}
    	}
    	return p6;
    	
    }
public static void main(String arg[]) {
	Scanner s = new Scanner(System.in);
	Multiply p1 = new Multiply();
	Multiply p2 = new Multiply();
	Multiply p3 = new Multiply();

	System.out.println("첫번째 다항식을 계수-지수 쌍으로 입력하세요.(지수가 0으로 입력되면 종료)");
	while(true) {
			int n = s.nextInt();
			int n2= s.nextInt();
			p1.append(n,n2);
			if(n==0 || n2==0){
				break;
			}
			
		}
	
	System.out.println("두번째 다항식을 계수-지수 쌍으로 입력하세요.(지수가 0으로 입력되면 종료)");
	while(true) {
			int m = s.nextInt();
			int m2= s.nextInt();
			p2.append(m,m2);
			if(m==0 || m2==0){
				break;
				}
	}
	
	int col = 0;
	int exp = 0;
	
	for(int i=0; i<p1.arraysize; i++) {
		col = p1.getCol(i)*p2.getCol(0);
		exp = p1.getexp(i)+p2.getexp(0);
		p3.append(col,exp);
				}
	
	for(int j=1; j<p2.arraysize; j++) {
		Multiply p4 = new Multiply();
		Multiply p5 = new Multiply();
		for(int k=0; k<p1.arraysize; k++) {
			col = p1.getCol(k)*p2.getCol(j);
			exp = p1.getexp(k)+p2.getexp(j);
			p4.append(col, exp);
			}
			p5 = add(p3,p4);
			p3 = p5;
		}
	p3.showans();
	}
}