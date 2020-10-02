class invertTree
{
    Node root;
    invertTree()
    {
        root=null;
    }
    public void invert()
    {
        root=invert(root);
    }
    Node invert(Node node)
    {
        if(node==null)
            return node;
            
        Node left=invert(node.left);
        Node right=invert(node.right);
        
        node.left=right;
        node.right=left;
        
        return node;
    }
    public void printTree(Node node)
    {
        if(node!=null)
        {
            printTree(node.left);
            System.out.print(node.data+" ");
            printTree(node.right);
        }
    }
    public static void main(String args[])
    {
        invertTree tree=new invertTree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7);
        
        tree.invert();
        System.out.println("Invert tree in inorder form...");
        tree.printTree(tree.root);
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