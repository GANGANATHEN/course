const btnsub = document.getElementById("btn-sub");
const custom = document.getElementById("custom-dialog");
const btnclose = document.getElementById("btn-close");

btnsub.addEventListener("click",()=>{
    custom.style.display = 'block';
})
btnclose.addEventListener("click",()=>{
    custom.style.display = 'none';
})
