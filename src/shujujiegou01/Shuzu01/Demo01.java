package shujujiegou01.Shuzu01;

import java.util.Arrays;
//数组的添加
public class Demo01 {
    public static void main(String[] args) {
        //解决数组的长度不可变的问题
        int[] arr=new int[]{9,8,7};
        //快速查看数组中的元素
        System.out.println(Arrays.toString(arr));
        //要加入数组的目标元素
        int dst=6;
        //创建一个数组 长度是原数组长度+1
        int [] one=new int[arr.length+1];
        //把原数组元素复制到新数组中
        for(int i=0;i<arr.length;i++){
            one[i]=arr[i];
        }
        //把目标元素放到新数组的最后一个位置上
        one[one.length-1]=dst;
        //新数组替换原数组
        arr=one;
        System.out.println(Arrays.toString(arr));


    }


}
