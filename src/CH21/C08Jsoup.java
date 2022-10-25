package CH21;

import java.io.*;
import java.net.URL;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class C08Jsoup {
   //Jsoup이란 자바라이브러리 DOM,CSS 및 J쿼리와 같은 방법을 사용하여 데이터를 추출
   public static void main(String[] args) throws Exception 
   {
      // URL과 연결된 Jsoup.connection
      Connection conn = Jsoup.connect("https://www.musinsa.com/app/");      
      
      //DOM 객체를 꺼내와 저장
      Document document = conn.get();
      //System.out.println(document);
      
      
      //DOM 객체 안에서 img 태그요소만 추출하는법
      Elements elements = document.getElementsByTag("img");
      System.out.println(elements);
      
      for(int i = 0; i < elements.size(); i++)
      { 	  
    	  if(elements.get(i).toString().contains("https"))
    	  {
         //" "을 기준으로 요소 안의 내용을 문자열로 바꾼뒤 잘라내기
    	  String str[] = elements.get(i).toString().split(" ");
    	  int start = str[1].indexOf("\"");
    	  int end = str[1].lastIndexOf("\"");
    	  String imgUrl=str[1].substring(start+1,end);
    	  System.out.println(imgUrl);
    	  
    	  //URL연결
    	  URL url = new URL(imgUrl);
    	  InputStream in = url.openStream();
    	  BufferedInputStream bin = new BufferedInputStream(in);
    	  String filename="ImageFile";
    	  OutputStream out = new FileOutputStream("C:\\iotest\\"+filename+i+".png");
    	  int data=0;
    	  while(true) {
    		  data = bin.read();
    		  if(data==-1) {
    			  break;
    		  }
    		  out.write(data);
    		  out.flush();
    	  	}
    	  
    	  }
    	  
      }

   }

}