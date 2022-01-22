package lection02.offline;

public class WorkingWithAnArray {

    private static final int ALLOWE_ARRAY_LENGTH = 4;

    public static int sumOfArrayElements(String[][] sourceArray, String sourceArrayName) {

        if (sourceArray == null || sourceArrayName == null) throw new NullPointerException();

        if (sourceArray.length != ALLOWE_ARRAY_LENGTH || sourceArray[0].length != ALLOWE_ARRAY_LENGTH) {
            throw new MyArraySizeException(String.format("У массива [%s] Количество строк или столбцов превышает [%d]",
                    sourceArrayName, ALLOWE_ARRAY_LENGTH));
        }

        int resultSum = 0;

        for (int i = 0; i < ALLOWE_ARRAY_LENGTH; i++) {
            for (int j = 0; j < ALLOWE_ARRAY_LENGTH; j++) {

                try {
                    resultSum += Integer.parseInt(sourceArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("У массива [%s] данные из ячейки [%d][%d] невозможно преобразовать в число",
                            sourceArrayName, i + 1, j + 1));
                }
            }
        }
        System.out.printf("Сумма элементов массива [%s] равна [%d]%n", sourceArrayName, resultSum);
        return resultSum;
    }
}
