function frmCheck(){
    let korEmpEmail = $(".korEmpEmail");
    let korEmpPasswd = $(".korEmpPasswd");

    if (!korEmpEmail.val()) {
        alert("이메일을 입력해 주세요");
        korEmpEmail.focus();
        return false;
    }

    if (!korEmpPasswd.val()) {
            alert("비밀번호를 입력해 주세요");
            korEmpPasswd.focus();
            return false;
        }
}