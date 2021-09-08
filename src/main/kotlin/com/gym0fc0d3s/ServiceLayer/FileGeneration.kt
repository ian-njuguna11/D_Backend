package com.gym0fc0d3s.ServiceLayer

import com.itextpdf.kernel.colors.ColorConstants
import com.itextpdf.kernel.pdf.PdfDocument
import com.itextpdf.kernel.pdf.PdfWriter
import com.itextpdf.layout.Document
import com.itextpdf.layout.element.Paragraph
import com.itextpdf.layout.property.TextAlignment
import java.io.File

fun main(args: Array<String>) {

//    val fileName = "data.txt"
//
//    var file = File(fileName)
//
//    // create a new file
//    val isNewFileCreated :Boolean = file.createNewFile()
//
//    if(isNewFileCreated){
//        println("$fileName is created successfully.")
//    } else{
//        println("$fileName already exists.")
//    }
//
//    // try creating a file that already exists
//    val isFileCreated :Boolean = file.createNewFile()
//
//    if(isFileCreated){
//        println("$fileName is created successfully.")
//    } else{
//        println("$fileName already exists.")
//    }
//
//    file.writeText("Diabetic Patient")


    val pdfDocument = PdfDocument(PdfWriter("Amina_Muhamed.pdf"))

    val document = Document(pdfDocument)

    val text = Paragraph("My Text")
    document.add(text)

    val boldText = Paragraph("My Styled Text")
    boldText.setBold()
    document.add(boldText)

    val sizedText = Paragraph("My Sized Text")
    sizedText.setFontSize(20.0f)
    document.add(sizedText)

    val coloredText = Paragraph("My Sized Text")
    coloredText.setFontColor(ColorConstants.RED)
    document.add(coloredText)

    val alignedText = Paragraph("My Sized Text")
    alignedText.setTextAlignment(TextAlignment.CENTER)
    document.add(alignedText)

    document.close()

//    val document = Document(pdfDocument)

//    val textWithoutSpace1 = Paragraph("My Text")
//    textWithoutSpace1.setMargins(10f, 10f, 10f, 10f)
//    document.add(textWithoutSpace1)
//
//    val textWithSpace = Paragraph("My Spaced Text")
//    textWithSpace.setMargins(10f, 10f, 10f, 10f)
//    document.add(textWithSpace)
//
//    val textWithoutSpace2 = Paragraph("My Text")
//    textWithoutSpace2.setMargins(10f, 10f, 10f, 10f)
//    document.add(textWithoutSpace2)
//
//    document.close()


}