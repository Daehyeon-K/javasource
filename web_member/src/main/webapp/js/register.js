/**
 *  register.html의 form 유효성 검정
 *  jquery validation plug-in 사용
 */
$(function(){
    $("#joinform").validate({
        // rules 정하기 - 유효성 검증 규칙 지정
        // form 요소 이름 사용
        rules:{
            userid:{
                required:true,
                validId:true
            },
            password:{
                required:true,
                validPwd:true
            },
            confirm_password:{
                required:true,
                equalTo: "#password",    // 현재 요소가 어떤 요소와 값이 같아야 하는가? (여기선 아이디 사용)
                validPwd:true
            },
            name:{
                required:true
            },
            gender:{
                required:true
            },
            email:{
                required:true,
                email:true
            }
        }, // rules 종료

        // 규칙이 맞지 않을 경우 보여줄 메세지 작성
        messages:{
            userid:{
                required:"아이디는 필수 입력 요소입니다.",

            },
            password:{
                required:"비밀번호는 필수 입력 요소입니다."

            },
            confirm_password:{
                required:"비밀번호는 필수 입력 요소입니다.",
                equalTo: "비밀번호가 일치하지 않습니다."
            },
            name:{
                required:"이름은 필수 입력 요소입니다."
            },
            gender:{
                required:"성별은 필수 입력 요소입니다."
            },
            email:{
                required:"이메일은 필수 입력 요소입니다.",
                email:"이메일 형식을 확인해 주세요."
            }
        },
        
        errorPlacement:function(error, element){
			$(element).closest("form").find("small[id='"+element.attr('id')+"']").append(error);
		}
        
    });
});

$.validator.addMethod("validId",function(data){
    const regId = /^(?=.*[A-Za-z])(?=.*[0-9])[A-Za-z0-9]{6,12}$/;
    return regId.test(data);
},"아이디는 영문자, 숫자를 포함해 6~12자리로 만들어야 합니다.");

$.validator.addMethod("validPwd",function(data){
    const regPwd = /^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[!@#$%^&*])[A-Za-z0-9!@#$%^&*]{8,15}$/;
    return regPwd.test(data);
},"비밀번호는 영문자, 숫자, 특수문자를 포함해 8~15자리로 만들어야 합니다.");

