//add getValue()
//add getNext()
//add main
//create 2 nodes manually
//add while loop
//add addNode
//add one node using addNode


public class Stack {
    private ListNode head;
    private ListNode tail;
    
    public Stack(ListNode h) {
        head = h;
        tail = h;
    }
    
    public ListNode getHead() {return head;}
    public void setHead(ListNode h) {head =h;}
    
    public ListNode getTail() {return tail;}
    public void setTail(ListNode t) {tail = t;}
    
    public void addNode(ListNode n) {
        tail.setNext(n);
        tail = n;
    }
    
    public void printList() {
        ListNode curr = head;
        while(curr != null) {
            System.out.println("Current node: "+curr.getValue());
            curr = curr.getNext();
        }
    }
    
    public void deleteValue(int val) {
        ListNode curr = head;
        ListNode prev = head;
        while(curr != null) {
            if(curr.getValue() == val) {
                prev.setNext(curr.getNext());
                curr = curr.getNext();
                continue;
            }
            prev = curr;
            curr = curr.getNext();
        }
    }
    
    //finish Monday
    public ListNode pop() {
        ListNode curr = head;
        while(curr.getNext() != tail) {
            curr = curr.getNext();
        }
        tail = curr;
        ListNode returnVal = tail.getNext();
        tail.setNext(null);
        
        return returnVal;
    }
    
    public void addHeadNode(ListNode n) {
        n.setNext(head);
        head = n;
    }
    
    public static void main(String args[]) {
        ListNode node1 = new ListNode(13,null);
        Stack stack1 = new Stack(node1);
        
        stack1.addNode(new ListNode(12,null));
        stack1.addNode(new ListNode(11,null));
        stack1.addNode(new ListNode(12,null));
        stack1.addNode(new ListNode(100,null));
        
        System.out.println("pop: "+stack1.pop().getValue());
        
        stack1.printList();
        System.out.println("\n\n");
        
    }
    
}










































/**
    public void add(ListNode n) {
        tail.setNext(n);
        tail = n;//comment to show
    }
    
    public void addHead(ListNode n) {
        n.setNext(head);
        head = n;
    }
    
    public void printList() {
        ListNode curr = head;
        while(curr != null) {
            System.out.println("curr: "+curr.getValue());
            curr = curr.getNext();
        }
    }
    
    public void deleteValue(ListNode n) {
        int val = n.getValue();
        ListNode curr = head;
        ListNode prev = curr;
        while(curr != null) {
            if(curr.getValue() == val) {
                prev.setNext(curr.getNext());
            }
            prev = curr;
            curr = curr.getNext();
        }
    }
    
    public static void main(String args[]) {
        ListNode node1 = new ListNode(37,null);
        ListNode node2 = new ListNode(25,null);
        node1.addNode(node2);
        
        ListNode curr = node1;
        while(curr.getNext() != null) {
            System.out.println("curr val: "+curr.getValue());
            curr = curr.getNext();
        }
        
        LinkedList list1 = new LinkedList(node1);
        list1.add(new ListNode(15,null));
        list1.add(new ListNode(20,null));
        list1.add(new ListNode(35,null));
        list1.addHead(new ListNode(1,null));
        list1.printList();
        list1.deleteValue(node1);
        list1.printList();
    }
    
    
}
*/