CREATE TABLE Truong (
	MaTruong VARCHAR(100) PRIMARY KEY,
	TenTruong VARCHAR(100)
);

INSERT INTO Truong (MaTruong, TenTruong)
VALUES('HUI', 'Đại học Công Nghiệp');

INSERT INTO Truong (MaTruong, TenTruong)
VALUES('SGU', 'Đại học Sài Gòn');

INSERT INTO Truong (MaTruong, TenTruong)
VALUES('BKA', 'Đại học Bách Khoa');

SELECT *
FROM Truong
Where matruong = 'SGU';

CREATE TABLE ThiSinh (
	SoBaoDanh VARCHAR(100) PRIMARY KEY,
	HoTen VARCHAR(100),
	NgaySinh DATE,
	NoiSinh VARCHAR(100),
	NamDuThi VARCHAR(100),
	MaTruong VARCHAR(100) NOT NULL,
	FOREIGN KEY (MaTruong) REFERENCES Truong(MaTruong)
);

DROP TABLE ThiSinh;

INSERT INTO ThiSinh (SoBaoDanh, HoTen, NgaySinh, NoiSinh, NamDuThi, MaTruong)
VALUES('1234','Sang','2013-06-01', 'Bình Phước', '2022', 'SGU');

INSERT INTO ThiSinh (SoBaoDanh, HoTen, NgaySinh, NoiSinh, NamDuThi, MaTruong)
VALUES('1236','Sáng','2013-06-01', 'Bình Phước', '2022', 'HUI');

INSERT INTO ThiSinh (SoBaoDanh, HoTen, NgaySinh, NoiSinh, NamDuThi, MaTruong)
VALUES('1237','Thảo','2013-06-01', 'Bình Phước', '2022', 'BKA');

SELECT *
FROM ThiSinh;

SELECT sobaodanh, hoten
FROM ThiSinh;

SELECT sobaodanh, hoten
FROM ThiSinh
WHERE sobaodanh = '1234'

CREATE TABLE MonThi (
	MaMon VARCHAR(100) PRIMARY KEY,
	TenMon VARCHAR(100)
);

INSERT INTO MonThi (MaMon, TenMon)
VALUES('M1', 'SQL');

INSERT INTO MonThi (MaMon, TenMon)
VALUES('M2', 'Java');

INSERT INTO MonThi (MaMon, TenMon)
VALUES('M3', 'OOP');

select *
from monthi;

CREATE TABLE KetQua (
	IdKQ VARCHAR(100) PRIMARY KEY,
	MaMon VARCHAR(100) Not Null,
	SoBaoDanh VARCHAR(100) Not Null,
	Diem integer,
	GhiChu VARCHAR(100),
	FOREIGN KEY (MaMon) REFERENCES MonThi(MaMon),
	FOREIGN KEY (SoBaoDanh) REFERENCES ThiSinh(SoBaoDanh)
);

INSERT INTO KetQua (IdKQ, MaMon, SoBaoDanh, Diem)
VALUES('KQ1', 'M1', '1234', 10);

INSERT INTO KetQua (IdKQ, MaMon, SoBaoDanh, Diem)
VALUES('KQ2', 'M2', '1234', 9);

INSERT INTO KetQua (IdKQ, MaMon, SoBaoDanh, Diem)
VALUES('KQ3', 'M3', '1234', 8);

select *
from KetQua,