// Generated by view binder compiler. Do not edit!
package com.example.kidszone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kidszone.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityScreenTimeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppBarBinding appBar;

  @NonNull
  public final TextView editResetThreshold;

  @NonNull
  public final AppCompatButton setTimerButton;

  @NonNull
  public final AppCompatButton startTimerButton;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textViewTime;

  private ActivityScreenTimeBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppBarBinding appBar, @NonNull TextView editResetThreshold,
      @NonNull AppCompatButton setTimerButton, @NonNull AppCompatButton startTimerButton,
      @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textViewTime) {
    this.rootView = rootView;
    this.appBar = appBar;
    this.editResetThreshold = editResetThreshold;
    this.setTimerButton = setTimerButton;
    this.startTimerButton = startTimerButton;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.textViewTime = textViewTime;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityScreenTimeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityScreenTimeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_screen_time, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityScreenTimeBinding bind(@NonNull View rootView) {
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

      id = R.id.edit_reset_threshold;
      TextView editResetThreshold = ViewBindings.findChildViewById(rootView, id);
      if (editResetThreshold == null) {
        break missingId;
      }

      id = R.id.set_timer_button;
      AppCompatButton setTimerButton = ViewBindings.findChildViewById(rootView, id);
      if (setTimerButton == null) {
        break missingId;
      }

      id = R.id.start_timer_button;
      AppCompatButton startTimerButton = ViewBindings.findChildViewById(rootView, id);
      if (startTimerButton == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView_time;
      TextView textViewTime = ViewBindings.findChildViewById(rootView, id);
      if (textViewTime == null) {
        break missingId;
      }

      return new ActivityScreenTimeBinding((ConstraintLayout) rootView, binding_appBar,
          editResetThreshold, setTimerButton, startTimerButton, textView4, textView5, textViewTime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
