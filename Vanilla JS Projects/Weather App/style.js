let temperature = document.querySelector(".temp");
let summary = document.querySelector(".summary");
let loc = document.querySelector(".location");
let icon = document.querySelector(".icon");
let city1=document.getElementById('cityinput');
const kelvin = 273;
const apikey = 'bdd29bebb51e5ada2443f186820d80e5';
 

window.onload = () => {

    const submit = document.getElementById('add');
    const container = document.getElementsByClassName('container')[0];
    
    submit.onclick = (e) => {
        
        container.style.transform = "translateX(-50%)";
        e.preventDefault();
        
        let city=city1.value;
        
        fetch(`https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apikey}`)
        .then((response) => {
            return response.json();
          })

          .then((data) => {
            console.log(data);
            temperature.textContent = 
                Math.floor(data.main.temp - kelvin) + "°C";
            summary.textContent = data.weather[0].description;
            loc.textContent = data.name + "," + data.sys.country;
            let icon1 = data.weather[0].icon;
            icon.innerHTML = 
                `<img src="icons/${icon1}.svg" style= 'height:10rem'/>`;
          })

          .catch((errorResponse) => {
            if (errorResponse.text) { //additional error information
              errorResponse.text().then( errorMessage => {
                //errorMessage now returns the response body which includes the full error message
              })
            } else {
              //no additional error information 
            } 
          });
    
    }
}


