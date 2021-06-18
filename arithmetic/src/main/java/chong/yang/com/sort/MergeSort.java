package chong.yang.com.sort;

/**
 * 归并排序
 * 归并排序（MERGE-SORT）是利用归并的思想实现的排序方法，
 * 该算法采用经典的分治（divide-and-conquer）策略（分治法将问题分(divide)成一些小的问题然后递归求解，
 * 而治(conquer)的阶段则将分的阶段得到的各答案"修补"在一起，即分而治之)。
 *
 *
 * 归并排序是稳定排序，它也是一种十分高效的排序，能利用完全二叉树特性的排序一般性能都不会太差。
 * java中Arrays.sort()采用了一种名为TimSort的排序算法，就是归并排序的优化版本。
 * 从上文的图中可看出，每次合并操作的平均时间复杂度为O(n)，而完全二叉树的深度为|log2n|。
 * 总的平均时间复杂度为O(nlogn)。而且，归并排序的最好，最坏，平均时间复杂度均为O(nlogn)。
 */
public class MergeSort {

    public int[] MySort (int[] arr) {
        mergeSort(arr,0,arr.length-1);
        return arr;
    }

    public void mergeSort(int[] arr,int l,int r){
        if(l==r){
            return;
        }
        int mid = l+((r-l)>>1); //中点位置，即(l+r)/2
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    public void merge(int[] arr,int l,int mid,int r){
        int [] help= new int[r-l+1];    //辅助数组
        int i=0;
        int p1=l; //左半数组的下标
        int p2=mid+1; //右半数组的下标

        //判断是否越界
        while(p1<=mid && p2<=r){
            help[i++]=arr[p1]<arr[p2] ? arr[p1++] : arr[p2++];
        }
        //p1没有越界，说明p2越界了，将左边剩余元素拷贝到辅助数组
        while(p1<=mid){
            help[i++]=arr[p1++];
        }
        //p2没有越界，说明p1越界了
        while(p2<=r){
            help[i++]=arr[p2++];
        }
        //将辅助数组元素拷贝会原数组
        for(i=0;i<help.length;i++){
            arr[l+i]=help[i];
        }
    }

}
