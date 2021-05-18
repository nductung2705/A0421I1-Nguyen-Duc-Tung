function convertTemperature() {
    var inputAmount=parseInt(document.getElementById("input").value);
    var inputUnit=document.getElementById("inputUnit").value;
    var outputUnit=document.getElementById("outputUnit").value;
    var convertTemp;
    if(inputUnit=="C")
    {
        if(outputUnit=="C")
            convertTemp=inputAmount
        else  convertTemp=(inputAmount/5*9)+32
    }
    else
    {
        if(outputUnit=="F")
            convertTemp=inputAmount
        else convertTemp=(inputAmount-32)/9*5

    }
    document.getElementById("Temp").innerHTML="Result: " +convertTemp
}