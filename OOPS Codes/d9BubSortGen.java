import java.util.Arrays;
public class d9BubSortGen<T extends Comparable<? super T>> 
{
T[] array;
d9BubSortGen(T[] array)
{
this.array = array;
}
private T[] bubbleSort()
{
for(int i = array.length; i > 1; i--)
{
for(int j = 0; j < i - 1; j++)
{
  if(array[j].compareTo(array[j+1]) > 0)
  swapElements(j, array);
}            
}
return array;
}
private void swapElements(int index, T[] arr)
{
T temp = arr[index];
arr[index] = arr[index+1];
arr[index+1] = temp;        
}
public static void main(String[] args) 
{
Integer[] intArr = {47, 62, 34, 7, 10,  2, 54};
d9BubSortGen<Integer> bsg1 = new d9BubSortGen<Integer>(intArr);
Integer[] sa1 = bsg1.bubbleSort();
System.out.println("Sorted Integer array- " + Arrays.toString(sa1)); 
String[] strArr = {"Earl", "Robert", "Asha", "Arthur"};
d9BubSortGen<String> bsg2 = new d9BubSortGen<String>(strArr);
String[] sa2 = bsg2.bubbleSort();
System.out.println("Sorted String array- " + Arrays.toString(sa2));
Float[] fArr = {100.0f, 90.0f,95.0f};
d9BubSortGen<Float> bsg3 = new d9BubSortGen<Float>(fArr);
Float[] sa3 = bsg3.bubbleSort();
System.out.println("Sorted Float array- " + Arrays.toString(sa3));
}
}
