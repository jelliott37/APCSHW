import java.io.*;
import java.util.*;

public class LLit<E> implements Iterator<E>{
    private Node<E> t;
    private Node<E> ta;
    public LLit(Node<E> n){
	t=n;
	ta=n;
    }

    public boolean hasNext(){
	return t!=null;
    }

    public E next(){
	E retval = t.getData();
	t=t.getNext();
	if(!(ta==t || ta.getNext() == t)){
	    ta=ta.getNext();
	}
	return retval;
    }

    public void remove(){
	ta.setNext(t);
    }
}

