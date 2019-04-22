package com.yaHuiSever.control;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class control {
	//服务器端
    private ServerSocket server;  
    private final int PORT=9999;
    private yaHuiService service;
	public control() {
		super();
		try {
			System.out.println("服务器正在开启中");
			this.server=new ServerSocket(PORT);
			Thread.sleep(1000);
			System.out.println("服务器已经开启中");
			this.service=new yaHuiServiceImpl();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void start(){
    	while(true){
    		//等待客户连接
    		try {
				Socket client=this.server.accept();
				System.out.println("用户"+client.getInetAddress().getHostAddress()+"已连接");
				//创建线程对象
				controlThread ct=new controlThread(client,service);
				ct.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    } 
    
}
