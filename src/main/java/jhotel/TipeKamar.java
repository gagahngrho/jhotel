package jhotel;

/**
 * TipeKamar untuk memilih dan membatasi tipe kamar 
 *
 * @author Anggoro Gagah Nugroho
 * @version 29/5/2018
 */
public enum TipeKamar
{
    SINGLE("Single"),DOUBLE("Double"),PREMIUM("Premium");

    private final String type;

    /**
     * Constructor TipeKamar
     *
     * @param type merupakan tipe kamar dalam string
     */
    TipeKamar(String type)
    {
        this.type=type;
    }

    /**
     * toString() - Method pengambilan String
     *
     * @return type mengembalikkan tipe kamar sebagai string
     */
    public String toString()
    {
        return this.type;
    }
}
