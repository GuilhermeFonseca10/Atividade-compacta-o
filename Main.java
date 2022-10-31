
import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    String texto = "TAAATGGGCCGGACCGGGCCGGCCCAGCAGGAAAAGAAGGCGCGCACTAAT";
    if (texto.length() % 2 == 1) {
      texto = texto + " ";
    }
    byte[] sequenciaConvertida = new byte[texto.length() / 2];
    int cont = 0;
    int aux = 0;
    HashMap<String, Byte> converter = new HashMap<String, Byte>();
    HashMap<Byte, String> re_converter = new HashMap<Byte, String>();

    for (int i = 0; i < texto.length(); i = i + 2) {
      if (converter.get(texto.substring(i, i + 2)) == null) {
        converter.put(texto.substring(i, i + 2), (byte) cont);
        re_converter.put((byte) cont, texto.substring(i, i + 2));
        cont++;
      }
      aux = i / 2;
      sequenciaConvertida[aux] = converter.get(texto.substring(i, i + 2));
    }
    System.out.println("Caracteres Convertida: " + sequenciaConvertida.length); // );
    for (int i = 0; i < sequenciaConvertida.length; i++) {
      System.out.print(sequenciaConvertida[i] + " ");
    }
    System.out.println("");
    System.out.println("Caracteres Re-Convertida: " + texto.length());
    for (int i = 0; i < sequenciaConvertida.length; i++) {
      System.out.print(re_converter.get(sequenciaConvertida[i]));
      
    }
System.out.println(converter);
  }

}