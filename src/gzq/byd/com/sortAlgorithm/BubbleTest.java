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
            showAll(target);
        }
    }
    public void showAll(int[] target){
        for (int i : target) {
            System.out.format("\t%d",i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleTest bubbleTest = new BubbleTest();
        int [] noSort = new int[]{5,8,2,1,7,3,6,4,9};//14ms
        System.out.println(System.currentTimeMillis());
        bubbleTest.bubble(noSort);
        System.out.println(System.currentTimeMillis());
    }
}
