public class Main {
    public static void main(String[] args) {
        //Use nested for loops to produce the following output:
        //
        //1
        //22
        //333
        //4444
        //55555
        //666666
        //7777777
        //88888888
        //999999999
//        for (int i=1; i<=10; ++i){
//            System.out.println(i);
//            for(int j=1;j<=2;++j){
//                System.out.print(j);
//              // for(int k=3;k<=4;++k){
        //    System.out.print(k);
        // }
        int rows = 9;
        int cols = 9;

        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {

                System.out.print(i+"");
            }
            System.out.println("");
        }
    }
    }



