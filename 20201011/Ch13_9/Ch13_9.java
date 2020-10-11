/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20201011;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
//只有查詢用
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
public class Ch13_9 {

 
    public static void main(String[] args) {
	String url = "jdbc:derby://localhost:1527/mydb2";
	String user ="qwer";
	String password ="12345";
	Random ran = new Random();
	String name = "Vivin";
	//JDBC 函示庫一定加入
	try(Connection conn= DriverManager.getConnection(url, user, password);
	    Statement stm = conn.createStatement();){
//	    String insert = String.format("INSERT INTO student(id,name) VALUES(%d,'%s')"
//		    ,ran.nextInt(500000),name);
	//新增的SQL語法
//	    String insert = "INSERT INTO student(id,name) VALUES(100,'Iris')";
//	    int count = stm.executeUpdate(insert);
//	    if (count > 0){
//		System.out.println("新增成功!");
//	    }
	    String update = "UPDATE student SET name = 'Lucy' WHERE id = 256036";
	    int count2 = stm.executeUpdate(update);
		    if (count2 > 0){
		    System.out.println("更新成功!");
		}
	 String delete = "DELETE FROM student WHERE id = 410955";
	  int count3 =  stm.executeUpdate(delete);
	    if (count3 > 0){
		    System.out.println("刪除成功!");
		}
	   //查詢語法
	   //resultSet 可用index取數值 index由 1 開始
	   //resultSet 可用colum name取數值 
	   String query = "SELECT id,name FROM student";
	   ResultSet resultSet =  stm.executeQuery(query);
	   while(resultSet.next()){
	       System.out.printf("id %d name %s %n",resultSet.getInt(1),
					resultSet.getString("name"));
	   }	   
	   
	}catch(SQLException ex){
	    System.out.println(ex);
	}
	
	
	
    }
    
}
