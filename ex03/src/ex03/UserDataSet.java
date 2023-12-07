package ex03;
import java.util.ArrayList;
public class UserDataSet {
	
	public static int rowNum;
	
	//로그인
	public boolean login(String id,String pw) {
		boolean isCheck=false;
		for(int i=0;i<User.getArrList().size();i++) {
			if(User.getArrList().get(i).indexOf(id)!=-1) {
			User.setPw(User.getArrList().get(i).get(1));
				if(pw.equals(decrypt())) {
					isCheck=true;
					rowNum=i;
				}
			}
		}
		return isCheck;
	}
	public boolean join() {
		ArrayList<String>arUser=new ArrayList<>();
		int idCheckDup=0;
		boolean isCheck=false;
		
		arUser.add(User.getId());
		arUser.add(encrypt());
		
		//중복체크
		
		for(int i=0; i<User.getArrList().size();i++) {
			if(User.getArrList().get(i).indexOf(arUser.get(0))!=-1) {
				idCheckDup++;
			}
		}
		if(idCheckDup==0) {
			User.getArrList().add(arUser);
			isCheck=true;
		}
		System.out.println(User.getArrList());
		return isCheck;
		
	}
	public String encrypt() {
		String enPw="";
		for(int i=0;i<User.getPw().length();i++) {
			enPw+=""+(char)(User.getPw().charAt(i)<<1);
		}
		return enPw;
	}
	//복구화
	public String decrypt() {
		String dePw="";
		for(int i=0;i<User.getPw().length();i++) {
			dePw+=""+(char)(User.getPw().charAt(i)>>1);
		}
		return dePw;
	}

}
