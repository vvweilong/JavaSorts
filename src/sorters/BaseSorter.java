package sorters;

/**
 * Created by zhuxiaolong on 2017/12/7.
 * 排序算法的父类
 */
abstract public class BaseSorter {


    public void exChangeValue(int[] array,int a,int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    protected static void printArray(int[] dataToBeSort) {
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
