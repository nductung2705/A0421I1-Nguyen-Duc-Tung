function CallByAlert() {
    alert("Well come");
}
function CallByConsoleLog() {
    console.log("AloALo");

}
function displaydocumentwirte() {
    document.write("ClearAll");
}
function getelement() {
    document.getElementById('Display').innerText='HelloJS'
}
function testDocumentWrite() {
    document.write("<button onclick='testDocumentWrite()'>Click me</button>");
    document.write("<b>This is text</b>");
    console.log("write log");
}
function Confirm() {
    var flag= confirm('Bạn có yêu tui hông?');
    if(flag){
        document.getElementById("Display").innerText="Dị yêu đơn phương đi"
    }
    else document.getElementById("Display").innerText="V làm ny tui nha"
}
function Import() {
    var Name= prompt("Nhap tên");
    var Age= parseInt(prompt("Nhập tuổi của bạn: "));
    var Questions=confirm("Hello "+ Name + " bạn "+Age + " tuổi phải không");
    if (Questions){
        if (Age<=18)
            document.getElementById("Display2").innerHTML="<b>Thanh Xuân Còn Dài</b>";
        else if(Age>18)
            document.getElementById("Display2").innerHTML="<b>Người Già Leo Đơn</b>";
    } else document.getElementById("Display2").innerHTML="<b>Fake thông tin</b>";

}

