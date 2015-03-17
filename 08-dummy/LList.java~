public class LList{
    private Node l=null;

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }
		
    public String toString(){
	String s = "";
	Node tmp;;
	for (tmp=l ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
    public Node find(int n){
	return find(n, l);
    }
    public Node find(int n, Node no){
	if (n == 0){
	    return no;
	}
	else{
	    return find(n-1, no.getNext());
	}
    }
    public void insert(int n, String s){
	if (n == 0){
	    Node tmp = new Node(s);
	    tmp.setNext(l);
	    l = tmp;
	}
	else{
	    insert(n, s, l);
        }
    }
    public Node insert(int n, String s, Node no){
        if ( n == 0){
	    Node tmp = new Node(s);
	    tmp.setNext(no);
	    return tmp;
	} else if (n == 1){
	    Node tmp = insert(n-1, s, no.getNext());
	    no.setNext(tmp);
	    return tmp;
	} else {
	    return insert(n-1, s, no.getNext());
	}
    }
}
