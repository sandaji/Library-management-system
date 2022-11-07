// return Book
public boolean returnBook() {
    boolean isReturned = false;
    int bookId = integer.parseInt(txt_bookId.getText());
    int studentId = integer.parseInt(txt_studentId.getText());

    try{
        connnection con = DBConnection.getConnection();
        String sql = "update issue_book_deatils set status = ? where student_id = ? and book_id = ? and status = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, "returned");
        pst.setString(2, studentId);
        pst.setString(3, bookId);
        pst.setString(4, "pending");

        int rowCount pst.executeUpdate();
        if (rowCount >0){
            isReturned = true;
        }else{
            isReturned = false;
        }
    }
    catch(Exception e){
      e.printStackTrace();  
    }
    return isReturned;
}

//updating book count
public void updateBookCount(){
    int bookId = integer.parseInt(txt_bookId.getText());
    try{
        connnection con = DBConnection.getConnection();
        String sql = "update book_details set quantity = quantity + 1 where book_id = ? ";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, bookId);

        int rowCount = pst.executeUpdate();

        if (rowCount>0){
            JOptionPane.showMessageDialog(this, "Book count update");
            // int initialCount = Integer.parseInt(label_dueDate.getText());
            // label_dueDate.setText(Integer.toString(initialCount -1));

        } else{
            JOptionPane.showMessageDialog(this, "Book count not updated");
        }

    } catch(Exception e){
        e.printStackTrace();

    }
}