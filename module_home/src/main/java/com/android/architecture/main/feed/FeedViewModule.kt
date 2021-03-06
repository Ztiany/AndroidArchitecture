package com.android.architecture.main.feed

import com.android.base.app.mvvm.RxViewModel
import com.android.base.concurrent.SchedulerProvider
import com.app.base.data.app.AppDataSource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @author Ztiany
 * Email: ztiany3@gmail.com
 * Date : 2018-11-05 14:23
 */
@HiltViewModel
class FeedViewModule @Inject constructor(
    val appDataSource: AppDataSource,
    private val schedulerProvider: SchedulerProvider,
) : RxViewModel() {

}