import java.util.*;
public class Quick {
  public static int partition ( int [] data, int start, int end){
    Random a = new Random();
    int select = start + a.nextInt(end - start);
    int pivot = data[select];
    int back = 0;
    int front = 0;
    int temp  = 0;
    int output = 0;
    for (int i = start; i < end; i++) {
      if (data[start + front] > pivot) {
        temp = data[start + front];
        data[start + front] = data[end - back];
        data[end - back] = temp;
        back += 1;
      }
      else {
        if (data[start + front] == pivot) {
          output = start + front;
        }
        front += 1;
      }
    }
    data[output] = data[start + front];
    data[start + front] = pivot;

    System.out.println(printarray(data));
    return start + front;
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
     int[] a = {746, 134, 1989, 1268, 1574, 103, 1999, 34, 743, 1252, 1446, 978, 1930, 1331, 159, 37, 533, 1722, 1061, 1868, 923, 1658, 670, 66, 1135, 43, 1569, 190, 1227, 1699, 644, 719, 1170, 1683, 817, 1625, 1344, 1494, 370, 1116, 1918, 438, 1841, 1911, 1277, 1422, 1023, 1563, 799, 51};
     for(int i = 5; i == 5; i++) {
       System.out.println(quickselect(a,i));
     }


   }


}
