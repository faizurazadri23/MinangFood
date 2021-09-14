package com.faizurazadri.minangfood.ui.home;


import com.faizurazadri.minangfood.model.Food;

import java.util.ArrayList;

public class FoodData {

    private static String[] foodName = {
            "Soles Padang",
            "Rakik Maco",
            "Bumbu Apik Lauak",
            "Ladu",
            "Gulai Baga",
            "Gulai Baga"
    };

    public static String[] food_Description = {
            "Soles dengan isian suwiran daging ayam nan gurih bercampur sayuran seperti wortel. Ditambah pedasnya karakter padang dan dibalut krimis di luar.",
            "Rakik maco sejenis makanan ringan yang pada dasarnya keripik, tapi ditambah ikan maco sebagai tambahan gizi dan membuatnya lebih nikmat. Dapat dinikmati langsung atau sebagai pendamping nasi.",
            "\n" +
                    "\n" +
                    "Apik lauak artinya ikan yang dibakar dengan pemanggang tradisional minangkabau, sedangkan bumbunya adalah bumbu khas pariaman, makanan khas pesisir yang melegenda juga dengan sala lauaknya.\n" +
                    "\n" +
                    "Bumbu ini kami siapkan untuk 1 KG ikan dengan ukuran sedang (sepanjang 10-15 cm). Bumbu ini tidak pedas, jadi bisa di konsumsi oleh anak-anak atau yang tidak penyuka pedas.\n" +
                    "\n" +
                    "Selain bumbu ini anda sebaiknya menambahkan perasan santan kental untuk di taburi di atas ikan saat pembakaran, menambah aroma sangat harum\n" +
                    "\n" +
                    "Bumbu baru kami buatkan saat akan dikirim, jadi bukan frozen food\n",
            "Ladu adalah makanan khas minang, panganan untuk bersantai ini dapat anda pesan dan bisa tahan lebih dari 5 hari setelah dibuka dari packaging",
            "Gulai baga adalah gulai tanpa santa khas pariaman, menggunakan daging yang bercampur lemak, sejenis sup tapi pedas. Sehat dan fresh. Kami tidak mengirimkan untuk perjalanan lebih dari 20 jam",
            "Gulai baga adalah gulai tanpa santa khas pariaman, menggunakan daging yang bercampur lemak, sejenis sup tapi pedas. Sehat dan fresh. Kami tidak mengirimkan untuk perjalanan lebih dari 20 jam",
    };

    public static String[] food_address = {
            "Padang",
            "Solok",
            "Sawah Lunto",
            "Pesisir Selatan",
            "Bukit Tinggi",
            "Cupak"

    };

    public static String[] food_image = {
            "https://demo.idwebdata.com/toko/wp-content/uploads/2020/05/soles-100x100.jpg",
            "https://demo.idwebdata.com/toko/wp-content/uploads/2020/05/11036949_1583576418554879_5625467794976026703_n-100x100.jpg",
            "https://demo.idwebdata.com/toko/wp-content/uploads/2020/05/IMG_1603-scaled-100x100.jpg",
            "https://demo.idwebdata.com/toko/wp-content/uploads/2020/05/11393019_1616688045243716_2270826192999947824_o-100x100.jpg",
            "https://demo.idwebdata.com/toko/wp-content/uploads/2020/05/10846446_1543463522566169_3754704038031399875_n-100x100.jpg",
            "https://demo.idwebdata.com/toko/wp-content/uploads/2020/05/10846446_1543463522566169_3754704038031399875_n-100x100.jpg"
    };

    public static String[] food_rate = {
            "4.9",
            "5.0",
            "4.9",
            "4.9",
            "4.9",
            "4.9"
    };

    public static String[] food_Detail = {
            "https://demo.idwebdata.com/toko/product/soles-padang/",
            "https://demo.idwebdata.com/toko/product/rakik-maco/",
            "https://demo.idwebdata.com/toko/product/bumbu-apik-lauak/",
            "https://demo.idwebdata.com/toko/product/ladu/",
            "https://demo.idwebdata.com/toko/product/gulai-baga/",
            "https://demo.idwebdata.com/toko/product/gulai-baga/"
    };

    static ArrayList<Food> getListData() {
        ArrayList<Food> list = new ArrayList<>();

        for (int position = 0; position < foodName.length; position++) {
            Food food = new Food();
            food.setFood_name(foodName[position]);
            food.setFood_Description(food_Description[position]);
            food.setFood_address(food_address[position]);
            food.setFood_image(food_image[position]);
            food.setFood_rate(food_rate[position]);
            food.setFood_detail(food_Detail[position]);
            list.add(food);
        }

        return list;
    }
}
