/*
 * author guo
 * year 2023
 */
package gzq.byd.com.leet;

public class SquareArea {

    public static void main(String[] args) {

        System.out.println(new SquareArea().s(-2, -2, 2, 2, -1, 4, 1, 6));
    }

    public int s(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2){
        int s = (ax2-ax1) * (ay2-ay1);
        int s1 = (bx2-bx1) * (by2-by1);
        if(bx1>ax2||by1>ay2||ax1>bx2||ay1>by2){
            return s+s1;
        }
        int rightTop1 = Math.min(ax2,bx2), rightTop2 = Math.min(ay2,by2);
        int leftBottom1 = Math.max(ax1,bx1),leftBottom2 = Math.max(ay1,by1);
        int diff = (rightTop2-leftBottom2)*(rightTop1-leftBottom1);

        return s-diff+s1;
    }
}
