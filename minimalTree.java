class minimalTree
{
    Node root;
    minimalTree()
    {
        root=null;
    }
    public static void main(String args[])
    {
        minimalTree tree=new minimalTree();
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        tree.createminimaltree(arr);
    }
    Node createminimaltree(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        return createminimaltree(arr,start,end);
    }
    Node createminimaltree(int arr[],int start,int end)
    {
        if(end<start)
            return null;
        else
        {
            int mid=(start+end)/2;
            Node root=new Node(arr[mid]);
            root.left=createminimaltree(arr,start,mid-1);
            root.right=createminimaltree(arr,mid+1,end);
            return root;
        }
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