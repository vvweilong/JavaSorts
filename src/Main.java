import sorters.stableSorts.InsertionSorter;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        int[] dataToBeSort1 = {10, 1, 20, 8, 13, 100, 55, 7, 19, 33};

//        SelectionSorter selectionSorter=new SelectionSorter();
//        selectionSorter.sort(dataToBeSort1);


        InsertionSorter insertionSorter=new InsertionSorter();
        insertionSorter.sort(dataToBeSort1);


        printArray(dataToBeSort1);
    }


    private static void printArray(int[] dataToBeSort) {
        StringBuilder stringBuilder = new StringBuilder(dataToBeSort.length);
        stringBuilder.append("{");
        for (int i = 0; i < dataToBeSort.length; i++) {
            stringBuilder.append(dataToBeSort[i]);
            if (i != dataToBeSort.length - 1) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("}");
        System.out.println(stringBuilder.toString());
    }

}
