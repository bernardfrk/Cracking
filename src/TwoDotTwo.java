
public class TwoDotTwo {

	
	
	public int findKth(Node head, int k) {
		if (head == null) 
			return 0;
		
		int i = findKth(head.next, k) + 1;
		if (i == k) System.out.println("found");
				
		return i;
	}
	
	public static void main(String[] args) {
		
	}
}
