package com.example.rickandmortyapp.adapters.recycleviewadapter.commandpattern.child;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.example.rickandmortyapp.adapters.recycleviewadapter.commandpattern.base.BaseCommand;
import com.example.rickandmortyapp.databinding.ItemCharacterContainerBinding;
import com.example.rickandmortyapp.models.characterdata.Character;

public class CharacterCommand extends BaseCommand<Character> {
    @Override
    public void bindData(Character character, ViewDataBinding dataBinding) {
        ((ItemCharacterContainerBinding)dataBinding).setCharacter(character);
    }

    @Override
    public ViewDataBinding setItemContainerBinding(LayoutInflater layoutInflater, int idLayout, ViewGroup parent) {
        ItemCharacterContainerBinding binding = DataBindingUtil.inflate(layoutInflater, idLayout, parent,false);
        return binding;
    }
}
