package chong.yang.com.sort;


import  chong.yang.com.sort.Utils ;
import jdk.nashorn.internal.ir.CallNode;

/**
 * 以升序排列为例：
 * 将第一个元素和第二个元素比较，若前者大于后者，则交换两者的位置，
 * 再将第二个元素与第三个元素比较，若前者大于后者则交换两者位置，以此类推直到倒数第二个元素与最后一个元素比较，若前者大于后者，则交换两者位置。
 * 这样一轮比较下来将会把序列中最大的元素移至序列末尾，这样就安排好了最大数的位置，接下来只需对剩下的（n-1）个元素，重复上述操作即可。
 *
 * 时间复杂度：
 * 若原数组本身就是有序的（这是最好情况），仅需n-1次比较就可完成，时间复杂度依然为O(n）；
 *
 *
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5,2,3,1,4};
        final int[] ints = MySort(arr);
        System.out.println(ints[0]);
    }

    public static  int[] MySort (int[] arr) {
        if(arr.length<2){
            return arr;
        }


        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    Utils.swap(arr,j,j+1);
                }
            }
        }

        return arr;
    }




}
