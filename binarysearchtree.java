public class binarysearchtree
{
        class Node {
              int key;
              Node left,right;
	      public Node (int item)
{
	      key=item;
   	      left=right=null;
              }
        }
        Node root;
        binarysearchtree() {
              root=null;
        }
	void insert (int key) {
	      root=insertRec(root,key);
	}
	Node insertRec (Node root,int key) {
              if (root==null) {
			root=new Node(key);
			return root;
		}
	if (key<root.key)
	       root.left=insertRec (root.left,key);
	else if (key>root.key)
	        root.right=insertRec(root.right,key);
        return root ;
        }
        void printTree() {
               printTree(root);
        }
        void printTree(Node Node)
        { 
        if (Node!=null) {
               printTree (Node.left);
        System.out.print(Node.key+"");
               printTree (Node.right);
        }
        }
public static void main (String [] args) {
        binarysearchtree tree=new binarysearchtree();
       		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
System.out.println("\n binarysearchtree:");
		tree.printTree();
                }
}