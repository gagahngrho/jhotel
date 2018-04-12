
/**
 * Class untuk objek objek Room
 *
 * @author Anggoro Gagah Nugroho
 * @version 8/3/2018
 */
public abstract class Room
{
    // instance variables
    private Hotel hotel;
    private String nomor_kamar;
    protected double dailyTariff;
    private StatusKamar status_kamar;
    private Pesanan pesan;
    
    /**
     * Constructor for objects of class Room
     */
    public Room(Hotel hotel,String nomor_kamar, StatusKamar status_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.dailyTariff = dailyTariff;
        this.status_kamar = status_kamar;
    }
    
    public abstract TipeKamar getTipeKamar();
   
    /**
     * Metode Accessor untuk Hotel
     *
     * @return Object Hotel
     */
    public Hotel getHotel()
    {
        return hotel;
    }
  
    
    /**
     * Method Accessor untuk Nomor Kamar
     *
     * @return Nomor Kamar
     */
    public String getNomorKamar()
    {
        return nomor_kamar;
    }
    

    
    /**
     * Method Accessor untuk Tarif perhari
     *
     * @return Tarif perhari
     */
    public double getDailyTariff()
    {
        return dailyTariff;
    }
    
    /**
     * Method Accessor untuk Status Kamar
     *
     * @return Status kamar berdasarkan enum
     */
    public StatusKamar getStatusKamar()
    {
        return status_kamar;
    }
    
    /**
     * Method Accessor untuk Pesanan
     *
     * @return Pesanan
     */
    public Pesanan getPesanan()
    {
        return pesan;
    }
    
    /**
     * Method Mutator untuk Hotel
     *
     * @param hotel object hotel
     */
    public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }
    

    
    /**
     * Method Mutator untuk NomorKamar
     *
     * @param nomor_kamar untuk nomorkamar
     */
    public void seNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar = nomor_kamar;
    }
    

    
  
    
    /**
     * Method Mutator untuk DailyTariff
     *
     * @param dailytariff untuk set daily tariff
     */
    public void setDailyTariff(double dailytariff)
    {
        this.dailyTariff = dailytariff;
    }
    
    /**
     * Method Mutator untuk Status Kamar
     *
     * @param status_kamar untuk mengganti status kamar
     */
    public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar = status_kamar;
    }
    
    /**
     * Method Mutator untuk Pesanan
     *
     * @param pesan untuk mengganti Object Pesanan
     */
    public void setPesanan(Pesanan pesan)
    {
        this.pesan = pesan;
    }
     public String toString()
   
    {
        if (isAvailable = true)
        {
            return ("Nama Hotel : " + hotel.getNama() 
            +"Tipe Kamar : " + getTipeKamar()
            +"Harga Kamar : " + dailyTariff
            + "Status Kamar : " + status_kamar);
      
    }
    else
    {
          return ("Nama Hotel : " + hotel.getNama() 
            +"Tipe Kamar : " + getTipeKamar()
            +"Harga Kamar : " + dailyTariff
            + "Status Kamar : " + status_kamar 
         + "Pelanggan : " + pesan.getPelanggan().getNama());
        
        }
        
        
    }
}

