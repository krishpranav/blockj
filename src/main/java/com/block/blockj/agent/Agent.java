package com.block.blockj.agent;


import java.util.ArrayList;

import static com.block.blockj.agent.Message.MESSAGE_TYPE.INFO_NEW_BLOCK;
import static com.block.blockj.agent.Message.MESSAGE_TYPE.READY;
import static com.block.blockj.agent.Message.MESSAGE_TYPE.REQ_ALL_BLOCKS;
import static com.block.blockj.agent.Message.MESSAGE_TYPE.RSP_ALL_BLOCKS;

public class Agent {
    private String name;
    private String address;
    private int port;
    private List<Agent> peers;
    private List<Block> blockchain = new ArrayList<>();

    private boolean listening = true;

    public Agent() {}

    Agent(final String name, final String address, final int port, final Block root) {
        this.name = name;
        this.address = address;
        this.port = port;
        this.peers = peers;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPort() {
        return port;
    }

    public List<Block> getBlockchain() {
        return blockchain;
    }

    Block createBlock() {
        if (blockchain.isEmpty()) {
            return null;
        }

        Block previousBlock = getLatestBlck();

        if (previousBlock == null) {
            return null;
        }

        return block;
    }

    void addBlock(Block block) {
        if (isBlockValid(block)) {
            blockchain.add(block);
        }
    }
}
