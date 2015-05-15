public class Heap{ //min heap
    private int[] data;
    private int last = 0;
    public Heap(int n){ // n is of the form 2^x - 1
	data = new int[n];
    }
    public Heap(int[] n){ // n has length 2^x - 1
	data = new int[n.length];
	for(int i : n){
	    insert(i);
	} 
    }
    public void siftup(int n){
	if(n == 0){
	    return ;
	} else if(data[n] < data[(n + 1) / 2]){
	    int ph = data[n];
	    data[n] = data[(n+1) / 2];
	    data[(n+1) / 2] = ph;
	    siftup((n+1) / 2);
	} 
	return ;
    }
    public void pushdown(int n){
	if(n > (data.length+1) / 2){
	    return ;
	} else if(data[n] > data[2 * n + 1]){
	    if(data[2 * n + 1] < data[2 * n + 2]){
		int ph = data[n];
		data[n] = data[2 * n + 1];
		data[2 * n + 1] = ph;
		pushdown(2 * n + 1);
	    } else {
		int ph = data[n];
		data[n] = data[2 * n + 2];
		data[2 * n + 2] = ph;
		pushdown(2 * n + 2);
	    }
	} else if(data[n] > data[2 * n + 2]){
	    int ph = data[n];
	    data[n] = data[2 * n + 2];
	    data[2 * n + 2] = ph;
	    pushdown(2 * n + 2);
	}
	return ;
    }
    public void insert(int n){
	if (last == 0) {
	    data[0] = n;
	} else if (last < data.length) {
	    data[last] = n;
	    siftup(last);
	} else {
	    last--;
	}
	last++;
    }
    public int deleteMin(){
	if(last != 0){
	    int ph = data[0];
	    data[0] = data[last];
	    data[last] = ph;
	    pushdown(0);
	    last--;
	    return ph;
	}
	return Integer.MAX_VALUE;
    }
    public int[] sort(){
	int[] heap = data;
	while(last > 0){
	    deleteMin();
	}
	int[] sorted = data;
	data = heap;
	return sorted;
    }    
}
