package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٜٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11819e extends C15703e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final int f23698e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final int f23699e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public InterfaceC3608e f23700e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public C9995e f23701e;

    public C11819e(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f23698e = 21;
            this.f23699e = 22;
        } else {
            this.f23698e = 22;
            this.f23699e = 21;
        }
    }

    @Override // defpackage.C15703e, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C13856e c13856e;
        int i;
        int pointToPosition;
        int i2;
        if (this.f23700e != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c13856e = (C13856e) headerViewListAdapter.getWrappedAdapter();
            } else {
                c13856e = (C13856e) adapter;
                i = 0;
            }
            C9995e item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= c13856e.getCount()) ? null : c13856e.getItem(i2);
            C9995e c9995e = this.f23701e;
            if (c9995e != item) {
                MenuC8939e menuC8939e = c13856e.f27442e;
                if (c9995e != null) {
                    this.f23700e.license(menuC8939e, c9995e);
                }
                this.f23701e = item;
                if (item != null) {
                    this.f23700e.mopub(menuC8939e, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f23698e) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f23699e) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C13856e) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C13856e) adapter).f27442e.metrica(false);
        return true;
    }

    public void setHoverListener(InterfaceC3608e interfaceC3608e) {
        this.f23700e = interfaceC3608e;
    }

    @Override // defpackage.C15703e, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
