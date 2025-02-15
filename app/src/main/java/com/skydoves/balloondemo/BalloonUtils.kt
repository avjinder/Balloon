/*
 * Copyright (C) 2019 skydoves
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.skydoves.balloondemo

import android.content.Context
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.lifecycle.LifecycleOwner
import com.skydoves.balloon.ArrowOrientation
import com.skydoves.balloon.Balloon
import com.skydoves.balloon.BalloonAnimation
import com.skydoves.balloon.OnBalloonClickListener

object BalloonUtils {

  fun getProfileBalloon(baseContext: Context, lifecycleOwner: LifecycleOwner): Balloon {
    return Balloon.Builder(baseContext)
      .setText("You can edit your profile now!")
      .setArrowSize(10)
      .setWidthRatio(0.75f)
      .setHeight(63)
      .setTextSize(15f)
      .setCornerRadius(8f)
      .setTextColor(ContextCompat.getColor(baseContext, R.color.white_87))
      .setIconDrawable(ContextCompat.getDrawable(baseContext, R.drawable.ic_edit))
      .setBackgroundColor(ContextCompat.getColor(baseContext, R.color.skyBlue))
      .setOnBalloonDismissListener { Toast.makeText(baseContext, "dismissed", Toast.LENGTH_SHORT).show() }
      .setBalloonAnimation(BalloonAnimation.ELASTIC)
      .setLifecycleOwner(lifecycleOwner)
      .build()
  }

  fun getNavigationBalloon(
    baseContext: Context,
    onBalloonClickListener: OnBalloonClickListener,
    lifecycleOwner: LifecycleOwner
  ): Balloon {
    return Balloon.Builder(baseContext)
      .setText("You can access your profile from on now.")
      .setArrowSize(10)
      .setWidthRatio(1.0f)
      .setHeight(65)
      .setTextSize(15f)
      .setArrowPosition(0.62f)
      .setCornerRadius(4f)
      .setAlpha(0.9f)
      .setTextColor(ContextCompat.getColor(baseContext, R.color.white_93))
      .setIconDrawable(ContextCompat.getDrawable(baseContext, R.drawable.ic_profile))
      .setBackgroundColor(ContextCompat.getColor(baseContext, R.color.colorPrimary))
      .setOnBalloonClickListener(onBalloonClickListener)
      .setBalloonAnimation(BalloonAnimation.FADE)
      .setLifecycleOwner(lifecycleOwner)
      .build()
  }

  fun getCustomListBalloon(
    baseContext: Context,
    lifecycleOwner: LifecycleOwner
  ): Balloon {
    return Balloon.Builder(baseContext)
      .setLayout(R.layout.layout_custom_list)
      .setArrowSize(10)
      .setArrowOrientation(ArrowOrientation.TOP)
      .setArrowPosition(0.85f)
      .setWidth(170)
      .setHeight(200)
      .setCornerRadius(4f)
      .setBackgroundColor(ContextCompat.getColor(baseContext, R.color.background800))
      .setBalloonAnimation(BalloonAnimation.FADE)
      .setLifecycleOwner(lifecycleOwner)
      .build()
  }

  fun getCustomProfileBalloon(
    baseContext: Context,
    lifecycleOwner: LifecycleOwner
  ): Balloon {
    return Balloon.Builder(baseContext)
      .setLayout(R.layout.layout_custom_profile)
      .setArrowSize(10)
      .setArrowOrientation(ArrowOrientation.TOP)
      .setArrowPosition(0.5f)
      .setWidthRatio(0.55f)
      .setHeight(250)
      .setCornerRadius(4f)
      .setBackgroundColor(ContextCompat.getColor(baseContext, R.color.background900))
      .setBalloonAnimation(BalloonAnimation.CIRCULAR)
      .setLifecycleOwner(lifecycleOwner)
      .build()
  }

  fun getCustomTagBalloon(
    baseContext: Context,
    lifecycleOwner: LifecycleOwner
  ): Balloon {
    return Balloon.Builder(baseContext)
      .setLayout(R.layout.layout_custom_tag)
      .setArrowSize(10)
      .setArrowOrientation(ArrowOrientation.BOTTOM)
      .setArrowPosition(0.5f)
      .setWidth(90)
      .setHeight(60)
      .setCornerRadius(4f)
      .setBackgroundColor(ContextCompat.getColor(baseContext, R.color.white))
      .setBalloonAnimation(BalloonAnimation.ELASTIC)
      .setLifecycleOwner(lifecycleOwner)
      .build()
  }
}
