package DATA_STRUCTURE.Demo01recursion;

public class Dmoe01 {
    public static int sum(int[] arr){
        return arrsum(arr,0);
    }
     private static int arrsum(int[] arr,int l){
        if(l==arr.length){
            return 0;
        }
        return arr[l]+arrsum(arr,l+1);

     }

    public static void main(String[] args) {
        int [] arr=new int[20];
        for(int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        int s=sum(arr);
        System.out.println(s);
    }

}
