package com.itheima;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamDemo {
public static void main(String[] args) throws IOException {
	 //计量开始时间
	long start=System.currentTimeMillis();
	//method1();//共耗时:337毫秒
	//method2();//共耗时:2毫秒
	//method3();//共耗时:9毫秒
	method4();//共耗时:2毫秒
	//记录结束时间
	long end =System.currentTimeMillis();
	System.out.println("共耗时:"+(end-start)+"毫秒");
}

private static void method3() throws IOException {
	BufferedInputStream bis=new BufferedInputStream(new FileInputStream("d:\\复制图片.avi"));
	BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("copy.avi"));
	int by;
	while((by=bis.read())!=-1){
		bos.write(by);
	}
	bos.close();
	bis.close();
}
	private static void method4() throws IOException {
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("d:\\复制图片.avi"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("copy.avi"));
		byte[] bys=new byte[1024];
		int len;
		
		while((len=bis.read(bys))!=-1){
			bos.write(bys,0,len);
		}
		bos.close();
		bis.close();
}

private static void method1() throws IOException {
	 FileInputStream fis=new FileInputStream("d:\\复制图片.avi");
	 FileOutputStream fos=new FileOutputStream("copy.avi");
	 int by;
	 while((by=fis.read())!=-1){
		 fos.write(by);
	 }
	 
	 fos.close();
	 fis.close();
}
private static void method2() throws IOException {
	 FileInputStream fis=new FileInputStream("d:\\复制图片.avi");
	 FileOutputStream fos=new FileOutputStream("copy.avi");
	 byte[]bys=new byte[1024];
	 int len;
	 while((len=fis.read(bys))!=-1){
		 fos.write(bys,0,len);
	 }
	 
	 fos.close();
	 fis.close();
}

}
