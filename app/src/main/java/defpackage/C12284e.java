package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؗٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12284e extends AbstractC10347e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C0576e f24632e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final String f24633e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final String f24634e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C0576e f24635e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final boolean f24636e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C0576e f24637e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C0576e f24638e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C0576e f24639e;

    public C12284e(String str, String str2, boolean z, C4851e c4851e) {
        super(0);
        this.f24634e = str;
        this.f24633e = str2;
        this.f24636e = z;
        Boolean bool = Boolean.FALSE;
        this.f24639e = AbstractC14533e.startapp(bool);
        this.f24632e = AbstractC14533e.startapp(bool);
        this.f24635e = AbstractC14533e.startapp(bool);
        this.f24637e = AbstractC14533e.startapp(BuildConfig.FLAVOR);
        this.f24638e = AbstractC14533e.startapp(c4851e);
    }

    /* renamed from: strictfp, reason: not valid java name */
    public static final void m3331strictfp(C12284e c12284e, AbstractC9200e abstractC9200e, C6064e c6064e) {
        if (abstractC9200e instanceof C9022e) {
            C4851e m3334private = c12284e.m3334private();
            EnumC10783e enumC10783e = c6064e.ad;
            if (enumC10783e == null) {
                enumC10783e = EnumC10783e.RESERVE_CODE;
            }
            String str = c6064e.license;
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            c12284e.f24638e.setValue(C4851e.ad(m3334private, enumC10783e, str));
            return;
        }
        c12284e.getClass();
        if (!(abstractC9200e instanceof C7220e)) {
            throw new C14803e(10);
        }
        StringBuilder sb = new StringBuilder("[RS/");
        C7220e c7220e = (C7220e) abstractC9200e;
        sb.append(c7220e.ad);
        sb.append("] ");
        sb.append(c7220e.vip);
        c12284e.m3333package(sb.toString());
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        c13770e.m3671package(503079452);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        byte b = 0;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
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
            AbstractC13348e.ad(null, AbstractC16653e.license(68986328, new C3071e(this, b, b), c13770e), null, null, null, 0, 0L, 0L, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).license(c13770e), AbstractC16653e.license(-1863475091, new C14002e(0, tapsense, (InterfaceC3965e) c13770e.adcel(AbstractC11473e.admob), this, c6260e2, m3334private().ad == EnumC10783e.PASSWORD), c13770e), c13770e, 805306416, 253);
            Unit unit = Unit.INSTANCE;
            boolean purchase = c13770e.purchase(c6260e2);
            Object m3681throw2 = c13770e.m3681throw();
            if (purchase || m3681throw2 == obj) {
                m3681throw2 = new C2733e(c6260e2, null, 1);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC17680e.license(c13770e, unit, (Function2) m3681throw2);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C3071e(this, i);
        }
    }

    /* renamed from: import, reason: not valid java name */
    public final void m3332import(boolean z) {
        this.f24632e.setValue(Boolean.valueOf(z));
    }

    /* renamed from: package, reason: not valid java name */
    public final void m3333package(String str) {
        this.f24637e.setValue(str);
    }

    /* renamed from: private, reason: not valid java name */
    public final C4851e m3334private() {
        return (C4851e) this.f24638e.getValue();
    }

    /* renamed from: transient, reason: not valid java name */
    public final void m3335transient(boolean z) {
        this.f24639e.setValue(Boolean.valueOf(z));
    }
}
