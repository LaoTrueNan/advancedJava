package org.gzq.algorithm.def;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Scanner;

/**
 * 完全二叉树
 * @author guo
 * @date 2022/12/23 9:40
 */
public class CompleteBinTree<T> {

    private BinaryTreeNode<T> [] data;



    // 目前节点个数
    private int size = 0;

    private static final int MIN_SIZE = 2<<3;

    // 2147483647
    private static final int MAX_SIZE = Integer.MAX_VALUE;
    // 默认是8个节点,不够再扩
    private int capacity = MIN_SIZE;

    // 构造方法有几种?
    //∅ 空

    public CompleteBinTree() {
        data = new BinaryTreeNode[capacity];
    }

    //① 单个值
    public CompleteBinTree(T t) {

        data[size++] = new BinaryTreeNode<>(t);

    }

    //② 单个BinaryTreeNode

    //③ 一个T值的集合

    public CompleteBinTree(Collection<? extends T> ts) {
        BinaryTreeNode<T> [] res = new BinaryTreeNode[ts.size()];
        int i = 0;
        for (T t : ts) {
            BinaryTreeNode<T> node = new BinaryTreeNode<>(t);
            res[i++] = node;
        }
        treeify(res);
    }


    //④ 一个BinaryTreeNode的集合

    //⑤ 另一棵树

//    private boolean checkCapacity(){
//        if(size==capacity){
//            boolean res = incrementSize(capacity >>> 1);
//            if(res)
//        }
//    }
    private boolean incrementSize(int i){
        if(capacity==MAX_SIZE){
            return false;
        }
        if(i<=0){
            throw new IllegalArgumentException("the size you want to expand is not legal");
        }
        // 有参数先按参数来,没参数就走默认
        capacity += i;

        // 先给它+一半


        return false;
    }


    private void treeify(BinaryTreeNode<T> [] nodes){

    }

    public static void main(String[] args) {
//CBAFEGD
//CFGEADB
        Scanner scanner = new Scanner(System.in);
//        BADC
        String mid = scanner.nextLine();
//        BDCA
        String post = scanner.nextLine();
        ArrayDeque<String> strings = new ArrayDeque<>();
        ArrayDeque<String> _strings = new ArrayDeque<>();
        _strings.offer(mid);
        strings.offer(post);
        while(strings.size()>0){
            String a = strings.pollLast();
            String b = _strings.pollLast();
            if (b.length()==1) {
                System.out.print(b);
                continue;
            }
            char c = a.charAt(a.length() - 1);
            System.out.print(c);
            int i = b.indexOf(c);
            if(i>=0){
                if(i<b.length()-1){
                    _strings.offer(b.substring(i+1));//DC
                    strings.offer(a.substring(i,a.length()-1));
                }
                if(i>0){
                    _strings.offer(b.substring(0,i));//B
                    strings.offer(a.substring(0,i));
                }
            }
        }
    }
}
