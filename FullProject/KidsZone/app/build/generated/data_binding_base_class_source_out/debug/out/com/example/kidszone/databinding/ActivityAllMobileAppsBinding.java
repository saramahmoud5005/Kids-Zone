// Generated by view binder compiler. Do not edit!
package com.example.kidszone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kidszone.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAllMobileAppsBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final AppBarBinding appBar;

  @NonNull
  public final BottomNavigationView bottomNavigation;

  @NonNull
  public final RecyclerView recycleView;

  private ActivityAllMobileAppsBinding(@NonNull RelativeLayout rootView,
      @NonNull AppBarBinding appBar, @NonNull BottomNavigationView bottomNavigation,
      @NonNull RecyclerView recycleView) {
    this.rootView = rootView;
    this.appBar = appBar;
    this.bottomNavigation = bottomNavigation;
    this.recycleView = recycleView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAllMobileAppsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAllMobileAppsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_all_mobile_apps, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAllMobileAppsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.app_bar;
      View appBar = ViewBindings.findChildViewById(rootView, id);
      if (appBar == null) {
        break missingId;
      }
      AppBarBinding binding_appBar = AppBarBinding.bind(appBar);

      id = R.id.bottom_navigation;
      BottomNavigationView bottomNavigation = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigation == null) {
        break missingId;
      }

      id = R.id.recycle_view;
      RecyclerView recycleView = ViewBindings.findChildViewById(rootView, id);
      if (recycleView == null) {
        break missingId;
      }

      return new ActivityAllMobileAppsBinding((RelativeLayout) rootView, binding_appBar,
          bottomNavigation, recycleView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
