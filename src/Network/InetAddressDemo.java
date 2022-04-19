package Network;

import java.io.IOException;
import java.net.*;

public class InetAddressDemo {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < args.length; i++) {
            try {
                InetAddress address = InetAddress.getByName(args[i]);
                System.out.print("Host name: " + address.getHostName() + " ");
                System.out.println("IP address: " + address.getHostAddress());
            } catch (UnknownHostException ex) {
                System.err.println("Unknown host or IP address " + args[i]);
            }
        }
    }
}
