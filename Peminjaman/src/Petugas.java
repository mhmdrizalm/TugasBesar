/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Muhamad Rizal M
 */
public class Petugas extends Orang {
    private String id_petugas;
    private String nama_petugas ;

    public String getIdPetugas(){
        return id_petugas;
    }
    
    public void setNama(String nama_petugas){
	this.nama_petugas = nama_petugas;
    }
	
    public String getNama(){
	return nama_petugas;
    }
}
