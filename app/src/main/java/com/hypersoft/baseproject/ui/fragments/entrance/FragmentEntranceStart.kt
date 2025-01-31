package com.hypersoft.baseproject.ui.fragments.entrance

import com.hypersoft.baseproject.R
import com.hypersoft.baseproject.databinding.FragmentEntranceStartBinding
import com.hypersoft.baseproject.ui.fragments.base.BaseFragment

class FragmentEntranceStart : BaseFragment<FragmentEntranceStartBinding>(R.layout.fragment_entrance_start) {

    override fun onViewCreatedOneTime() {
        fetchRemoteConfiguration()
    }

    private fun fetchRemoteConfiguration() {
        diComponent.remoteConfiguration.checkRemoteConfig {
            withDelay(3000) {
                launchWhenResumed {
                    navigateTo(R.id.fragmentEntranceStart, R.id.action_fragmentEntranceStart_to_fragmentEntranceLanguage)
                }
            }
        }
    }

    override fun onViewCreatedEverytime() {}

    override fun navIconBackPressed() {}

    override fun onBackPressed() {}

}