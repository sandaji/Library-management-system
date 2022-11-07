public class IssueBook extends javax.swing.JFrame{

    public IssueBook(){
        initComponents();
    }
    // fetching book details from database and display on the panel
    public void getBookDetails(){
        int bookId = integer.parseInt(txt_bookId.getText());

        try{
        connection con = DBConnection.getConnection();
        prepareStatement pst = con.prepareStatement("select * from book_deatils where book_id = ?");
        pst.setInt(1, bookId);
        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            label_bookId.setText(rs.getString("book_id"));
            label_bookName.setText(rs.getString("book_name"));
            label_author.setText(rs.getString("author"));
            label_quantity.setText(rs.getString("quantity"));
        }
        }catch(Exception e){
e.printStackTrace();
        }
    }
//line 387
public static void main(String[]args){
     try{
         for (javax.swing.UIManager.LookAndFeelInfo info :javax.swin.UImanager.getInstalledLookAndFeels())
        }catch{}
        }
        
        
        
        
        
        
        }