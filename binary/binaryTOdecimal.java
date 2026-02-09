public class binaryTOdecimal {
    public static void binary(int binNum){
        int myNum = binNum;
        int pow=0;
        int dec=0;
        while(binNum>=0){
            int Ld=binNum%10;
            dec=dec+(Ld*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("Decimal of"+ myNum+" :" +dec);

    }
    public static void main(String[] args) {
        binary(1011);  
    }
}
