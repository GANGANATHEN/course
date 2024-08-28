

// function a(x){
//     if(x<1){
//         return "less 1"
//     }else if(x<2){
//         return "2"
//     }else{
//         return "nothig..."
//     }
// }
// console.log(a(8));

// function ab(val){
//     const al =5.22;
//     if(al<1){
//         return "less 1"
//     }else if(al<2){
//         return "2"
//     }else{
//         return "nothig..."
//     }
// }

// switch 

function caseInswitch(a){
    let ans = '';
    switch (a){
        case 0:
            console.log("hello")
            break;
            
        case 1:
            console.log("hello - 1")
            break;
        case 2:
            console.log("hello - 2")
            break;
        default:
            console.log("hi");
    }
    return ans
}

// console.log(caseInswitch(2));


// for loop

// for(let i = 1; i<=5; i++){
//     a = i;
//     console.log(i);  
// }

// let i =0;
// while(i < 5){
//     console.log(i);
//     i++;
// }

// do {
//     text += "The number is " + i;
//     i++;
//   }
//   while (i < 10);

let i =0;

do{
    console.log(i);
    i++;
}
while(i<10)