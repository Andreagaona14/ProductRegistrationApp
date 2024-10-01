package com.inventario.model;
//En la linea 1 se define el paquete en el que se encuentra esta clase

import javax.swing.table.AbstractTableModel;
import java.util.List;
import java.util.ArrayList;
//Importación de las clases para la interfaz

public class ProductTableModel extends AbstractTableModel {
    //Declara la clase y la extiende, esto significa que esta clase es una ventana de la interfaz gráfica
    private final List<Product> productList;
    private final String[] columnNames = {"ID", "Nombre", "Precio", "Cantidad"};

    public ProductTableModel() {
        this.productList = new ArrayList<>();
    }

    // Implementa los métodos requeridos (getRowCount, getColumnCount, getValueAt)
    // Agrega el método addProduct
}
