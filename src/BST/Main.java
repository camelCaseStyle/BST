package BST;

public class Main {

	public static void main(String[] args) {
		BST tree = new BST();
		tree.put( 1);
		tree.put( 2);
		tree.put( 431);
		tree.put( 41);
		tree.put(2000);
		tree.put(20001);
		tree.put( 214);
		System.out.println(maxValue(tree.getRight()));
	}
	
	public static int maxValue(BSTNode node) {
		if(node == null) return -1; 
		int  max = node.get() >  maxValue(node.right()) ? node.get() : maxValue(node.right());
		return max; 
	}

}
