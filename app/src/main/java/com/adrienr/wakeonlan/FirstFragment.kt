package com.adrienr.wakeonlan

import ComputerAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.adrienr.wakeonlan.classes.Computer
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    var computers: ArrayList<Computer> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        AddComputersToList();

        view.findViewById<RecyclerView>(R.id.mainRvComputer).apply {
            this?.layoutManager = LinearLayoutManager(context)
            this?.adapter = ComputerAdapter(computers)
        }

        /*view.findViewById<Button>(R.id.button_first).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }*/
    }

    fun AddComputersToList() {
        computers.add(
            Computer(
                "192.168.1.1",
                "15:15:15:15:15",
                "My fist Computer"
            )
        )
        computers.add(
            Computer(
                "192.168.1.1",
                "15:15:15:15:15",
                "My fist Computer"
            )
        )
        computers.add(
            Computer(
                "192.168.1.1",
                "15:15:15:15:15",
                "My fist Computer"
            )
        )
        computers.add(
            Computer(
                "192.168.1.1",
                "15:15:15:15:15",
                "My fist Computer"
            )
        )
        computers.add(
            Computer(
                "192.168.1.1",
                "15:15:15:15:15",
                "My fist Computer"
            )
        )
        computers.add(
            Computer(
                "192.168.1.1",
                "15:15:15:15:15",
                "My fist Computer"
            )
        )
        computers.add(
            Computer(
                "192.168.1.1",
                "15:15:15:15:15",
                "My fist Computer"
            )
        )
        computers.add(
            Computer(
                "192.168.1.1",
                "15:15:15:15:15",
                "My fist Computer"
            )
        )
        computers.add(
            Computer(
                "192.168.1.1",
                "15:15:15:15:15",
                "My fist Computer"
            )
        )
    }
}
