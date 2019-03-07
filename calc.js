function switchOperator(option){
    document.getElementById("selectedOperator").innerHTML = option;
}

var operators = {
    '+': function(first, second) { return (+first) + (+second) },
    '-': function(first, second) { return first - second },
    '/': function(first, second) { return first / second },
    '*': function(first, second) { return first * second },
};

function calculate(){
    var firstNumber = document.getElementById("firstNumber").value;
    var secondNumber = document.getElementById("secondNumber").value;
    var operator = document.getElementById("selectedOperator").innerHTML;
    var result = operators[operator](firstNumber, secondNumber);
    document.getElementById("result").innerHTML = result;
};
