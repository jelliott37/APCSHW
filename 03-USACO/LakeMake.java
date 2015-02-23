public class LakeMake{
    String input = new String("4 6 22 2
28 25 20 32 34 36
27 25 20 20 30 34
24 20 20 20 20 30
20 20 14 14 20 20
1 4 4
1 1 10");
    String delims="[\n]+";
    String delims2="[ ]+";
    String[] ip = input.split(delims);
    String[] vars = ip[0].split(delims2);
    int[] othervars = new int[vars.length];
    int ph = 0;
    for (String v : vars){
	othervars[ph]=Integer.parseInt(v);
	ph++;
    }
    String[][] board=ne
}
