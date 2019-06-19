

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner; 

public class Client {
	public static void main(String[] args) {
		System.out.println("Please pick (1) to order peperoni Pizza and pick (2) to order a Vege Pizza");
		 Scanner myObj = new Scanner(System.in);
		 String order = myObj.nextLine(); 
		try (Socket socket = new Socket("localhost", ProactorInitiator.ASYNC_SERVER_PORT);) {
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			if (order.equals("1")) {
			out.print("1");
			System.out.println("Ordering Peperoni Pizza!");
			}
			if (order.equals("2")) {
				out.print("2");
				System.out.println("Ordering Vege Pizza!");
				}
			out.flush();
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String reply = in.readLine();
			String received="";
			if (reply.equals("1")) {
				received="Peperoni Pizza has been successfully delivered";
			}
			if (reply.equals("2")) {
				received="Vege Pizza has been successfully delivered";
			}
			System.out.println("Server responded: " + received);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}

//https://github.com/gysel/ProactorPattern/blob/master/src/client/Client.java