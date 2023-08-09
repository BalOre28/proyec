package com.mycompany.proyecto2_progra;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TableroLogicMain implements ActionListener {

    Random rndm = new Random();
    private char TurnoJugador = '1';
    private String[][] Tablero = new String[6][6];
    private String PosicionActual;
    private String PosicionNueva = null;
    private String PosicionAntigua = null;
    private String[][] Fantasmas = new String[4][4];
    private int x;
    private int y;
    private Usuario User1;
    private Usuario User2;

    public TableroLogicMain(Usuario usuario1, Usuario usuario2) {
        iniciartablero();
        User1 = usuario1;
        User2 = usuario2;
        TABLEROGHOSTS TG = new TABLEROGHOSTS(User1, User2);
        TG.setVisible(true);
        añadirActionEvents();

    }

    private void iniciartablero() {
        for (int ejex = 0; ejex < 6; ejex++) {
            for (int ejey = 0; ejey < 6; ejey++) {
                Tablero[ejex][ejey] = "";
            }
        }
        Tablero[0][0] = "SALIDA";
        Tablero[0][5] = "SALIDA";
        Tablero[5][0] = "SALIDA";
        Tablero[5][5] = "SALIDA";

        ConfiguracionLogica CONF = new ConfiguracionLogica();
        if (CONF.Dificultad() == 4) {
            Fantasmas[0] = new String[4];
            Fantasmas[0][0] = "1B_FANTASMAS";
            Fantasmas[0][1] = "1B_FANTASMAS";
            Fantasmas[0][2] = "1B_FANTASMAS";
            Fantasmas[0][3] = "1B_FANTASMAS";
            Fantasmas[1] = new String[4];
            Fantasmas[1][0] = "1M_FANTASMAS";
            Fantasmas[1][1] = "1M_FANTASMAS";
            Fantasmas[1][2] = "1M_FANTASMAS";
            Fantasmas[1][3] = "1M_FANTASMAS";
            Fantasmas[2] = new String[4];
            Fantasmas[2][0] = "2B_FANTASMAS";
            Fantasmas[2][1] = "2B_FANTASMAS";
            Fantasmas[2][2] = "2B_FANTASMAS";
            Fantasmas[2][3] = "2B_FANTASMAS";
            Fantasmas[3] = new String[4];
            Fantasmas[3][0] = "2M_FANTASMAS";
            Fantasmas[3][1] = "2M_FANTASMAS";
            Fantasmas[3][2] = "2M_FANTASMAS";
            Fantasmas[3][3] = "2M_FANTASMAS";
        } else if (CONF.Dificultad() == 2) {
            Fantasmas[0] = new String[2];
            Fantasmas[0][0] = "1B_FANTASMAS";
            Fantasmas[0][1] = "1B_FANTASMAS";
            Fantasmas[1] = new String[2];
            Fantasmas[1][0] = "1M_FANTASMAS";
            Fantasmas[1][1] = "1M_FANTASMAS";
            Fantasmas[2] = new String[2];
            Fantasmas[2][0] = "2B_FANTASMAS";
            Fantasmas[2][1] = "2B_FANTASMAS";
            Fantasmas[3] = new String[2];
            Fantasmas[3][0] = "2M_FANTASMAS";
            Fantasmas[3][1] = "2M_FANTASMAS";
        } else if (CONF.Dificultad() == 1) {
            Fantasmas[0] = new String[1];
            Fantasmas[0][0] = "1B_FANTASMAS";
            Fantasmas[1] = new String[1];
            Fantasmas[1][0] = "1M_FANTASMAS";
            Fantasmas[2] = new String[1];
            Fantasmas[2][0] = "2B_FANTASMAS";
            Fantasmas[3] = new String[1];
            Fantasmas[3][0] = "2M_FANTASMAS";
        }

        /*
        
        if (CONF.ModoDeJuego() == false) {

            String[] Posiciones = new String[(Fantasmas[1].length * 2)];
            String[] Posiciones2 = new String[(Fantasmas[1].length * 2)];
            String posiciones;
            int numejex, numejey;
            boolean finalizar = false;

            while (finalizar == false) {
                numejex = rndm.nextInt(0, 1);
                if (numejex == 0) {
                    numejey = rndm.nextInt(1, 4);
                } else {
                    numejey = rndm.nextInt(0, 5);
                }

                posiciones = numejex + "" + numejey;
                boolean terminar = false;
                while (terminar == false) {
                    int contador = 0;

                    if (!Posiciones[contador].equalsIgnoreCase(posiciones)) {
                        if (Posiciones[contador] == null) {
                            Posiciones[contador] = posiciones;
                            terminar = true;
                        } else {
                            terminar = true;
                        }
                        if (contador == ((Fantasmas[1].length * 2) - 1)) {
                            finalizar = true;
                        }
                    }
                    contador++;
                }
            }

            while (finalizar == false) {
                numejex = rndm.nextInt(4, 5);
                if (numejex == 5) {
                    numejey = rndm.nextInt(1, 4);
                } else {
                    numejey = rndm.nextInt(0, 5);
                }

                posiciones = numejex + "" + numejey;
                boolean terminar = false;
                while (terminar == false) {
                    int contador = 0;

                    if (!Posiciones2[contador].equalsIgnoreCase(posiciones)) {
                        if (Posiciones2[contador] == null) {
                            Posiciones2[contador] = posiciones;
                            terminar = true;
                        } else {
                            terminar = true;
                        }
                        if (contador == ((Fantasmas[1].length * 2) - 1)) {
                            finalizar = true;
                        }
                    }
                    contador++;
                }
            }
            int contador3 = 0;
            int xeje = 0;
            int yeje = 0;
            for (int contador = 0; contador < 6; contador++) {
                for (int contador2 = 0; contador2 < 6; contador2++) {
                    int x = Posiciones[contador3].charAt(0);
                    int y = Posiciones[contador3].charAt(1);
                    Tablero[x][y] = Fantasmas[xeje][yeje];
                    contador3++;
                    if (contador3 == Fantasmas[1].length) {
                        contador3 = 0;
                    }
                    yeje++;
                    if (yeje == Fantasmas[1].length) {
                        yeje = 0;
                    }
                }
                xeje++;
                if (xeje == 4) {
                    xeje = 0;
                }
            }
            contador3 = 0;
            xeje = 0;
            yeje = 0;
            for (int contador = 0; contador < 6; contador++) {
                for (int contador2 = 0; contador2 < 6; contador2++) {
                    int x = Posiciones2[contador3].charAt(0);
                    int y = Posiciones2[contador3].charAt(1);
                    Tablero[x][y] = Fantasmas[xeje][yeje];
                    contador3++;
                    if (contador3 == Fantasmas[1].length) {
                        contador3 = 0;
                    }
                    yeje++;
                    if (yeje == Fantasmas[1].length) {
                        yeje = 0;
                    }
                }
                xeje++;
                if (xeje == 4) {
                    xeje = 0;
                }
            }

        }
         */
    }

    private void TableroEnPantalla() {

    }

    private void añadirActionEvents() {
        TABLEROGHOSTS TG = new TABLEROGHOSTS(User1,User2);

        TG.T00.addActionListener(this);
        TG.T01.addActionListener(this);
        TG.T03.addActionListener(this);
        TG.T04.addActionListener(this);
        TG.T05.addActionListener(this);

        TG.T10.addActionListener(this);
        TG.T11.addActionListener(this);
        TG.T13.addActionListener(this);
        TG.T14.addActionListener(this);
        TG.T15.addActionListener(this);

        TG.T20.addActionListener(this);
        TG.T21.addActionListener(this);
        TG.T23.addActionListener(this);
        TG.T24.addActionListener(this);
        TG.T25.addActionListener(this);

        TG.T30.addActionListener(this);
        TG.T31.addActionListener(this);
        TG.T33.addActionListener(this);
        TG.T34.addActionListener(this);
        TG.T35.addActionListener(this);

        TG.T40.addActionListener(this);
        TG.T41.addActionListener(this);
        TG.T43.addActionListener(this);
        TG.T44.addActionListener(this);
        TG.T45.addActionListener(this);

        TG.T50.addActionListener(this);
        TG.T51.addActionListener(this);
        TG.T53.addActionListener(this);
        TG.T54.addActionListener(this);
        TG.T55.addActionListener(this);
    }

    private boolean MovimientoLegal(String PosAntigua, String PosNueva) {
        int xAnt = PosAntigua.charAt(0);
        int yAnt = PosAntigua.charAt(1);
        int xNue = PosNueva.charAt(0);
        int yNue = PosNueva.charAt(1);
        if ((xAnt == xNue) && ((yAnt + 1) == yNue) || (xAnt == xNue) && ((yAnt - 1) == yNue)) {
            return true;
        } else if (((yAnt == yNue) && ((xAnt + 1) == xNue)) || (yAnt == yNue) && ((xAnt - 1) == xNue)) {
            return true;
        }
        return false;
    }

    public void actionPerformed(ActionEvent ae) {
        if (TurnoJugador == '1') {

            PosicionActual = getBotonPosicionString(ae.getSource());

            if (ComprobarFantasma(PosicionActual) == true) {
                PosicionAntigua = PosicionActual;
            } else if (PosicionAntigua != null) {
                PosicionNueva = PosicionActual;

                CambiarFantasmas(PosicionAntigua, PosicionNueva);
                PosicionNueva = null;
                PosicionActual = null;

            }
        }

    }

    private void CambiarFantasmas(String PosAntigua, String PosNueva) {
        CambiarEnSistema(PosAntigua, PosNueva);
        CambiarEnPantalla(PosAntigua, PosNueva);
    }

    private boolean ComprobarFantasma(String posicion) {
        int x = Character.getNumericValue(posicion.charAt(0));
        int y = Character.getNumericValue(posicion.charAt(1));
        if (!Tablero[x][y].equalsIgnoreCase("")) {
            if (Tablero[x][y].charAt(0) == 1) {
                return true;
            } else {
                return false;
            }

        }
        return false;
    }

    private void CambiarEnPantalla(String PosAntigua, String PosNueva) {
        boton(PosAntigua).setIcon(null);
        boton(PosNueva).setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyecto2_progra/TrueFantasma.2.png")));

    }

    private boolean MovimientoPossibles(String[][] tabelero, String PosAntigua, String PosNueva) {
        return true;
    }

    private void CambiarEnSistema(String PosAntigua, String PosNueva) {
        int xAnt = Character.getNumericValue(PosAntigua.charAt(0));
        int yAnt = Character.getNumericValue(PosAntigua.charAt(1));

        int xNue = Character.getNumericValue(PosNueva.charAt(0));
        int yNue = Character.getNumericValue(PosNueva.charAt(1));

        Tablero[xNue][yNue] = Tablero[xAnt][yAnt];
        Tablero[xAnt][yAnt] = null;

    }

    public JButton boton(String Posicion) {
       TABLEROGHOSTS TG = new TABLEROGHOSTS(User1,User2);
        if (Posicion.equalsIgnoreCase("00")) {
            return TG.T00;
        } else if (Posicion.equalsIgnoreCase("01")) {
            return TG.T01;
        } else if (Posicion.equalsIgnoreCase("02")) {
            return TG.T02;
        } else if (Posicion.equalsIgnoreCase("03")) {
            return TG.T03;
        } else if (Posicion.equalsIgnoreCase("04")) {
            return TG.T04;
        } else if (Posicion.equalsIgnoreCase("05")) {
            return TG.T05;
        } else if (Posicion.equalsIgnoreCase("10")) {
            return TG.T10;
        } else if (Posicion.equalsIgnoreCase("11")) {
            return TG.T11;
        } else if (Posicion.equalsIgnoreCase("12")) {
            return TG.T12;
        } else if (Posicion.equalsIgnoreCase("13")) {
            return TG.T13;
        } else if (Posicion.equalsIgnoreCase("14")) {
            return TG.T14;
        } else if (Posicion.equalsIgnoreCase("15")) {
            return TG.T15;
        } else if (Posicion.equalsIgnoreCase("20")) {
            return TG.T20;
        } else if (Posicion.equalsIgnoreCase("21")) {
            return TG.T21;
        } else if (Posicion.equalsIgnoreCase("22")) {
            return TG.T22;
        } else if (Posicion.equalsIgnoreCase("23")) {
            return TG.T23;
        } else if (Posicion.equalsIgnoreCase("24")) {
            return TG.T24;
        } else if (Posicion.equalsIgnoreCase("25")) {
            return TG.T25;
        } else if (Posicion.equalsIgnoreCase("30")) {
            return TG.T30;
        } else if (Posicion.equalsIgnoreCase("31")) {
            return TG.T31;
        } else if (Posicion.equalsIgnoreCase("32")) {
            return TG.T32;
        } else if (Posicion.equalsIgnoreCase("33")) {
            return TG.T33;
        } else if (Posicion.equalsIgnoreCase("34")) {
            return TG.T34;
        } else if (Posicion.equalsIgnoreCase("35")) {
            return TG.T35;
        } else if (Posicion.equalsIgnoreCase("40")) {
            return TG.T40;
        } else if (Posicion.equalsIgnoreCase("41")) {
            return TG.T41;
        } else if (Posicion.equalsIgnoreCase("42")) {
            return TG.T42;
        } else if (Posicion.equalsIgnoreCase("43")) {
            return TG.T43;
        } else if (Posicion.equalsIgnoreCase("44")) {
            return TG.T44;
        } else if (Posicion.equalsIgnoreCase("45")) {
            return TG.T45;
        } else if (Posicion.equalsIgnoreCase("50")) {
            return TG.T50;
        } else if (Posicion.equalsIgnoreCase("51")) {
            return TG.T51;
        } else if (Posicion.equalsIgnoreCase("52")) {
            return TG.T52;
        } else if (Posicion.equalsIgnoreCase("53")) {
            return TG.T53;
        } else if (Posicion.equalsIgnoreCase("54")) {
            return TG.T54;
        } else if (Posicion.equalsIgnoreCase("55")) {
            return TG.T55;
        }
        return null;
    }

    private String getBotonPosicionString(Object boton) {
        TABLEROGHOSTS TG = new TABLEROGHOSTS(User1,User2);
        if (boton == TG.T00) {
            return "00";
        } else if (boton == TG.T01) {
            return "01";
        } else if (boton == TG.T02) {
            return "02";
        } else if (boton == TG.T03) {
            return "03";
        } else if (boton == TG.T04) {
            return "04";
        } else if (boton == TG.T05) {
            return "05";
        } else if (boton == TG.T10) {
            return "10";
        } else if (boton == TG.T11) {
            return "11";
        } else if (boton == TG.T12) {
            return "12";
        } else if (boton == TG.T13) {
            return "13";
        } else if (boton == TG.T14) {
            return "14";
        } else if (boton == TG.T15) {
            return "15";
        } else if (boton == TG.T20) {
            return "20";
        } else if (boton == TG.T21) {
            return "21";
        } else if (boton == TG.T22) {
            return "22";
        } else if (boton == TG.T23) {
            return "23";
        } else if (boton == TG.T24) {
            return "24";
        } else if (boton == TG.T25) {
            return "25";
        } else if (boton == TG.T30) {
            return "30";
        } else if (boton == TG.T31) {
            return "31";
        } else if (boton == TG.T32) {
            return "32";
        } else if (boton == TG.T33) {
            return "33";
        } else if (boton == TG.T34) {
            return "34";
        } else if (boton == TG.T35) {
            return "35";
        } else if (boton == TG.T40) {
            return "40";
        } else if (boton == TG.T41) {
            return "41";
        } else if (boton == TG.T42) {
            return "42";
        } else if (boton == TG.T43) {
            return "43";
        } else if (boton == TG.T44) {
            return "44";
        } else if (boton == TG.T45) {
            return "45";
        } else if (boton == TG.T50) {
            return "50";
        } else if (boton == TG.T51) {
            return "51";
        } else if (boton == TG.T52) {
            return "52";
        } else if (boton == TG.T53) {
            return "53";
        } else if (boton == TG.T54) {
            return "54";
        } else if (boton == TG.T55) {
            return "55";
        }
        return null;
    }

}
