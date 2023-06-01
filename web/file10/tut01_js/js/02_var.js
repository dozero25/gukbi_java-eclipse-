for(let i = 0; i < 10; i++) {
    console.log(i+1);
    document.write(i+1);
    document.write("<br>");
}

let str1 = "korea";
console.log(str1);

str1 = "Seoul";
console.log(str1);

const str2 = "korea";
console.log(str2);
// str2 = "Seoul";
console.log(str2);

function sum(num1, num2){
    return num1 + num2;
}

console.log(sum(100, 200));

let result = sum(200, 300);
console.log(result);

// let result2 = function add(num1, num2){
//     return num1 + num2;
// }

// 화살표 함수는 익명 함수로 사용
let add = (num1, num2) => {
    return num1 + num2;
}

let result3 = add(1000, 1000);
console.log(result3);