package net.swierczynski.alexaairly;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import javax.inject.Named;

@Named("alexa")
public class QuarkusDelegateStreamLambda implements RequestHandler<byte[], byte[]> {
  @Override
  public byte[] handleRequest(byte[] request, Context context) {
    throw new RuntimeException("UnreachableCode");
  }
}
