package com.duckhang.caculator_demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_caculator.*

class Calculators : Fragment() {

    private var input1 = 0.0
    private var input2 = 0.0
    private var canadd = false
    private var cansub = false
    private var canmul = false
    private var candiv = false
    private var canper = false

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_caculator, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_num0.setOnClickListener { text_result.append("0") }
        button_num1.setOnClickListener { text_result.append("1") }
        button_num2.setOnClickListener { text_result.append("2") }
        button_num3.setOnClickListener { text_result.append("3") }
        button_num4.setOnClickListener { text_result.append("4") }
        button_num5.setOnClickListener { text_result.append("5") }
        button_num6.setOnClickListener { text_result.append("6") }
        button_num7.setOnClickListener { text_result.append("7") }
        button_num8.setOnClickListener { text_result.append("8") }
        button_num9.setOnClickListener { text_result.append("9") }
        button_dot.setOnClickListener { text_result.append(".") }


        button_addition_operation.setOnClickListener {
            canadd = true
            input1 = text_result.text.toString().toDouble()
            text_result.text = ""
        }
        button_subtract_operation.setOnClickListener {
            cansub = true
            input1 = text_result.text.toString().toDouble()
            text_result.text = ""
        }
        button_multiplication.setOnClickListener {
            canmul = true
            input1 = text_result.text.toString().toDouble()
            text_result.text = ""
        }
        button_div.setOnClickListener {
            candiv = true
            input1 = text_result.text.toString().toDouble()
            text_result.text = ""
        }

        button_AC.setOnClickListener {
            text_result.text = ""
        }

        button_C.setOnClickListener {
            val number = text_result.text.toString().length
            val delete = text_result.text.toString().substring(0, number - 1)
            text_result.text = delete
        }

        button_pi.setOnClickListener { text_result.text = getString(R.string.pi_db) }

        button_percentage.setOnClickListener {
            canper = true
            input1 = text_result.text.toString().toDouble()
            text_result.text = ""
        }

        button_submission_operation.setOnClickListener {
            input2 = text_result.text.toString().toDouble()
            when {
                canadd -> {
                    text_result.text = (input1 + input2).toString()
                    canadd = false
                }
                cansub -> {
                    text_result.text = (input1 - input2).toString()
                    cansub = false
                }
                canmul -> {
                    text_result.text = (input1 * input2).toString()
                    canmul = false
                }
                candiv -> {
                    text_result.text = (input1 / input2).toString()
                    candiv = false
                }
                canper -> {
                    text_result.text = (input1 * input2 / 100).toString()
                    canper = false
                }
            }
        }
    }
}


