public class fizzbuzz {
    public static void main(String[] args) {
        int i;
        i = 1;
        System.out.println(i);
        while (i < 100) {
            i += 1;
            if (i % 3 == 0){
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }else {
                    System.out.println("Fizz");
                }
            }else if (i % 5 == 0){
                if (i % 5 == 0 && i % 3 == 0){
                    System.out.println("FizzBuzz");
                }else {
                    System.out.println("Buzz");
                }
            }else {
                System.out.println(i);
            }
    }
    }
}
