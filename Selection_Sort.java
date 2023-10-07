class Main {
  public static void main(String[] args) {
    int [] arr={5,2,3,4,1};
    selection(arr);
    System.out.println("The Sorted Array is: ");
    for(int i=arr.length-1;i>=0;i--)
      {
        System.out.println(arr[i]+" ");
      }
  }
  static void selection(int[]arr)
  {
    for(int i=0;i<arr.length;i++)
    {
      int last=arr.length-i-1;
      int maxIndex = getMaxIndex(arr,0,last);
      swap(arr,maxIndex,last);
    }
  }
  static int getMaxIndex(int[]arr,int start, int end)
  {
    int max = start;
    for(int i=start;i<=end;i++)
      {
        if(arr[max]>arr[i])
        {
          max=i;
        }
      }
    return max;
  }
  static void swap(int []arr,int a, int b)
  {
    int temp = arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
  }
}
