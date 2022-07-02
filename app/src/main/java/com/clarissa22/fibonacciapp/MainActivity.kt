package com.clarissa22.fibonacciapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.clarissa22.fibonacciapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var numsList=addsNums(100)
        print(numsList)
        var numberAdapter = NumberRecyclerViewAdapter(numsList)
        binding.rvNumbers.layoutManager  = LinearLayoutManager(this)
        binding.rvNumbers.adapter = numberAdapter
    }
    fun addsNums(size:Int):List<Int>{
        var carrier=ArrayList<Int>()
        var starter=0
        var steps=1
        var sum=0
        while (sum <= size){
            
         print(starter)
         var sums=starter+steps
            starter=steps
            steps=sums
            sum++
            carrier+=sums
    }
return carrier
}}