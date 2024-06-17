package dominando.android.projeto01

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dominando.android.projeto01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            registerUser()
        }
    }

    @SuppressLint("StringFormatInvalid")
    private fun registerUser() {
        val email = binding.edtEmail.text.toString()
        val password = binding.edtPassword.text.toString()
        var isValid = true

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            binding.edtEmail.error = getString(R.string.msg_error_email)
            isValid = false
        }
        if (password != "123") {
            binding.edtPassword.error = getString(R.string.msg_error_password)
            isValid = false
        }
        if (isValid) {
            Toast.makeText(this, getString(R.string.msg_sucess, email), Toast.LENGTH_SHORT).show()
            val intent = Intent(this, TelaTwo::class.java)
            startActivity(intent)
        }
    }
}