package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5530e extends AbstractC10727e implements InterfaceC14620e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C0576e f11823e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C5363e f11824e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C0576e f11825e = AbstractC14533e.startapp(0);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Drawable f11826e;

    public C5530e(Drawable drawable) {
        this.f11826e = drawable;
        Object obj = AbstractC6845e.ad;
        this.f11823e = AbstractC14533e.startapp(new C2108e((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : AbstractC5092e.ad(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.f11824e = new C5363e(new C10479e(23, this));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // defpackage.InterfaceC14620e
    public final void ad() {
        vip();
    }

    @Override // defpackage.AbstractC10727e
    public final void adcel(InterfaceC2235e interfaceC2235e) {
        InterfaceC14576e m4557this = interfaceC2235e.mo782finally().m4557this();
        ((Number) this.f11825e.getValue()).intValue();
        try {
            m4557this.billing();
            int i = Build.VERSION.SDK_INT;
            Drawable drawable = this.f11826e;
            if (i < 28 || i >= 31 || !(drawable instanceof AnimatedImageDrawable)) {
                drawable.setBounds(0, 0, AbstractC1561e.appmetrica(C2108e.purchase(interfaceC2235e.yandex())), AbstractC1561e.appmetrica(C2108e.metrica(interfaceC2235e.yandex())));
            } else {
                m4557this.ad(C2108e.purchase(interfaceC2235e.yandex()) / C2108e.purchase(startapp()), C2108e.metrica(interfaceC2235e.yandex()) / C2108e.metrica(startapp()));
            }
            Canvas canvas = AbstractC16863e.ad;
            drawable.draw(((C11648e) m4557this).ad);
            m4557this.admob();
        } catch (Throwable th) {
            m4557this.admob();
            throw th;
        }
    }

    @Override // defpackage.AbstractC10727e
    public final boolean appmetrica(C2815e c2815e) {
        this.f11826e.setColorFilter(c2815e != null ? c2815e.ad : null);
        return true;
    }

    @Override // defpackage.AbstractC10727e
    public final boolean license(float f) {
        this.f11826e.setAlpha(AbstractC3062e.metrica(AbstractC1561e.appmetrica(f * 255), 0, 255));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC14620e
    public final void metrica() {
        Drawable.Callback callback = (Drawable.Callback) this.f11824e.getValue();
        Drawable drawable = this.f11826e;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // defpackage.AbstractC10727e
    public final void purchase(EnumC7792e enumC7792e) {
        int i;
        int ordinal = enumC7792e.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                throw new C14803e(10);
            }
        } else {
            i = 0;
        }
        this.f11826e.setLayoutDirection(i);
    }

    @Override // defpackage.AbstractC10727e
    public final long startapp() {
        return ((C2108e) this.f11823e.getValue()).ad;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC14620e
    public final void vip() {
        Drawable drawable = this.f11826e;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }
}
