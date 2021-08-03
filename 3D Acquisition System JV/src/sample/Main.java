package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javafx.stage.WindowEvent;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.videoio.*;
import javax.swing.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();

//        FXMLLoader loader = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        BorderPane root = (BorderPane) loader.load();
//        Controller controller = loader.getController();
//
//        //test kamery
//        Mat mat = new Mat();
//        VideoCapture camera = new VideoCapture(0);
//
//        primaryStage.setTitle("camera 0");
//        Scene scene = new Scene(root, 300, 275);

        try {
            // load the FXML resource
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));

            // store the root element so that the controllers can use it
            BorderPane rootElement = (BorderPane) loader.load();

            // create and style a scene
            Scene scene = new Scene(rootElement, 1280, 720);
//            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

            // create the stage with the given title and the previously created
            // scene
            primaryStage.setTitle("JavaFX meets OpenCV");
            primaryStage.setScene(scene);

            // show the GUI
            primaryStage.show();

            // set the proper behavior on closing the application
            Controller controller = loader.getController();
            primaryStage.setOnCloseRequest((new EventHandler<WindowEvent>() {
                public void handle(WindowEvent we)
                {
                    controller.setClosed();
                }
            }));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

//        load the native OpenCV library
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);


//        Mat mat = Mat.eye(3, 3, CvType.CV_8UC1);
//        System.out.println("mat = " + mat.dump());
//
//        Mat frame = new Mat();
//        VideoCapture camera = new VideoCapture(0);
//        JFrame jframe = new JFrame("camera 0");
//        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JLabel vidpanel = new JLabel();
//        jframe.setContentPane(vidpanel);
//        jframe.setVisible(true);
//        try {
//            while (true) {
//                if (camera.read(frame)) {
//
//                    ImageIcon image = new ImageIcon(Mat2BufferedImage.Mat2BufferedImage(frame));
//                    vidpanel.setIcon(image);
//                    vidpanel.repaint();
//
//                }
//            }
//        } catch (Exception e) {
//
//        }

//        ta metoda uruchamia javafx
        launch(args);
    }
}
