package DSA1;

public class QuickSort{
    public static int partition(int arr[], int low, int high){
        int pivot= arr[low];
        int i=low;
        int j=high;

        while(i<j){
            while(arr[i]<=pivot && i<high){
                i++;
            }
            while(arr[j]>pivot && j>low){
                j--;
            }
            if(i<j){
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
            }
        }
//        now j is the perfect index for our pivot element(that is arr[low])
        int temp= arr[j];
        arr[j]= arr[low];
        arr[low]=temp;

//        now returning the index of the pivot element
        return j;
    }

    public static void quickSort(int arr[], int low, int high){
        if(low>=high) return;
        int pivot= partition(arr,low,high);
        quickSort(arr,low,pivot-1);
        quickSort(arr,pivot+1,high);
    }

    public static void main(String[] args) {
        int arr[] = {5,4,3,9,1};
        int n= arr.length;

        quickSort(arr,0,n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        return;
    }
}