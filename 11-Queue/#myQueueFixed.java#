public class myQueueFixed{
    private int[] array;
    private int start;
    private int end;

    public myQueueFixed(int n){
	array = new int[n];
	start = 0;
	end = 0;
    }

    public int dequeue(){
	if (empty()){
	    return 0;
	} else {
	    start += 1;
	    return array[start-1];
	}
    }
    public void enqueue(int n){
        array[end]=n;
	end++;
    }
    public boolean empty(){
	return start == end;
    }
    public int head(){
	if(empty()){
	    return 0;
	}
	return array[start];
    }
}
