create database furuma_resort;
-- Tao bang vi tri
create table vi_tri(
id_vi_tri int auto_increment primary key,
ten_vi_tri varchar(100) not null
);


-- Tao bang trinh do
create table trinh_do(
id_trinh_do int auto_increment primary key,
ten_trinh_do varchar(100) not null
);

-- Tao bang bo phan
create table bo_phan(
id_bo_phan int auto_increment primary key,
ten_bo_phan varchar(100) not null
);

-- Tao bang nhan vien
create table nhan_vien(
id_nhan_vien int auto_increment primary key,
ten_nhan_vien varchar(100) not null,
id_vi_tri int not null,
id_trinh_do int,
id_bo_phan int,
ngay_sinh date,
cmnd varchar(20),
luong float,
sdt varchar(20),
email varchar(100),
dia_chi varchar(100),
foreign key(id_bo_phan) references bo_phan(id_bo_phan),
foreign key(id_trinh_do) references trinh_do(id_trinh_do),
foreign key(id_vi_tri) references vi_tri(id_vi_tri)
);
-- Tao bang loai Khach
create table loai_khach(
id_loai_khach int auto_increment primary key,
ten_loai_khach varchar(100) not null
);

-- Tao bang khach hang
create table khach_hang(
id_khach_hang int auto_increment primary key,
id_loai_khach int,
foreign key (id_loai_khach) references loai_khach(id_loai_khach),
ten_khach_hang varchar(100) not null,
ngay_sinh date,
cmnd varchar(20),
sdt varchar(20),
email varchar(100),
dia_chi varchar(100)
);

-- Tao bang kieu thue
create table kieu_thue(
id_kieu_thue int auto_increment primary key,
ten_kieu_thue varchar(100) not null,
gia int
);

-- Tao bang loai dich vu
create table loai_dich_vu(
id_loai_dich_vu int auto_increment primary key,
ten_loai_dich_vu varchar(100) not null
);
-- Tao bang dich vu
create table dich_vu(
id_dich_vu int auto_increment primary key,
ten_dich_vu varchar(100) not null,
dien_tich int,
so_tang int,
so_nguoi_toi_da int,
chi_phi_thue int,
id_kieu_thue int,
foreign key (id_kieu_thue) references kieu_thue(id_kieu_thue),
id_loai_dich_vu int,
foreign key (id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu),
trang_thai varchar(50)
);
-- Tao bang dich vu di kem
create table dich_vu_di_kem(
id_dich_vu_di_kem int auto_increment primary key,
ten_dich_vu_di_kem varchar(100) not null,
gia int,
don_vi int,
trang_thai_kha_dung varchar(50)
);

-- Tao bang hop dong
create table hop_dong(
id_hop_dong int auto_increment primary key,
id_nhan_vien int,
foreign key(id_nhan_vien) references nhan_vien(id_nhan_vien),
id_khach_hang int,
foreign key(id_khach_hang) references khach_hang(id_khach_hang),
ngay_lam_hop_dong date,
ngay_ket_thuc date,
tien_dat_coc int,
tong_tien int
);
-- Bo sung cot id dich vi bi thieu
alter table hop_dong add column id_dich_vu int;
alter table hop_dong add constraint fk_dichvu_hopdong foreign key(id_dich_vu) references dich_vu(id_dich_vu);

-- Tao bang chi tiet hop dong
create table chi_tiet_hop_dong(
id_chi_tiet_hop_dong int auto_increment primary key,
id_hop_dong int,
foreign key(id_hop_dong) references hop_dong(id_hop_dong),
id_dich_vu_di_kem int,
foreign key(id_dich_vu_di_kem) references dich_vu_di_kem(id_dich_vu_di_kem),
so_luong int
);

 


