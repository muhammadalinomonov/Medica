// Generated by view binder compiler. Do not edit!
package uz.gita.a5.medica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.gita.a5.medica.R;

public final class ScreenHomeBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final LinearLayout btnDentist;

  @NonNull
  public final ImageView btnFavourite;

  @NonNull
  public final LinearLayout btnGeneral;

  @NonNull
  public final LinearLayout btnMore;

  @NonNull
  public final LinearLayout btnNeurolog;

  @NonNull
  public final ImageView btnNotifications;

  @NonNull
  public final LinearLayout btnNutrition;

  @NonNull
  public final LinearLayout btnOphthal;

  @NonNull
  public final LinearLayout btnPadiatric;

  @NonNull
  public final LinearLayout btnRadiolog;

  @NonNull
  public final CollapsingToolbarLayout collapsingToolbar;

  @NonNull
  public final LinearLayout container1;

  @NonNull
  public final ConstraintLayout container2;

  @NonNull
  public final View controlView1;

  @NonNull
  public final ImageView imgUser;

  @NonNull
  public final ImageView progress;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final AppCompatEditText searchBar;

  @NonNull
  public final TextView textView1;

  @NonNull
  public final TextView txtNameUser;

  @NonNull
  public final TextView txtSeeAll;

  private ScreenHomeBinding(@NonNull CoordinatorLayout rootView, @NonNull LinearLayout btnDentist,
      @NonNull ImageView btnFavourite, @NonNull LinearLayout btnGeneral,
      @NonNull LinearLayout btnMore, @NonNull LinearLayout btnNeurolog,
      @NonNull ImageView btnNotifications, @NonNull LinearLayout btnNutrition,
      @NonNull LinearLayout btnOphthal, @NonNull LinearLayout btnPadiatric,
      @NonNull LinearLayout btnRadiolog, @NonNull CollapsingToolbarLayout collapsingToolbar,
      @NonNull LinearLayout container1, @NonNull ConstraintLayout container2,
      @NonNull View controlView1, @NonNull ImageView imgUser, @NonNull ImageView progress,
      @NonNull RecyclerView recyclerView, @NonNull AppCompatEditText searchBar,
      @NonNull TextView textView1, @NonNull TextView txtNameUser, @NonNull TextView txtSeeAll) {
    this.rootView = rootView;
    this.btnDentist = btnDentist;
    this.btnFavourite = btnFavourite;
    this.btnGeneral = btnGeneral;
    this.btnMore = btnMore;
    this.btnNeurolog = btnNeurolog;
    this.btnNotifications = btnNotifications;
    this.btnNutrition = btnNutrition;
    this.btnOphthal = btnOphthal;
    this.btnPadiatric = btnPadiatric;
    this.btnRadiolog = btnRadiolog;
    this.collapsingToolbar = collapsingToolbar;
    this.container1 = container1;
    this.container2 = container2;
    this.controlView1 = controlView1;
    this.imgUser = imgUser;
    this.progress = progress;
    this.recyclerView = recyclerView;
    this.searchBar = searchBar;
    this.textView1 = textView1;
    this.txtNameUser = txtNameUser;
    this.txtSeeAll = txtSeeAll;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ScreenHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ScreenHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.screen_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ScreenHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_dentist;
      LinearLayout btnDentist = ViewBindings.findChildViewById(rootView, id);
      if (btnDentist == null) {
        break missingId;
      }

      id = R.id.btn_favourite;
      ImageView btnFavourite = ViewBindings.findChildViewById(rootView, id);
      if (btnFavourite == null) {
        break missingId;
      }

      id = R.id.btn_general;
      LinearLayout btnGeneral = ViewBindings.findChildViewById(rootView, id);
      if (btnGeneral == null) {
        break missingId;
      }

      id = R.id.btn_more;
      LinearLayout btnMore = ViewBindings.findChildViewById(rootView, id);
      if (btnMore == null) {
        break missingId;
      }

      id = R.id.btn_neurolog;
      LinearLayout btnNeurolog = ViewBindings.findChildViewById(rootView, id);
      if (btnNeurolog == null) {
        break missingId;
      }

      id = R.id.btn_notifications;
      ImageView btnNotifications = ViewBindings.findChildViewById(rootView, id);
      if (btnNotifications == null) {
        break missingId;
      }

      id = R.id.btn_nutrition;
      LinearLayout btnNutrition = ViewBindings.findChildViewById(rootView, id);
      if (btnNutrition == null) {
        break missingId;
      }

      id = R.id.btn_ophthal;
      LinearLayout btnOphthal = ViewBindings.findChildViewById(rootView, id);
      if (btnOphthal == null) {
        break missingId;
      }

      id = R.id.btn_padiatric;
      LinearLayout btnPadiatric = ViewBindings.findChildViewById(rootView, id);
      if (btnPadiatric == null) {
        break missingId;
      }

      id = R.id.btn_radiolog;
      LinearLayout btnRadiolog = ViewBindings.findChildViewById(rootView, id);
      if (btnRadiolog == null) {
        break missingId;
      }

      id = R.id.collapsing_toolbar;
      CollapsingToolbarLayout collapsingToolbar = ViewBindings.findChildViewById(rootView, id);
      if (collapsingToolbar == null) {
        break missingId;
      }

      id = R.id.container1;
      LinearLayout container1 = ViewBindings.findChildViewById(rootView, id);
      if (container1 == null) {
        break missingId;
      }

      id = R.id.container2;
      ConstraintLayout container2 = ViewBindings.findChildViewById(rootView, id);
      if (container2 == null) {
        break missingId;
      }

      id = R.id.control_view1;
      View controlView1 = ViewBindings.findChildViewById(rootView, id);
      if (controlView1 == null) {
        break missingId;
      }

      id = R.id.img_user;
      ImageView imgUser = ViewBindings.findChildViewById(rootView, id);
      if (imgUser == null) {
        break missingId;
      }

      id = R.id.progress;
      ImageView progress = ViewBindings.findChildViewById(rootView, id);
      if (progress == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.search_bar;
      AppCompatEditText searchBar = ViewBindings.findChildViewById(rootView, id);
      if (searchBar == null) {
        break missingId;
      }

      id = R.id.textView1;
      TextView textView1 = ViewBindings.findChildViewById(rootView, id);
      if (textView1 == null) {
        break missingId;
      }

      id = R.id.txt_name_user;
      TextView txtNameUser = ViewBindings.findChildViewById(rootView, id);
      if (txtNameUser == null) {
        break missingId;
      }

      id = R.id.txt_see_all;
      TextView txtSeeAll = ViewBindings.findChildViewById(rootView, id);
      if (txtSeeAll == null) {
        break missingId;
      }

      return new ScreenHomeBinding((CoordinatorLayout) rootView, btnDentist, btnFavourite,
          btnGeneral, btnMore, btnNeurolog, btnNotifications, btnNutrition, btnOphthal,
          btnPadiatric, btnRadiolog, collapsingToolbar, container1, container2, controlView1,
          imgUser, progress, recyclerView, searchBar, textView1, txtNameUser, txtSeeAll);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
