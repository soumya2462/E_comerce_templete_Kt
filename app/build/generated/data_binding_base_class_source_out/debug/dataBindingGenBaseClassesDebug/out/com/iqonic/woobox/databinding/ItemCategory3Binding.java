// Generated by data binding compiler. Do not edit!
package com.iqonic.woobox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqonic.woobox.R;
import com.iqonic.woobox.base.BaseRecyclerAdapter;
import com.iqonic.woobox.models.CategoryData;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemCategory3Binding extends ViewDataBinding {
  @NonNull
  public final ImageView ivCategory;

  @NonNull
  public final LinearLayout llMen;

  @NonNull
  public final TextView tvCatName;

  @Bindable
  protected CategoryData mModel;

  @Bindable
  protected BaseRecyclerAdapter.OnClickListener mCallback;

  protected ItemCategory3Binding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView ivCategory, LinearLayout llMen, TextView tvCatName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivCategory = ivCategory;
    this.llMen = llMen;
    this.tvCatName = tvCatName;
  }

  public abstract void setModel(@Nullable CategoryData model);

  @Nullable
  public CategoryData getModel() {
    return mModel;
  }

  public abstract void setCallback(@Nullable BaseRecyclerAdapter.OnClickListener callback);

  @Nullable
  public BaseRecyclerAdapter.OnClickListener getCallback() {
    return mCallback;
  }

  @NonNull
  public static ItemCategory3Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_category_3, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemCategory3Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemCategory3Binding>inflateInternal(inflater, R.layout.item_category_3, root, attachToRoot, component);
  }

  @NonNull
  public static ItemCategory3Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_category_3, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemCategory3Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemCategory3Binding>inflateInternal(inflater, R.layout.item_category_3, null, false, component);
  }

  public static ItemCategory3Binding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemCategory3Binding bind(@NonNull View view, @Nullable Object component) {
    return (ItemCategory3Binding)bind(component, view, R.layout.item_category_3);
  }
}
