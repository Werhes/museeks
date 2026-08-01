package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC7872e extends AbstractC15825e implements Runnable, InterfaceC0569e, View.OnAttachStateChangeListener {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f15932e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C8845e f15933e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f15934e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C12948e f15935e;

    public RunnableC7872e(C8845e c8845e) {
        super(!c8845e.pro ? 1 : 0);
        this.f15933e = c8845e;
    }

    @Override // defpackage.AbstractC15825e
    public final void advert(C12773e c12773e) {
        this.f15934e = false;
        this.f15932e = false;
        C12948e c12948e = this.f15935e;
        if (c12773e.ad.vip() > 0 && c12948e != null) {
            C2893e c2893e = c12948e.ad;
            C8845e c8845e = this.f15933e;
            c8845e.remoteconfig.purchase(AbstractC10510e.billing(c2893e.startapp(8)));
            c8845e.subscription.purchase(AbstractC10510e.billing(c2893e.startapp(8)));
            C8845e.vip(c8845e, c12948e);
        }
        this.f15935e = null;
    }

    @Override // defpackage.AbstractC15825e
    public final C12948e amazon(C12948e c12948e, List list) {
        C8845e c8845e = this.f15933e;
        C8845e.vip(c8845e, c12948e);
        return c8845e.pro ? C12948e.vip : c12948e;
    }

    @Override // defpackage.InterfaceC0569e
    /* renamed from: extends */
    public final C12948e mo378extends(View view, C12948e c12948e) {
        this.f15935e = c12948e;
        C8845e c8845e = this.f15933e;
        C0675e c0675e = c8845e.subscription;
        C2893e c2893e = c12948e.ad;
        c0675e.purchase(AbstractC10510e.billing(c2893e.startapp(8)));
        if (this.f15934e) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f15932e) {
            c8845e.remoteconfig.purchase(AbstractC10510e.billing(c2893e.startapp(8)));
            C8845e.vip(c8845e, c12948e);
        }
        return c8845e.pro ? C12948e.vip : c12948e;
    }

    @Override // defpackage.AbstractC15825e
    public final C7302e loadAd(C12773e c12773e, C7302e c7302e) {
        this.f15934e = false;
        return c7302e;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f15934e) {
            this.f15934e = false;
            this.f15932e = false;
            C12948e c12948e = this.f15935e;
            if (c12948e != null) {
                C8845e c8845e = this.f15933e;
                c8845e.remoteconfig.purchase(AbstractC10510e.billing(c12948e.ad.startapp(8)));
                C8845e.vip(c8845e, c12948e);
                this.f15935e = null;
            }
        }
    }

    @Override // defpackage.AbstractC15825e
    public final void smaato(C12773e c12773e) {
        this.f15934e = true;
        this.f15932e = true;
    }
}
