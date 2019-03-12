import java.util.*;
public class Quick {
  public static int partition ( int[] data, int start, int end){
    Random a = new Random();
    int select = start + a.nextInt(end - start);
    int inital = start;
    int pivot = data[select];
    int temp = data[start];
    data[start] = pivot;
    data[select] = temp;
    for (int i = 1; i < start - end; i++) {
      if(data[start + i] > pivot) {
        temp = data[start + i];
        data[start + i] = data[end];
        data[end] = temp;
        end -= 1;
      }
      else {
        start += 1;
      }
      }
      temp = data[start];
      data[inital] = temp;
      data[start] = pivot;
      System.out.println(pivot);
      System.out.println(printarray(data));

      return 0;
    }
  public static String printarray(int[] a) {
    String output = "";
    for(int i = 0; i < a.length; i++) {
      output += a[i] + " ";
    }
    return output;
  }
  public static int quickselect(int []data, int k){
    int lower = 0;
    int higher = data.length - 1;
    boolean flip = true;
    int temp = 0;
    while(flip) {
      temp = partition(data, lower, higher);
      if (temp == k) {
        return data[temp];
      }
      if (temp < k) {
        lower = temp;
      }
      if (temp > k) {
        higher = temp;
      }
    }
    return 0;
   }

   public static void main(String[] args) {
     int[] b = {10, 7, 8, 4 , 3 , 56 , 12 , 6};
    // int[] a = {746, 134, 1989, 1268, 1574, 103, 1999, 34, 743, 1252, 1446, 978, 1930, 1331, 159, 37, 533, 1722, 1061, 1868, 923, 1658, 670, 66, 1135, 43, 1569, 190, 1227, 1699, 644, 719, 1170, 1683, 817, 1625, 1344, 1494, 370, 1116, 1918, 438, 1841, 1911, 1277, 1422, 1023, 1563, 799, 51};
     for(int i = 0; i <= 10; i++) {
       partition(b,0,7);
     }
   }


}
