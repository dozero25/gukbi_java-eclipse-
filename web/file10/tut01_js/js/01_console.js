window.onload = () => {
            popup();
            comfi();
            register();
            deletebtn();
        }

        const btn = document.querySelector(".btn1");

        btn.onclick = () => {
            console.log("하이");
        }

        function popup(username="도제로") {
            const btn = document.querySelector(".btn2");
            btn.onclick = () => {
                alert("버튼 누름");
                alert(`${username}님 안녕하세요`);
            }
        }


        function comfi() {
            const btn = document.querySelector(".btn3");

            btn.onclick = () => {
                confirm('회원가입 하시겠습니까?');
            }
        }

        function register(){
            const btn = document.querySelector(".reg-btn");

            // confirm = 확인(true), 취소(false)
            btn.onclick = () => {
                if(confirm("회원가입을 하시겠습니까?") ){
                    location.href = "http://www.naver.com";
                } else {
                    location.href = "http://www.daum.net";
                }
                
            }
        }

        function deletebtn(){
            const btn = document.querySelector(".del-btn");
            const ph = document.querySelector(".phi");

            btn.onclick = () => {
                if(confirm("정말 삭제하시겠습니까?\n삭제하신 정보는 복구할 수 없습니다.")) {
                    // DELETE FROM member WHERE id = ?; => ajax로 가져오기
                    ph.style.color = "red";
                } else {
                    ph.style.color = "black";
                }
                
            }
        }