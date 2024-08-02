window.onload = function() {
    const name = prompt('Enter Student Name:');
    if (name) {
      document.getElementById('nameDisplay').innerText = `${name}'s Grade points`;
    }
};


document.getElementById('gradeForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const m1 = parseFloat(document.getElementById("tVal").value);
    const m2 = parseFloat(document.getElementById("eVal").value);
    const m3 = parseFloat(document.getElementById("mVal").value);
    const m4 = parseFloat(document.getElementById("sVal").value);
    const m5 = parseFloat(document.getElementById("ssVal").value);

    const totalMark =(m1+m2+m3+m4+m5)/5;

    let grade;
    if(totalMark<=50){
        grade = "Fail";
    }else if(totalMark<=60){
        grade = "E";
    }else if(totalMark<=70){
        grade = "D";
    }else if(totalMark<=80){
        grade = "C";
    }else if(totalMark<=90){
        grade = "B";
    }else if(totalMark<=100){
        grade = "A";
    }else{
        grade = "Pleace Enter Mark Correctly... foooooollll..."
    }

    document.getElementById('result').innerText = `Average Score: ${totalMark.toFixed(2)}\nGrade: ${grade}`;
  });
  


