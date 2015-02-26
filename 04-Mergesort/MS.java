import java.util.*;
public class MS{
    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
	ArrayList<Integer> c = new ArrayList<Integer>();
	while(b.size() > 0 || a.size() > 0){
	    if(b.size()==0){
		c.add(a.remove(0));
	    } else if (a.size() == 0){
	        c.add(b.remove(0));
	    } else if (a.get(0) > b.get(0)){
		c.add(b.remove(0));
	    } else {
		c.add(a.remove(0));
	    }
	}
	return c;
    }
    public ArrayList<Integer> msort(ArrayList<Integer> a){
	if (a.size() > 1) {
	    ArrayList b = new ArrayList<Integer>(a.subList(0,a.size()/2));
	    ArrayList c = new ArrayList<Integer>(a.subList(a.size()/2,a.size()));
	    ArrayList a1 = msort(b);
	    ArrayList a2 = msort(c);
	    return merge(a1,a2);
	} else {
	    return a;
	}
    }
    

    public int[] merge(int[] a, int[] b){
	int[] c = new int[a.length+b.length];
	int bit=0;
	int ait=0;
	int cit=0;
	while(bit<b.length||ait<a.length){
	    if(bit == b.length){
		c[cit]=a[ait];
		cit++;
		ait++;
	    } else if (ait == a.length){
		c[cit]=b[bit];
		cit++;
		bit++;
	    } else if (a[ait] > b[bit]){
		c[cit]=b[bit];
		cit++;
		bit++;
	    } else {
		c[cit]=a[ait];
		cit++;
		ait++;
	    }
	}
	return c;
    }

    public int[] msort(int[] a){
	if (a.length >  1){
	    int[] b = Arrays.copyOfRange(a, 0, a.length/2);
	    int[] c = Arrays.copyOfRange(a, a.length/2, a.length);
	    int[] a1 = msort(b);
	    int[] a2 = msort(c);
	    return merge(a1,a2);
	} else {
	    return a;
	}
    }
    public static void main(String[] args){
	MS m = new MS();
	//	ArrayList a = new ArrayList<Integer>(Arrays.asList(1,3,5,6,9,10));
	
	//	ArrayList b = new ArrayList<Integer>(Arrays.asList(2,4,7,8,11));
	//	System.out.println(m.merge(a,b));
	//	int[] a = {1,3,5,6,7,10};
	//int[] b = {2,4,8,9,11};
	//System.out.println(Arrays.toString(m.merge(a,b)));
	//ArrayList c = new ArrayList<Integer>(Arrays.asList(1,56,7,3,8,45,2,87));
	//	System.out.println(m.msort(c));
	int[] d = {1,56,7,3,9,45,2,87};
	System.out.println(Arrays.toString(m.msort(d)));
    }
}
