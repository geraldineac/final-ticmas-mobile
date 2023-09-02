package com.curso.android.app.comparar.textos

import android.widget.TextView
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.mockito.Mockito.`when`

class TestUnitario {



    @Test
    fun resultadoTextView() {

        val mockTextView = mock(TextView::class.java)

        val expectedText = "Aqui aparece un texto"
        `when`(mockTextView.text).thenReturn(expectedText)

        val someClass = SomeClass(mockTextView)
        someClass.updateTextView()

        verify(mockTextView).text = expectedText
    }


}

class SomeClass(private val textView: TextView) {
    fun updateTextView() {
        textView.text = "Aqui aparece un texto"
    }
}



