import java.util.*;
public class Quick {
  public static int partition ( int[] data, int start, int end){
    Random a = new Random();
    int select = start + a.nextInt(end - start + 1);
    int inital = start;
    int pivot = data[select];
    int temp = data[start];
    data[start] = pivot;
    data[select] = temp;
    start += 1;
    int temp2 = 0;
    int temp4 = a.nextInt(1);
    while (start <= end) {
      if(data[start] > pivot) {
          temp2 = data[start];
          data[start] = data[end];
          data[end] = temp2;
          end -= 1;
      }
      else if(data[start] == pivot) {
          temp4 = a.nextInt(2);
          if (temp4 % 2 == 1) {
          temp2 = data[start];
          data[start] = data[end];
          data[end] = temp2;
          end -= 1;
        }
        else {
          start += 1;
        }
      }
      else {
        start += 1;
      }
      }
      int temp3 = data[start - 1];
      data[start - 1] = pivot;
      data[inital] = temp3;
      return start - 1;
    }
    public static int partitionSort ( int[] data, int start,int pivot, int end){
      Random a = new Random();
      int select = pivot;
      int inital = start;
      int temp = data[start];
      data[start] = pivot;
      data[select] = temp;
      int timer= start - end;
      start += 1;
      int temp2 = 0;
      int temp4 = 0;
      while (start <= end) {
        if(data[start] > pivot) {
            temp2 = data[start];
            data[start] = data[end];
            data[end] = temp2;
            end -= 1;
        }
        else if(data[start] == pivot) {
            temp4 += 1;
            if (temp4 % 2 == 1) {
            temp2 = data[start];
            data[start] = data[end];
            data[end] = temp2;
            end -= 1;
          }
        }
        else {
          start += 1;
        }
        }
        int temp3 = data[start - 1];
        data[start - 1] = pivot;
        data[inital] = temp3;
        return start - 1;
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
        lower = temp + 1;
      }
      if (temp > k) {
        higher = temp - 1;
      }
    }
    return 0;
   }
   public static void quicksort(int []data) {

     quickSorthelper(data, 0, data.length - 1);
   }
   public static void quickSorthelper(int[] data, int start, int end) {
     if(start >= end) {
       return;
     }
     int split = partition(data,start,end);
     quickSorthelper(data,start,split- 1);
     quickSorthelper(data,split + 1, end);
   }













   public static void main(String[] args) {
     int[] b = {10, 10, 6,4 ,12}; //, 8, 4 , 3 , 56 , 12 , 6};
     int[] a = {134, 134, 1989, 1268, 1574, 103, 1999, 34, 743, 1252, 1446, 978, 1930, 1331, 159, 37, 533, 1722, 1061, 1868, 923, 1658, 670, 66, 1135, 43, 1569, 190, 1227, 1699, 644, 719, 1170, 1683, 817, 1625, 1344, 1494, 370, 1116, 1918, 438, 1841, 1911, 1277, 1422, 1023, 1563, 799, 51};
     for(int i = 0; i < 1;i++) {
       quicksort(a);
       System.out.println(printarray(a));
     }
   }


}
