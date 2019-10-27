package happy.mjstudio.sopt25_2.domain.entity

/**
 * Created by mj on 12, October, 2019
 */

data class GitRepoItem(
    val title : String,
    val desc : String,
    val language : String?,
    val languageColor : Int? = android.R.color.black
)