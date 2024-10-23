import java.util.ArrayList;

public class StockPriceAnalysis {

    // 1. Calculate Average Price
    public static float calculateAveragePrice(float[] stockPrices) {
        float sum = 0;
        for (float price : stockPrices) {
            sum += price;
        }
        return sum / stockPrices.length;
    }

    // 2. Find Maximum Price
    public static float findMaximumPrice(float[] stockPrices) {
        float max = stockPrices[0];
        for (float price : stockPrices) {
            if (price > max) {
                max = price;
            }
        }
        return max;
    }

    // 3. Count Occurrences of a Specific Price
    public static int countOccurrences(float[] stockPrices, float targetPrice) {
        int count = 0;
        for (float price : stockPrices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count;
    }

    // 4. Compute Cumulative Sum Using ArrayList
    public static ArrayList<Float> computeCumulativeSum(ArrayList<Float> stockPrices) {
        ArrayList<Float> cumulativeSum = new ArrayList<>();
        float sum = 0;
        for (float price : stockPrices) {
            sum += price;
            cumulativeSum.add(sum);
        }
        return cumulativeSum;
    }

    public static void main(String[] args) {
        // Test data: Stock prices for 10 days
        float[] stockPricesArray = {100.5f, 102.3f, 101.0f, 99.8f, 98.6f, 101.5f, 103.2f, 104.0f, 105.8f, 107.1f};

        // Creating an ArrayList from the array
        ArrayList<Float> stockPricesList = new ArrayList<>();
        for (float price : stockPricesArray) {
            stockPricesList.add(price);
        }

        // Test each method and print the results
        System.out.println("Average Price: " + calculateAveragePrice(stockPricesArray));
        System.out.println("Maximum Price: " + findMaximumPrice(stockPricesArray));
        System.out.println("Occurrences of 101.0: " + countOccurrences(stockPricesArray, 101.0f));
        System.out.println("Cumulative Sum: " + computeCumulativeSum(stockPricesList));
    }
}
