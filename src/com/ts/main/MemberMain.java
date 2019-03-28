package com.ts.main;

import com.ts.member.Member;
import com.ts.member.MemberController;
import com.ts.member.MemberInput;
import com.ts.view.MemberView;

public class MemberMain {
	public static void main(String[] args) {
		MemberController mc = new MemberController();
		mc.start();
	}
}

