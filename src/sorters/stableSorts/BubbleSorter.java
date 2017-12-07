package sorters.stableSorts;

import sorters.BaseSorter;

/**
 * Created by zhuxiaolong on 2017/12/7.
 * <p>
 * 冒泡排序   每一个元素 注意比较 交换位置
 */
public class BubbleSorter extends BaseSorter {


    public void sortUp(int[] dataArray) {
        int l = dataArray.length;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (dataArray[i] > dataArray[j]) {
                    exChangeValue(dataArray, i, j);
                }
            }
        }
    }

    /**
     * 由后向前排序 升序
     */
    public void sortUpBack(int[] dataArray) {
        int l = dataArray.length - 1;
        for (int i = l; i > -1; i--) {
            for (int j = i - 1; j > -1; j--) {
                if (dataArray[i] < dataArray[j]) {
                    exChangeValue(dataArray, i, j);
                }
            }
        }
    }


    public void sortDown(int[] dataArray) {
        int l = dataArray.length;
        for (int i = l; i > -1; i--) {
            for (int j = i - 1; j > -1; j--) {
                if (dataArray[i] < dataArray[j]) {
                    exChangeValue(dataArray, i, j);
                }
            }
        }

    }

    public void sortDownBack(int[] dataArray) {
        int l = dataArray.length - 1;
        for (int i = l; i > -1; i--) {
            for (int j = i - 1; j > -1; j--) {
                if (dataArray[i] > dataArray[j]) {
                    exChangeValue(dataArray, i, j);
                }
            }
        }
    }

    @Override
    public void exChangeValue(int[] array, int a, int b) {
        super.exChangeValue(array, a, b);
    }
}
