public class myQueueArray{
    private int[] array;
    private int start;
    private int end;

    public myQueueArray(int n){
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
	if(end >= array.length){
	    adjust();

	}
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
    public void adjust(){
	
	for(int i = 0; i < end-start; i++){
	    array[i]=array[i+start];
	}
	end -= start;
	start = 0;
	if (end >= array.length){
	    int[] temp = new int[array.length+1];
	    for(int i = 0; i < array.length; i++){
		temp[i]=array[i];
	    }
	    array= temp;
	}
    }
}
