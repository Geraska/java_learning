import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = scan.nextLine();
//        System.out.print("Enter your age: ");
//        int age =  scan.nextInt();
//        System.out.print("Enter your height: ");
//        float height =  scan.nextFloat();
//        display(name, age, height);
//        System.out.println(fibonachi(8));
//        try{
//            int[] numbers = new int[3];
//            numbers[2]=45;
//            System.out.println(numbers[2]);
//        }
//        catch(Exception ex){
//
//            ex.printStackTrace();
//        }
//        finally{
//            System.out.println("Блок finally");
//        }
//        System.out.println("Программа завершена");
        test jes = new test();
        System.out.println(jes.ok);
    }
    static int fibonachi(int n){

        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else{
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }
    static int sums(int a, int b, int c) {
        return a + b + c;
    }
//    static void sum(String msg, int ...num){
//        System.out.println(msg);
//        int result = 0;
//        for (int n:num) {
//            result += n;
//            System.out.println(result);
//        }
//    }

    static void scanner() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input num1: ");
        byte num1 = in.nextByte();
        System.out.print("Input num2: ");
        byte num2 = in.nextByte();
        int num = num1<num2? (num1+num2) : (num1-num2);
        System.out.printf("%d", num);
        in.close();
        System.out.println();
    }

    static void display(String name, int age, float height){
        System.out.printf("Name %s Age %d Height %.2f", name, age, height);
        System.out.println();
    }

    static void arrays() {
//        int[] nums = new int[4];
//        nums[0] = 1;
//        nums[1] = 2;
//        nums[2] = 3;
//        nums[3] = 4;
//        System.out.println(nums.length - 1);
//        int[][] nums1 = new int[2][3];
//        nums1[1][0] = 5;
//        System.out.println(nums1);
        int[][] nums = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        for (int i = 0; i < nums.length; i++){
            for(int j=0; j < nums[i].length; j++){

                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }
    }

    static void dataTypes() {
//        boolean b = 1 > 4;
//        boolean b1 = 1 != 4;
//        boolean b2 = 1 < 4;
//        System.out.println(b);
//        System.out.println(b1);
//        System.out.println(b2);
//        int a = 4;
//        byte b = (byte) a;
//        System.out.println(b);
//        int n = 10;
//        for(int i=0, j = n - 1; i < j; i++, j--){
//
//            System.out.println(i * j);
//        }
    }
}
