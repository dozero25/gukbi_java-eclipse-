// function login() {
//     let id = document.querySelector("#id");
//     let pw = document.querySelector("#pw");
//     // class => (".id"), id => ("#id")

//     if(id.value =="") {
//         alert("아이디를 넣어주세요");
//         document.frm.id.focus();
//         return false;
//     } 

//     if(pw.value =="") {
//         alert("비밀번호를 넣어주세요");
//         document.frm.pw.focus();
//         return false;
//     }

//     if(id.value == "dozero" && pw.value == "1234") {
//         alert("로그인 성공");
//         location.href = "https://www.naver.com";
//     } 

// }

window.onload = () => {
    clickEvent.getInstance().onclickEvent();
    clickEvent.getInstance().onclickNaverButton();
}

class clickEvent{
    static #instance = null;
    static getInstance() {
        if(this.#instance == null) {
            this.#instance = new clickEvent();
        }
        return this.#instance;
    }

    onclickEvent() {
        let id = document.querySelector("#id");
        let pw = document.querySelector("#pw");

        const button = document.querySelector(".login-button");

        button.onclick = () => {
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
        };
    }

    onclickNaverButton() {
        const naverButton = document.querySelector(".naver-button");

        naverButton.onclick = () => {
           location.href = "https://nid.naver.com/nidlogin.login?mode=form&url=https%3A%2F%2Fwww.naver.com";
        }
    };
}

