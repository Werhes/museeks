package defpackage;

import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12688e extends AbstractC10347e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C0576e f25432e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final String f25433e;

    public C12688e() {
        super(0);
        StringBuilder sb = new StringBuilder("adb shell pm grant ");
        VKXApplication vKXApplication = VKXApplication.f36528e;
        sb.append((vKXApplication == null ? null : vKXApplication).getPackageName());
        sb.append(" android.permission.SET_VOLUME_KEY_LONG_PRESS_LISTENER");
        this.f25433e = sb.toString();
        this.f25432e = AbstractC14533e.startapp(Boolean.FALSE);
    }

    /* renamed from: private, reason: not valid java name */
    public static final void m3377private(C12688e c12688e) {
        c12688e.getClass();
        AbstractC6232e.billing(new C1748e(!((Boolean) AbstractC16524e.startapp.ad()).booleanValue(), ((Boolean) AbstractC16524e.adcel.ad()).booleanValue()), AbstractC4608e.metrica(c12688e.vip()));
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        c13770e.m3671package(-1774710809);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            C5958e ad = AbstractC9083e.ad(c13770e);
            if (((Boolean) this.f25432e.getValue()).booleanValue()) {
                c13770e.m3676strictfp(637898484);
                m3378strictfp(c13770e, i2 & 14);
            } else {
                c13770e.m3676strictfp(634097915);
            }
            c13770e.Signature(false);
            AbstractC13348e.ad(null, AbstractC16653e.license(839670443, new C9130e(ad, this, 27), c13770e), null, null, null, 0, 0L, 0L, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).license(c13770e), AbstractC16653e.license(801564150, new C8937e(ad, this, 15), c13770e), c13770e, 805306416, 253);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C12167e(this, i, 0);
        }
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m3378strictfp(C13770e c13770e, int i) {
        c13770e.m3671package(609863934);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C3547e(this, 4);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC9262e.ad((Function0) m3681throw, AbstractC16653e.license(626765750, new C12167e(this, 2), c13770e), null, AbstractC16653e.license(-203887884, new C12167e(this, 3), c13770e), AbstractC13461e.signatures, AbstractC13461e.tapsense, AbstractC16653e.license(-1449868335, new C12167e(this, 4), c13770e), null, 0L, 0L, 0L, 0L, 0.0f, null, c13770e, 1797168, 0, 16260);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C12167e(this, i, 5);
        }
    }
}
