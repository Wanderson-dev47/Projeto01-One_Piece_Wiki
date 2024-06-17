package dominando.android.projeto01

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class TelaTwo : AppCompatActivity() {
    //0=Capitão;1=Espadachim;2=Navegadora;3=Atirador

    private val characters = mutableListOf(
        Character("Monkey D. Luffy", "Chapéu de Palha/Yonkou", 0, "3,000,000,000"),
        Character("Roronoa Zoro", "Caçador de Piratas", 1, "1,111,000,000"),
        Character("Nami", "Gata Ladrã", 2, "366,000,000"),
        Character("Usopp", "Sogeking/Rei dos Atiradores", 3, "500,000,000"),
        Character("Vinsmoke Sanji", "Perna Negra", 4, "1,032,000,000")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val listView = ListView(this)
        setContentView(listView)
        val adapter = CharacterAdapter(this, characters)
        listView.adapter = adapter

    }
}