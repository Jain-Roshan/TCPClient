package com.main.java;

public class TcpMsgSender {
    public static void main(String[] args) throws Exception {
        TcpMsgSender runner = new TcpMsgSender();
        runner.run(args);
    }

    //private static Logger logger = LoggerFactory.getLogger(TcpMsgSender.class);
    public void run(String[] args) throws Exception {
        //String fileName = args.length > 0 ? args[0] : "data/msg.txt";
        String[] hostPort =  "localhost:25000".split(":");
        String host = hostPort[0];
        String port = hostPort.length > 1 ? hostPort[1] : "25000";

        String text = "";

        
    }
}