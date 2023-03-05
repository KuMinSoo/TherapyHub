package com.user.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVO {
	
	private int idx; // 회원번호 PK 
	private String name; // 이름
	private String userid;// 아이디
	private String pwd; //비밀번호
	private String hp1, hp2, hp3; // 전화번호
	private String post;// 우편번호
	private String addr1, addr2; //집주소
	private Date indate; // 가입일
	private int status;// 회원상태 번호(0:일반회원, 1: 정지회원, 2: 탈퇴회원 , 9: 관리자)
	private String statusStr;// 회원상태
	private String email;//이메일 
	private String gender;//성별
	private int age;//나이
	
	public String getAllHp() {
		return hp1+"-"+hp2+"-"+hp3;
	}

	public String getAllAddr() {
		return "["+post+"]"+addr1+" "+addr2;
	}
}


