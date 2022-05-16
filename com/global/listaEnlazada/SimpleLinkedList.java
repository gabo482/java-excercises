package global.listaEnlazada;

public class SimpleLinkedList {

    private Node first;

    public SimpleLinkedList(){
        this.first = null;
    }

    public void push (Object obj){
        Node newNode = new Node(obj);
        newNode.setNext(this.first);
        this.first = newNode;
    }

    public Node Pop (){
        Node temp = this.first;
        this.first = this.first.next();
        return temp;
    }

    public Node delete (Object val){
        Node currentNode = this.first;
        Node previousNode = this.first;

        while(!currentNode.value().equals(val)){
            if(currentNode.next() == null){
                return null;
            }else{
                previousNode = currentNode;
                currentNode = currentNode.next();
            }
        }

        if(currentNode == this.first){
            this.first = this.first.next();
        }else{
            previousNode.setNext(currentNode.next());
        }
        return currentNode;
    }

}