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
	    }
	}
    }

    public static void main(String[] args){
	MS m = new MS();
	System.out.println(m.merge());

    }
}
