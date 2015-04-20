
public class Node {
    private int x,y;
    private Node prev;
    private int priority;
    public Node(int x, int y){
	this.x = x;
	this.y = y;
    }
    public Node(int x, int y, int pri){
	this.x = x;
	this.y = y;
	priority = pri;
    }
    public int getPriority(){
	return priority;
    }
    public Node getPrev() {
	return prev;
    }

    public void setPrev(Node n){
	prev = n;
    }
		
    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }
		
}










