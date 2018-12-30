package com.zlz.alfazaweddingorganizer.activity;

import java.util.ArrayList;

public class PengantinData {
    public static String[][] data = new String[][]{
            {"Gaun Jilbab Gold", "Sample Rias Pengantin Gaun Jilbab Gold", "https://scontent-sin6-2.xx.fbcdn.net/v/t1.0-9/16649035_1580891085259274_2589737587904429049_n.jpg?_nc_cat=108&_nc_ht=scontent-sin6-2.xx&oh=405dd594049fd93f46c7e6d422018429&oe=5CD75F40", "Sutra dan Brukat", "M, L"},
            {"Gaun Jilbab Biru", "Sample Rias Pengantin Gaun Jilbab Biru", "https://scontent-sin6-2.xx.fbcdn.net/v/t1.0-9/16508064_1580891058592610_3476425624323163335_n.jpg?_nc_cat=103&_nc_ht=scontent-sin6-2.xx&oh=a5408629272e22b6e8ee1e527621a7d3&oe=5C9053F3", "Sutra", "M, L, XL"},
            {"Gaun Jilbab Putih", "Sample Rias Pengantin Gaun Jilbab Putih", "https://scontent-sin6-2.xx.fbcdn.net/v/t1.0-9/16003114_1553137438034639_450799925324179416_n.jpg?_nc_cat=103&_nc_ht=scontent-sin6-2.xx&oh=c51e6a2f7cfae8d755775368231df176&oe=5C901271", "Katun dan Brukat",  "L, XL"},
            {"Gaun Jilbab Biru Muda", "Sample Rias Pengantin Gaun Biru Muda", "https://scontent-sin6-2.xx.fbcdn.net/v/t1.0-9/12687987_1230068343674885_7658605770740770898_n.jpg?_nc_cat=110&_nc_ht=scontent-sin6-2.xx&oh=63130e9b1df12b1f80656313366d88c7&oe=5C911BAF", "Sutra", "M, L, XL, XXL"},
            {"Gaun Jilbab Putih 2", "Sample Rias Pengantin Gaun Jilbab Putih 2", "https://scontent-sin6-2.xx.fbcdn.net/v/t1.0-9/12687798_1230068983674821_2230357379099454691_n.jpg?_nc_cat=106&_nc_ht=scontent-sin6-2.xx&oh=0bebfea20a82066c5142dd37c7c3d84e&oe=5CD0D9A7", "Bahan Kebaya dan Sutra", "M, L, XL, XXL"},
            {"Gaun Jilbab Merah", "Sample Rias Pengantin Gaun Jilbab Merah", "https://scontent-sin6-2.xx.fbcdn.net/v/t1.0-9/12650928_1230068847008168_6545980242723350022_n.jpg?_nc_cat=102&_nc_ht=scontent-sin6-2.xx&oh=79cfb44a04c5be07ad341e430d3bc0e8&oe=5C98EF5C", "Sutra dan Brukat", "M, L, XL"},
            {"Gaun Jilbab Pink Gold", "Sample Rias Pengantin Gaun Jilbab Pink Gold", "https://scontent-sin6-2.xx.fbcdn.net/v/t1.0-9/12359914_1191880220827031_6833189485836425437_n.jpg?_nc_cat=109&_nc_ht=scontent-sin6-2.xx&oh=b559546088f98f57deb7e31651f77338&oe=5C8B7AE9", "Sutra", "M, L, XL, XXL"}
    };

    public static ArrayList<Pengantin> getListData(){
        Pengantin gaun = null;
        ArrayList<Pengantin> list = new ArrayList<>();
        for (String[] aData : data) {
            gaun = new Pengantin();
            gaun.setName(aData[0]);
            gaun.setRemarks(aData[1]);
            gaun.setPhoto(aData[2]);
            gaun.setBahan(aData[3]);
            gaun.setUkuran(aData[4]);

            list.add(gaun);
        }

        return list;
    }
}
