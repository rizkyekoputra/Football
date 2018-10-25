package com.example.rizkyekoputra.footballclub

/**
 * Created by RizkyEko on 26/10/18.
 */
interface TeamDetailView {
    fun showLoading()
    fun hideLoading()
    fun showTeamDetail(data: List<Team>)
}