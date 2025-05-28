import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface TextFieldListener {
    void textChanged(String newText);
    void onFocus();
}

class Implementacion implements TextFieldListener {
    @Override
    public void textChanged(String newText) {
        System.out.println(newText);
    }

    @Override
    public void onFocus() {
        System.out.println("Text Field is focused");
    }
}

class MainClasesAnonimas {
    public static void main(String[] args) {
        // Clase Anonima
        TextFieldListener listener = new TextFieldListener() {
            @Override
            public void textChanged(String newText) {
                System.out.println(newText);
            }

            @Override
            public void onFocus() {
                System.out.println("Text Field is focused");
            }
        };
        TextField textField = new TextField();
        textField.listener = listener;
        // Codigo UI
        textField.focus();
        textField.changeText("nuevo texto");
        // Arreglos especiales que no necesitan definir tamaño desde el inicio
        ArrayList<String> list = new ArrayList<>();
        list.add("");
//        imprimir(listener);
    }

    public static <T extends Nueva & TextFieldListener> void imprimir(T param) {
        System.out.println(param);
        param.textChanged("");
        TextFieldListener listener = (TextFieldListener) param;
        listener.textChanged("Texto con Generics");
    }
}
interface NuevaInterfaz {}
abstract class Nueva {}
abstract class Otro {}

//TextField campo = new TextField();
//campo.listener = listener;

class TextField {
    TextFieldListener listener;
    void focus() {
        //
        listener.onFocus();
    }
    void changeText(String newText) {
        //
        listener.textChanged(newText);
    }
}
