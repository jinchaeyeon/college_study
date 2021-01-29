import java.util.Scanner;
import java.io.*;
import java.util.NoSuchElementException;

public class Simple{

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);

		Scanner s= new Scanner(System.in);
		SList list = new SList();

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
		System.out.println("(4) 파일에 저장하고 종료");

		there: while(true) {
			System.out.print("원하는 기능을 선택하세요: ");
			int n = s.nextInt();
			s.nextLine();
			switch(n) {
				case 1 :
					System.out.print("학번과 이름, 동아리들을 입력하시오. : ");
					String line = s.nextLine();
					insert(line,list);
					break;
				case 2 :
					System.out.print("학번을 입력하시오: ");
					int number = s.nextInt();
					Node1 front = list.search(number);
					if(number == list.head.getNumber()) {
						list.deleteFront();
					}
					else{
						list.deleteAfter(front);
					} break;
				case 3 :
					list.print(); break;
				case 4 : 
					BufferedWriter bw = new BufferedWriter(new FileWriter(args[0]));

					while(list.head != null) {
						bw.write(list.head.getNumber() + " " + list.head.getName() + " ");
						Node2 clubnode = list.head.clubnode;
						while(clubnode != null) {
							bw.write(clubnode.getClub());
							if(clubnode.getNext() != null) {
								bw.write("/");
							}
							clubnode = clubnode.getNext();
						}
						list.head = list.head.getNext();
						bw.newLine();
					}
					bw.close();
					System.out.print("종료합니다.");
					break there;
			}
		}
	}
	public static void insert(String line, SList list) {
		Node1 pre = list.head;
		Node1 cur = list.head;
		String a[] = line.split(" ",3);

		int number = Integer.parseInt(a[0]);

		if(list.head == null || list.head.getNumber() > number) {
			list.insertFront(number,a[1]);
			if(a.length>2) {
				String b[] = a[2].split("/");
				for(int i= 0; i< b.length; i++) {
					list.insertFront2(b[i]);
				}
			}
			cur = list.head;
		}
		else {
			cur = list.head;
			while(number > cur.getNumber()) {
				pre = cur;
				cur = cur.getNext();
				if(cur == null) { break; }
			}
			list.insertAfter(number,a[1],pre);
			if(a.length>2) {
				String b[] = a[2].split("/");
				for(int i=0; i< b.length; i++) {
					list.insertAfter2(b[i],pre);
				}
			}
		}
	}
}

class Node1 {

	private int number;
	private String name;
	private Node1 next;
	protected Node2 clubnode;

	public Node1(int number,String name,Node1 node) {
		this.number = number;
		this.name = name;
		next = node;
		clubnode = null;
	}

	public int getNumber() {return number;}
	public String getName() {return name;}
	public Node1 getNext() {return next;}
	public void setNumber(int newnumber) {number = newnumber;}
	public void setName(String newname) {name = newname;}
	public void setNext(Node1 newNext) {next = newNext;}

	public void insertFront2(String club) {
		clubnode = new Node2(club, clubnode);
	}

	public Node2 getClub() {return clubnode;}

	public void print1(){
		Node2 p =clubnode;
		while(p != null) {
			System.out.print(p.getClub());
			if(p.getNext() != null) {
				System.out.print("/");
			}
			p = p.getNext();
		}
		System.out.println();
	}
}

class Node2 {

	private String club;
	private Node2 next;

	public Node2(String newClub, Node2 node) {
		club = newClub;
		next = node;
	}

	public String getClub() { return club;}
	public Node2 getNext() {return next;}
	public void setClub(String newclub) { club = newclub;}
	public void setNext(Node2 newNext) {next = newNext;}
}

class SList {
	
	protected Node1 head;
	
	public SList() {
		head = null;
	}

	public void insertFront(int number, String name) {
		head = new Node1(number,name,head);
	}

	public void insertFront2(String club) {
		head.insertFront2(club);
	}

	public void insertAfter(int number, String name, Node1 n) {
		n.setNext(new Node1(number, name, n.getNext()));
	}

	public void insertAfter2(String club, Node1 n) {
		n.getNext().insertFront2(club);
	}

	public Node1 search(int number) {
		Node1 cur = head;
		Node1 pre = head;
		while(cur.getNumber() != number) {
			pre = cur;
			cur = cur.getNext();
		}
		return pre;
	}

	public void deleteFront() {
		head = head.getNext();
	}

	public void deleteAfter(Node1 p) {
		if(p == null) { throw new NoSuchElementException();}
		Node1 t = p.getNext();
		p.setNext(t.getNext());
		t.setNext(null);
	}

	public void print() {
		Node1 p =head;
		while(p != null) {
			System.out.print(p.getNumber() + " " + p.getName() + " ");
			p.print1();
			p = p.getNext();
		}
		System.out.println();
	}
}
