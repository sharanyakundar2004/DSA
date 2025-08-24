class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int left;
        int right;
        for (int i = 0; i < len; i++){
            if(flowerbed[i] == 0){
                if (i == 0){
                    left = 0;
                } else {
                    left = flowerbed[i - 1];
                }
                if (i == len - 1){
                    right = 0;
                } else {
                    right = flowerbed[i + 1];
                } 

                if (left == 0 && right == 0){
                    flowerbed[i] = 1;
                    n--;
                }
            }
            if(n <= 0){
                return true;
            }
        }
        return n <= 0;
    }
}