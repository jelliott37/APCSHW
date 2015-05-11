import java.util.*;
public class Tree{
    private Node start;
    public Node search(Integer i){
	Node T = start;
	while(T != null){
	    int ph = T.getData().compareTo(i);
	    if (ph == 0){
		return T;
	    } else if (ph < 0){
		T = T.getRight();
	    } else {
		T = T.getLeft();
	    }   
	}
	return null;
    }

    public void insert(Integer i){
	if(start == null){
	    start = new Node(i);
	}
	Node T = start;
	Node t2 = T;
	while (T != null){
	    t2 = T;
	    int ph = T.getData().compareTo(i);
	    if (ph == 0){
		return ;
	    } else if (ph < 0){
		T = T.getRight();
	    } else {
		T = T.getLeft();
	    }   
	}
	int ph = t2.getData().compareTo(i);
	if (ph < 0){
	    t2.setRight(new Node(i));
	} else {
	    t2.setLeft(new Node(i));
	}  
	
    }
    
    public Node rsearch(Integer i){
	return searchhelp(i,start);
    }
    private Node searchhelp(Integer i, Node t){
	if(t == null){
	    return null;
	}
	int ph = t.getData().compareTo(i);
	if(ph == 0){
	    return t;
	} else if (ph < 0){
	    return searchhelp(i, t.getRight());
	} else {
	    return searchhelp(i, t.getLeft());
	}
    }

    public void rinsert(Integer i){
	if(start == null){
	    start = new Node(i);
	    return;
	}
	inserthelp(i,start);
    }
    private void inserthelp(Integer i, Node t){
	int ph = t.getData().compareTo(i);
	if(ph == 0) {
	    return ;
	} else if(ph < 0){
	    if (t.getRight() != null){
		inserthelp(i, t.getRight());
	    } else {
		t.setRight(new Node(i));
	    }
	} else {
	    if ( t.getLeft() != null){
		inserthelp(i, t.getLeft());
	    } else {
		t.setLeft(new Node(i));
	    }
	}
    }

    public String toString(){
	return toStringHelper(start);
    }
    private String toStringHelper(Node t){
	if(t == null){
	    return "";
	}
	String ret = new String("");
	ret += toStringHelper(t.getLeft());
	//	System.out.println("This is a new element");
	ret += String.valueOf(t.getData()) + ";  ";
	//System.out.println(t.getData());

	ret += toStringHelper(t.getRight());
	return ret;
    }
    
    /*    public Integer remove(Integer i){
	Node T = start;
	Node t2 = start;
	if(T == null){
	    return null;
	}
	while (T.getData() != i){
	    t2 = T;
	    int ph = T.getData().compareTo(i);
	    if (ph < 0){
		T = T.getRight();
	    } else {
		T = T.getLeft();
	    }   
	}	
	if(T.getRight() == null){
	    t2.
	} else if (T.getLeft() == null){
	    
	}
    } 
    */
    public int numNodes(Node t){
	if (t==null){
	    return 0;
	}
	return 1 + numNodes(t.getRight()) + numNodes(t.getLeft());
    }

    public int height(Node t){
	if(t == null){
	    return 0;
	}
	int right = height(t.getRight());
	int left = height(t.getLeft());
	if(right > left){
	    return right + 1;
	} 
	return left + 1;
    }

    public void splitDupes(Node t){
	if(t == null) return;
	if(t.getRight().getData().equals(t.getData())){
	    Node temp = new Node(t.getData() -1);
	    temp.setRight(t.getRight());
	    t.setRight(temp);
	}
	if(t.getLeft().getData().equals(t.getData())){
	    Node temp = new Node(t.getData() -1);
	    temp.setLeft(t.getLeft());
	    t.setLeft(temp);
	}
	splitDupes(t.getRight());
	splitDupes(t.getLeft());
    }

    public Integer maxValue(Node t){
	if (t == null){
	    return Integer.MIN_VALUE;
	}
	return Math.max(t.getData(),
			Math.max(maxValue(t.getRight()), 
				 maxValue(t.getLeft())));
    }

    public int longest(Node t){
	if(t == null){
	    return 0;
	}
	return Math.max(longest(t.getRight()),
			Math.max(longest(t.getLeft()), 
				 height(t.getLeft())+height(t.getRight())+1));
    }
    
    public static void main(String[] args){
	Tree test = new Tree();
	Random r = new Random(5);
	//int[] = 
	for(int i = 1; i <=  20; i++){
	    System.out.println(test);
	    test.rinsert(r.nextInt(101));
	}

	

    }
    
}
