package com.kita.first.level3;

public class BoardVO {
	private String title; 
	//String title : default의 경우 같은 패키지 안에서 접근 가능
	private String content;
	private int writeId;
	
	public BoardVO() {}
	
	public BoardVO(String title, String content, int writeID) {
		super();
		this.title = title;
		this.content = content;
		this.writeId = writeId; 
	}
	
	//setter는 무조건 void형, set+변수명+타입+변수명
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) { //title에 값을 넣음
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {//content에 값을 넣음
		this.title = title;
		this.content = content;		
	}
	public int getWriteId() {
		return writeId;
	}
	
	public void setWriteID(int WriteID) { //WriteID 에 값을 넣음
		this.writeId = writeId;
		
		
		
	}

}
