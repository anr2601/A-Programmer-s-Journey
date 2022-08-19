var inputval = document.querySelector('#cityinput')
var btn = document.querySelector('#add');

apik = "3045dd712ffe6e702e3245525ac7fa38";

function convertion(val){
    return (val - 273).toFixed(2)
}



btn.addEventListener('click', function(){  
    const options = {
        method: 'GET',
        headers: {
            'X-RapidAPI-Key': 'SIGN-UP-FOR-KEY',
            'X-RapidAPI-Host': 'weatherbit-v1-mashape.p.rapidapi.com'
        }
    };
    
    fetch('https://weatherbit-v1-mashape.p.rapidapi.com/forecast/minutely?lat=35.5&lon=-78.5', options)
        .then(response => response.json())
        .then(response => console.log(response))
        .catch(err => console.error(err));
        })