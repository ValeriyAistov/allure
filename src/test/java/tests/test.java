package tests;

public class test {
    public static void main(String[] args) {
        test test = new test();
        test.simpleNumber(14);
    }

    void simpleNumber(int num){
        int counter = 0;
        for(int i = 2;i <= num;i++){
            for(int j = 1; j<=i;j++){
                if(i%j==0){
                    counter++;
                }
            }
            if(counter == 2){
                System.out.println(i);
            }
            counter = 0;
        }
    }
}
