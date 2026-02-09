public class binary {
    public static void printBinary(int n,int lastPlace,String str){
          if(n==0){
            System.out.println(str);
            return;
          }


        // if(lastPlace==0){
        //     printBinary(n-1,0,str.append("0"));
        //     printBinary(n-1,1,str.append("1"));
        // }else{
        //     printBinary(n-1,0,str.append("0"));
        // }
        printBinary(n-1,0,str+"0");
        if(lastPlace==0){
            printBinary(n-1,1,str+"1");
        }

    }
    public static void main(String[] arr){
        printBinary(3,0,"");
    }
}
