public class dsa1 {
    public static void main(String[] args) {
        int[] n = {3,2,4};
        int target=6;
        for(int i=0; i<n.length; i++){
            for(int j=i+1; j<n.length; j++){
                if (n[i]+n[j]==target){
                   System.out.println("[" + i + "," + j + "]");
                }

            }
        }
       System.out.println();

    //    example programsss

    int[] num = {4,7,2,7,9,8,2};
    for(int i=0; i<num.length; i++){
        for(int j=i+1; j<num.length; j++){
            if (num[i]==num[j]){
                System.out.println("the dublicated number is " + num[i]);
            }
        }
    }
       
    }
    
}
