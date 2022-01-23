public class SimpleStuffs {


    public int Addition(int[]array){
        int temp = 0;
        for(int i = 0; i < array.length; i++ ){
            temp += array[i];
        }
        return temp;
    }

    public int linearSearch (int[]array, int WhatImLookingFor){
        int index = 0;
        for (int var : array){
            if (WhatImLookingFor == var){
                return index;
            }else{
                index ++;
            }
        }
        return 0;
    }
}
