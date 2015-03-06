public class Select{
    public Select(){
	
    }
    public int Select(int[] a, int k, ing l, int h){
	int pivot = a[k];
	a[k]=a[h];
	li=l;
	hi=h;
	while (hi>li){
	    if(a[li]<pivot){
		li++;
	    } else {
		int ph = a[li];
		a[li]=a[hi];
		a[hi]=ph;
	    }
	}
	if (a[li] > pivot){
	    int pi = li;
	    a[h]=a[li];
	    a[li]=pivot;
	} else {
	    int pi = li+1;
	    a[h]=a[li+1];
	    a[li+1]=pivot;
	}
	if (k == pi){
	    return pivot;
	}
	else if (k < pi){
	    Select(a,k,pi+1,h);
	} else {
	    Select(a,k,l,pi-1);
	}
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
