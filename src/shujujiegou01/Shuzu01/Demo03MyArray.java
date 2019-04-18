package shujujiegou01.Shuzu01;

import java.util.Arrays;

public class Demo03MyArray {
    private int[] arr;

    public Demo03MyArray() {
        arr = new int[0];
    }

    //得到数组的长度
    public int getsize() {
        return arr.length;
    }

    //在数组末尾添加一个元素
    public void add(int element) {
        //创建一个新数组
        int[] one = new int[arr.length + 1];
        //把原来数组元素复制到新数组中
        for (int i = 0; i < arr.length; i++) {
            one[i] = arr[i];
        }
        //把最后元素添加到末尾
        one[arr.length] = element;
        //用新数组替换旧数组
        arr = one;
    }

    //打印所有元素到控制台
    public void show() {
        System.out.println(Arrays.toString(arr));
    }

    //删除数组中的元素
    public void delete(int index) {
        if (index < 0 || index > arr.length - 1)
            throw new RuntimeException("下标越界");


        int[] one = new int[arr.length - 1];
        for (int i = 0; i < one.length; i++) {
            if (i < index) {
                one[i] = arr[i];
            } else {
                one[i] = arr[i + 1];
            }
        }
        arr = one;
    }

    //获取某个元素
    public int get(int index) {
        return arr[index];
    }

    //插入一个元素到指定位置
    public void insert(int index, int element) {
        int[] one = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < index) {
                one[i] = arr[i];
            } else {
                one[i + 1] = arr[i];
            }
        }
        one[index] = element;
        arr = one;
    }

    //替换指定位置的元素
    public void set(int index, int element) {
        arr[index] = element;
    }

    //二分查找
    public int look(int element) {
        int begin = 0;
        int end = arr.length - 1;
        int mid = (begin + end) / 2;
        int index;
        while (true) {
            if (arr[mid] == element) {
                index = mid;
                break;
            } else if (arr[mid] > element) {
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
            mid = (begin + end) / 2;
        }
        return mid;
    }


}
