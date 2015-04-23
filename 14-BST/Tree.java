public class Tree{
    private Node start;
    
    public Node search(int i){
	Node T = start;
	while(T != null){
	    int ph = T.getData().compareTo(i);
	    if (ph == 0){
		return T;
	    } else if (ph < 0){
		T = T.getLeft();
	    } else {
		T = T.getRight();
	    }   
	}
	return null;
    }

    public void insert(int i){
	Node T = start;
	while (t != null){
	    Node t2 = T;
	    int ph = T.getData().compareTo(i);
	    if (ph == 0){
		return T;
	    } else if (ph < 0){
		T = T.getLeft();
	    } else {
		T = T.getRight();
	    }   
	}
	int ph = t2.getData().compareTo(i);
	if (ph < 0){
	    t2.setLeft(new Node(i));
	} else {
	    t2.setRight(new Node(i));
	}  
	
    }
}
