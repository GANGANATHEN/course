// document.getElementById("btn-c").addEventListener("click",()=>{
//     const litag = document.getElementById("style-c");
//     litag.href = './style1.css'
// })
const butn = document.getElementById("btn-c");
const litag = document.getElementById("style-c");

let count = 0;
function btnfun(){
   if(count== 1){
    litag.href = './style.css'
   }else if(count == 2){
    litag.href = './style1.css'
   }
   else{
    litag.href = './style2.css'
    count =0
   }
   count += 1;
}
