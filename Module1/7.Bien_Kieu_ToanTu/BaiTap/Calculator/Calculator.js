
function Addition() {
    var number1= parseInt(document.getElementById("number1").value);
    var number2= parseInt(document.getElementById("number2").value);
    var result=number1+number2
    document.getElementById("result").innerHTML="Result Division: "+result

}
function Subtraction() {
    var number1= parseInt(document.getElementById("number1").value);
    var number2= parseInt(document.getElementById("number2").value);
    var result=number1-number2
    document.getElementById("result").innerHTML="Result Division: "+result
}
function Multiplication() {
    var number1= parseInt(document.getElementById("number1").value);
    var number2= parseInt(document.getElementById("number2").value);
    var result=number1*number2
    document.getElementById("result").innerHTML="Result Division: "+result
}
function Division() {
    var number1= parseInt(document.getElementById("number1").value);
    var number2= parseInt(document.getElementById("number2").value);
    if(number2===0)
    {document.getElementById("result").innerHTML="Phép tính không hợp lệ"}
    else {
        var result = number1 / number2
        document.getElementById("result").innerHTML = "Result Division: " + result
    }
}