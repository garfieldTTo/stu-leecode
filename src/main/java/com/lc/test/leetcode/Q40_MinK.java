package com.lc.test.leetcode;

/**
 * @author fj
 * @date 2020/3/21
 **/
public class Q40_MinK {

        public static int[] getLeastNumbers(int[] arr, int k) {
            if(k == 0) {
                return new int[0];
            }
            if(arr.length <= k) {
                return arr;
            }
            int[] heap = new int[k];
            for(int i = 0; i < arr.length;i ++){
                if(i >= k){
                    if(heap[0] > arr[i]){
                        heap[0] = arr[i];
                        heapfy(heap,k);
                    }
                }else{
                    heapInsert(heap,i,arr[i]);
                }
            }
            return heap;
        }

        private static void heapInsert(int[] heap,int index,int x){
            heap[index] = x;
            int parent = (index-1)/2;
            while(heap[parent] < heap[index] && parent >= 0){
                swap(heap,parent,index);
                parent = (parent - 1)/2;
            }
        }

        private static void heapfy(int[] heap, int k){
            int top = 0;
            int left = top * 2 + 1;
            int right = left + 1;
            int small = top;
            while(true){
                if(left < k && heap[top] > heap[left]) {
                    small = left;
                }
                if(right < k && heap[small]  > heap[right]) {
                    small = right;
                }
                if(small != top){
                    swap(heap,top,small);
                    top = small;
                    left = top*2 + 1;
                    right = left + 1;
                }else{
                    break;
                }
            }
        }

        private static void swap(int[] heap,int a,int b){
            int tmp = heap[a];
            heap[a] = heap[b];
            heap[b] = tmp;
        }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 2, 4, 2, 2, 3, 1, 4};
        System.out.println(getLeastNumbers(arr, 8));
    }
}
