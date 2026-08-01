package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٔؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14712e {
    public final WeakReference ad;

    public C14712e(View view) {
        this.ad = new WeakReference(view);
    }

    public final void ad(float f) {
        View view = (View) this.ad.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void appmetrica(float f) {
        View view = (View) this.ad.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public final void license(InterfaceC18180e interfaceC18180e) {
        View view = (View) this.ad.get();
        if (view != null) {
            if (interfaceC18180e != null) {
                view.animate().setListener(new C9380e(interfaceC18180e, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void metrica(long j) {
        View view = (View) this.ad.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void vip() {
        View view = (View) this.ad.get();
        if (view != null) {
            view.animate().cancel();
        }
    }
}
