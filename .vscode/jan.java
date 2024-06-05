public class jan {
    static int partition(int arr[], int left, int right)
{
      int i = left, j = right;
      int tmp;
      int pivot = arr[(left + right) / 2];     
      while (i <= j) {
            while (arr[i] < pivot)
                  i++;
            while (arr[j] > pivot)
                  j--;
            if (i <= j) {
                  tmp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = tmp;
                  i++;
                  j--;
            }
      };     
      return i;
}
static void quickSort (int arr[], int left, int right) {
    int index = partition(arr, left, right);
    if (left < index - 1)
          quickSort(arr, left, index - 1);
    if (index < right)
          quickSort(arr, index, right);
}

    public static void main(String[] args) {
        int arr[] = {3, 1, 7, 2, 0, 4, 9, 5};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
     }   
}