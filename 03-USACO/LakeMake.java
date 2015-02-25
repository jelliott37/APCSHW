public class LakeMake{
    String input = new String("4 6 22 2\n28 25 20 32 34 36\n27 25 20 20 30 34\n24 20 20 20 20 30\n20 20 14 14 20 20\n1 4 4\n1 1 10");
    String delims="[\n]+";
    String delims2="[ ]+";
    String[] ip = input.split(delims);
    String[] vars = ip[0].split(delims2);
    int[] othervars = new int[vars.length];
    public int function(){
	int ph = 0;
	for (String v : vars){
	    othervars[ph]=Integer.parseInt(v);
	    ph++;
	}
	String[][] board=new String[othervars[0]][othervars[1]];
	ph = 1;
	while (ph <= othervars[0]){
	    board[ph-1] = ip[ph].split(delims2);
	    ph++;
	}
	int[][] field = new int[othervars[0]][othervars[1]];
	for (int i = 0; i < othervars[0];i++){
	    for (int j = 0; j <othervars[1]; j++){
		field[i][j]= Integer.parseInt(board[i][j]);
	    }
	}
	String[][] orderedPairs = new String[othervars[3]][3];
	while (ph <= othervars[0]+othervars[3]){
	    orderedPairs[ph-1-othervars[0]]=ip[ph].split(delims2);
	    ph++;
	}
	int[][] op = new int[othervars[3]][3];
	for (int i = 0; i < othervars[3];i++){
	    for (int j = 0; j < 3; j++){
		op[i][j]= Integer.parseInt(orderedPairs[i][j]);
	    }
	}
	for (int i = 0; i < othervars[3];i++){
	    int maxval=0;
	    for (int j = 0;j < 3;j++){
		for (int k = 0; k < 3;k++){
		    if(field[j+op[i][0]-1][k+op[i][1]-1]>maxval){
			maxval = field[j+op[i][0]-1][k+op[i][1]-1];
		    }
		}
	    }
	    maxval-=op[i][2];
	    for (int j = 0;j < 3;j++){
		for (int k = 0; k < 3;k++){
		    if(field[j+op[i][0]-1][k+op[i][1]-1]>maxval){
			field[j+op[i][0]-1][k+op[i][1]-1]=maxval;
		    }
		}
	    }
	}
	int sum = 0;
	for (int i = 0; i < othervars[0];i++){
	    for (int j = 0; j <othervars[1]; j++){
		if (field[i][j]<othervars[2]){
		    System.out.println("x:"+i+"//y:"+j+"//val:"+field[i][j]+"//depth:"+(othervars[2]-field[i][j]));
		    sum+=othervars[2]-field[i][j];
		}
	    }
	}
	return sum*72*72;
    }
    public static void main(String[] args){
        LakeMake lm = new LakeMake();
	System.out.println(lm.function());
    }
    
	
}
