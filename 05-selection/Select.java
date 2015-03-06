public class Select{
    public Select(){
	
    }
    public int select(int[] l, int si, int ei){
	int[] D = new int[l.length];
	for (int i = 0; i < si; i++){
	    D[i] = l[i];
	}
	for (int i = ei; i < D.length; i++){
	    D[i] = l[i];
	}
	int pivot = l[si];
        for (int i = si+1; i < ei;i++){
	    if (l[i]<pivot){
		l[si]=l[i];
		si++;
	    }
	    else {
		l[ei]=l[i];
		ei--;
	    }
	    
	}
	l[si]=pivot;
    return si;
    }

}