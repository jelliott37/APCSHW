public class Driver{
    public static void main(String[] args){
	myQueueArray q = new myQueueArray(5);
	q.enqueue(3);
	q.enqueue(27);
	System.out.println(q.head());
	System.out.println(q.dequeue());
	q.enqueue(1234);
	q.enqueue(54312);
	q.enqueue(543);
	q.dequeue();
	System.out.println(q.head());
	q.enqueue(4);q.enqueue(4);q.enqueue(4);q.enqueue(4);q.enqueue(4);q.enqueue(4);q.enqueue(4);q.enqueue(4);
	
    }
}
