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
    private var add = false
    private var sub = false
    private var mul = false
    var div = false
    private var per = false


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_caculator, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




        btn_n0.setOnClickListener {tv_result.append("0")}
        btn_n1.setOnClickListener {tv_result.append("1")}
        btn_n2.setOnClickListener {tv_result.append("2")}
        btn_n3.setOnClickListener {tv_result.append("3")}
        btn_n4.setOnClickListener {tv_result.append("4")}
        btn_n5.setOnClickListener {tv_result.append("5")}
        btn_n6.setOnClickListener {tv_result.append("6")}
        btn_n7.setOnClickListener {tv_result.append("7")}
        btn_n8.setOnClickListener {tv_result.append("8")}
        btn_n9.setOnClickListener {tv_result.append("9")}
        btn_dot.setOnClickListener {tv_result.append(".")}


        btn_add.setOnClickListener {
            add = true

            input1 = tv_result.text.toString().toDouble()
            tv_result.text = ""

        }
        btn_sub.setOnClickListener {
            sub = true

            input1 = tv_result.text.toString().toDouble()
            tv_result.text = ""
        }
        btn_mul.setOnClickListener {
            mul = true
            input1 = tv_result.text.toString().toDouble()
            tv_result.text = ""
        }
        btn_div.setOnClickListener {
            div = true
            input1 = tv_result.text.toString().toDouble()
            tv_result.text = ""
        }

        btn_ac.setOnClickListener {
            tv_result.text = ""
        }

        btn_c.setOnClickListener {
            val number = tv_result.text.toString().length

            val delete = tv_result.text.toString().substring(0, number -1)
            tv_result.text = delete
        }
        btn_per.setOnClickListener {
            per = true
            input1 = tv_result.text.toString().toDouble()
            tv_result.text = ""
        }
        btn_result.setOnClickListener {
            when {
                add -> {
                    input2 = tv_result.text.toString().toDouble()
                    tv_result.text = (input1 + input2).toString()
                    add = false

                }
                sub -> {
                    input2 = tv_result.text.toString().toDouble()
                    tv_result.text = (input1 - input2).toString()
                    sub = false
                }
                mul -> {
                    input2 = tv_result.text.toString().toDouble()
                    tv_result.text = (input1 * input2).toString()
                    mul = false
                }
                div -> {
                    input2 = tv_result.text.toString().toDouble()
                    tv_result.text = (input1 / input2).toString()
                    div = false
                }
                per -> {
                    input2 = tv_result.text.toString().toDouble()
                    tv_result.text = (input1 * input2 /100).toString()
                    per = false
                }
            }
        }


    }
}




