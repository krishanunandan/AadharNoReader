package com.brsolution.aadharnoreader.utility

import android.annotation.SuppressLint
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageProxy
import com.google.mlkit.vision.common.InputImage
import java.nio.ByteBuffer


class CustomImageAnalyzer(private val listener: ImageListener) : ImageAnalysis.Analyzer {

    @SuppressLint("UnsafeOptInUsageError")
    override fun analyze(imageProxy: ImageProxy) {
        val mediaImage = imageProxy.image
        val processedImage =
            mediaImage?.let { InputImage.fromMediaImage(it, imageProxy.imageInfo.rotationDegrees) }
        listener.processedImage(processedImage!!)

        imageProxy.close()
    }
}
