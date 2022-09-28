package gzq.byd.com.BTree;
//
//public class Test {
//
//    public void splitChild(int i, BStarTreeNode node) {
//        BStarTreeNode temp = new BStarTreeNode(node.degree - 1, node.leaf);
//        temp.numKeys = degree - 1;
//        // Copy the degree-1 keys into temo from node
//        for (int j = 0; j < degree - 1; j++) {
//            temp.keyHolder[j] = node.keyHolder[j + degree];
//        }
//        // If this node is not a leaf, copy the degree children
//        if (node.leaf == false) {
//            for (int j = 0; j < degree; j++) {
//                temp.children[j] = node.children[j + degree];
//            }
//        }
//        // Reduce the number of keys in node
//        node.numKeys = degree - 1;
//        // create space of new child
//        for (int j = numKeys; j >= i + 1; j--) {
//            children[j + 1] = children[j];
//        }
//        // Link the new child to this node
//        children[i + 1] = temp;
//        // new key and move all greater keys one space ahead
//        for (int j = numKeys - 1; j >= i; j--) {
//            keyHolder[j + 1] = keyHolder[j];
//        }
//        // Copy the middle key of node
//        keyHolder[i] = node.keyHolder[degree - 1];
//        // Increment count of keys in this node
//        numKeys = numKeys + 1;
//    }
//}

public class Test {

}