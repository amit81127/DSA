public class A01traingle {
     public static void traingle(int n){
        for(int i=0;i<=n;i++){
  for(int j=0;j<=i;j++){
    if((i+j)%2==0){
        System.out.print("1");
    }else{
        System.out.print("0");
    }
    
  }
  System.out.println();
        }
     }


    public static void main(String[] args) {
        traingle(5);
    }
}
