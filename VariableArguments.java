//program for varargs
class VariableArguments{
    static void sum_n(int ...n){
        int s=0;
        for(int i:n)
            s+=i;
        System.out.println("Sum is:"+s);
    }

    public static void main(String args[]){
        System.out.println("PROGRAM FOR VARARGS-");
        sum_n(1,2,3);
        sum_n(1,8);        
        sum_n(2);
    }
}