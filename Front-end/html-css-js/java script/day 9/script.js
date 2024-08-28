fetch('https://api.nationalize.io/?name=nathaniel')
.then(response => {
    console.log(response.statusText);
    
    if (!response.ok) {
        throw new Error("Warning..! " + response.statusText);
    }
    return response.json();
})
.then(data => {
    console.log("Full API data:", data.name);
})
.catch(error =>{
    console.error("error",error.message);
})