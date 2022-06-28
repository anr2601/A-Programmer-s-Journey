let screen = document.getElementById('screen');
let buttons = document.querySelectorAll('button');
let calculated = false;

let x=(e) => {

    let buttontext = e.target.innerText;
    console.log('Button text is ', buttontext);

    if (calculated) {
        screen.value = '';
        calculated = false;
    }

    if (buttontext == '=') {
        if (screen.value !== "") {

            //calculate and show the answer to display
            screen.value = eval(screen.value);

            calculated = true;
        }
    }

    else if (buttontext == 'X') {
        buttontext = '*';
        screen.value += buttontext;
    }


    else if (buttontext == "C") {
        screen.value = '';
    }


    else if (buttontext == '1') {
        screen.value += buttontext;
    }
    else if (buttontext == '2') {
        screen.value += buttontext;
    }
    else if (buttontext == '3') {
        screen.value += buttontext;
    }
    else if (buttontext == "4") {
        screen.value += buttontext;
    }
    else if (buttontext == "5") {
        screen.value += buttontext;
    }
    else if (buttontext == "6") {
        screen.value += buttontext;
    } else if (buttontext == "7") {
        screen.value += buttontext;
    } else if (buttontext == '8') {
        screen.value += buttontext;
    } else if (buttontext == '9') {
        screen.value += buttontext;
    }
    else if (buttontext == '0') {
        screen.value += buttontext;
    }
    else if (buttontext == '+') {
        screen.value += buttontext;
    }
    else if (buttontext == '-') {
        screen.value += buttontext;
    }
    else if (buttontext == '%') {
        screen.value += buttontext;
    }
    else if (buttontext == '/') {
        screen.value += buttontext;
    }

}

for (item of buttons) {
    item.addEventListener('click', x);
}

addEventListener('keydown',(e)=>{
    if (e.key >= 48 && e.key <= 57 || e.key>=42 && e.key<=43 || e.key==45 || e.key==47 || e.key ==61) {
        e.target.innerText = e.key;
        x(e);
    }
});