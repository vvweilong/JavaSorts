package sorters.stableSorts;

import sorters.BaseSorter;

import java.util.Arrays;

/**
 * Created by zhuxiaolong on 2017/12/7.
 * <p>
 * 步骤是  采用递归的方式 将 数组拆分
 */
public class MergeSorter extends BaseSorter {

    public void sort(int[] dataArray){
        merge(dataArray);
    }
    private void merge(int[] dataArray) {
        if (dataArray.length > 1) {
            //分成两边
            int middle = (int) (dataArray.length * 0.5);
            int[] left = Arrays.copyOfRange(dataArray, 0, middle);
            int[] right = Arrays.copyOfRange(dataArray, middle, dataArray.length);
            //左边数组迭代  进入后 会继续拆分
            merge(left);
            //右边数组迭代 进入后会继续拆分
            merge(right);
            //执行到这里 每个子数组已经完成了 排序  即 left 有序  right 有序
            //接下来执行合并 并返回结果
            doMerge(dataArray, left, right);
        }
        printArray(dataArray);
    }

    private void doMerge(int[] outputArray, int[] left, int[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;
        //首先 设置大循环 条件是 两边数组都 没有比较完
        while (leftIndex < left.length && rightIndex < right.length) {
            //判断 左边数组的当前元素与右边数组的当前元素大小
            if (left[leftIndex] < right[rightIndex]) {
                outputArray[resultIndex] = left[leftIndex];
                leftIndex++;
                resultIndex++;
            } else {
                outputArray[resultIndex] = right[rightIndex];
                rightIndex++;
                resultIndex++;
            }
        }
        //如果左侧的数组还有剩余元素 全部添加到 结果数组中
        while (leftIndex < left.length) {
            outputArray[resultIndex] = left[leftIndex];
            resultIndex++;
            leftIndex++;
        }

        //如果右侧的数组还有剩余元素 全部添加到 结果数组中
        while (rightIndex < right.length) {
            outputArray[resultIndex] = right[rightIndex];
            resultIndex++;
            rightIndex++;
        }

    }


}
