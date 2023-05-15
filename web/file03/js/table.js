let s_wrod =  document.querySelector(".search");
        let s_btn = document.querySelector(".search-button");

        function searchClick(e){
            e.preventDefault();
            if(s_wrod.value == "") {
                alert("검색어를 입력하세요");
                s_wrod.focus();
                return;
            }
        }

        s_btn.addEventListener("click", searchClick);