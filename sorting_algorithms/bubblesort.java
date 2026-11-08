package sorting_algorithms;

public class bubblesort {
    public static void sort(int arr[]){ 
        int n= arr.length;
        boolean swapped;
        for(int i=0;i<n;i++){ 
            swapped = false;
            for(int j=0;j<n-1-i;j++){ 
                if(arr[j] > arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                    swapped = true;
                }
            }

            if(swapped == false){ 
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,8,4,9,2,5};
        sort(arr);
        for(int i=0;i<arr.length;i++){ 
            System.out.print(arr[i]+ " ");
        }
    }
}
