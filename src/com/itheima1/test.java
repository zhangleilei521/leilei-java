package com.itheima1;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class test {
	public static void main(String[] args) throws IOException {
	Scanner scan=new Scanner(System.in);
	long startTime=System.currentTimeMillis();
	//写文件
	System.out.println("请输入文件名：");
	String name =scan.next();
	File file=new File(name+".txt");//文件名  相对路径目录下
	BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream("file"));//true表示追加，如果文件存在，向里面继续添加内容
	System.out.println("请输入写入的内容:");
	String str=scan.next();
	byte bytes[]=str.getBytes();//fileoutputStream是基于字节流，把要写入的信息保存到字节数组中
	fos.write(bytes,0,bytes.length);//将直接数组中的全部内容写到文件中,从0到数组的长度
	fos.close();
	long endtime=System.currentTimeMillis();
	System.out.println("所用时间："+(endtime-startTime));
	System.out.println("文件写入成功！");
	//读文件
	FileInputStream fis =new FileInputStream("file");
	byte bs[]=new byte[1024];//每次最多1KB
	int len;
	while((len=fis.read(bs))!=-1){//将数据保存到缓冲区中，并返回读取的字节数,-1表示读完了
		System.out.println(new String(bs,0,len));//输出数组中保存的内容，按照每次读取的字节数
	}
	fis.close();
	}
}
