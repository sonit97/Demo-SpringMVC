//package net.sonnpt.entity;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class DatabaseTest  {
//	
//	private JdbcTemplate jdbcTemplate ;
//	
//	@Autowired
//	public void setDataSource(DataSource dataSource){
//		this.jdbcTemplate = new JdbcTemplate(dataSource);
////		String sql = "select * from Profile";
////		List<NhanVien>  listNV = jdbcTemplate.query(sql,new RowMapper<NhanVien>(){
////
////			@Override
////			public NhanVien mapRow(ResultSet rowResult, int arg1) throws SQLException {
////				NhanVien nv = new NhanVien();
////				nv.tenNhanVien = rowResult.getString("hoten");
////				nv.diaChi = rowResult.getString("diachi");
////				return nv;
////			}			
////	});	
////		for(NhanVien value : listNV){
////			 System.out.println("Gia tri"+value.tenNhanVien + "---"+value.diaChi);
////			
////			
////		}
//		
//	}
//	
//	public void getListNV(){
//		String sql = "select * from Profile";
//		List<NhanVien>  listNV = jdbcTemplate.query(sql,new RowMapper<NhanVien>(){
//
//			@Override
//			public NhanVien mapRow(ResultSet rowResult, int arg1) throws SQLException {
//				NhanVien nv = new NhanVien();
//				nv.tenNhanVien = rowResult.getString("hoten");
//				nv.diaChi = rowResult.getString("diachi");
//				return nv;
//			}			
//	});	
//		for(NhanVien value : listNV){
//			 System.out.println("Gia tri"+value.tenNhanVien + "---"+value.diaChi);
//			
//			
//		}
//	}	
//}
