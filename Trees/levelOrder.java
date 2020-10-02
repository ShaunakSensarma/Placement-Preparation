
class levelOrder
{
    Node root;
    levelOrder()
    {
        root=null;
    }
    public void printlevelOrder(Node node)
    {
        int h=height(node);
        for(int i=1;i<=h;i++)
        {
            printlevel(node,i);
            System.out.println();
        }     
    }
    public int height(Node n)
    {
        if(n==null)
            return 0;
        else
        {
            int lh=height(n.left);
            int rh=height(n.right);
            if(lh>rh)
                return lh+1;
            else
                return rh+1;
        }
    }
    public void printlevel(Node root,int level)
    {
        if(root==null)
            return;
        else if(level==1)
            System.out.print(root.data+" ");
        else
        {
            printlevel(root.left,level-1);
            printlevel(root.right,level-1);
        }
    }
    public static void main(String args[])
    {
        levelOrder tree=new levelOrder();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        
        tree.printlevelOrder(tree.root);
    }
}
class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}