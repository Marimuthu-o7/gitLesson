function isEven(num) {
    return num % 2 === 0;
}

function isOdd(num) {
    return num % 2 !== 0;
}

for(let i = 0; i <= 10; i++) {
    if(isEven(i)) {
        console.log(i);
    }
}

