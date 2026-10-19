package com.astronity.app;

import java.util.BitSet;

public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet(8);
        BitSet bitSet2 = new BitSet(8);

        bitSet.set(1);
        bitSet2.set(0);
        bitSet2.set(1);
        bitSet2.set(3);
        bitSet.and(bitSet2);

        System.out.println("B1 "+ bitSet);
    }
}
