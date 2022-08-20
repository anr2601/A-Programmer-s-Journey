window.onload = () => {

    const submit = document.getElementById('add');
    const container = document.getElementsByClassName('container')[0];
    
    submit.onclick = (e) => {
        
        container.style.transform = "translateX(-50%)";
    
    }
}

