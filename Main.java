public class Main {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenCounter = 0;
        int oddCounter = 0;
        while (number <= finishNumber){
            number++;
            if (isEvenNumber(number)){
                evenCounter++;
                System.out.println(number + " is a even number");
                if (evenCounter == 5) {
                    break;
                }
            } else {
                oddCounter++;
            }

        }

        System.out.println("Total Even Number Found " + " = " + evenCounter);
        System.out.println("Total Odd Number Found " +  " = " + oddCounter);

    }

    public static boolean isEvenNumber(int number){
        if (number < 0){
            return false;
        } else {
            if (number % 2 == 0) {

                return true;
            } else {
                return false;
            }
        }
    }
}
