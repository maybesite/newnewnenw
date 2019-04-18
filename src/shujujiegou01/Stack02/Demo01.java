package shujujiegou01.Stack02;

public class Demo01 {
    //栈的底层 数组实现
    int [] arr;

    public Demo01() {
        arr=new int[0];
    }

    //入栈
    public void push(int element){
        int [] one=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            one[i]=arr[i];
        }
        one[arr.length]=element;
        arr=one;
    }
    //出栈
    public int pop(){
        int last=arr[arr.length-1];
        if(arr.length==0)
            throw new RuntimeException("栈为空");
        int[] two=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            two[i]=arr[i];
        }
        arr=two;
        return last;
    }
    //查看栈顶元素
    public int peek(){
        return arr[arr.length-1];
    }
    //判断栈是否为空
    public boolean isempty(){
        return arr.length==0;
    }
}
