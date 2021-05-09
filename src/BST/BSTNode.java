package BST;

public class BSTNode
{
    private int key;
    private BSTNode left, right;

    public BSTNode( int key )
    {
        this.key = key;
        this.left = null; 
        this.right = null ;
    }

    //if key not found in BST then it is added. If jey already exists then that node's value
    //is updated.
    public void put( int key )
    {
        if ( key < this.key )         
        {             
            if ( left != null )             
            {                 
                left.put(key);             
            }             
            else             
            {                 
                left = new BSTNode( key);             
            }         
        }         
        else if ( key > this.key)
        {
            if ( right != null )
            {
                right.put( key );
            }
            else
            {
                right = new BSTNode( key );
            }
        }

    }

    //find Node with given key and return it's value
    public int get()
    {
        return this.key;
    }
    public BSTNode right() {
    	return this.right;
    }
    public BSTNode left() {
    	return this.left;
    }
}