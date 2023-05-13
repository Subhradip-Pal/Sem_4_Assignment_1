import java.util.*;
class Node{
	int data;
	Node next;
}
public class MyLinkedList {
	static Node head;
	MyLinkedList(int data){
		Node n=new Node();
		n.data=data;
		head=n;
		head.next=null;
	}

	public static void insert(int data) {
		Node n=new Node();
		n.data=data;
		Node curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=n;
		sort();
	}
	
	public static void printReverse() {
		Node last=head;
		while(last!=null) {
			last=last.next;
		}
		Node curr;
		while(last!=head) {
			curr=head;
			while(curr.next!=last) {
				curr=curr.next;
			}
			last=curr;
			System.out.print(curr.data+" ");
		}
		System.out.println();
	}
	
	public static void reverse() {
		Node curr=head;
		Node prev=null;
		Node next=null;
		while (curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;


	}
	
	public static void sort() {
		int t;
		Node temp=head,last,curr;
		while(temp.next!=null) {
			last=temp;
			if(temp.data>temp.next.data) {
				t=temp.next.data;
				temp.next.data=temp.data;
				temp.data=t;
				while(last!=head) {
					curr=head;
					while(curr.next!=last) {
						curr=curr.next;
					}
					if(curr.data>curr.next.data) {
						t=curr.next.data;
						curr.next.data=curr.data;
						curr.data=t;
					}
					last=curr;
				}
			}
			temp=temp.next;
			
		}
	}
	
	public static void print() {
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
	
	public static void sortedInsert() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the new data:");
		Node n=new Node();
		n.data=sc.nextInt();
		if(head==null || head.data>n.data) {
			n.next=head;
			head=n;
		}
		else {
			Node curr=head;int c=0;
			while(curr.next!=null && curr.next.data<n.data) {
				curr=curr.next;
				c++;
			}
			System.out.println(n.data+" is inserted in location: "+c);
			n.next=curr.next;
			curr.next=n;
		}
	}
	
	public static void deleteDuplicate() {
		
	}
	
	public static void main(String args[]) {
		MyLinkedList sll=new MyLinkedList(14);
		sll.insert(12);
		sll.insert(10);
		sll.insert(9);
		sll.insert(13);
		printReverse();
		sll.reverse();
		sll.print();
		sll.sort();
		sll.print();
		sll.sortedInsert();
		sll.print();
	}

}
