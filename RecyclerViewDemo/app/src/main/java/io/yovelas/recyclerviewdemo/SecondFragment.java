package io.yovelas.recyclerviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class SecondFragment extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
        view.findViewById(R.id.recycler_view_main_linear_btn).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.recycler_view_main_linear_btn:
                Log.e("dddd", "onClick: ");
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_LinearLayoutFragment);
//                startActivity(new Intent(context, RecyclerViewLinearActivity.class));
//                startActivity(new Intent(context, RecyclerViewGridActivity.class));
                break;
            case R.id.recycler_view_main_staggered_btn:
//                startActivity(new Intent(context, RecyclerViewStaggeredActivity.class));
                break;
            case R.id.recycler_view_main_custom_btn:
//                startActivity(new Intent(context, RecyclerViewCustomActivity.class));
                break;
            case R.id.recycler_view_main_pinned_btn:
//                startActivity(new Intent(context, RecyclerViewPinnedActivity.class));
                break;
        }
    }
}