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
        console.log(response.statusText);
        
        if (!response.ok) {
            throw new Error("Warning..! " + response.statusText);
        }
        return response.json();
    })
    .then(data => {
        // console.log("Full API data:", data);
        // console.log("User ID:", data.id);
        // console.log("Username:", data.login);
        // console.log("Followers:", data.followers);
        document.getElementById("name").innerText = `Username:${data.name}` || `no data`;
        document.getElementById("id").innerText = `Id:${data.id}`
        document.getElementById("uname").innerText = `Node Id:${data.node_id}`
        document.getElementById("url").innerText = `URL:${data.url}`
        document.getElementById("fol").innerText = `Followers:${data.followers}`
        document.getElementById("location").innerText = `Location:${data.location}`
        document.getElementById("bio").innerText = `Bio:${data.bio}`
        document.getElementById('p-img').src = data.avatar_url || "data not available"
        // document.getElementById('link').href = data.followers_url

        const followurl =  document.getElementById("url")
        if(data.followers_url){
            followurl.href = data.followers_url
            followurl.innerText = "Click here"
        }else{
            followurl.textContent = "Not Available"
        }
    })
    .catch(error => {
        console.error("Error:", error.message);
    });

