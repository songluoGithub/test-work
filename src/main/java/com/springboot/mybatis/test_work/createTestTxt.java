package com.springboot.mybatis.test_work;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class createTestTxt {
    public static void main(String[] args) throws IOException {
    	FileWriter fw = new FileWriter("C:\\Users\\luosong\\Desktop\\test.txt");
    	long phone = 13787850000L;
    	long cert = 430621193402340000L;
    	int aa = 1;
        //第二步，调用fw的write方法，向文件中写入数据；
        for(int i=0;i<5000;i++){
        	String bb = (phone++)+"||"+"1"+"||"+(++cert)+"||"+"test"+"||"+"1"+"||"+(aa++);
        	fw.write(bb+"\r\n");
        }
        
        //第三步， 调用FileWriter对象的flush()方法，将数据写入到指定文件中
        fw.flush();
        
        //最后，调用close方法，关闭输出流，这个方法会自动调用上一步的flush方法，将缓冲区的数据写到目的文件中去
        fw.close();
	}
}
