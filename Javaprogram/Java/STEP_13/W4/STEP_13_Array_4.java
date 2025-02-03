class Array_41{
    void array_test() {
        int[] data = new int [10];
        System.out.println("Array_41");
        for(int i = 0 ; i < data.length; i++){
            data[i] = (int)(Math.random()*100);
        }
        int xa;
        for (int i = 0 ; i < data.length ; i++){
            xa = data[i];
            System.out.printf("%d\n", xa);
        }
        for(int xb: data)
            System.out.printf("%d", xb);
        System.out.printf("\n");
    }
}

public class STEP_13_Array_4{
    public static void main(String[] args){
        new Array_41().array_test();
    }
}