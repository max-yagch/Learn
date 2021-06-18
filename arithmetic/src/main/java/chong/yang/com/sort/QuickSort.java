package chong.yang.com.sort;

import  chong.yang.com.sort.Utils ;

/**
 *
 *
 * 快速排序(Quick Sort)：
 * 是对冒泡排序的一种改进方法，
 * 在冒泡排序中，进行元素的比较和交换是在相邻元素之间进行的，
 * 元素每次交换只能移动一个位置，所以比较次数和移动次数较多，效率相对较低。
 * 而在快速排序中，元素的比较和交换是从两端向中间进行的，较大的元素一轮就能够交换到后面的位置，而较小的元素一轮就能交换到前面的位置，
 * 元素每次移动的距离较远，所以比较次数和移动次数较少，y速度较快，故称为“快速排序”。
 *
 * 快速排序的基本思想是：
 * 1、在待排序的元素任取一个元素作为基准(通常选第一个元素，但最的选择方法是从待排序元素中随机选取一个作为基准)，称为基准元素；
 * 2、将待排序的元素进行分区，比基准元素大的元素放在它的右边，比其小的放在它的左边；
 * 3、对左右两个分区重复以上步骤直到所有元素都是有序的
 */



public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {5,2,3,1,4};
        System.out.println(arr[0]);

    }


    public int[] MySort (int[] arr) {
        // write code here

        return arr;
    }
    public void quickSort(int[] list, int left, int right) {
        if (left < right) {
            // 分割数组，找到分割点
            int point = partition(list, left, right);
            // 递归调用，对左子数组进行快速排序
            quickSort(list, left, point - 1);
            // 递归调用，对右子数组进行快速排序
            quickSort(list, point + 1, right);
        }
    }

    /**
     * 分割数组，找到分割点
     */
    public int partition(int[] list, int left, int right) {
        // 用数组的第一个元素作为基准数
        int first = list[left];

        while (left < right) {
            while (left < right && list[right] >= first) {
                right--;
            }

            // 交换
            Utils.swap(list, left, right);

            while (left < right && list[left] <= first) {
                left++;
            }

            // 交换
            Utils.swap(list, left, right);
        }
        // 返回分割点所在的位置
        return left;
    }



}

