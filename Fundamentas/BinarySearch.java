/*************************************************************************
 *  Compilation:  javac BinarySearch.java
 *  Execution:    java BinarySearch whitelist.txt < input.txt
 *  Data files:   http://algs4.cs.princeton.edu/11model/tinyW.txt
 *                http://algs4.cs.princeton.edu/11model/tinyT.txt
 *                http://algs4.cs.princeton.edu/11model/largeW.txt
 *                http://algs4.cs.princeton.edu/11model/largeT.txt
 *
 *  % java BinarySearch tinyW.txt < tinyT.txt
 *  50
 *  99
 *  13
 *
 *  % java BinarySearch largeW.txt < largeT.txt | more
 *  499569
 *  984875
 *  295754
 *  207807
 *  140925
 *  161828
 *  [3,675,966 total values]
 *
 *************************************************************************/

import java.util.Arrays;

public class BinarySearch {

/***
  //递归实现二分查找 
  public static int rank(int key, int[] a)
    { return rank(key, a, 0, a.length - 1); }
      public static int rank(int key, int[] a, int lo, int hi)
    { //如果key存在于a[]中，它的索引不会小于lo且不会大于hi
      if (lo > hi) return -1;
      int mid = lo + (hi - lo) / 2;
      if (key < a[mid]) return rank(key, a, lo, mid - 1);
      else if (key > a[mid]) return rank(key, a, mid + 1, hi);
      else return mid;
    }
***/
    // precondition: array a[] is sorted
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);

        Arrays.sort(whitelist);

        // read key; print if not in whitelist
        while (!System.in.isEmpty()) {
            int key = System.in.readInt();
            if (rank(key, whitelist) == -1)
                System.out.println(key);
        }
    }
}
