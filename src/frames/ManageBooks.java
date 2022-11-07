package jfarme;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
*
* @author IJAMY VINCENT
*/

public class ManageBooks extends javax.swing.JFrame{

// create new form ManageBooks
String bookName, author;
int book_id,quantity;
DefaultTableModel model;
public ManageBooks() {
    initComponents();
    setBookDetailsToTable(); 
}

// line 35
//to set the book details into table
public void setBookDetailsToTable(){
    try{
class.forName("com.mysql.jdbc.Driver");
connection con = DriverManager.getConnection("jdbc:mysql://localhost:3500/library_system","root","");
Statement st= con.createStatement();
ResultSet rs = st.executeQuery("select * from book_details");

while (rs.next()) {
    String bookId = rs.getString("book_id");
    String bookName = rs.getString("book_name");
    String author = rs.getString("author");
    int quantity = rs.getInt("quantity");

    Object [] obj = {bookId,bookName,author,quantity};
    model= (DefaultTableModel) tbl_bookDetails.getModel();
    model.addRow(obj);
}
    }catch(Exception e){
        e.printStackTrace();
        }
}


// line 60
// add book operation

public boolean addBook(){
    boolean isAdded = false;
    bookId= integer.parseInt(txt_bookId.getText());
    bookName= txt_bookName.getText();
    authorname= txt_authorName.getText();
    quantity= integer.parseInt(txt_quantity.getText());
   
   try{
    connection con=DBConnection.getConnection();
    String sql ="insert into book_details values(?,?,?,?)" ;
    PreparedStatement pst = con.prepareStatement(sql);
    pst.setInt(1, bookId);
    pst.setString(2, bookName);
    pst.setString(3, author);
    pst.setString(4, quantity);

    int rowCount = pst.executeUpdate();
    if (rowCount>0){
    isAdded = true; 
    }else{
        isAdded = false;
    }

    }catch(Exception e){e.printStackTrace();}
    return isAdded;

}

        /*
        add book button action
        */
private void rSMaterialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt){
    if (addBook()== true){
        JOptionPane.showMessageDialog(this, "you've successfully added a book");
        clearTable();
        setBookDetailsToTable();
    }else{
        JOptionPane.showMessageDialog(this, "operation addBook failed");
    }
}

// update book details
public boolean updateBook(){
    boolean isUpdated = false;

    bookId= integer.parseInt(txt_bookId.getText());
    bookName= txt_bookName.getText();
    authorname= txt_authorName.getText();
    quantity= integer.parseInt(txt_quantity.getText());
   
   try{
    connection con=DBConnection.getConnection();
    String sql ="update book_details set book_name= ?,author=?, quanity=?,Where book_id=?)" ;
    PreparedStatement pst = con.prepareStatement(sql);
    pst.setInt(1, bookId);
    pst.setString(2, bookName);
    pst.setString(3, author);
    pst.setString(4, quantity);

    int rowCount = pst.executeUpdate();
    if (rowCount>0){
        isUpdated = true; 
           }else{
        isUpdated = false;
        }

    }catch(Exception e){
        e.printStackTrace();
           }
    return Updated;
}

        /*
        update book button action
        */
private void rSMaterialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt){
    if (updateBook()== true){
        JOptionPane.showMessageDialog(this, "you've successfully updated a book");
        clearTable();
        setBookDetailsToTable();
            }else{
        JOptionPane.showMessageDialog(this, "operation updateBook failed");
               }
}


// Delete  book details
public boolean deleteBook(){
    boolean isDeleted = false;

     bookId= integer.parseInt(txt_bookId.getText());
   
   
   try{
    connection con=DBConnection.getConnection();
    String sql ="delete from book_details where book_id= ?,)" ;
    PreparedStatement pst = con.prepareStatement(sql);
    pst.setInt(1, bookId);

    int rowCount = pst.executeUpdate();
    if (rowCount>0){
      isDeleted = true; 
    }else{
        isDeleted = false;
    }

    }catch(Exception e){
        e.printStackTrace();
    }
    return isUpdated;
}
        /*
        delete book button action
        */
private void rSMaterialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt){
    if (updateBook()== true){
        JOptionPane.showMessageDialog(this, "book deleted successfully ");
        clearTable();
        setBookDetailsToTable();
    }else{
        JOptionPane.showMessageDialog(this, "operation updateBook failed");
    }
}

// method to clear table
public void clearTable(){
    DefaultTableModel model = (DefaultTableModel) tbl_bookDetails.getModel();
    model.setRowCount(0);
}
// line 377
private void tbl_bookDetailsMouseClicked(java.awt.event.MouseEvent evt){
    int rowNo = tbl_bookDetails.getSelectedRow();
    TableModel model = tbl_bookDetails.getModel();

    txt_bookId.setText(model.getvalueAt(rowNo,0).toString());
    txt_bookName.setText(model.getvalueAt(rowNo,1).toString());
    txt_authorName.setText(model.getvalueAt(rowNo,2).toString());
    txt_quantity.setText(model.getvalueAt(rowNo,3).toString());
}




public static void main(String args[] ){
    // set nimus look and feel

    // create and display form
    java.awt.EventQueue.invokeLater(new Runnable() {})
}


// line 433
/*
add book button action
*/
































}