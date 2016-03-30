import java.util.Arrays;
public class BinarySearchJava {


  public static int  BinarySearch(int key,int[] a){
    int low = 0;
    int high = a.length - 1;
    while ((low <= high){
      int middle = low+(high - low)/2;

     if(key < a[middle]){
        high = middle - 1;
      }
      else if(key > a[middle]){
        low = middle -1 ;
      }else return middle;

    return -1;
  }

  //测试
   public static void main(String[] args) {
     int[] a = new int [1000];
     for (int i = 0;i < 1000; i++){
       a[i] = i;
     }
     System.out.println(a);
  }


}
