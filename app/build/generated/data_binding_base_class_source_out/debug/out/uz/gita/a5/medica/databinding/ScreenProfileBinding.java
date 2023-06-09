// Generated by view binder compiler. Do not edit!
package uz.gita.a5.medica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.gita.a5.medica.R;

public final class ScreenProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ShapeableImageView avatar;

  @NonNull
  public final ImageView btnBack;

  @NonNull
  public final TextView btnContinue;

  @NonNull
  public final ImageView btnEdit;

  @NonNull
  public final EditText editDate;

  @NonNull
  public final EditText editEmail;

  @NonNull
  public final EditText editFullName;

  @NonNull
  public final EditText editGenter;

  @NonNull
  public final EditText editNickName;

  private ScreenProfileBinding(@NonNull ConstraintLayout rootView,
      @NonNull ShapeableImageView avatar, @NonNull ImageView btnBack, @NonNull TextView btnContinue,
      @NonNull ImageView btnEdit, @NonNull EditText editDate, @NonNull EditText editEmail,
      @NonNull EditText editFullName, @NonNull EditText editGenter,
      @NonNull EditText editNickName) {
    this.rootView = rootView;
    this.avatar = avatar;
    this.btnBack = btnBack;
    this.btnContinue = btnContinue;
    this.btnEdit = btnEdit;
    this.editDate = editDate;
    this.editEmail = editEmail;
    this.editFullName = editFullName;
    this.editGenter = editGenter;
    this.editNickName = editNickName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ScreenProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ScreenProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.screen_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ScreenProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.avatar;
      ShapeableImageView avatar = ViewBindings.findChildViewById(rootView, id);
      if (avatar == null) {
        break missingId;
      }

      id = R.id.btn_back;
      ImageView btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btn_continue;
      TextView btnContinue = ViewBindings.findChildViewById(rootView, id);
      if (btnContinue == null) {
        break missingId;
      }

      id = R.id.btn_edit;
      ImageView btnEdit = ViewBindings.findChildViewById(rootView, id);
      if (btnEdit == null) {
        break missingId;
      }

      id = R.id.edit_date;
      EditText editDate = ViewBindings.findChildViewById(rootView, id);
      if (editDate == null) {
        break missingId;
      }

      id = R.id.edit_email;
      EditText editEmail = ViewBindings.findChildViewById(rootView, id);
      if (editEmail == null) {
        break missingId;
      }

      id = R.id.edit_full_name;
      EditText editFullName = ViewBindings.findChildViewById(rootView, id);
      if (editFullName == null) {
        break missingId;
      }

      id = R.id.edit_genter;
      EditText editGenter = ViewBindings.findChildViewById(rootView, id);
      if (editGenter == null) {
        break missingId;
      }

      id = R.id.edit_nick_name;
      EditText editNickName = ViewBindings.findChildViewById(rootView, id);
      if (editNickName == null) {
        break missingId;
      }

      return new ScreenProfileBinding((ConstraintLayout) rootView, avatar, btnBack, btnContinue,
          btnEdit, editDate, editEmail, editFullName, editGenter, editNickName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
