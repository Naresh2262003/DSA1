package DSA1;

public class MergeSort{
    public static void merge(int arr[], int low, int mid, int high){
        int temp[]= new int[high-low+1];

        int i=low;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=high){
            temp[k++]=arr[j++];
        }

        for(int x=0, y=low; x<temp.length; y++, x++){
            arr[y]=temp[x];
        }
    }

    public static void mergeSort(int arr[], int low, int high){
        if(low>=high){
            return;
        }
//        int mid= low+(high-low)/2;
        int mid= high-(high-low)/2;

        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public static void main(String[] args) {
        int arr[] = {5,4,3,9,1};
        int n= arr.length;

        mergeSort(arr,0,n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        return;
    }
}