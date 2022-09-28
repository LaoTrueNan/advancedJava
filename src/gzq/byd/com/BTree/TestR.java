package gzq.byd.com.BTree;
//
//public class TestR {
//
//    public void remove(T r) {
//        remove(root, r);
//    }
//
//    private TreeNode<T> remove(TreeNode<T> tree, T r) {
//        if (tree == null)
//            return tree;
//        if (// my num is smaller
//        r.compareTo(tree.getValue()) < 0)
//            tree.setLeft(remove(tree.getLeft(), r));
//        else if (// my num is larger
//        r.compareTo(tree.getValue()) > 0)
//            tree.setRight(remove(tree.getRight(), r));
//        else // this is my number
//        {
//            if (tree.getLeft() == null && tree.getRight() == null)
//                return null;
//            else if (tree.getLeft() == null)
//                return tree.getRight();
//            else if (tree.getRight() == null)
//                return tree.getLeft();
//            else {
//                T min = getSmallest(tree.getRight());
//                tree.setValue(min);
//                // System.out.println("2 + " + toString(tree));
//                tree.setRight(remove(tree.getRight(), min));
//            }
//        }
//        return tree;
//    }
//}


import java.util.HashMap;
import java.util.Map;

public class TestR {
    public static void main(String[] args) throws AssertionError{
        Map<String,String> gzqHashMap = new HashMap<>();
        //返回旧值
        String put = gzqHashMap.put("HG", "enpi");
        String put2 = gzqHashMap.put("HG", "harlen");

        assert put == null;
        System.out.println(put);
        System.out.println(put2);
    }
}