package com.kh.serverEx;
/*
서버 IP가 192.200.3.58일 때 서버로 연결하는 방법을 수정해서 작성하기
 */
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class IPPort {
	public static void main(String[] args) {
		String serverIP = "192.200.3.58";
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			System.out.println(serverIP);
									//serverIP = 192.168.0.35 각자 컴퓨터 IP 주소
			Socket socket = new Socket(serverIP,3000);
			System.out.println(socket);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
