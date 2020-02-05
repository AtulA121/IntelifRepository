//for all programs
public class ReverseString {
    public static void main(String[] args){
        reverseString();
        TrianglePattern.printPattern();
    }
    public static void reverseString(){
        String str="atul pisal";
        StringBuilder newStr= new StringBuilder();
        int temp=str.length()-1;
        for(int i=temp;i>=0;i--){
            newStr.append(str.charAt(i));
        }
        System.out.println("Done : "+newStr);
    }
}
