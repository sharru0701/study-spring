package com.oracle.oBootJpa01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.oBootJpa01.domain.Member;
import com.oracle.oBootJpa01.repository.MemberRepository;

@Service
@Transactional //service 에서 return하는 순간 transaction 단위 끝(commit)
public class MemberService {
	private final MemberRepository memberRepository;
	@Autowired
	public MemberService(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}
	
	// 회원가입
	public Long memberSave(Member member) {
		System.out.println("MemberService memberSave member -> " + member);
		memberRepository.memberSave(member);
		System.out.println("MemberService memberSave After...");
		return member.getId();
	}

	public List<Member> getListAllMember() {
		List<Member> listMember = memberRepository.findAllMember();
		System.out.println("MemberService getListAllMember listMember.size() -> " + listMember.size());
		return listMember;
	}
}
