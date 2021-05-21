function average() {
    var chemistry=parseInt(document.getElementById("chemistry").value);
    var physical=parseInt(document.getElementById("physical").value);
    var biological=parseInt(document.getElementById("biological").value);
    var average=((chemistry+physical+biological)/3);
    document.getElementById("result").value=average
}

