
//loops in array,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
// public class Array {
//     public static void main(String[] args) {
//         int []arr={10,20,30,40,50};
//         for(int i=0; i<=4; i++){
//         System.out.print(arr[i]+" ");
//     }
// }
// }

import java.util.Scanner;
//input take from user,,,,,,,,,,,,,,,,,,,
public class Array {
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the size of array:");
 int n=sc.nextInt();
 int []arr=new int[n];
  
  System.out.println("enter array elements:");
  for(int i=0; i<n; i++){
    arr[i]=sc.nextInt();
  }
  for(int i=0; i<n; i++){
    System.out.print(arr[i]+" ");
  }}}
//sum of array ,,,,,,,,,,,,,,,,,,,
// public class Array {
//     public static void main(String[] args) {
//  int[]marks={10,20,30,40,50};
//  int sum=0;
//  for(int i=0; i<marks.length; i++){
//     sum += marks[i];

//  }
//  System.out.println(sum);
    
//     }}
//sum of array take input from user,,,,,,,,,,,,,,,,,,
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//          System.out.println("enter the size of Array:");
//          int n=sc.nextInt();
//          int[]arr=new int[n];

//          System.out.print("enter the array elements:");
//          for(int i=0; i<n; i++){
//              arr[i]=sc.nextInt();
//          }
//          int sum=0;
//           for(int i=0; i<n;=  i++){
//     sum += arr[i];
//             System.out.println(sum);
//          }}}
// find the element in Array,,,,,,,,,,
// public class Array{
//     public static void main(String[] args) {
//         int[]arr={1,2,3,4,5,6};
//         int x=4;
//    for(int i=0; i<arr.length; i++){
//     if(arr[i]==x){
//         System.out.println("found");
//     }
//     }
//     }
// }
// to find the maximum element in array,,,,

