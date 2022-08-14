var inputval = document.querySelector('#cityinput')
var btn = document.querySelector('#add');
var city = document.querySelector('#cityoutput')
var descrip = document.querySelector('#description')
var temp = document.querySelector('#temp')
var wind = document.querySelector('#wind')

apik = "3045dd712ffe6e702e3245525ac7fa38";

function convertion(val){
    return (val - 273).toFixed(2)
}



btn.addEventListener('click', function(){  
    //This is the api link from where all the information will be collected
            fetch('https://api.openweathermap.org/data/2.5/weather?q='+inputval.value+'&appid='+apik)
            .then(res => res.json())
             //.then(data => console.log(data))
            .then(data => {
    //Now you need to collect the necessary information with the API link. Now I will collect that information and store it in different constants.
                var nameval = data['name']
                var descrip = data['weather']['0']['description']
                var tempature = data['main']['temp']
                var wndspd = data['wind']['speed']
    
    //Now with the help of innerHTML you have to make arrangements to display all the information in the webpage.
                city.innerHTML=`Weather of <span>${nameval}<span>`
                temp.innerHTML = `Temperature: <span>${ convertion(tempature)} C</span>`
                description.innerHTML = `Sky Conditions: <span>${descrip}<span>`
                wind.innerHTML = `Wind Speed: <span>${wndspd} km/h<span>`
    
            })
    //Now the condition must be added that what if you do not input anything in the input box.
            .catch(err => alert('You entered Wrong city name'));
        })