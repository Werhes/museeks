package defpackage;

import android.os.Build;
import java.util.Collections;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7888e extends AbstractC10347e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C0576e f15962e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C0576e f15963e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C0576e f15964e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C0576e f15965e;

    public C7888e() {
        super(0);
        this.f15963e = AbstractC14533e.startapp(Boolean.FALSE);
        C15409e.ad.getClass();
        this.f15962e = AbstractC14533e.startapp(C15409e.subscription.ad());
        this.f15964e = AbstractC14533e.startapp(C15409e.pro.ad());
        this.f15965e = AbstractC14533e.startapp(C15409e.signatures.ad());
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        c13770e.m3671package(1257862850);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            C5958e ad = AbstractC9083e.ad(c13770e);
            if (((Boolean) this.f15963e.getValue()).booleanValue()) {
                c13770e.m3676strictfp(-597287470);
                m2351strictfp(c13770e, i2 & 14);
            } else {
                c13770e.m3676strictfp(-600142880);
            }
            c13770e.Signature(false);
            AbstractC13348e.ad(null, AbstractC16653e.license(-1227845250, new C6949e(ad, this, 16), c13770e), null, null, null, 0, 0L, 0L, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).license(c13770e), AbstractC16653e.license(18108243, new C8937e(ad, this, 1), c13770e), c13770e, 805306416, 253);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C10624e(this, i, 3);
        }
    }

    /* renamed from: package, reason: not valid java name */
    public final void m2349package(boolean z) {
        if (!z) {
            Boolean bool = Boolean.FALSE;
            this.f15964e.setValue(bool);
            C15409e.ad.getClass();
            C15409e.pro.vip(bool);
            return;
        }
        AppActivity appActivity = (AppActivity) pro();
        C10277e c10277e = new C10277e(this, 4);
        if (appActivity == null) {
            c10277e.invoke();
        } else if (Build.VERSION.SDK_INT >= 33) {
            appActivity.premium(Collections.singletonList("android.permission.POST_NOTIFICATIONS"), new C6868e(c10277e, appActivity, 1));
        } else {
            c10277e.invoke();
        }
    }

    /* renamed from: private, reason: not valid java name */
    public final void m2350private(boolean z) {
        if (!z) {
            Boolean bool = Boolean.FALSE;
            this.f15962e.setValue(bool);
            C15409e.ad.getClass();
            C15409e.subscription.vip(bool);
            return;
        }
        AppActivity appActivity = (AppActivity) pro();
        C10277e c10277e = new C10277e(this, 5);
        if (appActivity == null) {
            c10277e.invoke();
        } else if (Build.VERSION.SDK_INT >= 31) {
            appActivity.premium(Collections.singletonList("android.permission.BLUETOOTH_CONNECT"), new C6868e(c10277e, appActivity, 0));
        } else {
            c10277e.invoke();
        }
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m2351strictfp(C13770e c13770e, int i) {
        c13770e.m3671package(-606843951);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C10277e(this, 6);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC9262e.ad((Function0) m3681throw, AbstractC16653e.license(78021769, new C10624e(this, 5), c13770e), null, null, null, AbstractC8797e.mopub, AbstractC16653e.license(41341412, new C10624e(this, 6), c13770e), null, 0L, 0L, 0L, 0L, 0.0f, null, c13770e, 1769520, 0, 16284);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C10624e(this, i, 7);
        }
    }
}
