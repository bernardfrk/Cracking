public class FourDotOne {

	class TreeNode {
		public TreeNode left;
		public TreeNode right;
	}

	class Node {

	}

	public static int checkHeight(TreeNode node) {
		if (node == null)
			return 0;

		int left = checkHeight(node);
		if (left == -1)
			return -1;

		int right = checkHeight(node);
		if (right == -1)
			return -1;

		int height = Math.abs(left - right);
		if (height > 1)
			return -1;
		else
			return 1 + Math.max(left, right);
	}

	public static boolean isBalanced(TreeNode root) {
		if (checkHeight(root) == -1)
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
		System.out.println(test());

	}
	
	private static String test() {
		try {  
		    System.out.println("inside try");
		    throw new Exception();
//		    return "try";  
		}  
		catch (Exception e) {
			System.out.println("inside catch");
		    return "catch";  
		}  
		finally {  
		    System.out.println("inside finally.");
		    return "finally";
		}
	}

}
