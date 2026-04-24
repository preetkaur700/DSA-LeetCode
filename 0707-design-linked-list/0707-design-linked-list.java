class Node{
    Node next;
    int val;
    Node prev;
    Node(int val){
        next=prev=null;
        this.val=val;
    }
}
class MyLinkedList {
    Node head;
    public MyLinkedList() {
        head=null;   
    }
    
    public int get(int index) {
        if(index<0)return -1;
        if(head==null)return -1;

        Node temp=head;
        for(int i=0;i<index && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null)return -1;
        int val = temp.val;
        return val;
    }
    
    public void addAtHead(int val) {
        
        Node newNode = new Node(val);
        newNode.next = head;
        if(head!=null){
            head.prev=newNode;
        }
        head=newNode;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);

        if(head==null){
            head=newNode;return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }      
        temp.next=newNode;
        if(temp!=null){
            newNode.prev=temp;
        }
    }
    
    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
        
        if(index<0)return;

        if(index==0){
            addAtHead(val);
            return;
        }

        if(head==null)return;
        Node temp=head;
        for(int i=0;i<index-1 && temp!=null;i++){
            temp=temp.next;
        }
        
        if(temp==null)return;
        newNode.next = temp.next;

        if(temp.next!=null){
            temp.next.prev=newNode;
        }

        temp.next=newNode;
        if(temp!=null){
          newNode.prev=temp;
        }     
        
    }
    
    public void deleteAtIndex(int index) {
        if(head==null)return;
        if(index<0)return;
        if(index==0){
            head=head.next;
            if(head!=null){
                head.prev=null;
            }
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null || temp.next==null)return;
        temp.next=temp.next.next;
        if(temp.next!=null){
            temp.next.prev=temp;
        }
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */