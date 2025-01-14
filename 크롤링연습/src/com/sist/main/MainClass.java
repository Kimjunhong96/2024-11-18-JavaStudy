package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String html= "<html> " // HTML 문서시작
					+"<body>"
					+"<div>"
					+"<div>Java</div>"
					+"<div>Oracle</div>"
					+"<div>HTML/CSS</div>"
					+"</div>"
					+"<div>"
					+"<div>JavaScript</div>"
					+"<div>Jsp</div>"
					+"<div>Spring</div>"
					+"</div>"
					+"<img src=http://www.daum.net>"
					+"</body>"
					+"</html>";
		try {
			// Element => text() , attr() : 속성값
			// html() => HTML 태그 , data() : JavaScript읽기
			// Elements => get() => 태그를 1개씩 읽기 
			// -------- 태그 갯수 확인 => size() 
			Document doc=Jsoup.parse(html);
			//System.out.println(doc);
			Element div=doc.selectFirst("div");
			//System.out.println(div);
			//Element div1=div.get(0);
			
			
		}catch(Exception ex) {}
	}

}
