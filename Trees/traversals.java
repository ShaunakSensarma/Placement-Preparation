
class traversals
{
    Node root;
    
    traversals()
    {
        root=null;
    }
    public void inorder(Node node)
    {
        if(node!=null)
        {  
            inorder(node.left);
            System.out.print(node.data+",");
            inorder(node.right);
        }
    }
    public void preorder(Node node)
    {
        if(node!=null)
        {
            System.out.print(node.data+",");
            preorder(node.left);
            preorder(node.right);
        }
        
    }
    public void postorder(Node node)
    {
        if(node!=null)
        {            
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data+",");
        }
    }
    public static void main(String args[])
    {
        traversals tree=new traversals();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(11);
        
        tree.root.right.left.left = new Node(12);
        tree.root.right.left.right = new Node(13);
        tree.root.right.right.left = new Node(14);
        tree.root.right.right.right = new Node(15);
        
        System.out.println("\n\nIn-order traversal.");
        tree.inorder(tree.root);
        
        
        System.out.println("\n\nPre-order traversal.");
        tree.preorder(tree.root);
        
        
        System.out.println("\n\nPost-order traversal.");
        tree.postorder(tree.root);
    }
}
class Node
{
      int data;
      Node left;
      Node right;
      public Node(int d)
      {
          data=d;
          left=null;
          right=null;
      }
}
