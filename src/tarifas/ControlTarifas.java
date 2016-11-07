/*
 * Copyright (C) 2015 Luis Hurtado <luis.9499@hotmail.com>
 * ----------------------------------------------------------------------------
 * "THE BEER-WARE LICENSE" (Revision 1.0):
 *  <luis.9499@hotmail.com> wrote this file. As long as you retain this notice you
 *  can do whatever you want with this stuff. If we meet some day, and you think
 *  this stuff is worth it, you can buy me a beer in return
 *  ----------------------------------------------------------------------------
 */

package tarifas;

import javax.swing.JOptionPane;

/**
 * Clase para realizar los calculos de la tarifa del periodo, subsidios y contribuciones
 * @author Luis Hurtado <luis.9499@hotmail.com>
 * @date 20/12/2015
 * @version 1.1
 */
public class ControlTarifas {

    /**
     * Lista de Tarifas
     */
    double cuMar = 421.2055;
    double cuAbr = 441.5962;
    double cuMay = 418.0969;
    double cuJun = 454.1752;
    double cuJul = 437.8377;
    double cuAgo = 442.1986;
    double cuSep = 451.0422;
    double cuOct = 460.0631;
    double cuNov = 469.2643;
    double cuDic = 478.6496;
    double cuEne = 488.2226;
    double cuFeb16= 497.9871;
    double cuMar16= 507.9468;
    double cuAbr16=518.1057;
    double cuMay16=518.1057;
    double cuJun16=518.1057;
    double cuJul16=518.1057;
    double cuAgo16=518.1057;
    double cuSep16=528.4679;
    double cuOct16=539.0372;
    /**
     * Metodo para comparar estratos
     * @param estAct
     * @param estReal
     * @return Comparacion de estratos
     */
    public boolean comparaEstrato(int estAct, int estReal) {

        boolean compara = true;
        if (estAct <= estReal) {
            compara = false;
            JOptionPane.showMessageDialog(null, "Estrato Inferior o igual al Actual\n Verifique estrato actual y real");
        }
        return compara;
    }
    /**
     * Metodo para validar consumo 0
     * @param consumo
     * @return Validacion de consumo
     */
    public boolean validaConsumo(int consumo) {

        boolean valida = true;
        if (consumo <= 0) {
            valida = false;
            JOptionPane.showMessageDialog(null, "Consumo igual o menor a 0\n Verifique consumo ingresado");
        }
        return valida;
    }
    /**
     * Metodo para calcular el % de Subsidio o Contribución
     * @param estrato
     * @return porcentaje de subsidio o contribución
     */
    public double calPorctSubs(int estrato) {
        double porcSubs = 0;

        if (estrato == 1) {
            porcSubs = 0.6;
        }
        if (estrato == 2) {
            porcSubs = 0.5;
        }
        if (estrato == 3) {
            porcSubs = 0.15;
        }
        return porcSubs;
        }
    /**
     * Entrega valor en $ del periodo seleccionado
     * @param periodo
     * @return Valor del CU para el periodo
     */
    public double calPeriodo(int periodo) {
        double result = 0;
        if (periodo == 201611) {
            result = cuOct16;
        }
        if (periodo == 201610) {
            result = cuSep16;
        }
        if (periodo == 201609) {
            result = cuAgo16;
        }
        if (periodo == 201608) {
            result = cuJul16;
        }
        if (periodo == 201607) {
            result = cuJun16;
        }
        if (periodo == 201606) {
            result = cuMay16;
        }
        if (periodo == 201605) {
            result = cuAbr16;
        }
        if (periodo == 201604) {
            result = cuMar16;
        }
        if (periodo == 201603) {
            result = cuFeb16;
        }
        if (periodo == 201602) {
            result = cuEne;
        }
        if (periodo == 201601) {
            result = cuDic;
        }
        if (periodo == 201512) {
            result = cuNov;
        }
        if (periodo == 201511) {
            result = cuOct;
        }
        if (periodo == 201510) {
            result = cuSep;
        }
        if (periodo == 201509) {
            result = cuAgo;
        }
        if (periodo == 201508) {
            result = cuJul;
        }
        if (periodo == 201507) {
            result = cuJun;
        }
        if (periodo == 201506) {
            result = cuMay;
        }
        if (periodo == 201505) {
            result = cuAbr;
        }
        if (periodo == 201504) {
            result = cuMar;
        }
        return result;
    }
    /**
     * Calcula el valor del consumo
     * @param estrato
     * @param consumo
     * @param periodo
     * @return Valor del consumo
     */
    public double valorConsumo(int estrato, int consumo, int periodo) {

        double valorConsumo = 0;
        if (estrato < 4) {
            valorConsumo = (consumo * calPeriodo(periodo)) - (calSubsidio(consumo, estrato, periodo));
        }
        if (estrato == 4) {
            valorConsumo = consumo * calPeriodo(periodo);
        }
        if (estrato > 4) {
            valorConsumo = consumo * calPeriodo(periodo) * 1.2;
        }
        return valorConsumo;
    }
    /**
     * Calcula Valor del Subsidio
     * @param consumo
     * @param estrato
     * @param periodo
     * @return Valor del Subsidio
     */
    public double calSubsidio(int consumo, int estrato, int periodo) {

        double subsidio = 0;
        if (consumo <= 130) {
            subsidio = consumo * calPeriodo(periodo) * calPorctSubs(estrato);
        }
        if (consumo > 130) {
            subsidio = 130 * calPeriodo(periodo) * calPorctSubs(estrato);
        }
        return subsidio;
    }
    /**
     * Calcula el valor facturado actual
     * @param estAct
     * @param consumo
     * @param periodo
     * @return valor facturado actual
     */
    public double valorFact(int estAct, int consumo, int periodo) {

        double valFact = 0;
        valFact = valorConsumo(estAct, consumo, periodo);
        return valFact;
    }
    /**
     * Calcula el valor real facturado
     * @param estReal
     * @param consumo
     * @param periodo
     * @return valor real facturado
     */
    public double valorReal(int estReal, int consumo, int periodo) {

        double valRe = 0;
        valRe = valorConsumo(estReal, consumo, periodo);
        return valRe;
    }
    /**
     * Hace resta entre valor fact y real
     * @param estAct
     * @param estReal
     * @param consumo
     * @param periodo
     * @return resta entre valor fact y real
     */
    public double valorDif(int estAct, int estReal, int consumo, int periodo) {

        double dif = 0;
        dif = valorFact(estAct, consumo, periodo) - valorReal(estReal, consumo, periodo);
        return dif;
    }
    /**
     * Calculo de Contribuciòn
     * @param estrato
     * @param consumo
     * @param periodo
     * @return 
     */
    public double calContr(int estrato, int consumo, int periodo) {

        double contrib = 0;
        if (estrato > 4) {
            contrib = consumo * calPeriodo(periodo) * 0.2;
        } else {
            contrib = 0;
        }
        return contrib;
    }
}
