package io.asbun.extracreditmainmenu;
//Programmer Guido Asbun

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class IntegratedCircuitDesign extends Application
{
    Stage window;
    BorderPane layout;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        window = primaryStage;
        window.setTitle("Integrated Circuit Design");

        // Menu Bar
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu components = new Menu("Components");
        Menu viewMenu = new Menu("View");
        Menu helpMenu = new Menu("Help");

        // File menu items
        fileMenu.getItems().add(new MenuItem("New"));
        fileMenu.getItems().add(new MenuItem("Open"));
        fileMenu.getItems().add(new MenuItem("Save"));

        // Edit menu items
        editMenu.getItems().add(new MenuItem("Copy"));
        editMenu.getItems().add(new MenuItem("Paste"));
        editMenu.getItems().add(new MenuItem("Undo"));
        editMenu.getItems().add(new MenuItem("Redo"));

        // Components menu items
        // Standard Components
        Menu standardSubmenu = new Menu("Standard");
        components.getItems().add(standardSubmenu);
        standardSubmenu.getItems().add(new MenuItem("Input"));
        standardSubmenu.getItems().add(new MenuItem("Connector"));
        standardSubmenu.getItems().add(new MenuItem("Output"));

        // Components menu items
        // Logic Gates
        Menu logicGatesSubmenu = new Menu("Logic Gates");
        components.getItems().add(logicGatesSubmenu);
        logicGatesSubmenu.getItems().add(new MenuItem("AND"));
        logicGatesSubmenu.getItems().add(new MenuItem("OR"));
        logicGatesSubmenu.getItems().add(new MenuItem("NOT"));
        logicGatesSubmenu.getItems().add(new MenuItem("NAND"));
        logicGatesSubmenu.getItems().add(new MenuItem("NOR"));
        logicGatesSubmenu.getItems().add(new MenuItem("XOR"));
        logicGatesSubmenu.getItems().add(new MenuItem("XNOR"));

        // Components menu items
        // Combinational Logic
        Menu combinationalLogicSubmenu = new Menu("Combinational Logic");
        components.getItems().add(combinationalLogicSubmenu);
        combinationalLogicSubmenu.getItems().add(new MenuItem("Half Adder"));
        combinationalLogicSubmenu.getItems().add(new MenuItem("Full Adder"));
        combinationalLogicSubmenu.getItems().add(new MenuItem("Multiplexor"));
        combinationalLogicSubmenu.getItems().add(new MenuItem("Demultiplexor"));

        // View menu items
        viewMenu.getItems().add(new MenuItem("Actual Size"));
        viewMenu.getItems().add(new MenuItem("Zoom In"));
        viewMenu.getItems().add(new MenuItem("Zoom Out"));

        // Help menu items
        helpMenu.getItems().add(new MenuItem("Version"));

        // Main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu);
        menuBar.getMenus().addAll(editMenu);
        menuBar.getMenus().addAll(components);
        menuBar.getMenus().addAll(viewMenu);
        menuBar.getMenus().addAll(helpMenu);

        // Display
        layout = new BorderPane();
        layout.setTop(menuBar);
        Scene scene = new Scene(layout, 480, 270);
        window.setScene(scene);
        window.show();
    }

}