package sorters.unstableSorts;

import sorters.BaseSorter;

/**
 * Created by zhuxiaolong on 2017/12/7.
 * 快速排序的实现
 * 快速排序的 原理:
 * 通过一趟排序将要排序的数据分割成独立的两部分，
 * 其中一部分的所有数据都比另外一部分的所有数据都要小，
 * 然后再按此方法对这两部分数据分别进行快速排序，
 * 整个排序过程可以递归进行，以此达到整个数据变成有序序列。
 */
public class QuickSorter extends BaseSorter {

    /**
     * 特殊形式  如果 数组出现对称 形式 会造成死循环
     */
    public void sort(int[] dataArray, int startPosition, int endPosition) {
        //需要排序的数组 数量要大于1才进行排序
        if (endPosition - startPosition > 1) {
//            System.out.println("stander = " + dataArray[startPosition]);
            // 分割 需要有个分割的标准  选定一个 元素作为比较 标准
            int stander = dataArray[startPosition];
            // 用于左右交换的 元素指针
            int pointLeft = startPosition;
            int pointRight = endPosition;
            /*循环查找 左右 */
            while (pointLeft < pointRight) {
                //具体分割方法-- 首先在左边开始寻找 比标准大的元素 找到后记录位置
                while (pointLeft < pointRight && dataArray[pointLeft] < stander) {
                    //左侧 大于标准的值
                    pointLeft++;
                }
                while (pointLeft < pointRight && dataArray[pointRight] > stander) {
                    //右侧小于标准的值
                    pointRight--;
                }


                /**
                 * bug  出现两个相等的值并且与 标准值相等 会造成 重复 调换的死循环
                 * */
                exChangeValue(dataArray, pointLeft++, pointRight);
                printArray(dataArray);
            }
            System.out.println();
            // 进行迭代调用 左边部分 再次分割
            sort(dataArray, startPosition, pointLeft - 1);
            // 进行迭代调用 右边边部分 再次分割
            sort(dataArray, pointLeft, endPosition);
        }
    }



    /*交换两个位置的值*/
    @Override
    public void exChangeValue(int[] array, int a, int b) {
//        System.out.println("调换 俩个元素");
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }


}
