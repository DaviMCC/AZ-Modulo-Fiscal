package br.com.azzonaazul.modulofiscal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import com.google.android.material.snackbar.Snackbar

class VerficarVeiculoActivity : AppCompatActivity() {

    private lateinit var etPlaca : AppCompatEditText
    private lateinit var btnConsultar : AppCompatButton
    private lateinit var btnRegistrar: AppCompatButton
    private lateinit var tvMsgStatus : AppCompatTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verficar_veiculo)


        etPlaca = findViewById(R.id.etPlaca)
        btnConsultar = findViewById(R.id.btnConsultar)
        btnRegistrar = findViewById(R.id.btnRegistrar)
        tvMsgStatus = findViewById(R.id.tvMsgStatus)

    }

    private fun consultarPlaca(){
        if(etPlaca.text.isNullOrBlank()){
            Snackbar.make(tvMsgStatus, "Informe a placa do veículo que deseja consultar", Snackbar.LENGTH_LONG).show()
        }else{
            tvMsgStatus.text = "A placa" + etPlaca + "está irregular";
            tvMsgStatus.visibility = View.VISIBLE;
            btnRegistrar.visibility = View.VISIBLE;
            etPlaca.text!!.clear();

        }
    }

}