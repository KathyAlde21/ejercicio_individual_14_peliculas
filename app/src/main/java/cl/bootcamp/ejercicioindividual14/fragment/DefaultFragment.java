package cl.bootcamp.ejercicioindividual14.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import cl.bootcamp.ejercicioindividual14.R;
import cl.bootcamp.ejercicioindividual14.databinding.FragmentDefaultBinding;
public class DefaultFragment extends Fragment {

    private FragmentDefaultBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDefaultBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.startButton.setOnClickListener(v ->
                Navigation.findNavController(view).navigate(R.id.action_defaultFragment_to_emptyFragment));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding=null;
    }
}