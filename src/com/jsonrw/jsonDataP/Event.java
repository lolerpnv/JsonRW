package com.jsonrw.jsonDataP;

/**
 * Created by Toni P on 6/5/2015.
 */
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;


public class Event {

    @Expose
    private String Klub;
    @Expose
    private String Naslov;
    @Expose
    private String Tekst;
    @Expose
    private String VrstaGlazbe;
    @Expose
    private String dodatno;
    @Expose
    private List<String> pics = new ArrayList<String>();

    /**
     *
     * @return
     * The Klub
     */
    public String getKlub() {
        return Klub;
    }

    /**
     *
     * @param Klub
     * The Klub
     */
    public void setKlub(String Klub) {
        this.Klub = Klub;
    }

    /**
     *
     * @return
     * The Naslov
     */
    public String getNaslov() {
        return Naslov;
    }

    /**
     *
     * @param Naslov
     * The Naslov
     */
    public void setNaslov(String Naslov) {
        this.Naslov = Naslov;
    }

    /**
     *
     * @return
     * The Tekst
     */
    public String getTekst() {
        return Tekst;
    }

    /**
     *
     * @param Tekst
     * The Tekst
     */
    public void setTekst(String Tekst) {
        this.Tekst = Tekst;
    }

    /**
     *
     * @return
     * The VrstaGlazbe
     */
    public String getVrstaGlazbe() {
        return VrstaGlazbe;
    }

    /**
     *
     * @param VrstaGlazbe
     * The VrstaGlazbe
     */
    public void setVrstaGlazbe(String VrstaGlazbe) {
        this.VrstaGlazbe = VrstaGlazbe;
    }

    /**
     *
     * @return
     * The dodatno
     */
    public String getDodatno() {
        return dodatno;
    }

    /**
     *
     * @param dodatno
     * The dodatno
     */
    public void setDodatno(String dodatno) {
        this.dodatno = dodatno;
    }

    /**
     *
     * @return
     * The pics
     */
    public List<String> getPics() {
        return pics;
    }

    /**
     *
     * @param pics
     * The pics
     */
    public void setPics(List<String> pics) {
        this.pics = pics;
    }

}