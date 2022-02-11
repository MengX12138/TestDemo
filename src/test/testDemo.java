package test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class testDemo {

    public static void main(String[] args) throws IOException {
        //监听客户端连接
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //绑定监听端口  设置为非阻塞模式
        serverSocketChannel.socket().bind(new InetSocketAddress("IP", 9000));
        serverSocketChannel.configureBlocking(false);
        //创建Reactor线程
        Selector selector = Selector.open();
    }

}
