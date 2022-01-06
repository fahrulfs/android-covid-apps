package com.example.fragment;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/** A simple {@link Fragment} subclass.
 * Use the {@link tab2#newInstance} factory method to
 * create an instance of this fragment.*/
public class tab2 extends Fragment {
    // TODO: Ganti nama argumen parameter, pilih nama yang cocok
    // parameter inisialisasi fragmen, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Ganti nama dan ubah jenis parameter
    private String mParam1;
    private String mParam2;

    public tab2() {}// harus kosong
    /** Gunakan metode pabrik ini untuk membuat instance baru dari
     * fragmen ini menggunakan parameter yang disediakan.
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return Contoh baru dari tab2 fragmen.*/
    // TODO: Rename and change types and number of parameters
    public static tab2 newInstance(String param1, String param2) {
        tab2 fragment = new tab2();
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
        // Mengembang tata letak untuk fragmen ini
        return inflater.inflate(R.layout.fragment_tab2, container, false);
    }
}