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
	//д�ļ�
	System.out.println("�������ļ�����");
	String name =scan.next();
	File file=new File(name+".txt");//�ļ���  ���·��Ŀ¼��
	BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream("file"));//true��ʾ׷�ӣ�����ļ����ڣ�����������������
	System.out.println("������д�������:");
	String str=scan.next();
	byte bytes[]=str.getBytes();//fileoutputStream�ǻ����ֽ�������Ҫд�����Ϣ���浽�ֽ�������
	fos.write(bytes,0,bytes.length);//��ֱ�������е�ȫ������д���ļ���,��0������ĳ���
	fos.close();
	long endtime=System.currentTimeMillis();
	System.out.println("����ʱ�䣺"+(endtime-startTime));
	System.out.println("�ļ�д��ɹ���");
	//���ļ�
	FileInputStream fis =new FileInputStream("file");
	byte bs[]=new byte[1024];//ÿ�����1KB
	int len;
	while((len=fis.read(bs))!=-1){//�����ݱ��浽�������У������ض�ȡ���ֽ���,-1��ʾ������
		System.out.println(new String(bs,0,len));//��������б�������ݣ�����ÿ�ζ�ȡ���ֽ���
	}
	fis.close();
	}
}
