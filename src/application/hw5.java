package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.Chart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;



public class hw5 extends Application {
	@SuppressWarnings("unchecked")
	@Override
	//Cameron Bolanos
	//CS2450
	//3-18-22
	//Homework 5
	
	public void start(Stage primaryStage) {
	
		CategoryAxis hAxis = new CategoryAxis();
		hAxis.setLabel("NFL Teams");

		NumberAxis vAxis = new NumberAxis();
		vAxis.setLabel("Points per Month");

		StackedBarChart<String, Number> chart1 = new StackedBarChart<>(hAxis, vAxis);

		XYChart.Series<String, Number> janPoints = new XYChart.Series<>();
		janPoints.setName("January");
		janPoints.getData().add(new XYChart.Data<>("LA Rams", 146));
		janPoints.getData().add(new XYChart.Data<>("Las Vegas Raiders", 113));
		janPoints.getData().add(new XYChart.Data<>("Kansas City Chiefs", 174));

		XYChart.Series<String, Number> febPoints = new XYChart.Series<>();
		febPoints.setName("February");
		febPoints.getData().add(new XYChart.Data<>("LA Rams", 122));
		febPoints.getData().add(new XYChart.Data<>("Las Vegas Raiders", 133));
		febPoints.getData().add(new XYChart.Data<>("Kansas City Chiefs", 154));

		XYChart.Series<String, Number> marPoints = new XYChart.Series<>();
		marPoints.setName("March");
		marPoints.getData().add(new XYChart.Data<>("LA Rams", 137));
		marPoints.getData().add(new XYChart.Data<>("Las Vegas Raiders", 129));
		marPoints.getData().add(new XYChart.Data<>("Kansas City Chiefs", 144));

		chart1.getData().addAll(janPoints, febPoints, marPoints);
		chart1.setPrefSize(600, 600);

		CategoryAxis hAxis2 = new CategoryAxis();
		hAxis.setLabel("NFL Teams");

		NumberAxis vAxis2 = new NumberAxis();
		vAxis.setLabel("Points per Month");
		
		ScatterChart<String, Number> chart2 = new ScatterChart<>(hAxis2, vAxis2);

		XYChart.Series<String, Number> jan2Points = new XYChart.Series<>();
		jan2Points.setName("January");
		jan2Points.getData().add(new XYChart.Data<>("LA Rams", 146));
		jan2Points.getData().add(new XYChart.Data<>("Las Vegas Raiders", 113));
		jan2Points.getData().add(new XYChart.Data<>("Kansas City Chiefs", 174));

		XYChart.Series<String, Number> feb2Points = new XYChart.Series<>();
		feb2Points.setName("February");
		feb2Points.getData().add(new XYChart.Data<>("LA Rams", 122));
		feb2Points.getData().add(new XYChart.Data<>("Las Vegas Raiders", 133));
		feb2Points.getData().add(new XYChart.Data<>("Kansas City Chiefs", 154));

		XYChart.Series<String, Number> mar2Points = new XYChart.Series<>();
		mar2Points.setName("March");
		mar2Points.getData().add(new XYChart.Data<>("LA Rams", 137));
		mar2Points.getData().add(new XYChart.Data<>("Las Vegas Raiders", 129));
		mar2Points.getData().add(new XYChart.Data<>("Kansas City Chiefs", 144));

		chart2.getData().addAll(jan2Points, feb2Points, mar2Points);
		chart2.setPrefSize(600, 600);
		
		CategoryAxis hAxis3 = new CategoryAxis();
		hAxis.setLabel("NFL Teams");

		NumberAxis vAxis3 = new NumberAxis();
		vAxis.setLabel("Points per Month");

		AreaChart<String, Number> chart3 = new AreaChart<>(hAxis3, vAxis3);

		XYChart.Series<String, Number> jan3Points = new XYChart.Series<>();
		jan3Points.setName("January");
		jan3Points.getData().add(new XYChart.Data<>("LA Rams", 146));
		jan3Points.getData().add(new XYChart.Data<>("Las Vegas Raiders", 113));
		jan3Points.getData().add(new XYChart.Data<>("Kansas City Chiefs", 174));

		XYChart.Series<String, Number> feb3Points = new XYChart.Series<>();
		feb3Points.setName("February");
		feb3Points.getData().add(new XYChart.Data<>("LA Rams", 122));
		feb3Points.getData().add(new XYChart.Data<>("Las Vegas Raiders", 133));
		feb3Points.getData().add(new XYChart.Data<>("Kansas City Chiefs", 154));

		XYChart.Series<String, Number> mar3Points = new XYChart.Series<>();
		mar3Points.setName("March");
		mar3Points.getData().add(new XYChart.Data<>("LA Rams", 137));
		mar3Points.getData().add(new XYChart.Data<>("Las Vegas Raiders", 129));
		mar3Points.getData().add(new XYChart.Data<>("Kansas City Chiefs", 144));

		chart3.getData().addAll(jan3Points, feb3Points, mar3Points);
		chart3.setPrefSize(600, 600);
		
		CategoryAxis hAxis4 = new CategoryAxis();
		hAxis.setLabel("NFL Teams");

		NumberAxis vAxis4 = new NumberAxis();
		vAxis.setLabel("Points per Month");
		
		LineChart<String, Number> chart4 = new LineChart<>(hAxis4, vAxis4);

		XYChart.Series<String, Number> jan4Points = new XYChart.Series<>();
		jan4Points.setName("January");
		jan4Points.getData().add(new XYChart.Data<>("LA Rams", 146));
		jan4Points.getData().add(new XYChart.Data<>("Las Vegas Raiders", 113));
		jan4Points.getData().add(new XYChart.Data<>("Kansas City Chiefs", 174));

		XYChart.Series<String, Number> feb4Points = new XYChart.Series<>();
		feb4Points.setName("February");
		feb4Points.getData().add(new XYChart.Data<>("LA Rams", 122));
		feb4Points.getData().add(new XYChart.Data<>("Las Vegas Raiders", 133));
		feb4Points.getData().add(new XYChart.Data<>("Kansas City Chiefs", 154));

		XYChart.Series<String, Number> mar4Points = new XYChart.Series<>();
		mar4Points.setName("March");
		mar4Points.getData().add(new XYChart.Data<>("LA Rams", 137));
		mar4Points.getData().add(new XYChart.Data<>("Las Vegas Raiders", 129));
		mar4Points.getData().add(new XYChart.Data<>("Kansas City Chiefs", 144));

		chart4.getData().addAll(jan4Points, feb4Points, mar4Points);
		chart4.setPrefSize(600, 600);
		
		VBox vbox = new VBox(chart1, chart2);
		VBox vbox2 = new VBox(chart3, chart4);
		vbox.setSpacing(10);
		vbox2.setSpacing(10);

		
		HBox hbox = new HBox(vbox, vbox2);
		hbox.setSpacing(10);

		BorderPane root = new BorderPane(hbox);
		Scene scene = new Scene(root, 800,800);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Homework 5");
		primaryStage.show();
}
	
	public static void main(String[] args) {
		launch(args);
	}
}
