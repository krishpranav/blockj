package com.block.blockj.agent;

import java.io.Serial;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Block implements Serializable {
    private static final long serialVersionUID = 1L;

    private int index;
    private Long timestamp;
    private String hash;
    private String previousHash;
    private String creator;

    public Block() {}

    @Override
    public String toString() {
        return "Block{" +
                "index=" + index +
                ", timestamp=" + timestamp +
                ", creator=" + creator +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }


        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Block block = (Block) o;

        return index == block.index && timestamp.equals(block.timestamp);
    }
}
