class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        this.val = x;
    }
}

class CustomLinkedList{
    ListNode head;

    public CustomLinkedList(){
        this.head = null;
    }
    public void insertAtHead(int val){
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }
    public void inserAtTail(int val){
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
            return;
        }

        ListNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }
    public void deleteValue(int val){
        if(head == null) return;

        if(head.val == val){
            head = head.next;
            return;
        }
        ListNode curr = head;
        while(curr.next != null && curr.next.val != val){
            curr = curr.next;
        }
        if(curr.next != null){
            curr.next = curr.next.next;
        }
    }
    public void printList(){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
    public static void main(String[] args){
        CustomLinkedList list = new CustomLinkedList();
        list.insertAtHead(3);
        list.insertAtHead(2);
        list.insertAtHead(1);
        list.inserAtTail(4);
        list.inserAtTail(5);

        System.out.println("Linked List:");
        list.printList();

        System.out.println("Deleting value 3:");
        list.deleteValue(3);
        list.printList();
    }
}