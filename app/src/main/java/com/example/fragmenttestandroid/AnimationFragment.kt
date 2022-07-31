package com.example.fragmenttestandroid

import android.os.Bundle
import androidx.transition.ChangeBounds
import androidx.transition.TransitionSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.transition.Scene
import androidx.transition.TransitionManager

class AnimationFragment : Fragment(R.layout.fragmen_with_animation) {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View =
        inflater.inflate(R.layout.fragmen_with_animation,container,false).also {
            it.findViewById<Button>(R.id.buttonAnim).setOnClickListener{
                exp()
            }
        }


    fun exp(){
        var scene = Scene.getSceneForLayout(requireView() as ViewGroup, R.layout.fragmen_with_animation_2, requireContext())
        TransitionManager.go(scene, TransitionSet().apply {
            addTransition(ChangeBounds())
        })
    }


}

