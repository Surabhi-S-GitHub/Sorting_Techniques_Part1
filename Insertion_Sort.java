class Main {
  public static void main(String[] args) {
    int [] arr={5,2,3,4,1};
    insertion(arr);
    System.out.println("The Sorted Array is: ");
    for(int i=0;i<arr.length;i++)
      {
        System.out.println(arr[i]+" ");
      }
  }
  static void insertion(int[]arr)
  {
    for(int i=0;i<arr.length-1;i++)
    {
      for(int j=i+1;j>0;j--)
      {
        if(arr[j]<arr[j-1])
        {
          swap(arr,j,j-1);
        }
        else{
          break;
        }
      }
    }
  }
  static void swap(int []arr,int a, int b)
  {
    int temp = arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
  }
}
