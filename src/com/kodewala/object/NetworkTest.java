package com.kodewala.object;

class Server {
	final int port;

	Server() {
		port = 8080;
		System.out.println("Server port = " + port);
	}
}

class SecureServer extends Server {
	final String protocol;

	SecureServer() {
		protocol = "HTTPS";
		System.out.println("Protocol = " + protocol);
	}
}

public class NetworkTest {
	public static void main(String[] args) {
		new SecureServer();
	}
}
