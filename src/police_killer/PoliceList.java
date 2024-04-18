package police_killer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PoliceList {

    public static Police[] getPolice() throws IOException, FileNotFoundException {
        String cadena;
        int i = 0;

        String[] columna = new String[10];
        Police[] pol = new Police[464];
        File obj = new File("police_killings.csv");
        BufferedReader buffer = new BufferedReader(new FileReader(obj));

        buffer.readLine();
        while ((cadena = buffer.readLine()) != null) {
            columna = cadena.split(",");
            Police polices = new Police(columna[0], Integer.parseInt(columna[1]), columna[2], columna[3], columna[4], Integer.parseInt(columna[5]), Integer.parseInt(columna[6]), columna[7], columna[8], columna[9]);
            pol[i++] = polices;
        }
        return pol;
    }

    public int busquedaSecuencial(String nombre) throws IOException {
        Police[] p = getPolice();
        int result = -1;
        try {
            for (int i = 0; i < p.length; i++) {
                if (p[i].getName().equals(nombre)) {
                    result = i;
                    break;
                }
            }
        } catch (NullPointerException e) {
            result = -1;
        }
        return result;
    }
}
