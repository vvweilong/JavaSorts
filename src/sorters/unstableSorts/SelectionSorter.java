package sorters.unstableSorts;

import sorters.BaseSorter;
import sorters.stableSorts.BubbleSorter;

/**
 * Created by zhuxiaolong on 2017/12/7.
 * 选择排序
 * 是一种简单直观的排序算法。它的工作原理是每一次从待排序的数据元素中选出最小（或最大）的一个元素，
 * 存放在序列的起始位置，直到全部待排序的数据元素排完。 选择排序是不稳定的排序方法
 * （比如序列[5， 5， 3]第一次就将第一个[5]与[3]交换，导致第一个5挪动到第二个5后面）。
 */
public class SelectionSorter extends BaseSorter {

    private BubbleSorter bubbleSorter;

    public SelectionSorter() {
        bubbleSorter = new BubbleSorter();
    }

    /**
     * @param dataArray 要排序的数组
     */
    public void sort(int[] dataArray) {
        int length = dataArray.length;
        //这里循环每一个元素
        for (int i = 0; i < length; i++) {
            printArray(dataArray);
            int minPosition = findMinPosition(dataArray, i);
//            System.out.println(" 最小值的位置 "+ minPosition +" 最小值 : "+dataArray[minPosition]);
            exChangeValue(dataArray, i, minPosition);
        }
    }

    /**
     * 由前向后找 最小的值的位置
     */
    private int findMinPosition(int[] dataArray, int startPoint) {
//        System.out.println("查找最小值起点 : "+startPoint);
        int point = startPoint;
        int l = dataArray.length;

        /*
        *假设 0 位置 为当前最小
        *
        *
        * */
        for (int i = startPoint; i < l; i++) {
            if (dataArray[i] < dataArray[point]) {
                point = i;
            }
        }
        return point;
    }


}
