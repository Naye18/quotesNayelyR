// Generated by view binder compiler. Do not edit!
package edu.itvo.quotescelebrities.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import edu.itvo.quotescelebrities.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentQuoteRandomBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView tvAuthor;

  @NonNull
  public final TextView tvQuote;

  @NonNull
  public final ConstraintLayout viewContainer;

  private FragmentQuoteRandomBinding(@NonNull ConstraintLayout rootView, @NonNull TextView tvAuthor,
      @NonNull TextView tvQuote, @NonNull ConstraintLayout viewContainer) {
    this.rootView = rootView;
    this.tvAuthor = tvAuthor;
    this.tvQuote = tvQuote;
    this.viewContainer = viewContainer;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentQuoteRandomBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentQuoteRandomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_quote_random, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentQuoteRandomBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tvAuthor;
      TextView tvAuthor = ViewBindings.findChildViewById(rootView, id);
      if (tvAuthor == null) {
        break missingId;
      }

      id = R.id.tvQuote;
      TextView tvQuote = ViewBindings.findChildViewById(rootView, id);
      if (tvQuote == null) {
        break missingId;
      }

      ConstraintLayout viewContainer = (ConstraintLayout) rootView;

      return new FragmentQuoteRandomBinding((ConstraintLayout) rootView, tvAuthor, tvQuote,
          viewContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
