package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17515e extends AbstractC18491e {
    public int adcel;
    public final C2946e appmetrica;
    public AbstractC18491e billing;
    public final C2946e purchase;
    public C5891e startapp;
    public AbstractC18491e yandex;

    public C17515e(C2946e c2946e, C2946e c2946e2) {
        this.appmetrica = c2946e;
        this.purchase = c2946e2;
    }

    @Override // defpackage.AbstractC18491e
    public final void advert(String str) {
    }

    public final void loadAd(int i) {
        if (this.adcel == i) {
            return;
        }
        this.adcel = i;
        if (i == 0) {
            AbstractC18491e abstractC18491e = this.billing;
            if (abstractC18491e == null) {
                abstractC18491e = null;
            }
            View startapp = abstractC18491e.startapp();
            if (startapp != null) {
                AbstractC17680e.yandex(startapp);
            }
            AbstractC18491e abstractC18491e2 = this.yandex;
            View startapp2 = (abstractC18491e2 != null ? abstractC18491e2 : null).startapp();
            if (startapp2 != null) {
                AbstractC17680e.billing(startapp2);
                return;
            }
            return;
        }
        if (i != 1) {
            return;
        }
        AbstractC18491e abstractC18491e3 = this.billing;
        if (abstractC18491e3 == null) {
            abstractC18491e3 = null;
        }
        View startapp3 = abstractC18491e3.startapp();
        if (startapp3 != null) {
            AbstractC17680e.billing(startapp3);
        }
        AbstractC18491e abstractC18491e4 = this.yandex;
        View startapp4 = (abstractC18491e4 != null ? abstractC18491e4 : null).startapp();
        if (startapp4 != null) {
            AbstractC17680e.yandex(startapp4);
        }
    }

    @Override // defpackage.AbstractC18491e
    public final void mopub() {
        AbstractC18491e abstractC18491e = this.billing;
        if (abstractC18491e == null) {
            abstractC18491e = null;
        }
        abstractC18491e.mopub();
        AbstractC18491e abstractC18491e2 = this.yandex;
        (abstractC18491e2 != null ? abstractC18491e2 : null).mopub();
    }

    @Override // defpackage.AbstractC18491e
    public final View purchase(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.vkxui_toolbar_fl, viewGroup, false);
        AppBarLayout appBarLayout = (AppBarLayout) inflate;
        FrameLayout frameLayout = (FrameLayout) AbstractC7779e.vip(inflate, R.id.content);
        if (frameLayout == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.content)));
        }
        this.startapp = new C5891e(appBarLayout, frameLayout, 25);
        this.billing = (AbstractC18491e) this.appmetrica.invoke();
        this.yandex = (AbstractC18491e) this.purchase.invoke();
        C5891e c5891e = this.startapp;
        if (c5891e == null) {
            c5891e = null;
        }
        FrameLayout frameLayout2 = (FrameLayout) c5891e.f12439e;
        AbstractC18491e abstractC18491e = this.billing;
        if (abstractC18491e == null) {
            abstractC18491e = null;
        }
        frameLayout2.addView(abstractC18491e.purchase(context, viewGroup));
        AbstractC18491e abstractC18491e2 = this.yandex;
        if (abstractC18491e2 == null) {
            abstractC18491e2 = null;
        }
        View purchase = abstractC18491e2.purchase(context, viewGroup);
        if (purchase != null) {
            purchase.setVisibility(8);
        }
        frameLayout2.addView(purchase);
        C5891e c5891e2 = this.startapp;
        if (c5891e2 == null) {
            c5891e2 = null;
        }
        AppBarLayout appBarLayout2 = (AppBarLayout) c5891e2.f12440e;
        C3663e c3663e = new C3663e();
        c3663e.ad = 0;
        appBarLayout2.setLayoutParams(c3663e);
        C5891e c5891e3 = this.startapp;
        return (AppBarLayout) (c5891e3 != null ? c5891e3 : null).f12440e;
    }

    @Override // defpackage.AbstractC18491e
    public final void smaato(int i) {
        AbstractC18491e abstractC18491e = this.billing;
        if (abstractC18491e != null) {
            if (abstractC18491e == null) {
                abstractC18491e = null;
            }
            abstractC18491e.smaato(i);
        }
        AbstractC18491e abstractC18491e2 = this.yandex;
        if (abstractC18491e2 != null) {
            (abstractC18491e2 != null ? abstractC18491e2 : null).smaato(i);
        }
    }

    @Override // defpackage.AbstractC18491e
    public final View startapp() {
        C5891e c5891e = this.startapp;
        if (c5891e == null) {
            c5891e = null;
        }
        return (AppBarLayout) c5891e.f12440e;
    }
}
