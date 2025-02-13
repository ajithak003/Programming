package praticeFile;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;


public class BinaryTreePreOrder {
	public static class TreeNode
    {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data)
        {
            this.data=data;
        }
    }
 
    // Recursive Solution
    public void postOrder(TreeNode root) {
        if(root !=  null) {
            postOrder(root.left);
            postOrder(root.right);
            //Visit the node by Printing the node data  
            System.out.print(root.data+" ");
        }
    }
 
    // Iterative solution
    public void postorderIter( TreeNode root) {
        if( root == null ) return;
 
        Stack<TreeNode> s = new Stack<TreeNode>( );
        TreeNode current = root;
 
        while( true ) {
 
            if( current != null ) {
                if( current.right != null ) 
                    s.push( current.right );
                s.push( current );
                current = current.left;
                continue;
            }
 
            if( s.isEmpty( ) ) 
                return;
            current = s.pop( );
 
            if( current.right != null && ! s.isEmpty( ) && current.right == s.peek( ) ) {
                s.pop( );
                s.push( current );
                current = current.right;
            } else {
                System.out.print( current.data + " " );
                current = null;
            }
        }
    }
    
    public static void levelOrderTraversal(TreeNode startNode) {
        Queue<TreeNode> queue =  new LinkedList<TreeNode>();
        queue.add(startNode);
        while(!queue.isEmpty())
        {
            TreeNode tempNode=queue.poll();
            System.out.printf("%d ",tempNode.data);
            if(tempNode.left!=null)
                queue.add(tempNode.left);
            if(tempNode.right!=null)
                queue.add(tempNode.right);
        }
    }
    
    public static void spiralOrZigzagLevelOrder(TreeNode root) {
        if(root==null) return; 
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
 
        boolean directionflag=false;
        while(!stack.isEmpty())
        {
            Stack<TreeNode> tempStack=new Stack<>();
 
            while(!stack.isEmpty())
            {
                TreeNode tempNode=stack.pop();
                System.out.printf("%d ",tempNode.data);
                if(!directionflag) 
                {
                    if(tempNode.left!=null) 
                        tempStack.push(tempNode.left);
                    if(tempNode.right!=null) 
                        tempStack.push(tempNode.right);
                }else
                {
                    if(tempNode.right!=null) 
                        tempStack.push(tempNode.right);
                    if(tempNode.left!=null) 
                        tempStack.push(tempNode.left);
                }
            }
            // for changing direction
            directionflag=!directionflag; 
 
            stack=tempStack; 
        }
        
        System.out.println();
 
    }
    public static  int getMaximumRec(TreeNode root)
    {
        int max=Integer.MIN_VALUE;
        int value=0;
        int left,right;
        if(root != null)
        {
            value=root.data;
            left=getMaximumRec(root.left);
            right=getMaximumRec(root.right);
 
            if(left>right)
            {
                max=left;
            }
            else
            {
                max=right;
            }
 
            if(max < value)
            {
                max=value;
            }
        }
 
        return max;
    }
 
    public static void main(String[] args)
    {
    	BinaryTreePreOrder bi=new BinaryTreePreOrder();
        // Creating a binary tree
        TreeNode rootNode=createBinaryTree();
        System.out.println("Using Recursive solution:");
        bi.getMaximumRec(rootNode);
        bi.spiralOrZigzagLevelOrder(rootNode);
        bi.levelOrderTraversal(rootNode);
        System.out.println();
        bi.postOrder(rootNode);
 
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Using Iterative solution:");
 
        bi.postorderIter(rootNode);
    }
 
    public static TreeNode createBinaryTree()
    {
 
        TreeNode rootNode =new TreeNode(40);
        TreeNode node20=new TreeNode(20);
        TreeNode node10=new TreeNode(10);
        TreeNode node30=new TreeNode(30);
        TreeNode node60=new TreeNode(60);
        TreeNode node50=new TreeNode(50);
        TreeNode node70=new TreeNode(70);
 
        rootNode.left=node20;
        rootNode.right=node60;
 
        node20.left=node10;
        node20.right=node30;
 
        node60.left=node50;
        node60.right=node70;
 
        return rootNode;
    }
}
