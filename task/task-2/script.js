// scores ...
const score1 = document.getElementById("ds-1");
const score2 = document.getElementById("ds-2");

//team btns
const tbtn1 = document.getElementById("Tbtn-1");
const tbtn2 = document.getElementById("Tbtn-2");

// bat or bowl
const dp1 = document.getElementById("dp-1");
const dp2 = document.getElementById("dp-2");

// buttons ...

const but1 = document.getElementById("btn-1");
const but2 = document.getElementById("btn-2");
const but3 = document.getElementById("btn-3");
const but4 = document.getElementById("btn-4");
const but5 = document.getElementById("btn-5");
const but6 = document.getElementById("btn-6");

let count1 = 0;
let count2 = 0;
let t1ballcount = 0;
let t2ballcount = 0;

// Team-1 buttons

function butt1(){
    count1 +=1;
    t1ballcount +=1;
    score1.innerText = "Score = " + count1;
    document.getElementById('show').innerText ="ballcount = "+ t1ballcount;
}
function butt2(){
    count1 +=4;
    score1.innerText = "Score = " + count1;
    t1ballcount +=1;
    document.getElementById('show').innerText ="ballcount = "+ t1ballcount;
}
function butt3(){
    count1 +=6;
    score1.innerText = "Score = " + count1;
    t1ballcount +=1;
    document.getElementById('show').innerText ="ballcount = "+ t1ballcount;
}

// Team-2 buttons

function butt4(){
    count2 +=1;
    t2ballcount +=1;
    score2.innerText = "Score = " + count2;
    document.getElementById('show1').innerText ="ballcount = "+ t2ballcount;
}
function butt5(){
    count2 +=4;
    t2ballcount +=1;
    score2.innerText = "Score = " + count2;
    document.getElementById('show1').innerText ="ballcount = "+ t2ballcount;
}
function butt6(){
    count2 +=6;
    t2ballcount +=1;
    score2.innerText = "Score = " + count2;
    document.getElementById('show1').innerText ="ballcount = "+ t2ballcount;
}

// toss 

function toss() {
    // Randomly decide if Team 1 or Team 2 wins the toss
    const isTeam1Win = Math.random() < 0.5;

    if (isTeam1Win) {
        document.getElementById('dp-1').textContent = "Team 1 wins the toss.";
        tbtn1.style.display = 'block';
        dp2.innerText = "Bowl";
        document.getElementById('tos').style.display = 'none';
    } else {
        document.getElementById('dp-2').textContent = "Team 2 wins the toss.";
        tbtn2.style.display = 'block';
        dp1.innerText = "Bowl";
        document.getElementById('tos').style.display = 'none';
    }
}
