package core.classes;

public class MyClass {

    public void showSum(double x, double y, int count){

        double sum = x + y;

        if(count<1){
            return;
        }

        for(int i = 0; i < count; i++){
            System.out.println(sum);
        }
    }
}
