package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؕۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3212e implements InterfaceC17868e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Toolbar f7330e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C9995e f7331e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public MenuC8939e f7332e;

    public C3212e(Toolbar toolbar) {
        this.f7330e = toolbar;
    }

    @Override // defpackage.InterfaceC17868e
    public final boolean appmetrica(C9995e c9995e) {
        Toolbar toolbar = this.f7330e;
        KeyEvent.Callback callback = toolbar.f248e;
        if (callback instanceof InterfaceC7802e) {
            ((C4875e) ((InterfaceC7802e) callback)).f10346e.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f248e);
        toolbar.removeView(toolbar.f268e);
        toolbar.f248e = null;
        ArrayList arrayList = toolbar.f239e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f7331e = null;
        toolbar.requestLayout();
        c9995e.f19734e = false;
        c9995e.f19728e.Signature(false);
        toolbar.tapsense();
        return true;
    }

    @Override // defpackage.InterfaceC17868e
    public final boolean license() {
        return false;
    }

    @Override // defpackage.InterfaceC17868e
    public final boolean metrica(SubMenuC1355e subMenuC1355e) {
        return false;
    }

    @Override // defpackage.InterfaceC17868e
    public final void mopub(Context context, MenuC8939e menuC8939e) {
        C9995e c9995e;
        MenuC8939e menuC8939e2 = this.f7332e;
        if (menuC8939e2 != null && (c9995e = this.f7331e) != null) {
            menuC8939e2.license(c9995e);
        }
        this.f7332e = menuC8939e;
    }

    @Override // defpackage.InterfaceC17868e
    public final void startapp() {
        if (this.f7331e != null) {
            MenuC8939e menuC8939e = this.f7332e;
            if (menuC8939e != null) {
                int size = menuC8939e.f17947e.size();
                for (int i = 0; i < size; i++) {
                    if (this.f7332e.getItem(i) == this.f7331e) {
                        return;
                    }
                }
            }
            appmetrica(this.f7331e);
        }
    }

    @Override // defpackage.InterfaceC17868e
    public final void vip(MenuC8939e menuC8939e, boolean z) {
    }

    @Override // defpackage.InterfaceC17868e
    public final boolean yandex(C9995e c9995e) {
        Toolbar toolbar = this.f7330e;
        toolbar.metrica();
        ViewParent parent = toolbar.f268e.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f268e);
            }
            toolbar.addView(toolbar.f268e);
        }
        View actionView = c9995e.getActionView();
        toolbar.f248e = actionView;
        this.f7331e = c9995e;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f248e);
            }
            C16533e yandex = Toolbar.yandex();
            yandex.ad = (toolbar.f230e & 112) | 8388611;
            yandex.vip = 2;
            toolbar.f248e.setLayoutParams(yandex);
            toolbar.addView(toolbar.f248e);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C16533e) childAt.getLayoutParams()).vip != 2 && childAt != toolbar.f265e) {
                toolbar.removeViewAt(childCount);
                toolbar.f239e.add(childAt);
            }
        }
        toolbar.requestLayout();
        c9995e.f19734e = true;
        c9995e.f19728e.Signature(false);
        KeyEvent.Callback callback = toolbar.f248e;
        if (callback instanceof InterfaceC7802e) {
            ((C4875e) ((InterfaceC7802e) callback)).f10346e.onActionViewExpanded();
        }
        toolbar.tapsense();
        return true;
    }
}
