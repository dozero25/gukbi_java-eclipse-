function chkSearch() {
    let input = document.frm;

    if(!input.box.value) {
        alert("검색어를 입력해주세요");
        document.frm.search.focus();
    }
}