package shujujiegou01.Paixun05;

import java.util.Arrays;

//冒泡排序
public class Maopao {
    public static void main(String[] args) {
        int[] arr=new int[]{6,45,25,3,95,55};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubblesort(int [] arr){
        int i,j,temp;
        //趟数
        for(i=0;i<arr.length-1;i++){
            //比较次数
            for(j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
