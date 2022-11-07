import java.awt.Borderlayout;
import java.awt.color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.JfreeChart;
import org.jfree.data.general.DefaultPieDataset;



public class HomePage extend javax.swing.JFrame{
    // homepage form

    Color mouseEnterColor = new Color(0, 0, 0);
    Color mouseExitColor = new Color(51, 51, 51);


    public HomePage(){
        initComponents();
        showPieChart();
    }
    public void showPieChart(){
        // create dataset
        DefaultPieDataset barDataset = new DefaultPieDataset();
        barDataset.setValue("iphone 12 pro", new Double(20));
    }

    public void showPieChart(){
        // create Dataset
        DefaultPieDataset barDataset = new DefaultPieDataset();

        try{
             connection con=DBConnection.getConnection();
            String sql ="select book_name, count(*) as issue_count from issue_book_details group by book_id " ;
            Statement st = con.CreateStatement();
            ResultSet rs = st.executeQuery(sql);
             
             while (rs.next()) {
                barDataset.setValue("book_name" ,new Double(rs.getDouble("issue_count")));
             }
        } catch (Exception e) {
            e.printStackTrace();
            }

        //craete chat
        JfreeChart pieChart = ChartFactory.CreatePieChart("Books Issued", barDataset, false,true,false);

        PiePlot pieChart=(PiePlot) pieChart.getPlot();

        // changing pie chart colors
        PiePlot.setSectionPaint("mathematics", new Color(60,0,102)  ;
        PiePlot.setSectionPaint("computer", new Color(100,180,102)  ;
        PiePlot.setSectionPaint("physics", new Color(200,100,102)  ;
        PiePlot.setSectionPaint("chemistry", new Color(60,60,60)  ;
        PiePlot.setSectionPaint("history", new Color(0,0,102) ; 
        PiePlot.setSectionPaint("ODE", new Color(10,100,202) ;

        PiePlot.setBackgroundPaint(color.white);

        // create chartPanel to display the chart/graph
         
    }
}