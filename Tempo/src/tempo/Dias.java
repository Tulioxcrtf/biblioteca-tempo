/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempo;

/**
 *
 * @author tulio.xcrtf
 */
public enum Dias {

    DIA_01("Um"),
    DIA_02("Dois"),
    DIA_03("Três"),
    DIA_04("Quatro"),
    DIA_05("Cinco"),
    DIA_06("Seis"),
    DIA_07("Sete"),
    DIA_08("Oito"),
    DIA_09("Nove"),
    DIA_10("Dez"),
    DIA_11("Onze"),
    DIA_12("Doze"),
    DIA_13("Treze"),
    DIA_14("Quatorze"),
    DIA_15("Quinze"),
    DIA_16("Dezesseis"),
    DIA_17("Dezessete"),
    DIA_18("Dezoito"),
    DIA_19("Dezenove"),
    DIA_20("Vinte"),
    DIA_21("Vinte e um"),
    DIA_22("Vinte e dois"),
    DIA_23("Vinte e três"),
    DIA_24("Vinte e quatro"),
    DIA_25("Vinte e cinco"),
    DIA_26("Vinte e seis"),
    DIA_27("Vinte e sete"),
    DIA_28("Vinte e oito"),
    DIA_29("Vinte e nove"),
    DIA_30("Trinta"),
    DIA_31("Trinta e um");

    private String nome;

    Dias(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return this.nome;
    }
    
    
}
