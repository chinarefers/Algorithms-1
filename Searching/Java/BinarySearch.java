
//二分法查找

public class BinarySearch {

  public static int search( int[] a,int key){
    int low = 0;
    int high = a.length - 1;

    while (low <= high){
      int mid = low + (high - low) / 2;
      if      (key < a[mid]) high = mid - 1;
      else if (key > a[mid]) low = mid + 1;
      else return mid;
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] a = { 2, 4, 11, 13, 22, 26, 91, 113, 135, 214 };
    //对数组进行排序
    int find = BinarySearch.search(a,135);

    if (find != -1) {
        System.out.println("找到数值于索引" + find);
    } else {
        System.out.println("找不到数值");
    }
  }

}
