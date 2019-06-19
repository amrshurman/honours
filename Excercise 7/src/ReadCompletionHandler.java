
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

public class ReadCompletionHandler implements CompletionHandler<Integer, SessionState> {
	private final AsynchronousSocketChannel socketChannel;
	private final ByteBuffer inputBuffer;

	public ReadCompletionHandler(AsynchronousSocketChannel socketChannel, ByteBuffer inputBuffer) {
		this.socketChannel = socketChannel;
		this.inputBuffer = inputBuffer;
	}

	@Override
	public void completed(Integer bytesRead, SessionState sessionState) {

		byte[] buffer = new byte[bytesRead];
		inputBuffer.rewind();
		// Rewind the input buffer to read from the beginning

		inputBuffer.get(buffer);
		String message = new String(buffer);
		String msgSend="";System.out.println(message);
		if (message.equals("1")) {
			msgSend="Peperonni Pizza has been made and is making its way to be delivered."; 
		}
		if (message.equals("2")) {
			msgSend="Vege Pizza has been made and is making its way to be delivered.";
		}
		System.out.println("Received message from client : " + msgSend);

		// Echo the message back to client
		WriteCompletionHandler writeCompletionHandler = new WriteCompletionHandler(socketChannel);

		ByteBuffer outputBuffer = ByteBuffer.wrap(buffer);

		socketChannel.write(outputBuffer, sessionState, writeCompletionHandler);
		System.out.println("Awaiting Order...");
	}

	@Override
	public void failed(Throwable exc, SessionState attachment) {
		// Handle read failure.....
	}

}