public class keypad {
    public static String[] keypadArr={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printcombo(String str,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char cuurchar=str.charAt(idx);
        String mapping=keypadArr[cuurchar-'0'];
        for(int i=0;i<mapping.length();i++){
            printcombo(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="23";
        printcombo(str, 0, "");
    }
}
