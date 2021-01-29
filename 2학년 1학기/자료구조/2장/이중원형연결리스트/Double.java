import java.util.Scanner;
import java.io.*;
import java.util.NoSuchElementException;

public class Double{

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);

		Scanner s= new Scanner(System.in);
		DList list = new DList();

		if(file.exists()){
			FileReader filereader = new FileReader(file);
			BufferedReader br = new BufferedReader(filereader);
			String line = "";

			while((line = br.readLine()) != null) {
				insert(line,list);
				}
			}

		System.out.println("(1) 새 학생 입력");
		System.out.println("(2) 학생 삭제");
		System.out.println("(3) 학번 순으로 전체 출력");
		System.out.println("(4) 학번 역순으로 전체 출력");
		System.out.println("(5) 특정 학번부터 전체 출력");
		System.out.println("(6) 파일에 저장하고 종료");

		there: while(true) {
			System.out.print("원하는 기능을 선택하세요: ");
			int n = s.nextInt();
			s.nextLine();
			switch(n) {
			case 1 :
				System.out.print("학번과 이름을 입력하시오. : ");
				String line = s.nextLine();
				insert(line,list);
				break;
			case 2 :
				System.out.print("학번을 입력하시오: ");
				int id = s.nextInt();
				DNode front = list.search(id);
				list.delete(front.getnext());
				break;
			case 3 :
				list.print(); break;
			case 4 :
				list.printre(); break;
			case 5 :
				System.out.print("학번을 입력하시오: ");
				int id2 = s.nextInt();
				DNode front2 = list.search(id2);
				list.printsp(front2.getnext()); break;
			case 6 : 
				BufferedWriter bw = new BufferedWriter(new FileWriter(args[0]));

				DNode p = list.dummy.getnext();
				for(int i = 0; i<list.size; i++) {
					bw.write(p.getid() + " " + p.getname() + " ");
					bw.newLine();
					p = p.getnext();
				}
				bw.close();
				System.out.print("종료합니다.");
				break there;
			}
		}
	}	
	
	public static void insert(String line, DList list) {
		String a[] = line.split(" ",2);
		
		int id = Integer.parseInt(a[0]);
		String name = a[1];

		if(list.dummy.getnext() == list.dummy) {
			list.insertAfter(list.dummy, id, name);
		}
		else {
			list.insertAfter(list.search(id), id, name);
		}
	}
}

class DNode {
	private int id;
	private String name;
	private DNode pre;
	private DNode next;
	
	public DNode (int newid , String newname, DNode p, DNode n) {
		id = newid;
		name = newname;
		pre = p;
		next = n;
	}
	
	public int getid() {return id;}
	public String getname() {return name;}
	public DNode getpre() {return pre;}
	public DNode getnext() {return next;}
	public void setid(int newid) { id = newid;}
	public void setname(String newname) {name = newname;}
	public void setpre(DNode p) {pre = p;}
	public void setnext(DNode n) {next = n;}
}

class DList {
	private DNode head;
	protected DNode dummy;
	protected int size;
	
	public DList() {
		dummy = new DNode(0, null, null, null);
		head =  new DNode(0, null, dummy, dummy);
		dummy.setnext(head.getnext());
		dummy.setpre(head.getpre());
	}
	
	public boolean isEmply() {
		return dummy == dummy.getnext();
	}
	
	public void insertAfter(DNode m, int newid, String newname) {
		DNode t = m.getnext();
		DNode newNode = new DNode(newid, newname, m, t);
		t.setpre(newNode);
		m.setnext(newNode);
		size++;
	}
	
	public void delete(DNode m) {
		if(m == null) {throw new NoSuchElementException();}
		DNode f = m.getpre();
		DNode r = m.getnext();
		f.setnext(r);
		r.setpre(f);
		size--;
	}
	
	public DNode search(int id) {
		DNode cur = dummy;
		while(cur.getid() < id) {
			cur = cur.getnext();
			if(cur == dummy) {
				break;
			}
		}
		return cur.getpre();
	}
	
	public void print() {
		DNode p = dummy.getnext();
		for(int i = 0; i<size; i++) {
			System.out.println(p.getid() + " " + p.getname() + " ");
			p = p.getnext();
		}
		System.out.println();
	}
	
	public void printre() {
		DNode p = dummy;
		for(int i = 0; i<size; i++) {
			p = p.getpre();
			System.out.println(p.getid() + " " + p.getname() + " ");
		}
		System.out.println();
	}
	
	public void printsp(DNode front2) {
		DNode p = front2;
		for(int i=0; i<size; i++) {
			if(p.getid() == 0) {
				p = p.getnext();
			}
			System.out.println(p.getid() + " " + p.getname() + " ");
			p = p.getnext();
		}
		System.out.println();
	}
}