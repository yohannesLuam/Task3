public class EvenorNot {
    public static void main(String[] args) {

        // Generating random int from 1-100
        int randNum = (int) (Math.random()*(100-1));

        // Check whether random number generated is even or odd
        if (randNum%2==0){
            System.out.println(randNum + " is an even number");
        }
        else{
            System.out.println(randNum + " is an odd number");
        }
    }
}
