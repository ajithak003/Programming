package praticeFile;

public class LinkedList{
	 
    private Node head;
 
    private static class Node {
        private int value;
        private Node next;
 
        Node(int value) {
            this.value = value;
 
        }
    }
 
    public void addToTheLast(Node node) {
 
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
 
            temp.next = node;
        }
    }
 
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.format("%d ", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }
 
    public boolean ifLoopExists() {
        Node fastPtr = head;
        Node slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr)
                return true;
 
        }
        return false;
    }
 
    public Node  findStartNodeOfTheLoop() {
        Node fastPtr = head;
        Node slowPtr = head;
        boolean loopExists=false;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr)
            {
                loopExists=true;
                break;
            }
 
        }
        if(loopExists)
        {
            slowPtr=head;
 
            while(slowPtr!=fastPtr)
            {
                slowPtr=slowPtr.next;
                fastPtr=fastPtr.next;
            }
 
        }
        else
        {
            System.out.println("Loop does not exists");
            slowPtr=null;
        }
        return slowPtr;
    }
    
    public static Node reverseLinkedList(Node currentNode)
    {
        // For first node, previousNode will be null
        Node previousNode=null;
        Node nextNode;
        while(currentNode!=null)
        {
            nextNode=currentNode.next;
            // reversing the link
            currentNode.next=previousNode;
            // moving currentNode and previousNode by 1 node
            previousNode=currentNode;
            currentNode=nextNode;
        }
        return previousNode;
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // Creating a linked list
        Node loopNode=new Node(7);
        list.addToTheLast(loopNode);
        list.addToTheLast(new Node(5));
        list.addToTheLast(new Node(6));
       // list.addToTheLast(loopNode);
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));
 
        Node reverseHead=reverseLinkedList(loopNode);
        list.printList();
        // creating a loop
        list.addToTheLast(loopNode);
        // Test if loop existed or not
        System.out.println("Loop existed-->" + list.ifLoopExists());
        
        Node startNode=list.findStartNodeOfTheLoop();
        if(startNode!=null)
            System.out.println("start Node of loop is "+ startNode.value);
    
 
    }
}