package com.itheima;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferedwriterreader {
public static void main(String[] args) throws IOException {
	BufferedWriter bw=new BufferedWriter(new FileWriter("a.txt"));
	bw.write("hello");
	bw.close();
	
	
	//�����ַ���������������
	BufferedReader br=new BufferedReader(new FileReader("Bufferedwriterreader.java"));
	//int ch;
	//while((ch=br.read())!=-1){
		//System.out.print((char)ch);
	//}
	
	//һ�ζ�ȡһ���ַ�����
	char[] bys =new char[1024];
	int  len;
	while((len=br.read(bys))!=-1){
		System.out.print(new String (bys,0,len));
	}
	//�ͷ���Դ
	br.close();
}
}