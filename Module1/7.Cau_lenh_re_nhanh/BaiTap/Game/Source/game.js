var slider1 =[
"file:///D:/A0421I1_NguyenDucTung/Module1/7.Cau_lenh_re_nhanh/BaiTap/Game/img/curry1.png",
"file:///D:/A0421I1_NguyenDucTung/Module1/7.Cau_lenh_re_nhanh/BaiTap/Game/img/james1.png",
"file:///D:/A0421I1_NguyenDucTung/Module1/7.Cau_lenh_re_nhanh/BaiTap/Game/img/LB1.png",
];

var slider2 =[
"file:///D:/A0421I1_NguyenDucTung/Module1/7.Cau_lenh_re_nhanh/BaiTap/Game/img/curry2.png",
"file:///D:/A0421I1_NguyenDucTung/Module1/7.Cau_lenh_re_nhanh/BaiTap/Game/img/james2.png",
"file:///D:/A0421I1_NguyenDucTung/Module1/7.Cau_lenh_re_nhanh/BaiTap/Game/img/LB2.png",
];

var slider3 =[
"file:///D:/A0421I1_NguyenDucTung/Module1/7.Cau_lenh_re_nhanh/BaiTap/Game/img/curry3.png",
"file:///D:/A0421I1_NguyenDucTung/Module1/7.Cau_lenh_re_nhanh/BaiTap/Game/img/james3.png",
"file:///D:/A0421I1_NguyenDucTung/Module1/7.Cau_lenh_re_nhanh/BaiTap/Game/img/LB3.png",
];

var slider4 =[
"file:///D:/A0421I1_NguyenDucTung/Module1/7.Cau_lenh_re_nhanh/BaiTap/Game/img/curry4.png",
"file:///D:/A0421I1_NguyenDucTung/Module1/7.Cau_lenh_re_nhanh/BaiTap/Game/img/james4.png",
"file:///D:/A0421I1_NguyenDucTung/Module1/7.Cau_lenh_re_nhanh/BaiTap/Game/img/LB4.png",
];
var num=0;
function move1(){
    var p1= document.getElementById("p1");
    num++;
    if(num>=slider1.length){
        num=0;
    }
    p1.src=slider1[num]
}
function move2(){
    var p2= document.getElementById("p2");
    num++;
    if(num>=slider2.length){
        num=0;
    }
    p2.src=slider2[num]
}
function move3(){
    var p3= document.getElementById("p3");
    num++;
    if(num>=slider3.length){
        num=0;
    }
    p3.src=slider3[num]
}
function move4(){
    var p4= document.getElementById("p4");
    num++;
    if(num>=slider4.length){
        num=0;
    }
    p4.src=slider4[num]
}
function checkPicture(){
    if(p1.src==slider1[0]&&p2.src==slider2[0]&&p3.src==slider3[0]&&p4.src==slider4[0]){
    alert("That's Right")
    }
     if(p1.src==slider1[1]&&p2.src==slider2[1]&&p3.src==slider3[1]&&p4.src==slider4[1]){
    alert("That's Right")
    }
     if(p1.src==slider1[2]&&p2.src==slider2[2]&&p3.src==slider3[2]&&p4.src==slider4[2]){
    alert("That's Right")
    }
}