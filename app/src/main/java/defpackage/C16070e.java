package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16070e extends AbstractC10347e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C0576e f31640e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final String f31641e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final String f31642e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C0576e f31643e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final String f31644e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C0576e f31645e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C0576e f31646e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final String f31647e;

    public C16070e(String str, String str2, String str3, String str4, C9875e c9875e) {
        super(0);
        this.f31642e = str;
        this.f31641e = str2;
        this.f31644e = str3;
        this.f31647e = str4;
        Boolean bool = Boolean.FALSE;
        this.f31640e = AbstractC14533e.startapp(bool);
        this.f31643e = AbstractC14533e.startapp(bool);
        this.f31645e = AbstractC14533e.startapp(BuildConfig.FLAVOR);
        this.f31646e = AbstractC14533e.startapp(c9875e);
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        c13770e.m3671package(709296586);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        byte b = 0;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC5083e interfaceC5083e = null;
            C12380e tapsense = AbstractC12947e.tapsense(null, c13770e, 3);
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (m3681throw == obj) {
                C6260e c6260e = C6260e.vip;
                m3681throw = C11080e.ad;
                c13770e.m3682throws(m3681throw);
            }
            ((C11080e) m3681throw).getClass();
            C6260e c6260e2 = new C6260e();
            InterfaceC3965e interfaceC3965e = (InterfaceC3965e) c13770e.adcel(AbstractC11473e.admob);
            EnumC16168e enumC16168e = m4107strictfp().ad;
            boolean yandex = c13770e.yandex(this);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex || m3681throw2 == obj) {
                m3681throw2 = new C9042e(this, interfaceC5083e, 20);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC17680e.license(c13770e, enumC16168e, (Function2) m3681throw2);
            AbstractC13348e.ad(null, AbstractC16653e.license(2085929350, new C2622e(this, b, b), c13770e), null, null, null, 0, 0L, 0L, null, AbstractC16653e.license(1394614555, new C12050e(this, tapsense, interfaceC3965e, c6260e2, 3), c13770e), c13770e, 805306416, 509);
            Unit unit = Unit.INSTANCE;
            boolean purchase = c13770e.purchase(c6260e2);
            Object m3681throw3 = c13770e.m3681throw();
            if (purchase || m3681throw3 == obj) {
                m3681throw3 = new C2733e(c6260e2, null, 2);
                c13770e.m3682throws(m3681throw3);
            }
            AbstractC17680e.license(c13770e, unit, (Function2) m3681throw3);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2622e(this, i);
        }
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final C9875e m4107strictfp() {
        return (C9875e) this.f31646e.getValue();
    }
}
