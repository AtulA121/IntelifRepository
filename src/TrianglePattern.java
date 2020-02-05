//pattern
public class TrianglePattern {
    public static void printPattern(){
        int n=4;
        int temp=1;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<temp;k++) {
                System.out.print("*");
            }
            temp=temp+2;
            System.out.println();
        }
    }
}
