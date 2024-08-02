let count = 0;

let incre = document.getElementById("btnInc")
let decre = document.getElementById("btnDec")
let para = document.getElementById("para")
let save = document.getElementById("old")


function Increment(){
    count += 1
    para.innerText = count
}
function Decrement(){
    count -= 1
    para.innerText = count
}

function save1(){
    let countstr = count + "";
    console.log(countstr);
    save.innerText = countstr;
}
// console.log(incre);








document.getElementById("")