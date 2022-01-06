package com.example.fragment;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/** A simple {@link Fragment} subclass.
 * Use the {@link tab3#newInstance} factory method to
 * create an instance of this fragment.*/
public class tab3 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // inisial parameter fragment, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: ganti nama dan tipe parameter
    private String mParam1;
    private String mParam2;

    public tab3() {}// diperlukan kosong
    /** Gunakan metode pabrik ini untuk membuat instance baru dari
     * fragmen ini menggunakan parameter yang disediakan.
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return Contoh baru dari fragmen tab3.*/
    // TODO: ganti nama, ubah jenis, dan jumlah parameter
    public static tab3 newInstance(String param1, String param2) { //metode statis yang ditentukan dan meneruskan parameter apapun melalui argumen
        tab3 fragment = new tab3();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate layout untuk fragment ini
        return inflater.inflate(R.layout.fragment_tab3, container, false);
    }
}