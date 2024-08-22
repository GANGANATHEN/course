// const date = new Date();
// const Time = date.getFullYear();
// const Month = date.getMonth()+1
// const Year = date.getFullYear()
// const Day = date.getDay()

// const date = new Date().getDate();
// console.log(date);
// console.log(Day);

// document.getElementById("ds").innerText = `Today Date ${Day}/${Month}/${Year}`





//   var g= fetch("https://api.github.com/users/arun-cloud-dev")
//   console.log(g);
  


//   .then(response =>{
//     throw new Error("Warning..!");  
//   }return response.json())
// fetch('https://api.github.com/users/arun-cloud-dev')
// .then(response =>{
//     if(!response.ok){
//         throw new Error("Warning..!"+response);
//     }
//     return response.json()
// })

// .then(data =>{
//     console.log("The user is",data.login);
// })

// .catch(error =>{
//     console.error("Error...!")
// })
fetch('https://api.github.com/users/arun-cloud-dev')
    .then(response => {
        if (!response.ok) {
            throw new Error("Warning..! " + response.statusText);
        }
        return response.json();
    })
    .then(data => {
        console.log("Full API data:", data);
        console.log("User ID:", data.id);
        console.log("Username:", data.login);
        console.log("Followers:", data.followers);
        document.getElementById("name").innerText = `Username:${data.name}`
        document.getElementById("id").innerText = `Username:${data.id}`
        document.getElementById("uname").innerText = `Username:${data.username}`
        document.getElementById("url").innerText = `Username:${data.url}`
        document.getElementById("fol").innerText = `Username:${data.followers}`
        document.getElementById("location").innerText = `Username:${data.location}`
        document.getElementById("bio").innerText = `Username:${data.bio}`
    })
    .catch(error => {
        console.error("Error:", error.message);
    });

