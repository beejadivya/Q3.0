
import java.util.*;

    public class LuggageWeight {

        // Function to calculate the extra cost
        static int weighingMachine(int N, int weight[], int W)
        {
            int amount = 0;

            // Loop to calculate the excess cost
            for (int i = 0; i < N; i++) {
                if (weight[i] - W >15
                        && weight[i] - W <=16)
                    amount += 500;
            }
            return amount;
        }

        // Driver code
        public static void main(String[] args)
        {
            int weight[] =
                    { 15, 18 };
            int N = 2;
            int W = 15;

            System.out.println(
                    weighingMachine(N, weight, W));
        }
    }
