package com.company;
public class Huffman {

    public static void printCode(HuffmanNode root, String s)
    {
        if (root.left == null && root.right == null && Character.isLetter(root.character)) {
            System.out.println(root.character + ":" + s);
            return;
        }

        printCode(root.left, s + "0");  //go left then add "0"
        printCode(root.right, s + "1");  //go right add "1"
    }}
