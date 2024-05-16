package service.impl;

import java.util.List;

import dao.impl.MemberDaoImpl;
import service.MemberService;
import vo.Member;

public class MemberServiceImpl implements MemberService{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	MemberDaoImpl mdi=new MemberDaoImpl();

	@Override
	public void addMember(Member m) {
		mdi.add(m);
		
	}

	@Override
	public String showAll() {
		String show=" ";
		List<Member> l=mdi.selectAll();
		for(Member m:l)
		{
			show=show+"<tr><td>"+m.getId()+
					"<td>"+m.getName()+
					"<td>"+m.getUsername()+
					"<td>"+m.getPassword();
		}
		return show;
	}

}
