package lection02.offline;


public class ProgramLaunch {

    public static void main(String[] args) {

        String[][] arr1 = new String[][]{
                {"4", "8", "14", "8"},
                {"9", "8", "42", "54"},
                {"98", "7", "4", "tr"},
                {"549", "1001", "-47", "-800"}};

        String[][] arr2 = new String[][]{
                {"4", "8", "14", "8", "13"},
                {"9", "8", "42", "54"},
                {"98", "7", "4", "tr", "24"},
                {"549", "1001", "-47", "-800"}};

        String[][] arr3 = new String[][]{
                {"4", "8", "14", "8"},
                {"9", "8", "42", "54"},
                {"98", "7", "4", "5"},
                {"549", "1001", "-47", "-800"}};

        String[][] arr4 = new String[][]{
                {"4", "8", "14", "8"},
                {"9", "8", "42", "54"},
                {"98", "7", "4", "5"},
                {"549", "1001", "-47", "#231dd"}};

        String[][] arr5 = new String[][]{
                {"4", "8", "14", "8"},
                {"9", "8", "42", "54"},
                {"98", "7", "4", "5"},
                {"s", "1001", "-47", "-800"}};

        String[][] arr6 = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "-1"}};

        try {
            WorkingWithAnArray.sumOfArrayElements(arr1, "arr1");
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            WorkingWithAnArray.sumOfArrayElements(arr2, "arr2");
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            WorkingWithAnArray.sumOfArrayElements(arr3, "arr3");
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            WorkingWithAnArray.sumOfArrayElements(arr4, "arr4");
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            WorkingWithAnArray.sumOfArrayElements(arr5, "arr5");
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            WorkingWithAnArray.sumOfArrayElements(arr6, "arr6");
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
        }

    }

}
