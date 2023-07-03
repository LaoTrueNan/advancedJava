package org.gzq.algorithm.def;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author guo
 * @date 2022/12/23 9:11
 */

public class BinaryTreeNode<T> {

    private T val = null;

    private BinaryTreeNode<T> left = null;

    private BinaryTreeNode<T> right = null;

    public BinaryTreeNode(T val) {
        this(val,null,null);
    }

    public BinaryTreeNode(T val, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }

    public BinaryTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return val.toString();
    }

    public static void main(String[] args) {
        try {
            ServerSocket socket = new ServerSocket(8765);
            Socket accept = socket.accept();
            InputStream inputStream = accept.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder stringBuilder = new StringBuilder();
            while(true){
                if(in.ready()){
                    int i = in.read();
                    while(i!=-1){
                        stringBuilder.append((char) i);
                        i = in.read();
                    }
                    break;
                }
            }
            socket.close();
            System.out.println(stringBuilder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
