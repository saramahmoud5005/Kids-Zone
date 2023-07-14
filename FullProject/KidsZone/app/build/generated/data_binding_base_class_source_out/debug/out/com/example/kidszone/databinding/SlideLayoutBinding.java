// Generated by view binder compiler. Do not edit!
package com.example.kidszone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kidszone.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SlideLayoutBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView privacyPolicyLinkPopup;

  @NonNull
  public final TextView slideDescription;

  @NonNull
  public final TextView slideHeading;

  @NonNull
  public final ImageView slideImg;

  private SlideLayoutBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView privacyPolicyLinkPopup, @NonNull TextView slideDescription,
      @NonNull TextView slideHeading, @NonNull ImageView slideImg) {
    this.rootView = rootView;
    this.privacyPolicyLinkPopup = privacyPolicyLinkPopup;
    this.slideDescription = slideDescription;
    this.slideHeading = slideHeading;
    this.slideImg = slideImg;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SlideLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SlideLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.slide_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SlideLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.privacy_policy_link_popup;
      TextView privacyPolicyLinkPopup = ViewBindings.findChildViewById(rootView, id);
      if (privacyPolicyLinkPopup == null) {
        break missingId;
      }

      id = R.id.slide_description;
      TextView slideDescription = ViewBindings.findChildViewById(rootView, id);
      if (slideDescription == null) {
        break missingId;
      }

      id = R.id.slide_heading;
      TextView slideHeading = ViewBindings.findChildViewById(rootView, id);
      if (slideHeading == null) {
        break missingId;
      }

      id = R.id.slide_img;
      ImageView slideImg = ViewBindings.findChildViewById(rootView, id);
      if (slideImg == null) {
        break missingId;
      }

      return new SlideLayoutBinding((RelativeLayout) rootView, privacyPolicyLinkPopup,
          slideDescription, slideHeading, slideImg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
