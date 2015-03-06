public class Recursion {
    public int fact(int n){
	if (n > 1){
	    return n * fact(n - 1);
	}
	else{
	    return 1;
	}
    }
    public int fib(int n){ //this is both in and out of coding bat? why?
	if (n > 1){
	    return fib(n - 1) + fib(n - 2);
	}
	else if (n == 1){
	    return 1;
	}
	    return 0;

    }
    public int len(String s){
	if (!s.equals("")){
	    return 1 + len(s.substring(1));
	}
	else {
	    return 0;
	}
    }
    public int count(String s, char c){
	if (!s.equals("")){
	    if (s.charAt(0) == c){
		return 1 + len(s.substring(1));
	    }
        }
	return 0;
    }
    public int bunnyEars2(int bunnies) { //you put this question twice?
	if (bunnies == 0){
	    return 0;
	}
	else if (bunnies % 2 == 0){
	    return 3 + bunnyEars2(bunnies - 1);
	}
	else {
	    return 2 + bunnyEars2(bunnies - 1);
	}
    }
    public int strCount(String s, String sub){
	if (s.length() < sub.length()){
	    return 0;
	}
	else if (s.substring(0,sub.length()).equals(sub)){
	    return 1 + strCount(s.substring(sub.length()),sub);
	}
	else {
	    return strCount(s.substring(1), sub);
	}
    }
    public int sumDigits(int n){
	if (n / 10 == 0){
	    return n;
	}
	else {
	    return n%10 + (sumDigits(n/10));
	}
    }
    public String allStar(String s) {
        if (s.length() <= 1){
            return s;
        }
        else {
            return s.charAt(0) + "*" + allStar(s.substring(1));
        }	
    }

}
