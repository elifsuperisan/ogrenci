public class Main {
    public static void main(String[] args) {
        Ogrenci o1= new Ogrenci();
        Ogrenci o2= new Ogrenci("Gökhan","Bilgisayar Mühendisliği","2003",1.7);
        Ogrenci o3= new Ogrenci("Ayşe","Makine Mühendisliği","2020",2.5);
        Ogrenci o4= new Ogrenci("Elif", "Elektrik Elektronik Mühendisliği","2021",3.5);

        System.out.println("Öğrenci Bilgileri");
        System.out.println("OGR-1 " + o1.getAd()+ " "+ o1.getBolum() + " " + o1.getGano()+ " " + o1.getGirisYili());
        System.out.println("OGR-2 " + o2.getAd()+ " "+ o2.getBolum() + " " + o2.getGano()+ " " + o2.getGirisYili());
        System.out.println("OGR-3 " + o3.getAd()+ " "+ o3.getBolum() + " " + o3.getGano()+ " " + o3.getGirisYili());
        System.out.println("OGR-4 " + o4.getAd()+ " "+ o4.getBolum() + " " + o4.getGano()+ " " + o4.getGirisYili());

        System.out.println("OGR-1 ogrNo "+o1.OgrNoHesapla());
        System.out.println("OGR-2 ogrNo "+o2.OgrNoHesapla());
        System.out.println("OGR-3 ogrNo "+o3.OgrNoHesapla());
        System.out.println("OGR-4 ogrNo "+o4.OgrNoHesapla());

        System.out.println("OGR-3 Harc "+o3.HarcHesap(4));
        System.out.println("OGR-4 Harc "+o4.HarcHesaap(4,3));
    }

}