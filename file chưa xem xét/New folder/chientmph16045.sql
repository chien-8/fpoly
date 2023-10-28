
use QLSV_TESTFULL1
go

create table sinhvien(
  masv char(15) not null primary key,
  hoten nvarchar(50) not null,
  ngaysinh date,
  gioitinh nvarchar(15),
  lop char(15)

)
create table monhoc(
  mamonhoc char(15) not null primary key,
  tenmonhoc nvarchar(max),
  sotinchi int
)
create table diem(
  masv char(15) not null,
  mamonhoc char(15) not null,
  diemlan1 int,
  diemlan2 int,
  primary key(masv,mamonhoc),
  constraint fk_hoadon1 foreign key(masv) references sinhvien(masv),
  constraint fk_hoadon2 foreign key(mamonhoc) references monhoc(mamonhoc),
)


insert into sinhvien(masv,hoten,ngaysinh,gioitinh,lop) values('SV001',N'Tạ Minh Chiến','2002/11/15',N'nam','DL001'),
('SV002',N'Nguyễn Rôbi','1998/01/02',N'nam','LT001'),
('SV003',N'Nguyễn Thị Huệ','1999/03/20',N'nữ','DL001'),
('SV004',N'Nguyễn Thị Hoa','2000/03/05',N'nam','DL001')


insert into monhoc(mamonhoc,tenmonhoc,sotinchi) values ('SQL',N'cơ sở dữ liệu SQL sever',3),
('XML',N'ngôn ngữ đánh dấu mở rộng',3),
('THDC',N'tin học đại cương',4)


insert into diem(masv,mamonhoc,diemlan1,diemlan2) values ('SV001','SQL',8,null),
('SV001','XML',null,null),
('SV002','THDC',4,7),
('SV003','SQL',9,null),
('SV004','SQL',9,null)



select*from sinhvien
select*from monhoc
select*from diem



--Câu 2 (1 điểm): Hiển thị mã sinh viên, tên sinh viên, tuổi của sinh viên. Chỉ hiển thị  những sinh viên có giới tính là nam
select masv,hoten,datediff(year,ngaysinh,getdate()) as N'tuoi' from sinhvien where gioitinh like 'nam%'
--Câu 3 (1 điểm): In ra thông tin sinh viên có điểm thi môn SQL (mã môn) cao nhất.
select sv.masv,hoten,ngaysinh,gioitinh,lop
from sinhvien sv,diem kq(select max(diemlan1) as maxdiem from diem kq where mamonhoc ='SQL') a
where sv.masv=kq.masv and mamonhoc='SQL' and diem=a.maxdiem

--Câu 4 (1 điểm):. Thống kê số môn học của mỗi sinh viên
select sinhvien.masv,sum(mamonhoc),tenmonhoc from sinhvien
inner join monhoc on sinhvien.mamonhoc=monhoc.mamonhoc
--Câu 5 (1): Hiển thị mã sinh viên, tên sinh viên, và ĐTB lần 1 của các sinh viên. Trong đó ĐTB lần 1 = (điểm lần 1 * Số tín chỉ)/tổng số tín chỉ.
--Câu 6 (1Liệt kê ra các sinh viên có điểm lần 1 lớn nhất của mỗi môn học. Chỉ hiển thị: Mã sinh viên, tên sinh viên, môn học và điểm lần 1.
--Câu 7 (1 điểm). Cập nhật điểm sinh viên có mã SV001 và môn XML có điểm lần 2 là 6.
update diem set diemlan2=6 where masv='SV001' and mamonhoc='XML'
--Câu 8. (1 điểm). Xóa những sinh viên có điểm môn THDC dưới 3 điểm
delete from diem where mamonhoc=N'THDC'