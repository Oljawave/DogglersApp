// Generated by view binder compiler. Do not edit!
package com.example.dogglers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.dogglers.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class VerticalHorizontalListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView tvAge;

  @NonNull
  public final TextView tvHobbies;

  @NonNull
  public final TextView tvName;

  private VerticalHorizontalListItemBinding(@NonNull MaterialCardView rootView,
      @NonNull ImageView imageView, @NonNull TextView tvAge, @NonNull TextView tvHobbies,
      @NonNull TextView tvName) {
    this.rootView = rootView;
    this.imageView = imageView;
    this.tvAge = tvAge;
    this.tvHobbies = tvHobbies;
    this.tvName = tvName;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static VerticalHorizontalListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static VerticalHorizontalListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.vertical_horizontal_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static VerticalHorizontalListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.image_view;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.tv_age;
      TextView tvAge = ViewBindings.findChildViewById(rootView, id);
      if (tvAge == null) {
        break missingId;
      }

      id = R.id.tv_hobbies;
      TextView tvHobbies = ViewBindings.findChildViewById(rootView, id);
      if (tvHobbies == null) {
        break missingId;
      }

      id = R.id.tv_name;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      return new VerticalHorizontalListItemBinding((MaterialCardView) rootView, imageView, tvAge,
          tvHobbies, tvName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
