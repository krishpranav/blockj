package com.block.blockj.agent;

import java.io.IOException;
import java.net.Socket;

public class AgentServerThread {

    private Socket client;
    private final Agent agent;

    AgentServerThread(final Agent agent, final Socket client) {
        super(agent.getName() + System.currentTimeMillis());
        this.agent = agent;
        this.client = client;
    }

    @Override
    public void run() {
        try {

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
