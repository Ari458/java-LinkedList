class Node <type>{
    public type data;
    public Node next;

    Node(type data){
        this.data=data;
        this.next=null;
    }

    public String toString(){
        return data+""; 
    }
}


class NodeOperations{
    private static String name;

    static{
        name="Arindam Dutta";
    }

    public static void authorName(){
        System.out.println(name);
    }

    public static <type> Node addFront(Node root,type data){
        Node temp= new Node(data);
        if(root==null)
           root=temp; 
        else{
            Node p=root;
            root=temp;
            temp.next=p;
        }
        return root;
    }

    public static <type> Node addEnd(Node root,type data){
        Node temp= new Node(data);
        if(root==null)
           root=temp;
        else{
            Node p=root;
            while(p.next!=null)
                  p=p.next;
            p.next=temp;      
        }
        return root;
    }

    public static <type> Node addSpecificPos(Node root,type data,int pos){
        Node temp= new Node(data);
        int count=0;

        if(pos==0) 
            System.err.println("wrong postion");   
        else if(root==null && pos==1)
            root=temp;
        else if(root!=null && pos==1)
            addFront(root,data);     
        else if(root!=null && pos>1){
            Node front,back;
            front=root;
            back=root.next;

            while(front!=null){
                if(++count==pos-1)break;
                else{
                    front=front.next;
                    back=back.next;
                }
            }
            front.next=temp;
            temp.next=back;  
        }
        return root;
    }

    public static Node delFront(Node root){
        if(root==null)
          System.out.println("empty linked-list");
        else
            root=root.next;
        return root;    
    }

    public static Node delEnd(Node root){
        Node p=root;
        if(root==null)
          System.out.println("empty linked-list");
        else{
            while(p.next.next!=null)
                p=p.next;
            p.next=null;    
        }  
        return root;
    }

    public static Node delSpecificPos(Node root,int pos){
        int count=0;
        if(pos==0) 
            System.err.println("wrong postion"); 
        else if(root==null)
            System.out.println("empty linked list");
        else if(root!=null && pos==1)
            delFront(root);
        else if(root!=null && pos>1){  
            Node front,back;
            front=root;
            back=root.next;

            while(front!=null){
                if(++count==pos-1)break;
                else{
                    front=front.next;
                    back=back.next;
                }
            }
            front.next=back.next;
        }  
        return root;       
    }

    public static void show(Node root){
        if(root==null)
        System.err.println("Empty linked list");
        else{
            Node p=root;
            while(p!=null){
                System.out.print(p);
                if(p.next!=null)
                System.out.print(" ==> ");
                p=p.next;
            }
        }
    }
}

