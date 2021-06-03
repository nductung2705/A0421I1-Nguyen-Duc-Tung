function input(temp){
   document.getElementById("result").value+=temp
}

function calculate(){
    document.getElementById("result").value =eval(document.getElementById("result").value)
}
function clear(){
    document.getElementById("result").value=''
}