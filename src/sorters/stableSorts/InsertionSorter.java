package sorters.stableSorts;

import sorters.BaseSorter;

/**
 * Created by zhuxiaolong on 2017/12/7.
 * <p>
 * 每步将一个待排序的记录，按其关键码值的大小插入前面已经排序的文件中适当位置上，直到全部插入完为止。
 */
public class InsertionSorter extends BaseSorter {

    public void sort(int[] dataArray) {

        int l = dataArray.length;
        for (int i = 0; i < l; i++) {
            //选中第 i 个元素 插入到前 0~i-1个元素的数组中
            insert(dataArray, i);
//            printArray(dataArray);
        }
    }

    /**
     * 这个方法是 在未排序的数组中取第一个元素 对前面已经排序的数组进行从后向前比较排序
     * 执行的是一个元素的 向前插入操作
     *
     * @param end       代表当前需要插入元素的位置
     * @param dataArray 需要排序的数组
     */
    private void insert(int[] dataArray, int end) {
        //判断 当前元素的位置 是否是第一个
        if (end == 0) {
            return;
        }
        //向前一一对比
        for (int i = end - 1; i > -1; i--) {
            //如果 当前元素比上一个元素小 互换位置 并记录元素的新位置
            if (dataArray[end] < dataArray[i]) {
                //交换位置
                exChangeValue(dataArray, end, i);
                //记录元素新位置
                end = i;
            }else {
                //如果不能比前面已排序的 元素小的话 说明 这个元素比较大 可以完成本次插入了
                break;

            }
        }

    }
}
