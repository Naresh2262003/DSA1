package DSA1;

public class Basic_Sorting{
    public static void selectionSort(int arr[], int n){
        for(int i=0; i<n; i++){
            int min=i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[min]){
                    min= j;
                }
            }
            // swap
            int temp=arr[i];
            arr[i]= arr[min];
            arr[min]=temp;
        }
    }

    public static void bubbleSort(int arr[], int n){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]<arr[j+1]){
//                    swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }

    public static void insertionSort(int arr[], int n){
        for(int i=1; i<n; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
//                swap
                int temp= arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= temp;

                j--;
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {5,4,3,2,1};
        int n= arr.length;

//        selectionSort(arr,n);
//        bubbleSort(arr,n);
//        insertionSort(arr,n);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        return;
    }
}

