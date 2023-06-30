$(function() {
            $.ajax({
                type: "post",
                url: "/main/getDept",
                dataType: "json",
                success: function(res) {
                    let output = "<option>부서 선택</option>"
                    res.forEach((r) => {
                        output += `
                            <option value=${r.korDeptCode}>${r.korDeptName}</option>
                        `;
                    });

<!--                    document.querySelector("#selDept").innerHTML = output;-->
                        $("#selDept").html(output); // jquery 방식
                },
                error: function(err){
                    console.log(err);
                }
            });
        });

        function getPos(){
            let selDept = document.querySelector("#selDept"); // select
            let selDeptValue = selDept.options[selDept.selectedIndex].value;

            $.ajax({
            type : "post",
            url : "/main/getPos",
            dataType : "json",
            data: {selDeptValue},
            success : function(res) {
                let output = "<option value=0>직책 선택</option>";
                res.forEach( (r) => {
                    output += `
                        <option value=${r.korPosCode}>${r.korPosName}</option>
                    `
                });
                console.log(output);

                $("#selPos").html(output);
            },
            error: function(error) {
                console.log(error);
            }
            });
        }

        let korEmpEmail = document.querySelector(".korEmpEmail");
        let korEmpPasswd = document.querySelector(".korEmpPasswd");

        function chkEmail() {
            if( !korEmpEmail.value ){
                $(".alert > p").html("이메일을 입력해 주세요.");
                $(".alert > p").css("padding", "20px 0");
                korEmpEmail.focus();
                return false;
            }
            else {
                console.log(korEmpPasswd.value);

                $.ajax({
                    type : "post",
                    url: "/main/emailCheck",
                    dataType : "json",
                    data: {email: korEmpEmail.value},
                    success: response =>{
                        if (response > 0) {
                            $(".alert > p").html("사용할 수 없는 이메일입니다.");
                            korEmpEmail.value= "";
                            korEmpEmail.focus();
                        } else {
                            $(".alert > p").html("사용할 수 있는 이메일입니다.");
                            $(".alert > p").css("padding", "20px 0");
                        }
                    },
                    error: function(error){
                        console.log(error);
                    }
                });
            }
        }

        korEmpPasswd.addEventListener('focus', chkEmail);

        function frmCheck(){
            let korEmpPasswd = document.querySelector(".korEmpPasswd");
            let korEmpPasswdOk = document.querySelector(".korEmpPasswdOk");
            let korEmpName = document.querySelector(".korEmpName");

            if(!korEmpPasswd.value) {
                alert("비밀번호를 입력해 주세요");
                korEmpPasswd.focus();
                return false;
            }
            if(!korEmpPasswdOk.value) {
                alert("비밀번호를 입력해 주세요");
                korEmpPasswdOk.focus();
                return false;
            }

            if (korEmpPasswd.value != korEmpPasswdOk.value){
                alert("비밀번호가 일치하지 않습니다.\n비밀번호를 다시 입력하세요");
                korEmpPasswd.value = "";
                korEmpPasswdOk.value = "";

                korEmpPasswd.focus();
                return false;
            }

            if(!korEmpName.value) {
                alert("이름을 입력해 주세요");
                korEmpName.focus();
                return false;
            }

            let selDept = document.querySelector("#selDept");
            let selDeptValue = selDept.options[selDept.selectedIndex].value;
            if(selDeptValue == 0) {
                alert("부서를 선택하세요");
                selPos.focus();
                return false;
            }

            let obj = {
                korEmpEmail : $(".korEmpEmail").val(),
                korEmpPasswd : $(".korEmpPasswd").val(),
                korEmpName : $(".korEmpName").val(),
                korEmpGender : $("input[type='radio']:checked").val(),
                korEmpDept : $(".korEmpDept").val(),
                korEmpPos : $(".korEmpPos").val()

            };

            console.log(obj);

            $.ajax({
                type: "post",
                url: "/main/register",
                dataType: "json",
                data: obj,
                success : response => {
                    if(response.msg == "success") {
                        alert("사원 정보가 등록되었습니다. \n관리자 접속 승인 후 이용 가능합니다.")
                        location.href = "/home"
                    }
                },
                error: error => {
                console.log(error);
                }
            });

        }

        document.querySelector("#reg").addEventListener('click', frmCheck);