public class SortReview {
    public static void main(String[] args){

        int[] arr = {2,5,9,0,1,7,8,3,4,6};

        SortReview sortReview = new SortReview();
        sortReview.insertSort(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }

    //插入排序
    public void insertSort(int[] arr){
        //外层循环遍历数组的下标
        for (int i = 1; i < arr.length; i++) {
            //从第2个元素开始，j从末端i开始，依次和前一个元素比较，如果比他小，则和前一个元素做交换，直到j为开始元素
            for(int j = i; j > 0; j--){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else{
                    continue;
                }
            }
        }

    }
}

