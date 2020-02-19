import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adrienr.wakeonlan.classes.Computer
import com.adrienr.wakeonlan.classes.ComputerViewHolder

class ComputerAdapter(private val list: List<Computer>)
    : RecyclerView.Adapter<ComputerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComputerViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ComputerViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: ComputerViewHolder, position: Int) {
        val computer: Computer = list[position]
        holder.bind(computer)
    }

    override fun getItemCount(): Int = list.size

}