public class Main
{
    
    static void spiral(int[][] arr, int row, int col){
        int i = 0, j = 0;
        
        int left = 0, right = col-1;
        int up = 0, down = row-1;
        int rc = 0;
        while(rc<row*col){
            
            System.out.print(arr[i][j]+" ");
            
            //Go to next element in spiral border
            
            if(j==left && i<down){
                i++;
            }
            else if(i==down && j<right){
                j++;
            }
            else if(j==right && i>up){
                i--;
            }
            else if(i==up && j>left-1){
                j--;
            }
            
            //After one cycle, change border varibles (Shrink border).
            
            if(i==up && j-1==left){
                if(left<col-1){
                    left++;
                }
                if(right>0){
                    right--;
                }
                if(up<row-1){
                    up++;
                }
                if(down>0){
                    down--;
                }
            }
            
            //Count of No of elements printed
            rc++;
        }
    }
    
	public static void main(String[] args) {
		int row = 4;
		int col = 4;
		int[][] arr = {{1,2,3,4},{5,6,7,8},{1,2,3,4},{5,6,7,8}};
		spiral(arr,row,col);
	}
}
