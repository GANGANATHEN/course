// const inputText = document.getElementById("ine").value
// function validate(){
//     let maformat = /^[a-zA-Z0-9._%+-]+@gmail\.com$/

//     if(inputText == maformat){
//         alert ("Valid email address")
//     }
//     else(
//         alert ("Not Valid email address")
//     )

// }

// const d = new Date();
// const month =d.getMonth()+1;
// const year =d.getFullYear();


// const a = d.setMonth(12);
// const y = d.setDate(2);
// const all = new Date();
// const d = getDate();
// document.getElementById("date").innerText = d
// console.log(month);
// console.log(year);

// const date = new Date();
// document.getElementById("dat").innerText = date

const date = new Date();
let day = date.getDate();
let month = date.getMonth()+1;
let year = date.getFullYear();


// console.log(date)
// console.log(day)
// console.log(month)
// console.log(year)

document.getElementById("dat").innerText = `${day}day/${month}/month${year}/year`

var start = Date.now()
console.log(start);