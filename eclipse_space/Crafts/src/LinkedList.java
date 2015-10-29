
public class LinkedList {
	Node start;
	void insertFront(int element){
		Node newnode=new Node(element);
		Node temp=null;
		if(start==null) start=newnode;
		else {
			temp=start;
			start=newnode;
			start.next=temp;
		}
	}
	void insertMiddle(int position,int element) {
		try {
			int count=1;
			Node ptr=start;
			for(;count<position;count++) ptr=ptr.next;
			Node newnode=new Node(element);
			newnode.next=ptr.next;
			ptr.next=newnode;
		}
		catch(NullPointerException ex) {
			System.err.println("Error State 78EF! :(");
			return;
		}
	}
	void insertRear(int element){
		Node newnode=new Node(element);
		if(start==null) start=newnode;
		else {
			Node ptr=start;
			while(ptr.next!=null) ptr=ptr.next;
			ptr.next=newnode;
		}
	}
	void display() {
		Node ptr=start;
		while(ptr!=null) {
			System.out.print(ptr.getInt()+"-->");
			ptr=ptr.next;
		}
	}
}
