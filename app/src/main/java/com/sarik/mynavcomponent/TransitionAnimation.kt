package com.sarik.mynavcomponent

import androidx.navigation.NavOptions

/**
 * Created by Mehedi Hasan on 11/3/2020.
 */
class TransitionAnimation {
    companion object {
        fun getNavBuilder(): NavOptions.Builder {
            val navBuilder: NavOptions.Builder = NavOptions.Builder()
            navBuilder.setEnterAnim(R.anim.open_enter).setExitAnim(R.anim.close_exit)
                .setPopEnterAnim(R.anim.open_enter).setPopExitAnim(R.anim.close_exit)
            return navBuilder
        }
    }
}

