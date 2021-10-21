package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//it only calls that DataMgr object once
		DataMgr dataMgr1=DataMgr.getInstance();
		DataMgr dataMgr2=DataMgr.getInstance();
		DataMgr dataMgr3=DataMgr.getInstance();




	}

}
