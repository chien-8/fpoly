create database assignment_com2012;
go


use assignment_com2012;
go



create table sinhvien(
  masv varchar(10) not null primary key,
  tensv nvarchar(50) not null,
  ngayhethan date not null,
  chuyennganh nvarchar(50) null,
  email varchar(50) not null,
  sdt varchar(15) not null,
 
)
create table loaisach(
  maloaisach varchar(10) not null primary key,
  tenloaisach nvarchar(50) not null

)


create table sach(
  masach varchar(10) not null primary key,
  tensach nvarchar(50) not null,
  nhaxuatban nvarchar(50) not null,
  tacgia nvarchar(50),
  soluong int not null,
  gia float not null,
  vitri nvarchar(50) not null,
  maloaisach varchar(10) not null,
  foreign key (maloaisach) references loaisach(maloaisach)

)
 create table phieumuon(
   mapm varchar(10) not null primary key,
   ngaymuon date not null,
   ngaytra date not null,
   masv varchar(10) not null,
   foreign key(masv) references sinhvien(masv)
 
 )
  create table chitetphieumuon(
    mapm varchar(10) not null,
	masach varchar(10) not null,
	ghichu nvarchar(255),
	primary key(mapm,masach),
	foreign key (mapm) references phieumuon(mapm),
	foreign key (masach) references sach(masach)
  
  )

alter table sach add ngaynhapkho date;
alter table phieumuon add trangthai nvarchar(15);

insert into sinhvien(masv,tensv,ngayhethan,chuyennganh,email,sdt) values ('PD12301',N'Nguyễn Hữa Toàn','2022/12/12',N'ứng dụng phần mềm','toan@fpt.edu.vn','0909')
insert into sinhvien(masv,tensv,ngayhethan,chuyennganh,email,sdt) values ('PD12302',N'Tạ Minh Chiến','2022/12/12',N'đồ họa','chien@fpt.edu.vn','0909'),
('PD12303',N'Đỗ Đức Hoàn','2022/12/12',N'kinh tế','hoan@fpt.edu.vn','0909'),
('PD12304',N'Trần Mai Phương','2022/12/12',N'thiết kế website','phuong@fpt.edu.vn','0909'),
('PD12305',N'Nguyễn Thanh Bình','2022/12/12',N'seo','binh@fpt.edu.vn','0909')

insert into loaisach(maloaisach,tenloaisach) values ('KT',N'kinh tế'),('DH',N'đồ họa'),('EN',N'tiếng anh'),('IT',N'công nghệ thông tin'),('KS',N'khách sạn')
insert into sach(masach,tensach,nhaxuatban,tacgia,soluong,gia,vitri,maloaisach) values ('ACC1013',N'Nguyên lý kế kế toán',N'nhà xuất bản FPT',N'lê duẩn',100,120000,'1','KT')
insert into sach(masach,tensach,nhaxuatban,tacgia,soluong,gia,vitri,maloaisach) values ('ACC2043',N'kế toán quản trị',N'nhà xuất bản FPT','lê duẩn',100,120000,'1','KT'),
('BUS2042',N'quản trị bán hàng',N'nhà xuất bản FPT',N'lê duẩn',100,120000,'1','KT'),
('COM1012',N'Tin học cơ sở',N'nhà xuất bản FPT',N'lê duẩn',105,120000,'1','IT'),
('COM2012',N'cơ sở dữ liệu',N'nhà xuất bản FPT',N'lê duẩn',150,150000,'1','IT'),
('HOS1011',N'nghiệp vụ lễ tân',N'FPT',N'lê hồng phong',100,120000,'1','KS')

insert into phieumuon(mapm,ngaymuon,ngaytra,masv) values ('PM01','2021/04/16','2021/04/23','PD12301'),('PM02','2021/03/15','2021/03/22','PD12303'),('PM03','2021/01/06','2021/01/13','PD12301'),('PM04','2021/05/13','2021/05/20','PD12302'),('PM05','2021/04/16','2021/04/23','PD12305')


insert into chitetphieumuon(mapm,masach,ghichu) values ('PM01','ACC1013',null),('PM01','ACC2043',null),('PM02','ACC2043',null),('PM02','COM2012',null),('PM03','HOS1011',null),('PM04','COM2012',null),('PM04','COM1012',null),('PM05','COM2012',null),('PM05','ACC1013',null)
update sach set ngaynhapkho='2019/11/02' where masach='ACC1013'
update sach set ngaynhapkho='2019/11/02' where masach='ACC2043'
update sach set ngaynhapkho='2019/11/02' where masach='BUS2042'
update sach set ngaynhapkho='2019/11/02' where masach='COM1012'
update sach set ngaynhapkho='2014/11/02' where masach='COM2012'
update sach set ngaynhapkho='2014/11/02' where masach='HOS1011'



update phieumuon set trangthai=N'chưa trả' where mapm='PM01'
update phieumuon set trangthai=N'đã trả' where mapm='PM02'
update phieumuon set trangthai=N'chưa trả' where mapm='PM03'
update phieumuon set trangthai=N'chưa trả' where mapm='PM04'
update phieumuon set trangthai=N'đã trả' where mapm='PM05'

--6.1 Liệt kê tất cả thông tin của các đầu sách gồm tên sách, mã sách, giá tiền , tác giả thuộc loại sách có mã “IT”.
select masach,tensach,tacgia,gia,maloaisach from sach where maloaisach='IT'

--6.2 Liệt kê các phiếu mượn gồm các thông tin mã phiếu mượn, mã sách , ngày mượn, mã sinh viên có ngày mượn trong tháng 01/2021.
select a.mapm,b.masach,ngaymuon,masv from  phieumuon a
inner join chitetphieumuon b on a.mapm=b.mapm
where a.ngaymuon like '2021-01%'

--6.3 Liệt kê các phiếu mượn chưa trả sách cho thư viên theo thứ tự tăng dần của ngày mượn sách.
select*from phieumuon where trangthai like N'chưa trả' order by ngaymuon

--6.4 Liệt kê tổng số đầu sách của mỗi loại sách ( gồm mã loại sách, tên loại sách, tổng số lượng sách mỗi loại).
select sach.maloaisach,loaisach.tenloaisach,count(loaisach.maloaisach) as 'sodausach' from sach
inner join loaisach on sach.maloaisach=loaisach.maloaisach
group by sach.maloaisach,loaisach.tenloaisach

--6.5 Đếm xem có bao nhiêu lượt sinh viên đã mượn sách.
select masv,count(masv)as N'số lượt mượn' from phieumuon group by masv

--6.6 Hiển thị tất cả các quyển sách có tiêu đề chứa từ khoá “cơ sở”.
select*from sach where tensach like N'%cơ sở%'

--6.7 Hiển thị thông tin mượn sách gồm các thông tin: mã sinh viên, tên sinh viên, mã phiếu mượn, tiêu đề sách, ngày mượn, ngày trả. Sắp xếp thứ tự theo ngày mượn sách.
select sinhvien.masv,tensv, phieumuon.mapm,sach.tensach,ngaymuon,ngaytra from sinhvien 
inner join phieumuon on sinhvien.masv=phieumuon.masv
inner join chitetphieumuon on chitetphieumuon.mapm=phieumuon.mapm
inner join sach on sach.masach=chitetphieumuon.masach
order by ngaymuon

--6.8 Liệt kê các đầu sách có lượt mượn lớn hơn 2 lần.
select sach.masach, count(chitetphieumuon.masach) as N'lượt mượn' from sach
inner join chitetphieumuon on chitetphieumuon.masach=sach.masach
group by sach.masach
having count(chitetphieumuon.masach)>2

--6.9 Viết câu lệnh cập nhật lại giá tiền của các quyển sách có ngày nhập kho trước năm 2014 giảm 30%.
update sach set gia=gia-gia*0.3
where year(ngaynhapkho)<='2014'

--6.10 Viết câu lệnh cập nhật lại trạng thái đã trả sách cho phiếu mượn của sinh viên có mã sinh viên PD12301 (ví dụ).
update phieumuon set trangthai=N'đã trả' where masv='PD12301'
select*from phieumuon

--6.11 Lập danh sách các phiếu mượn quá hạn chưa trả gồm các thông tin: mã phiếu mượn,tên sinh viên, email, danh sách các sách đã mượn, ngày mượn.
select phieumuon.mapm,tensv,email,ngaymuon,ngaytra,trangthai,
datediff(day,phieumuon.ngaytra,getdate()) as N'số ngày quá hạn trả'
from phieumuon
inner join sinhvien on sinhvien.masv=phieumuon.masv
where trangthai like N'chưa trả'
and datediff(day,phieumuon.ngaytra,getdate()) >=0

--6.12 Viết câu lệnh cập nhật lại số lượng bản sao tăng lên 5 đơn vị đối với các đầu sách có lượt mượn lớn hơn 10
select*from sach

update sach set soluong=soluong+5 
where masach in (select sach.masach from sach
inner join chitetphieumuon on chitetphieumuon.masach=sach.masach
group by sach.masach
having count(chitetphieumuon.masach)>2)


--6.13 Viết câu lệnh xoá các phiếu mượn có ngày mượn và ngày trả trước „1/1/2010‟
delete phieumuon where ngaymuon< '2021-01-01'
