public class Qs{
    private char[][] board;
    private int count = 0;
    private int sl;
    private boolean solved = false;
    private boolean ph = false;
    public Qs(int side){
	board = new char[side][side];
	sl = side;
	for (int i = 0; i < sl;i++){
	    for (int k = 0; k < sl ; k++){
		board[i][k] = '#';
	    }
	}
    }
    
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
    

    public String toString()
    {
	String s = "[2J\n";
				
	for (int y=0;y<sl;y++)
	    {
		for (int x=0;x<sl;x++)
		    s = s +board[x][y];
		s=s+"\n";
	    }
	return s;
    }
    
    public void solve(int x, int y){

	for (int i = 0;i< board.length;i++){
	    for (int k = 0; k< board.length; k++){
		if (board[i][k] != 'Q'){
		}else if (k - i == y - x){
		    if (y == sl-1){
			ph = true;
			System.out.println(this);
		    }	    // System.out.println("case1/"+x + "/" + y);
		    return ;
		} else if (k == y){
		    if (y == sl-1){
			ph = true;
			System.out.println(this);
		    }	    // System.out.println("case2/"+x + "/" + y);
		    return ;
		} else if (i == x){
		    if (y == sl-1){
			ph = true;
			System.out.println(this);
		    }	    // System.out.println("case3/"+x + "/" + y);
		    return ;
		} else if (k + i == y + x){
		    if (y == sl-1){
			ph = true;
			System.out.println(this);
		    }	    // System.out.println("case4/"+x + "/" + y);
		    return ;
		} else if (solved){
		    if (y == sl-1){
			ph = true;
			System.out.println(this);
		    }	    //   System.out.println("case5/"+x + "/" + y);
		    return ;
		}
	    }
	}

	if (count == sl){
	    System.out.println("SOLVED!");
	    solved = true;
	} 
	delay(200);
	board[x][y] = 'Q';
	System.out.println(this);
	count ++;
	for (int i = 0;i<sl;i++){
	    solve(x+1,i);
	    if (count != sl && ph ){
		ph = false;
		count --;
		board[x][y] = '#';
	    } 
	    
	}
	if (y == sl -1){
	    ph=true;
	}
	else if (x == 0 && y < sl){
	    y++;
	    solve (0,y);
	}

    }
		
    public static void main(String[] args){
	Qs q = new Qs(13);
	System.out.println(q);
	q.solve(0,0);
	System.out.println(q);
    }
}
