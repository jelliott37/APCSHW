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
    
    public Integer remove(Integer i){
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
    
    public static void main(String[] args){
	Tree test = new Tree();
	Random r = new Random(5);
	//int[] = 
	for(int i = 1; i <=  20; i++){
	    System.out.println(test);
	    test.rinsert(r.nextInt(100));
	}
	

    }
    
}
