public class Quick {
  public static int partition ( int [] data, int start, int end){
    int select = start + 2;
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
      System.out.println(printarray(data));
    }
    data[output] = data[start + front];
    data[start + front] = pivot;
    return start + front;
}
  public static String printarray(int[] a) {
    String output = "";
    for(int i = 0; i < a.length; i++) {
      output += a[i] + " ";
    }
    return output;
  }
}
