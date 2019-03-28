package com.ts.member;

import java.util.Scanner;

public class MemberInput {
	private Scanner sc;
	
	public MemberInput() {
		sc = new Scanner(System.in);
	}
	/*
	 memberLogin 
	 매개변수로  Member[]를 받아서
	 로그인 성공 시 member를 리턴
	 로그인 실패 시 member를 리턴
	 */
	public Member memberLogin(Member[]members) {
		Member member = null;
		System.out.println("ID를 입력하세요 : ");
		String id = sc.next();
		System.out.println("PW를 입력하세요 : ");
		String pw = sc.next();
		for(int i=0;i<members.length;i++) {
			if(id.equals(members[i].getId())&&pw.equals(members[i].getPw())) {
				member = members[i];
				break;
			}
		}
		return member;
	}
	/*
	 MemberJoin
	 id, pw, 나이, 이메일, 전화번호
	 member를 티런
	 */
	public Member memberJoin() {
		Member member = new Member();
		System.out.println("ID를 입력하세요 : ");
		String id = sc.next();
		member.setId(id);
		System.out.println("PW를 입력하세요 : ");
		String pw = sc.next();
		member.setPw(pw);
		System.out.println("나이를 입력하세요 : ");
		member.setAge(sc.nextInt());
		System.out.println("이메일을 입력하세요 : ");
		member.setEmail(sc.next());
		System.out.println("번호를 입력하세요 : ");
		member.setPhone(sc.next());
		return member;
	}

}
