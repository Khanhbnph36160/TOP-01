USE [DuAn1]
GO
CREATE TABLE [dbo].[ChatLieu](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ten] [nchar](20) NULL,
	[created_at] [date] NULL,
	[created_by] [int] NULL,
	[updated_at] [date] NULL,
	[updated_by] [int] NULL,
	[deleted] [bit] NULL,
 CONSTRAINT [PK_ChatLieu] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
CREATE TABLE [dbo].[HeDieuHanh](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ten] [nchar](20) NULL,
	[created_at] [date] NULL,
	[created_by] [int] NULL,
	[updated_at] [date] NULL,
	[updated_by] [int] NULL,
	[deleted] [bit] NULL,
 CONSTRAINT [PK_HeDieuHanh] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
CREATE TABLE [dbo].[HinhAnh](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ten] [nchar](50) NULL,
	[trangThai] [nchar](20) NULL,
	[created_at] [date] NULL,
	[created_by] [int] NULL,
	[updated_at] [date] NULL,
	[updated_by] [int] NULL,
	[deleted] [bit] NULL,
 CONSTRAINT [PK_HinhAnh] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
CREATE TABLE [dbo].[HinhThucTT](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[tienMat] [nchar](10) NULL,
	[chuyenKhoan] [nchar](10) NULL,
	[created_at] [date] NULL,
	[created_by] [int] NULL,
	[updated_at] [date] NULL,
	[updated_by] [int] NULL,
	[deteted] [bit] NULL,
 CONSTRAINT [PK_HinhThucTT] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
CREATE TABLE [dbo].[HoaDon](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_NhanVien] [int] NULL,
	[id_KhachHang] [int] NULL,
	[id_Voucher] [int] NULL,
	[id_HinhThucTT] [int] NULL,
	[soLuong] [int] NULL,
	[tongTien] [float] NULL,
	[sdt] [nchar](20) NULL,
	[diaChi] [nchar](100) NULL,
	[ngayXacNhan] [date] NULL,
	[ngayShip] [date] NULL,
	[ngayNhan] [date] NULL,
	[trangThai] [nchar](20) NULL,
	[created_at] [date] NULL,
	[created_by] [int] NULL,
	[updated_at] [date] NULL,
	[updated_by] [int] NULL,
	[deteted] [bit] NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
CREATE TABLE [dbo].[HoaDonChiTiet](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_SanPhamChiTiet] [int] NULL,
	[id_HoaDon] [int] NULL,
	[gia] [float] NULL,
	[created_at] [date] NULL,
	[created_by] [int] NULL,
	[updated_at] [date] NULL,
	[updated_by] [int] NULL,
	[deteted] [bit] NULL,
 CONSTRAINT [PK_HoaDonChiTiet] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
CREATE TABLE [dbo].[IMEI](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ten] [nchar](20) NULL,
	[created_at] [date] NULL,
	[created_by] [int] NULL,
	[updated_at] [date] NULL,
	[updated_by] [int] NULL,
	[deleted] [bit] NULL,
 CONSTRAINT [PK_IMEI] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
CREATE TABLE [dbo].[KH_Voucher](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_KhachHang] [int] NULL,
	[id_Voucher] [int] NULL,
	[created_at] [date] NULL,
	[created_by] [int] NULL,
	[updated_at] [date] NULL,
	[updated_by] [int] NULL,
	[deleted] [bit] NULL,
 CONSTRAINT [PK_KH_Voucher] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
CREATE TABLE [dbo].[KhachHang](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ten] [nchar](50) NULL,
	[sdt] [nchar](20) NULL,
	[email] [nchar](50) NULL,
	[diaChi] [nchar](100) NULL,
	[created_at] [date] NULL,
	[created_by] [int] NULL,
	[updated_at] [date] NULL,
	[updated_by] [int] NULL,
	[deleted] [bit] NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
CREATE TABLE [dbo].[MauSac](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[tenMau] [nchar](10) NULL,
	[created_at] [date] NULL,
	[created_by] [int] NULL,
	[updated_at] [date] NULL,
	[updated_by] [int] NULL,
	[deteted] [bit] NULL,
 CONSTRAINT [PK_MauSac] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
CREATE TABLE [dbo].[Mota](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_SanPham] [int] NULL,
	[noiDung] [nchar](50) NULL,
	[created_at] [date] NULL,
	[created_by] [int] NULL,
	[updated_at] [date] NULL,
	[updated_by] [int] NULL,
	[deteted] [bit] NULL,
 CONSTRAINT [PK_Mota] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
CREATE TABLE [dbo].[NhanVien](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ten] [nchar](50) NULL,
	[id_role] [int] NULL,
	[email] [nchar](50) NULL,
	[sdt] [nchar](20) NULL,
	[diaChi] [nchar](100) NULL,
	[created_at] [date] NULL,
	[created_by] [int] NULL,
	[updated_at] [date] NULL,
	[updated_by] [int] NULL,
	[deleted] [bit] NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
CREATE TABLE [dbo].[NSX](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[tenNSX] [nchar](20) NULL,
	[diaChiNSX] [nchar](50) NULL,
	[gioiThieu] [nchar](100) NULL,
	[created_at] [date] NULL,
	[created_by] [int] NULL,
	[updated_at] [date] NULL,
	[updated_by] [int] NULL,
	[deleted] [bit] NULL,
 CONSTRAINT [PK_NSX] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
CREATE TABLE [dbo].[role](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ten] [nchar](50) NULL,
	[created_at] [date] NULL,
	[created_by] [int] NULL,
	[updated_at] [date] NULL,
	[updated_by] [int] NULL,
	[deleted] [bit] NULL,
 CONSTRAINT [PK_role] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
CREATE TABLE [dbo].[SanPham](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ten] [nchar](20) NULL,
	[soLuong] [int] NULL,
	[created_at] [date] NULL,
	[created_by] [int] NULL,
	[updated_at] [date] NULL,
	[updated_by] [int] NULL,
	[deteted] [bit] NULL,
 CONSTRAINT [PK_SanPham] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
CREATE TABLE [dbo].[SanPhamChiTiet](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_NSX] [int] NULL,
	[id_Mau] [int] NULL,
	[id_SanPham] [int] NULL,
	[id_MoTa] [int] NULL,
	[id_HinhAnh] [int] NULL,
	[id_ThuongHieu] [int] NULL,
	[id_HeDieuHanh] [int] NULL,
	[id_ChatLieu] [int] NULL,
	[id_IMEI] [int] NULL,
	[gia] [float] NULL,
	[created_at] [date] NULL,
	[created_by] [int] NULL,
	[updated_at] [date] NULL,
	[updated_by] [int] NULL,
	[deleted] [bit] NULL,
 CONSTRAINT [PK_SanPhamChiTiet] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
CREATE TABLE [dbo].[ThuongHieu](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ten] [nchar](20) NULL,
	[created_at] [date] NULL,
	[created_by] [int] NULL,
	[updated_at] [date] NULL,
	[updated_by] [int] NULL,
	[deleted] [bit] NULL,
 CONSTRAINT [PK_ThuongHieu] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[voucher]    Script Date: 11/9/2023 10:34:30 PM ******/
CREATE TABLE [dbo].[voucher](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ten_voucher] [nchar](20) NULL,
	[soLuong] [int] NULL,
	[giaTri] [nchar](20) NULL,
	[ngay_bat_dau] [date] NULL,
	[ngay_ket_thuc] [date] NULL,
	[trangThai] [nchar](20) NULL,
	[created_at] [date] NULL,
	[created_by] [int] NULL,
	[updated_at] [date] NULL,
	[updated_by] [int] NULL,
	[deleted] [bit] NULL,
 CONSTRAINT [PK_voucher] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[ChatLieu] ADD  CONSTRAINT [DF_ChatLieu_created_at]  DEFAULT (getdate()) FOR [created_at]
GO
ALTER TABLE [dbo].[ChatLieu] ADD  CONSTRAINT [DF_ChatLieu_updated_at]  DEFAULT (getdate()) FOR [updated_at]
GO
ALTER TABLE [dbo].[HeDieuHanh] ADD  CONSTRAINT [DF_HeDieuHanh_created_at]  DEFAULT (getdate()) FOR [created_at]
GO
ALTER TABLE [dbo].[HeDieuHanh] ADD  CONSTRAINT [DF_HeDieuHanh_updated_at]  DEFAULT (getdate()) FOR [updated_at]
GO
ALTER TABLE [dbo].[HinhAnh] ADD  CONSTRAINT [DF_HinhAnh_created_at]  DEFAULT (getdate()) FOR [created_at]
GO
ALTER TABLE [dbo].[HinhAnh] ADD  CONSTRAINT [DF_HinhAnh_updated_at]  DEFAULT (getdate()) FOR [updated_at]
GO
ALTER TABLE [dbo].[HinhThucTT] ADD  CONSTRAINT [DF_HinhThucTT_created_at]  DEFAULT (getdate()) FOR [created_at]
GO
ALTER TABLE [dbo].[HinhThucTT] ADD  CONSTRAINT [DF_HinhThucTT_updated_at]  DEFAULT (getdate()) FOR [updated_at]
GO
ALTER TABLE [dbo].[HoaDon] ADD  CONSTRAINT [DF_HoaDon_ngayXacNhan]  DEFAULT (getdate()) FOR [ngayXacNhan]
GO
ALTER TABLE [dbo].[HoaDon] ADD  CONSTRAINT [DF_HoaDon_ngayShip]  DEFAULT (getdate()) FOR [ngayShip]
GO
ALTER TABLE [dbo].[HoaDon] ADD  CONSTRAINT [DF_HoaDon_ngayNhan]  DEFAULT (getdate()) FOR [ngayNhan]
GO
ALTER TABLE [dbo].[HoaDon] ADD  CONSTRAINT [DF_HoaDon_created_at]  DEFAULT (getdate()) FOR [created_at]
GO
ALTER TABLE [dbo].[HoaDon] ADD  CONSTRAINT [DF_HoaDon_updated_at]  DEFAULT (getdate()) FOR [updated_at]
GO
ALTER TABLE [dbo].[HoaDonChiTiet] ADD  CONSTRAINT [DF_HoaDonChiTiet_created_at]  DEFAULT (getdate()) FOR [created_at]
GO
ALTER TABLE [dbo].[HoaDonChiTiet] ADD  CONSTRAINT [DF_HoaDonChiTiet_updated_at]  DEFAULT (getdate()) FOR [updated_at]
GO
ALTER TABLE [dbo].[IMEI] ADD  CONSTRAINT [DF_IMEI_created_at]  DEFAULT (getdate()) FOR [created_at]
GO
ALTER TABLE [dbo].[IMEI] ADD  CONSTRAINT [DF_IMEI_updated_at]  DEFAULT (getdate()) FOR [updated_at]
GO
ALTER TABLE [dbo].[KH_Voucher] ADD  CONSTRAINT [DF_KH_Voucher_created_at]  DEFAULT (getdate()) FOR [created_at]
GO
ALTER TABLE [dbo].[KH_Voucher] ADD  CONSTRAINT [DF_KH_Voucher_updated_at]  DEFAULT (getdate()) FOR [updated_at]
GO
ALTER TABLE [dbo].[KhachHang] ADD  CONSTRAINT [DF_KhachHang_created_at]  DEFAULT (getdate()) FOR [created_at]
GO
ALTER TABLE [dbo].[KhachHang] ADD  CONSTRAINT [DF_KhachHang_updated_at]  DEFAULT (getdate()) FOR [updated_at]
GO
ALTER TABLE [dbo].[MauSac] ADD  CONSTRAINT [DF_MauSac_created_at]  DEFAULT (getdate()) FOR [created_at]
GO
ALTER TABLE [dbo].[MauSac] ADD  CONSTRAINT [DF_MauSac_updated_at]  DEFAULT (getdate()) FOR [updated_at]
GO
ALTER TABLE [dbo].[Mota] ADD  CONSTRAINT [DF_Mota_created_at]  DEFAULT (getdate()) FOR [created_at]
GO
ALTER TABLE [dbo].[Mota] ADD  CONSTRAINT [DF_Mota_updated_at]  DEFAULT (getdate()) FOR [updated_at]
GO
ALTER TABLE [dbo].[NhanVien] ADD  CONSTRAINT [DF_NhanVien_created_at]  DEFAULT (getdate()) FOR [created_at]
GO
ALTER TABLE [dbo].[NhanVien] ADD  CONSTRAINT [DF_NhanVien_updated_at]  DEFAULT (getdate()) FOR [updated_at]
GO
ALTER TABLE [dbo].[NSX] ADD  CONSTRAINT [DF_NSX_created_at]  DEFAULT (getdate()) FOR [created_at]
GO
ALTER TABLE [dbo].[NSX] ADD  CONSTRAINT [DF_NSX_updated_at]  DEFAULT (getdate()) FOR [updated_at]
GO
ALTER TABLE [dbo].[role] ADD  CONSTRAINT [DF_role_created_at]  DEFAULT (getdate()) FOR [created_at]
GO
ALTER TABLE [dbo].[role] ADD  CONSTRAINT [DF_role_updated_at]  DEFAULT (getdate()) FOR [updated_at]
GO
ALTER TABLE [dbo].[SanPham] ADD  CONSTRAINT [DF_SanPham_created_at]  DEFAULT (getdate()) FOR [created_at]
GO
ALTER TABLE [dbo].[SanPham] ADD  CONSTRAINT [DF_SanPham_updated_at]  DEFAULT (getdate()) FOR [updated_at]
GO
ALTER TABLE [dbo].[SanPhamChiTiet] ADD  CONSTRAINT [DF_SanPhamChiTiet_created_at]  DEFAULT (getdate()) FOR [created_at]
GO
ALTER TABLE [dbo].[SanPhamChiTiet] ADD  CONSTRAINT [DF_SanPhamChiTiet_updated_at]  DEFAULT (getdate()) FOR [updated_at]
GO
ALTER TABLE [dbo].[ThuongHieu] ADD  CONSTRAINT [DF_ThuongHieu_created_at]  DEFAULT (getdate()) FOR [created_at]
GO
ALTER TABLE [dbo].[ThuongHieu] ADD  CONSTRAINT [DF_ThuongHieu_updated_at]  DEFAULT (getdate()) FOR [updated_at]
GO
ALTER TABLE [dbo].[voucher] ADD  CONSTRAINT [DF_voucher_ngay_bat_dau]  DEFAULT (getdate()) FOR [ngay_bat_dau]
GO
ALTER TABLE [dbo].[voucher] ADD  CONSTRAINT [DF_voucher_ngay_ket_thuc]  DEFAULT (getdate()) FOR [ngay_ket_thuc]
GO
ALTER TABLE [dbo].[voucher] ADD  CONSTRAINT [DF_voucher_created_at]  DEFAULT (getdate()) FOR [created_at]
GO
ALTER TABLE [dbo].[voucher] ADD  CONSTRAINT [DF_voucher_updated_at]  DEFAULT (getdate()) FOR [updated_at]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_HinhThucTT] FOREIGN KEY([id_HinhThucTT])
REFERENCES [dbo].[HinhThucTT] ([id])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_HinhThucTT]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KhachHang] FOREIGN KEY([id_KhachHang])
REFERENCES [dbo].[KhachHang] ([id])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_KhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([id_NhanVien])
REFERENCES [dbo].[NhanVien] ([id])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_NhanVien]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_voucher] FOREIGN KEY([id_Voucher])
REFERENCES [dbo].[voucher] ([id])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_voucher]
GO
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_HoaDonChiTiet_HoaDon] FOREIGN KEY([id_HoaDon])
REFERENCES [dbo].[HoaDon] ([id])
GO
ALTER TABLE [dbo].[HoaDonChiTiet] CHECK CONSTRAINT [FK_HoaDonChiTiet_HoaDon]
GO
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_HoaDonChiTiet_SanPhamChiTiet] FOREIGN KEY([id_SanPhamChiTiet])
REFERENCES [dbo].[SanPhamChiTiet] ([id])
GO
ALTER TABLE [dbo].[HoaDonChiTiet] CHECK CONSTRAINT [FK_HoaDonChiTiet_SanPhamChiTiet]
GO
ALTER TABLE [dbo].[KH_Voucher]  WITH CHECK ADD  CONSTRAINT [FK_KH_Voucher_KhachHang] FOREIGN KEY([id_KhachHang])
REFERENCES [dbo].[KhachHang] ([id])
GO
ALTER TABLE [dbo].[KH_Voucher] CHECK CONSTRAINT [FK_KH_Voucher_KhachHang]
GO
ALTER TABLE [dbo].[KH_Voucher]  WITH CHECK ADD  CONSTRAINT [FK_KH_Voucher_voucher] FOREIGN KEY([id_Voucher])
REFERENCES [dbo].[voucher] ([id])
GO
ALTER TABLE [dbo].[KH_Voucher] CHECK CONSTRAINT [FK_KH_Voucher_voucher]
GO
ALTER TABLE [dbo].[Mota]  WITH CHECK ADD  CONSTRAINT [FK_Mota_SanPham] FOREIGN KEY([id_SanPham])
REFERENCES [dbo].[SanPham] ([id])
GO
ALTER TABLE [dbo].[Mota] CHECK CONSTRAINT [FK_Mota_SanPham]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_role] FOREIGN KEY([id_role])
REFERENCES [dbo].[role] ([id])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_role]
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_SanPhamChiTiet_ChatLieu] FOREIGN KEY([id_ChatLieu])
REFERENCES [dbo].[ChatLieu] ([id])
GO
ALTER TABLE [dbo].[SanPhamChiTiet] CHECK CONSTRAINT [FK_SanPhamChiTiet_ChatLieu]
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_SanPhamChiTiet_ChatLieu1] FOREIGN KEY([id_ChatLieu])
REFERENCES [dbo].[ChatLieu] ([id])
GO
ALTER TABLE [dbo].[SanPhamChiTiet] CHECK CONSTRAINT [FK_SanPhamChiTiet_ChatLieu1]
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_SanPhamChiTiet_HeDieuHanh] FOREIGN KEY([id_HeDieuHanh])
REFERENCES [dbo].[HeDieuHanh] ([id])
GO
ALTER TABLE [dbo].[SanPhamChiTiet] CHECK CONSTRAINT [FK_SanPhamChiTiet_HeDieuHanh]
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_SanPhamChiTiet_HinhAnh] FOREIGN KEY([id_HinhAnh])
REFERENCES [dbo].[HinhAnh] ([id])
GO
ALTER TABLE [dbo].[SanPhamChiTiet] CHECK CONSTRAINT [FK_SanPhamChiTiet_HinhAnh]
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_SanPhamChiTiet_HinhAnh1] FOREIGN KEY([id_HinhAnh])
REFERENCES [dbo].[HinhAnh] ([id])
GO
ALTER TABLE [dbo].[SanPhamChiTiet] CHECK CONSTRAINT [FK_SanPhamChiTiet_HinhAnh1]
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_SanPhamChiTiet_IMEI] FOREIGN KEY([id_IMEI])
REFERENCES [dbo].[IMEI] ([id])
GO
ALTER TABLE [dbo].[SanPhamChiTiet] CHECK CONSTRAINT [FK_SanPhamChiTiet_IMEI]
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_SanPhamChiTiet_MauSac] FOREIGN KEY([id_Mau])
REFERENCES [dbo].[MauSac] ([id])
GO
ALTER TABLE [dbo].[SanPhamChiTiet] CHECK CONSTRAINT [FK_SanPhamChiTiet_MauSac]
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_SanPhamChiTiet_Mota] FOREIGN KEY([id_MoTa])
REFERENCES [dbo].[Mota] ([id])
GO
ALTER TABLE [dbo].[SanPhamChiTiet] CHECK CONSTRAINT [FK_SanPhamChiTiet_Mota]
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_SanPhamChiTiet_NSX] FOREIGN KEY([id_NSX])
REFERENCES [dbo].[NSX] ([id])
GO
ALTER TABLE [dbo].[SanPhamChiTiet] CHECK CONSTRAINT [FK_SanPhamChiTiet_NSX]
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_SanPhamChiTiet_SanPham] FOREIGN KEY([id_SanPham])
REFERENCES [dbo].[SanPham] ([id])
GO
ALTER TABLE [dbo].[SanPhamChiTiet] CHECK CONSTRAINT [FK_SanPhamChiTiet_SanPham]
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_SanPhamChiTiet_ThuongHieu] FOREIGN KEY([id_ThuongHieu])
REFERENCES [dbo].[ThuongHieu] ([id])
GO
ALTER TABLE [dbo].[SanPhamChiTiet] CHECK CONSTRAINT [FK_SanPhamChiTiet_ThuongHieu]
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_SanPhamChiTiet_ThuongHieu1] FOREIGN KEY([id_ThuongHieu])
REFERENCES [dbo].[ThuongHieu] ([id])
GO
ALTER TABLE [dbo].[SanPhamChiTiet] CHECK CONSTRAINT [FK_SanPhamChiTiet_ThuongHieu1]
GO
