public class operation {
    public static int addgetbit(int n,int i){
        int bitMarks=1<<i;
        if((n&bitMarks)==0){
            return 0;
        }else{
           return 1;
        }
    }

    public static int set(int n,int i){
        int bitMarks=1<<i;
        return n|bitMarks;
    }
    public static int clear(int n,int i){
        int bitMark=1<<i;
        return n&(~bitMark);
    }

    public static int update(int n,int i,int v){
        if(v==0){
            return clear(n,i);
        }else{
            return set(n,i);
        }
    }
    public static int clarlast(int n,int i){
        return n&(-1<<i);
    }
    public static void main(String[] args) {
        System.out.println(clarlast(15, 2));
       
    }
}
