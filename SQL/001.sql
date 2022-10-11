CREATE TABLE ThiSinh (
	SoBaoDanh VARCHAR(100) PRIMARY KEY,
	HoTen VARCHAR(100),
	NgaySinh DATE,
	NoiSinh VARCHAR(100),
	NamDuThi VARCHAR(100)
);

DROP TABLE ThiSinh;

INSERT INTO ThiSinh (SoBaoDanh, HoTen, NgaySinh, NoiSinh, NamDuThi)
VALUES('1234','Google','2013-06-01', 'Bình Phước', '2022');

INSERT INTO ThiSinh (SoBaoDanh, HoTen, NgaySinh, NoiSinh, NamDuThi)
VALUES('1234','Google','2013-06-01', 'Bình Phước', '2022');

INSERT INTO ThiSinh (SoBaoDanh, HoTen, NgaySinh, NoiSinh, NamDuThi)
VALUES('1236','Google','2013-06-01', 'Bình Phước', '2022');

INSERT INTO ThiSinh (SoBaoDanh, HoTen, NgaySinh, NoiSinh, NamDuThi)
VALUES('1237','Google','2013-06-01', 'Bình Phước', '2022');

SELECT *
FROM ThiSinh;

SELECT sobaodanh, hoten
FROM ThiSinh;

SELECT sobaodanh, hoten
FROM ThiSinh
WHERE sobaodanh = '1234'
