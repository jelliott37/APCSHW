public class Node{
    private int Data;
    private Node right,left;
    public Node(int n){
	Data = n;
    }
    public int getData(){
	return Data;
    }
    public Node getRight(){
	return right;
    }
    public Node getLeft(){
	return left;
    }
    public void setRight(Node n){
	right = n;
    }
    public void setLeft(Node n){
	left = n;
    }
    public void setData(int i){
	Data = i;
    }
}
