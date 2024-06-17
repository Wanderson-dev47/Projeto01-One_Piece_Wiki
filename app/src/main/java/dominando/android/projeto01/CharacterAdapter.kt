package dominando.android.projeto01

import android.content.Context
import android.content.res.TypedArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.annotation.StringRes
import dominando.android.projeto01.databinding.ItemCharacterBinding

class CharacterAdapter(
    private val ctx: Context,
    private val character: List<Character>
) : BaseAdapter() {
    private val characters: TypedArray by lazy { ctx.resources.obtainTypedArray(R.array.characters) }

    override fun getCount(): Int = character.size

    override fun getItem(position: Int) = character[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView
        val binding: ItemCharacterBinding

        if (convertView == null) {
            binding = ItemCharacterBinding.inflate(LayoutInflater.from(ctx), parent, false)
            convertView = binding.root
            convertView.tag = binding
        } else {
            binding = convertView.tag as ItemCharacterBinding
        }

        val character = character[position]

        binding.imgChar.setImageDrawable(characters.getDrawable(character.function))
        binding.txtName.text = character.name
        binding.txtTitle.text = character.title
        binding.txtFunction.text = ctx.getString(getFunction(character))
        binding.txtReward.text = character.reward

        return convertView
    }

    @StringRes
    private fun getFunction(character: Character): Int {
        return when (character.function) {
            0 -> R.string.fuel_capitao
            1 -> R.string.fuel_espadachim
            2 -> R.string.fuel_navegadora
            3 -> R.string.fuel_atirador
            4 -> R.string.fuel_cozinheiro
            else -> R.string.fuel_invalid
        }
    }

}