package io.nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

//NIO获取通道
public class GetChannel {

	public static void main(String[] args) throws IOException {
		FileChannel channel = new FileOutputStream("").getChannel();
	}
}
