package com.company;
import java.util.PriorityQueue;


public class Main {

    public static void main(String[] args) {
        try {
            int n = 6;
            char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
            int[]  Frequency = {5,9,12,13,16,45};
            PriorityQueue<HuffmanNode> elements = new PriorityQueue<>(n, new MyComparator());   // min-priority

            for (int i = 0; i < n; i++) {
                HuffmanNode newNode = new HuffmanNode();
                newNode.character = charArray[i];
                newNode.frequency = Frequency[i];
                newNode.left = null;
                newNode.right = null;
                elements.add(newNode);
            }

            HuffmanNode MainRoot = null; // this root we will use to pass to Huffman function " printCode "
            while (elements.size() > 1) {
                HuffmanNode x = elements.poll();
                HuffmanNode y = elements.poll();
                HuffmanNode f = new HuffmanNode();
                //  summary of the frequencies of the two nodes
                f.frequency = x.frequency + y.frequency;
                f.character = '-';
                f.left = x;
                f.right = y;
                MainRoot = f;
                elements.add(f);
            }


            Huffman.printCode(MainRoot, "");

        }catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}