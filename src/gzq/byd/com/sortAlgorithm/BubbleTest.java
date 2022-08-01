package gzq.byd.com.sortAlgorithm;

public class BubbleTest {
    public void bubble(int[] target){
//        int tmp = 0;
        boolean hasSwitched = false;
        for(int i = target.length-1;i>0;i--){
        hasSwitched = false;
            for(int j = 0;j<i;j++){
                if(target[j+1]<target[j]){
                    target[j] = target[j]^target[j+1];
                    target[j+1] = target[j]^target[j+1];
                    target[j] = target[j]^target[j+1];
                    hasSwitched = true;
                }
            }
            //no position switches happen,the array is already sorted
            if(!hasSwitched){
                System.out.println("done!");
                break;
            }
            System.out.format("No %d,",target.length-i);
            SortUtil.showAll(target);
        }
    }


    public static void main(String[] args) {
        BubbleTest bubbleTest = new BubbleTest();
        int [] noSort = new int[]{5,8,2,1,7,3,6,4,9};//14ms
        long startTime = System.currentTimeMillis();
        bubbleTest.bubble(noSort);
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println(elapsedTime);
    }
}
