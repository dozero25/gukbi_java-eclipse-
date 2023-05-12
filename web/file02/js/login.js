function login() {
    let id = document.querySelector("#id");
    let pw = document.querySelector("#pw");
    // class => (".id"), id => ("#id")

    if(id.value =="") {
        alert("아이디를 넣어주세요");
        document.frm.id.focus();
        return false;
    } 

    if(pw.value =="") {
        alert("비밀번호를 넣어주세요");
        document.frm.pw.focus();
        return false;
    }

    if(id.value == "dozero" && pw.value == "1234") {
        alert("로그인 성공");
        location.href = "https://www.naver.com";
    } 

}