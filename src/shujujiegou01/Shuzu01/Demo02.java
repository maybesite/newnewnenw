package shujujiegou01.Shuzu01;

import java.util.Arrays;
//数组的删除
public class Demo02 {
    public static void main(String[] args) {
            int[] arr=new int[]{9,8,7,6,5,4};
            //要删除元素的下标
            int dst=3;
            //创建一个新数组 长度是原来数组长度-1
            int[] one=new int[arr.length-1];
            //复制原数组中除了要删的那个元素的其他元素到新数组中
            for(int i=0;i<one.length;i++){
                if(i<dst){
                    one[i]=arr[i];}
                else{
                    one[i]=arr[i+1];}
            }
            //新数组替换旧数组
            arr=one;
        System.out.println(Arrays.toString(one));
        System.out.println(one.length);

    }
}
