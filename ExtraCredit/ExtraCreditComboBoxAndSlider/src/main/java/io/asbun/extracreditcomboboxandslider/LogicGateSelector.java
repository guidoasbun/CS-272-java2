package io.asbun.extracreditcomboboxandslider;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Collections;

public class LogicGateSelector extends Application
{
    String[] gateList = new String[]{"NOT", "AND", "OR", "XOR", "XNOR", "NAND", "NOR"};

    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("Logic Gate Selector");
        primaryStage.setWidth(480);
        primaryStage.setHeight(270);

        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);

        // Combo Box
        HBox comboBoxContainer = new HBox();
        comboBoxContainer.setSpacing(50);
        comboBoxContainer.setAlignment(Pos.CENTER);

        ComboBox<String> comboBox = new ComboBox<>();
        ObservableList<String> list = comboBox.getItems();
        Collections.addAll(list, gateList);
        comboBox.setValue("NAND");

        Label gateLabel = new Label("Gate");

        comboBoxContainer.getChildren().addAll(gateLabel,comboBox);

        // Slider
        HBox sliderContainer = new HBox();
        sliderContainer.setSpacing(50);
        sliderContainer.setAlignment(Pos.CENTER);

        Slider slider = new Slider();
        slider.setMin(2);
        slider.setMax(4);
        slider.setShowTickLabels(true);
        slider.setMaxWidth(200);
        slider.setMajorTickUnit(1);

        Label sliderLabel = new Label("Number of Inputs");

        sliderContainer.getChildren().addAll(sliderLabel,slider);

        // Button
        HBox buttonContainer = new HBox();
        buttonContainer.setSpacing(50);
        buttonContainer.setAlignment(Pos.CENTER);

        Button button = new Button("Select");

        buttonContainer.getChildren().add(button);

        // Add all containers to the VBox
        vbox.getChildren().addAll(comboBoxContainer, sliderContainer, buttonContainer);

        // Set the scene
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }
}