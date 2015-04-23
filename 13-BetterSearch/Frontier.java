import java.util.*;

public class Frontier {
    public LinkedList<Node> l = new LinkedList<Node>();

    public void add(Node n){
	l.add(n);
    }

    public Node remove() {
	return l.remove(0);
    }

    public boolean isEmpty(){
	return l.isEmpty();
    }
    public void addInOrder(Node n){
	int index = 0;
	for (Node temp : l){
	    if(temp.getPriority()>n.getPriority()){
		l.add(index,temp);
		break;
	    }
	    index++;
	}

    }
}










