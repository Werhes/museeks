package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؓٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1964e implements InterfaceC10819e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final View f5163e;

    public C1964e(ImageView imageView) {
        this.f5163e = imageView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1964e) && AbstractC7890e.billing(this.f5163e, ((C1964e) obj).f5163e);
    }

    public final int hashCode() {
        return (this.f5163e.hashCode() * 31) + 1231;
    }

    public final String toString() {
        return "RealViewSizeResolver(view=" + this.f5163e + ", subtractPadding=true)";
    }

    @Override // defpackage.InterfaceC10819e
    public final Object vip(AbstractC10731e abstractC10731e) {
        C16320e remoteconfig = AbstractC8647e.remoteconfig(this);
        if (remoteconfig != null) {
            return remoteconfig;
        }
        C13578e c13578e = new C13578e(1, AbstractC10558e.startapp(abstractC10731e));
        c13578e.tapsense();
        ViewTreeObserver viewTreeObserver = this.f5163e.getViewTreeObserver();
        ViewTreeObserverOnPreDrawListenerC13670e viewTreeObserverOnPreDrawListenerC13670e = new ViewTreeObserverOnPreDrawListenerC13670e(this, viewTreeObserver, c13578e);
        viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC13670e);
        c13578e.inmobi(new C8286e(2, this, viewTreeObserver, viewTreeObserverOnPreDrawListenerC13670e));
        return c13578e.signatures();
    }
}
