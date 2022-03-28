package emp.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 접근하고자 하는 테이블의 필드와 동일하게 생성
// 지금은 exam_emp

//@AllArgsConstructor
//@NoArgsConstructor
//@Setter
//@Getter
//@ToString

@NoArgsConstructor // 디폴트 생성자 추가해주는-생성자 없어서 만든것
@AllArgsConstructor // 이거 들어오면 디폴트 생성자 없어짐. 디폴트 생성자는 기본으로 생성자 없을때 만들어지는건데 이건 생성자 명시해주는거라
@Data // 이건 getter, setter, toString, Equals, hashCode 다 모아서 불러옴 ArgsConstructor들 빼고
public class EmpDTO {
	
	
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
}
