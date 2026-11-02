package arrays;

public class trap_rainwater {
    public static int water(int heights[]){ 
        int water_level =0;
        int l = heights.length;
        int leftmax[]= new int[l],rightmax[] = new int[l];
        leftmax[0]= heights[0];
        for(int i=1;i<l;i++){ 
            if(heights[i]>leftmax[i-1]){ 
                leftmax[i]= heights[i];
            }
            else{ 
                leftmax[i]= leftmax[i-1];
            }
        }
        rightmax[l-1]=heights[l-1];
        for(int i=l-2;i>=0;i--){ 
            if(rightmax[i]<heights[i]){
                rightmax[i]= heights[i];
            }
            else{ 
                rightmax[i]= rightmax[i+1];
            }
        }

        for(int i=0;i<l;i++){ 
            water_level += Math.min(leftmax[i], rightmax[i]) - heights[i];
        }
        return water_level;
    }

    public static void main(String[] args) {
        int heights[]= {4,2,0,6,3,2,5};
        System.out.println(water(heights));
    }
}
