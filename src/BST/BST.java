package BST;

public class BST
{
    private BSTNode root;

    public void put( int key)
    {
        if ( root == null )
        {
            root = new BSTNode( key);
        }
        else
        {
            root.put( key);
        }
    }

    public int get(  )
    {
        return root == null ? null : root.get();
    }
    public BSTNode getRight(  )
    {
        return root.right();
    }
    public BSTNode getLeft(  )
    {
        return root.left();
    }
    
   
}