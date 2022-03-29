package br.com.azzonaazul.modulofiscal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import br.com.azzonaazul.modulofiscal.databinding.ActivityRegistrarIrregularidadeBinding
import com.google.android.material.snackbar.Snackbar

class  RegistrarIrregularidadeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrarIrregularidadeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegistrarIrregularidadeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIMG1.setOnClickListener {
            cameraProviderResult.launch(android.Manifest.permission.CAMERA)
        }
        binding.btnIMG2.setOnClickListener {
            cameraProviderResult.launch(android.Manifest.permission.CAMERA)
        }
        binding.btnIMG3.setOnClickListener {
            cameraProviderResult.launch(android.Manifest.permission.CAMERA)
        }
        binding.btnIMG4.setOnClickListener {
            cameraProviderResult.launch(android.Manifest.permission.CAMERA)
        }
    }

    private val cameraProviderResult =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) {
            if (it) {
                abrirTelaDePreview()
            } else {
                Snackbar.make(
                    binding.root,
                    "Você não concedeu permissões para usar a câmera.",
                    Snackbar.LENGTH_INDEFINITE
                ).show()
            }
        }

    private fun abrirTelaDePreview() {
        val intentCameraPreview = Intent(this, CameraPreviewActivity::class.java)
    }
}




