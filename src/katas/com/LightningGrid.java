package katas.com;

import katas.com.interfaces.Grid;

public class LightningGrid implements Grid {
    private final int[][] arr = new int[1000][1000];

   public void performProcedure(int row1, int column1, int row2, int column2, String operation){
       if(operation.equals(Operation.TURNON)){
           for(int i=row1;i<=row2;i++)
           {
               for(int j=column1;j<=column2;j++){

                   arr[i][j]=1;
               }
           }
       }
       else if (operation.equals(Operation.TURNOFF)) {
           for(int i=row1;i<=row2;i++)
           {
               for(int j=column1;j<=column2;j++){

                   arr[i][j]=0;
               }
           }
       }
       else if(operation.equals(Operation.TOGGLE)){
           for(int i=row1;i<=row2;i++)
           {
               for(int j=column1;j<=column2;j++){

                   if(arr[i][j] == 1){
                       arr[i][j] = 0;
                   }else{
                       arr[i][j] =1;
                   }
               }
           }
       }
   }

   public int countNoOfLights(){
       Count count = new Count();
       return count.countNoOfLights(arr);

   }





}
