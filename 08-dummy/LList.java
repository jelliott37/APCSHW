
public class LList{
    private Node l=null;
    private int len = 0;
    private Node dummy = new Node("dummy",l);
    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
	len += 1;
    }
		
    public String toString(){
	String s = "";
	Node tmp;
	for (tmp=l ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
    public Node get(int n){
	if (n > len){
	    return null;
	}
	Node tmp = l;
	while (n > 0){
	    n--;
	    tmp = tmp.getNext();
	}
	return tmp;
    }
    public void add(int n, String s){
	if (n > len){
	    return;
	}
	Node tmp = l;
	while (n - 1 > 1){
	    n--;
	    tmp = tmp.getNext();
	}
	if (tmp.getNext() != null){
	    tmp.setNext(new Node(s, tmp.getNext()));
	} else {
	    tmp.setNext(new Node(s));
	}
    }
    public void remove(int n){
	if (n > len){
	    return ;
	} else if (n == 0){
	    
	}
	Node tmp = l;
	while (n -1 > 1){
	    n--;
	    tmp = tmp.getNext();
	}
	if (tmp.getNext().getNext() != null){
	    tmp.setNext(tmp.getNext().getNext());
	} else {
	    tmp.setNext(null);
	}

    }
}
