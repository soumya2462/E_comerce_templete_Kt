package com.iqonic.woobox.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u001e\u0010\t\u001a\u00020\b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000bj\b\u0012\u0004\u0012\u00020\u0005`\fJ\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016J\u001a\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\bH\u0002J\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0005H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/iqonic/woobox/fragments/MyCartFragment;", "Lcom/iqonic/woobox/fragments/BaseFragment;", "()V", "mCartAdapter", "Lcom/iqonic/woobox/base/BaseRecyclerAdapter;", "Lcom/iqonic/woobox/models/CartResponse;", "Lcom/iqonic/woobox/databinding/ItemCartBinding;", "clearCartItems", "", "invalidateCartLayout", "it", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "invalidatePaymentLayout", "b", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "removeCartItem", "model", "Lcom/iqonic/woobox/models/RequestModel;", "scrollToPriceDetail", "updateCartItem", "app_debug"})
public final class MyCartFragment extends com.iqonic.woobox.fragments.BaseFragment {
    private com.iqonic.woobox.base.BaseRecyclerAdapter<com.iqonic.woobox.models.CartResponse, com.iqonic.woobox.databinding.ItemCartBinding> mCartAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void clearCartItems() {
    }
    
    private final void scrollToPriceDetail() {
    }
    
    private final void invalidatePaymentLayout(boolean b) {
    }
    
    private final void removeCartItem(com.iqonic.woobox.models.RequestModel model) {
    }
    
    private final void updateCartItem(com.iqonic.woobox.models.CartResponse model) {
    }
    
    public final void invalidateCartLayout(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.iqonic.woobox.models.CartResponse> it) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    public MyCartFragment() {
        super();
    }
}