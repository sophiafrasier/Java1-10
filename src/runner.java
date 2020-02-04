public class runner {



    public int sumDouble(int a, int b) {
        int sum= a + b;

        if(a==b){
            sum= 2*sum;
        }
        return sum;
    }
    public int array667(int[] nums) {
        int count= 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==6) {
                if(nums[i+1]==6 || nums[i+1]==7){
                    count= count+1;
                }
            }
        }
        return count;
    }
    public String helloName(String name) {
        String words= "Hello "+ name+ "!";
        return words;
    }
    public boolean commonEnd(int[] a, int[] b) {
        if(a[0]==b[0]){
            return true;
        }

        if(a[a.length-1]==b[b.length-1]){
            return true;
        }else{
            return false;
        }
    }
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if(isWeekend==true && cigars>=40){
            return true;
        }
        if(isWeekend==false && cigars>=40 && cigars<=60){
            return true;
        }else{
            return false;
        }
    }

    public int noTeenSum(int a, int b, int c) {
        a= fixTeen(a);
        b= fixTeen(b);
        c=fixTeen(c);
        return a+b+c;
    }
    public int fixTeen(int n){
        if(n<=19 && n>=17){
            return 0;
        }
        if(n>=13 && n<=14){
            return 0;
        }else{
            return n;
        }
    }
    public boolean bobThere(String str) {
        boolean result = false;
        for(int i=0; i<str.length()-2; i++){
            if(str.substring(i,i+1).equals("b") && str.substring(i+2, i+3).equals("b")) {
                result= true;
            }
        }
        return result;
    }


    public boolean equalIsNot(String str) {
        int countIs=0;
        int countNot=0;
        boolean result= false;
        for(int i=0; i<str.length()-2; i++){
            if(str.substring(i,i+3).equals("not")){
                countNot= countNot +1;
            }
        }

        for(int a=0; a<str.length()-1; a++){
            if(str.substring(a,a+2).equals("is")){
                countIs= countIs +1;
            }
        }

        if(countIs==countNot){
            result= true;
        }
        return result;
    }
}

