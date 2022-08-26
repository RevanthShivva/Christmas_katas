package katas.com;

public class Count {
    public int countNoOfLights(int[][] arr){
        int count = 0;
        for(int i =0;i< 1000;i++){
            for(int j =0;j<1000; j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
        }
        return count;
    }
}
