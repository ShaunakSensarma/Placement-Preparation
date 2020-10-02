class heightTree
{
    Node root;
    heightTree()
    {
        root=null;
    }
    int maxDepth(Node node)  
    { 
        if(node==null)
            return 0;
        else
        {
            int ldepth=maxDepth(node.left);
            int rdepth=maxDepth(node.right);
            
            if(ldepth>rdepth)
                return(ldepth+1);
            else
                return(rdepth+1);
        }
    } 
    public static void main(String args[])
    {
        heightTree tree=new heightTree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7);  
        
        System.out.println("Height of tree..."+tree.maxDepth(tree.root));
    }
}
class Node
{
    int data;
    Node left;
    Node right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}