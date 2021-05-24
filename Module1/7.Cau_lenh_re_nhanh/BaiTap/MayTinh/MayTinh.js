function Input(temp){
   document.getElementById("result").value+=temp
}

function Tinh(){
    document.getElementById("result").value =eval(document.getElementById("result").value)
}
function Clear(){
    document.getElementById("result").value=''
}