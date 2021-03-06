package com.hippo.redis;

import io.netty.buffer.ByteBuf;

import java.io.IOException;

import com.hippo.redis.coder.RedisReplyDecoder;

/**
 * 
 * @author saitxuc
 *
 */
public interface Reply<T> {
	
	byte[] CRLF = new byte[] { RedisReplyDecoder.CR, RedisReplyDecoder.LF };

	  T data();
	  void write(ByteBuf os) throws IOException;
	
}
