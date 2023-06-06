package com.walker.modulo2aula2androidfundamentos

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

const val TAG_FRAGMENT = "FragmentLifecycle::"

class BlankFragment : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("$TAG_FRAGMENT${javaClass.simpleName} onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("$TAG_FRAGMENT${javaClass.simpleName} onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        println("$TAG_FRAGMENT${javaClass.simpleName} onCreateView")
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        println("$TAG_FRAGMENT${javaClass.simpleName} onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        println("$TAG_FRAGMENT${javaClass.simpleName} onStart")
    }

    override fun onResume() {
        super.onResume()
        println("$TAG_FRAGMENT${javaClass.simpleName} onResume")
    }

    override fun onPause() {
        super.onPause()
        println("$TAG_FRAGMENT${javaClass.simpleName} onPause")
    }

    override fun onStop() {
        super.onStop()
        println("$TAG_FRAGMENT${javaClass.simpleName} onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("$TAG_FRAGMENT${javaClass.simpleName} onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("$TAG_FRAGMENT${javaClass.simpleName} onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        println("$TAG_FRAGMENT${javaClass.simpleName} onDetach")
    }
}