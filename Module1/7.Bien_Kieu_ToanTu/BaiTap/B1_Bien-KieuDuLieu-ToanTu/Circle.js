function CircleS() {
    var typesData= document.getElementsByName("type").values();
    if(typesData=="r") {
        var r = parseInt(document.getElementById("data").value)
    }
    else
        {
            var r=parseInt(document.getElementById("data").value)/2
        }
    const pi=3.1416
    let S=pi*r**2
    document.getElementById("S").innerText="Diện tích là: "+S
    let C=2*r*pi
    document.getElementById("C").innerText="Chu vi là: "+C
}
