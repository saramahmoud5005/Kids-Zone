// Generated by view binder compiler. Do not edit!
package com.example.kidszone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kidszone.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityScreenBlockerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView appIcon;

  @NonNull
  public final AppCompatButton closeBlockScreenBtn;

  @NonNull
  public final TextView emptyBlockedListText;

  @NonNull
  public final LinearLayout emptyListLayout;

  private ActivityScreenBlockerBinding(@NonNull LinearLayout rootView, @NonNull ImageView appIcon,
      @NonNull AppCompatButton closeBlockScreenBtn, @NonNull TextView emptyBlockedListText,
      @NonNull LinearLayout emptyListLayout) {
    this.rootView = rootView;
    this.appIcon = appIcon;
    this.closeBlockScreenBtn = closeBlockScreenBtn;
    this.emptyBlockedListText = emptyBlockedListText;
    this.emptyListLayout = emptyListLayout;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityScreenBlockerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityScreenBlockerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_screen_blocker, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityScreenBlockerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.app_icon;
      ImageView appIcon = ViewBindings.findChildViewById(rootView, id);
      if (appIcon == null) {
        break missingId;
      }

      id = R.id.close_block_screen_btn;
      AppCompatButton closeBlockScreenBtn = ViewBindings.findChildViewById(rootView, id);
      if (closeBlockScreenBtn == null) {
        break missingId;
      }

      id = R.id.empty_blocked_list_text;
      TextView emptyBlockedListText = ViewBindings.findChildViewById(rootView, id);
      if (emptyBlockedListText == null) {
        break missingId;
      }

      LinearLayout emptyListLayout = (LinearLayout) rootView;

      return new ActivityScreenBlockerBinding((LinearLayout) rootView, appIcon, closeBlockScreenBtn,
          emptyBlockedListText, emptyListLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
