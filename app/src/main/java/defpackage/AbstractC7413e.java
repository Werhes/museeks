package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۙؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7413e implements InterfaceC13836e, InterfaceC17868e, AdapterView.OnItemClickListener {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Rect f15178e;

    public static int smaato(ListAdapter listAdapter, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public abstract void Signature(int i);

    public abstract void admob(int i);

    public abstract void advert(MenuC8939e menuC8939e);

    public abstract void amazon(View view);

    @Override // defpackage.InterfaceC17868e
    public final boolean appmetrica(C9995e c9995e) {
        return false;
    }

    public abstract void loadAd(boolean z);

    @Override // defpackage.InterfaceC17868e
    public final void mopub(Context context, MenuC8939e menuC8939e) {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C13856e) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C13856e) listAdapter).f27442e.admob((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC8330e) ? 0 : 4);
    }

    public abstract void pro(int i);

    public abstract void remoteconfig(boolean z);

    public abstract void subscription(PopupWindow.OnDismissListener onDismissListener);

    @Override // defpackage.InterfaceC17868e
    public final boolean yandex(C9995e c9995e) {
        return false;
    }
}
