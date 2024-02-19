package com.moiseeva.test.recadapters

import com.moiseeva.test.R

data class feel(val image:Int, val text_feel :String){

    class MyFeel{val list  = arrayListOf(feel(R.drawable.calm, "Спокойно"),
       feel(R.drawable.relax, "Расслаблено"),
        feel(R.drawable.focus, "Сосредоточено"),
        feel(R.drawable.calm, "Спокойно"),
        feel(R.drawable.relax, "Расслаблено"),
        feel(R.drawable.focus, "Сосредоточено"),
        )  }
}
