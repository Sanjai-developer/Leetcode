class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
     for (int i=0;i< flowerbed.length;i++){
        if(flowerbed[i]==0){
            if(i==flowerbed.length-1||flowerbed[i+1] ==0){
                flowerbed[i] = 1;//planted flower
                i++;
                n--;
            }
        }else{i++;}

     if (n<=0){
            return true;
        }
    }
        return n<=0;

        }
    }


