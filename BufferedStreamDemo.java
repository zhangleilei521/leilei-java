package com.itheima;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamDemo {
public static void main(String[] args) throws IOException {
	 //������ʼʱ��
	long start=System.currentTimeMillis();
	//method1();//����ʱ:337����
	//method2();//����ʱ:2����
	//method3();//����ʱ:9����
	method4();//����ʱ:2����
	//��¼����ʱ��
	long end =System.currentTimeMillis();
	System.out.println("����ʱ:"+(end-start)+"����");
}

private static void method3() throws IOException {
	BufferedInputStream bis=new BufferedInputStream(new FileInputStream("d:\\����ͼƬ.avi"));
	BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("copy.avi"));
	int by;
	while((by=bis.read())!=-1){
		bos.write(by);
	}
	bos.close();
	bis.close();
}
	private static void method4() throws IOException {
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("d:\\����ͼƬ.avi"));
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
	 FileInputStream fis=new FileInputStream("d:\\����ͼƬ.avi");
	 FileOutputStream fos=new FileOutputStream("copy.avi");
	 int by;
	 while((by=fis.read())!=-1){
		 fos.write(by);
	 }
	 
	 fos.close();
	 fis.close();
}
private static void method2() throws IOException {
	 FileInputStream fis=new FileInputStream("d:\\����ͼƬ.avi");
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
