public class Main {
    public static void main(String[] args)
    {
        // ARRAY
        int[] numbers = new int[10];

        numbers[0] = 10;
        numbers[1] = -6;
        numbers[2] = 37;
        numbers[3] = -15;
        numbers[4] = 25;
        numbers[5] = 9;
        numbers[6] = 4;
        numbers[7] = 81;
        numbers[8] = 43;
        numbers[9] = 0;

        // Prints Unsorted Array
        System.out.println("Unsorted Array:");
        printArray(numbers);

        // Prints Bubble Sorted Array
        System.out.println("\n\nDescending Sort via Bubble Sort:");
        bubbleSort(numbers);
        printArray(numbers);

        // Print Selection Sorted Array
        System.out.println("\n\nDescending Sort via Selection Sort:");
        selectionSort(numbers);
        printArray(numbers);
    }

    private static void selectionSort(int[] array)
    {
        for (int lastSortIndex = array.length - 1; lastSortIndex > 0; lastSortIndex--)
        {
            int smallestIndex = 0;

            for (int i = 0; i <= lastSortIndex; i++)
            {
                if (array[i] < array[smallestIndex])
                {
                    smallestIndex = i;
                }
            }

            int temp = array[lastSortIndex];
            array[lastSortIndex] = array[smallestIndex];
            array[smallestIndex] = temp;
        }
    }

    private static void bubbleSort(int[] array)
    {
        for (int lastSortIndex = array.length - 1; lastSortIndex > 0; lastSortIndex--)
        {
            for (int i = 0; i < lastSortIndex; i++)
            {
                if (array[i] < array[i + 1])
                {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array)
    {
        for (int j : array)
        {
            System.out.print(j +  " ");
        }
    }

}