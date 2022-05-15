public class LinkedList{
    public static void main(String[] args) throws Exception{
        Node root=null;
        root=NodeOperations.addEnd(root,"Aridam Dutta");
        root=NodeOperations.addEnd(root,"Sohini Debnath");
        root=NodeOperations.addEnd(root,"Ishani Deb");
        root=NodeOperations.addEnd(root,189.90);
        root=NodeOperations.addEnd(root,12);
        root=NodeOperations.delSpecificPos(root,"Atanu Nandi");
        NodeOperations.show(root);
    }
}
