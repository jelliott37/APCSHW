
public class LList{
    private Node l=null;
    private int len = 0;
    private Node dummy = new Node("dummy",l);
    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
	len +=1;
	dummy.setNext(
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
    public Node get(int n){
	if (n > len){
	    return null;
	}
	Node tmp = dummy;
	while (n + 1 > 0){
	    n--;
	    tmp = tmp.getNext();
	}
	return tmp;
    }
    public void add(int n, String s){
	if (n > len){
	    return;
	}
	Node tmp = dummy;
	while (n + 1 > 1){
	    n--;
	    tmp = tmp.getNext();
	}
	tmp.setNext(newNode(s, tmp.getNext()));
    }
    public void remove(int n){
	if (n > len){
	    return ;
	}
	Node tmp = dummy;
	while (n + 1 > 1){
	    n--;
	    tmp = tmp.getNext();
	}
	tmp.setNext(tmp.getNext().getNext());
    }
}
