package com.crisspian.recyclerviewexamples_01;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.core.widget.ImageViewCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.bumptech.glide.Glide;
import com.crisspian.recyclerviewexamples_01.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {
    private static final String ARG_PARAM1 = "descr";
    private static final String ARG_PARAM2 = "urlimg";
    private String mdescr;
    private String murlimg;
    private FragmentSecondBinding mBinding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
           mdescr = getArguments().getString(ARG_PARAM1);
           murlimg = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        mBinding = FragmentSecondBinding.inflate(inflater,container, false);
        return mBinding.getRoot();
     }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBinding.tvDescription.setText(mdescr);

        Glide.with(getContext()).load(murlimg)
                .into(mBinding.ivDescription);

/*        mBinding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });*/

    }
}