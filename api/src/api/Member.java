package api;

public class Member {
	private String id;

	public Member(String id) {
		super();
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj; // 인스턴스 가능 확인 후 멤버로 강제 형 변환
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "id = "+id;
	}
}
