class Main {
  public static void main(String[] args) {
    int [] arr={5,2,3,4,1};
    bubble(arr);
    System.out.println("The Sorted Array is: ");
    for(int i=0;i<arr.length;i++)
      {
        System.out.println(arr[i]+" ");
      }
  }
  static void bubble(int[]arr)
  {
    for(int i=0;i<arr.length;i++)
    {
      for(int j=1;j<=arr.length-i-1;j++)
      {
        if(arr[j]<arr[j-1])
        {
          int temp = arr[j];
          arr[j]=arr[j-1];
          arr[j-1]=temp;
        }
      }
    }
  }
}
