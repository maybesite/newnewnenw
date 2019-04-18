package shujujiegou01.Queue03;

public class Demo01 {
    int[] arr;
    public Demo01(){
        arr=new int[0];
    }
    //入队
    public void add(int element){
        int [] one=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            one[i]=arr[i];
        }
        one[arr.length]=element;
        arr=one;
    }
    //出队
    public int pull(){
        int [] two=new int[arr.length-1];
        int element=arr[0];
        for(int i=0;i<two.length;i++){
            two[i]=arr[i+1];
        }
        arr=two;
        return element;
    }
}
