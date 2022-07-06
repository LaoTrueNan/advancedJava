package gzq.byd.com.sortAlgorithm;

public class BinaryTree<T> {
    private TreeNode<T> root;
    private int capacity;
    public BinaryTree() {
        this(null);
    }
    public BinaryTree(TreeNode<T> root){
        this(root,50);
    }
    public BinaryTree(TreeNode<T> root,int capacity) {
        this.root = root;
        this.capacity = capacity;
    }
    public T appendNode(T newNode){
        return newNode;
    }
    public T deleteNode(T target){
        return target;
    }
    public TreeNode<T> getRoot() {
        return root;
    }
    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    /*三序遍历*/
    public void SFC(Order a){
        switch (a){
//            中序
            case In:
//            前序
            case Pre:
//            后序
            case Post:

        }
    }
    /*层次遍历*/
    public void VFC(){
        TreeNode<T> root = this.getRoot();
        
    }
    class TreeNode<T>{
        private T data;
        private T left;
        private T right;

        public TreeNode(T data, T left, T right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    enum Order{
        Pre,In,Post
    }
}
