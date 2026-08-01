package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٗۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3420e {
    public static final float ad = 40;
    public static final C3924e vip = AbstractC6549e.ad;
    public static final float metrica = (float) 7.5d;
    public static final float license = (float) 2.5d;
    public static final float appmetrica = 10;
    public static final float purchase = 5;
    public static final float billing = 6;
    public static final C12870e yandex = AbstractC12696e.yandex(300, 2, AbstractC5616e.license);

    public static final void ad(C8933e c8933e, long j, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        InterfaceC12864e interfaceC12864e2;
        C13770e c13770e2;
        InterfaceC12864e interfaceC12864e3;
        c13770e.m3671package(-486016981);
        int i2 = i | (c13770e.yandex(c8933e) ? 4 : 2) | (c13770e.appmetrica(j) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            Object obj2 = m3681throw;
            if (m3681throw == obj) {
                C17985e ad2 = AbstractC11972e.ad();
                ad2.adcel(1);
                c13770e.m3682throws(ad2);
                obj2 = ad2;
            }
            Object obj3 = (C17985e) obj2;
            boolean purchase2 = c13770e.purchase(c8933e);
            Object m3681throw2 = c13770e.m3681throw();
            if (purchase2 || m3681throw2 == obj) {
                m3681throw2 = AbstractC14533e.purchase(new C10229e(c8933e, 0));
                c13770e.m3682throws(m3681throw2);
            }
            Object vip2 = AbstractC16102e.vip(((Number) ((InterfaceC16132e) m3681throw2).getValue()).floatValue(), yandex, null, null, c13770e, 48, 28);
            c13770e2 = c13770e;
            Object m3681throw3 = c13770e2.m3681throw();
            if (m3681throw3 == obj) {
                m3681throw3 = new C3114e(4);
                c13770e2.m3682throws(m3681throw3);
            }
            interfaceC12864e2 = interfaceC12864e;
            InterfaceC12864e ad3 = AbstractC1147e.ad(interfaceC12864e2, false, (Function1) m3681throw3);
            boolean yandex2 = c13770e2.yandex(c8933e) | c13770e2.purchase(vip2) | ((i2 & 112) == 32) | c13770e2.yandex(obj3);
            Object m3681throw4 = c13770e2.m3681throw();
            if (yandex2 || m3681throw4 == obj) {
                interfaceC12864e3 = ad3;
                Object c8830e = new C8830e(c8933e, vip2, j, obj3, 5);
                c13770e2.m3682throws(c8830e);
                m3681throw4 = c8830e;
            } else {
                interfaceC12864e3 = ad3;
            }
            AbstractC18366e.ad(interfaceC12864e3, (Function1) m3681throw4, c13770e2, 0);
        } else {
            interfaceC12864e2 = interfaceC12864e;
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C11653e(c8933e, j, interfaceC12864e2, i, 2);
        }
    }

    public static final void metrica(InterfaceC2235e interfaceC2235e, C17985e c17985e, C0763e c0763e, long j, float f, C18211e c18211e) {
        c17985e.yandex();
        c17985e.purchase(0.0f, 0.0f);
        float f2 = appmetrica;
        float mo497instanceof = interfaceC2235e.mo497instanceof(f2);
        float f3 = c18211e.f35652e;
        c17985e.appmetrica(mo497instanceof * f3, 0.0f);
        c17985e.appmetrica((interfaceC2235e.mo497instanceof(f2) * f3) / 2, interfaceC2235e.mo497instanceof(purchase) * f3);
        float intBitsToFloat = (Float.intBitsToFloat((int) (c0763e.purchase() >> 32)) + (Math.min(c0763e.metrica - c0763e.ad, c0763e.license - c0763e.vip) / 2.0f)) - ((interfaceC2235e.mo497instanceof(f2) * f3) / 2.0f);
        float mo497instanceof2 = (interfaceC2235e.mo497instanceof(license) / 2.0f) + Float.intBitsToFloat((int) (c0763e.purchase() & 4294967295L));
        c17985e.advert((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(mo497instanceof2) & 4294967295L));
        c17985e.vip();
        float f4 = c18211e.f35653e;
        long mo779e = interfaceC2235e.mo779e();
        C18478e mo782finally = interfaceC2235e.mo782finally();
        long m4560try = mo782finally.m4560try();
        mo782finally.m4557this().billing();
        try {
            ((C5389e) mo782finally.f36228e).crashlytics(f4, mo779e);
            AbstractC4653e.Signature(interfaceC2235e, c17985e, j, f, null, 56);
        } finally {
            AbstractC0054e.m224this(mo782finally, m4560try);
        }
    }

    public static final void vip(final boolean z, final C8933e c8933e, final InterfaceC12864e interfaceC12864e, long j, long j2, C13770e c13770e, final int i) {
        final long j3;
        final long j4;
        int i2;
        long ad2;
        long j5;
        long j6;
        C3618e c3618e;
        c13770e.m3671package(308716636);
        int i3 = i | (c13770e.billing(z) ? 4 : 2) | (c13770e.yandex(c8933e) ? 32 : 16) | (c13770e.purchase(interfaceC12864e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | 205824;
        if (c13770e.m3673protected(i3 & 1, (74899 & i3) != 74898)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                long j7 = ((C3618e) ((C16423e) c13770e.adcel(AbstractC10809e.ad)).purchase.getValue()).ad;
                i2 = i3 & (-64513);
                ad2 = AbstractC10809e.ad(j7, c13770e);
                j5 = j7;
            } else {
                c13770e.m3659default();
                i2 = i3 & (-64513);
                j5 = j;
                ad2 = j2;
            }
            c13770e.admob();
            int i4 = i2 & 14;
            boolean purchase2 = (i4 == 4) | c13770e.purchase(c8933e);
            Object m3681throw = c13770e.m3681throw();
            if (purchase2 || m3681throw == C2987e.ad) {
                m3681throw = AbstractC14533e.purchase(new C16435e(z, c8933e, 3));
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC16132e interfaceC16132e = (InterfaceC16132e) m3681throw;
            C7523e c7523e = (C7523e) c13770e.adcel(AbstractC0794e.ad);
            float f = billing;
            if (c7523e == null) {
                c13770e.m3676strictfp(1453038224);
                c13770e.Signature(false);
                c3618e = null;
            } else {
                c13770e.m3676strictfp(323966865);
                c13770e.m3676strictfp(-1687113661);
                C16423e c16423e = (C16423e) c13770e.adcel(AbstractC10809e.ad);
                if (C15765e.ad(f, 0) <= 0 || c16423e.ad()) {
                    c13770e.m3676strictfp(-1095489470);
                    c13770e.Signature(false);
                    j6 = j5;
                } else {
                    c13770e.m3676strictfp(-1095627978);
                    j6 = AbstractC6532e.billing(C3618e.vip(((((float) Math.log(1 + f)) * 4.5f) + 2.0f) / 100.0f, AbstractC10809e.ad(j5, c13770e)), j5);
                    c13770e.Signature(false);
                }
                c13770e.Signature(false);
                c13770e.Signature(false);
                c3618e = new C3618e(j6);
            }
            long j8 = c3618e != null ? c3618e.ad : j5;
            InterfaceC12864e yandex2 = AbstractC12546e.yandex(AbstractC5750e.appmetrica(AbstractC18007e.startapp(interfaceC12864e, ad), new C3114e(5)), new C13749e(3, c8933e));
            if (!((Boolean) interfaceC16132e.getValue()).booleanValue()) {
                f = 0;
            }
            C3924e c3924e = vip;
            InterfaceC12864e metrica2 = AbstractC16136e.metrica(AbstractC16398e.license(yandex2, f, c3924e, true, 24), j8, c3924e);
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
            int appmetrica2 = AbstractC5546e.appmetrica(c13770e);
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, metrica2);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license2, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            C14865e c14865e = C2721e.adcel;
            if (c13770e.f27292implements || !AbstractC7890e.billing(c13770e.m3681throw(), Integer.valueOf(appmetrica2))) {
                c13770e.m3682throws(Integer.valueOf(appmetrica2));
                c13770e.vip(Integer.valueOf(appmetrica2), c14865e);
            }
            AbstractC2270e.yandex(c13770e, purchase3, C2721e.license);
            AbstractC9180e.vip(Boolean.valueOf(z), null, AbstractC12696e.yandex(100, 6, null), null, AbstractC16653e.license(1853731063, new C7308e(ad2, c8933e, 0), c13770e), c13770e, i4 | 24960, 10);
            c13770e.Signature(true);
            j3 = j5;
            j4 = ad2;
        } else {
            c13770e.m3659default();
            j3 = j;
            j4 = j2;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2(z, c8933e, interfaceC12864e, j3, j4, i) { // from class: eْ۠ؑ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ long f26840e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f26841e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ C8933e f26842e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ long f26843e;

                /* renamed from: eّٖۦ, reason: contains not printable characters */
                public final /* synthetic */ boolean f26844e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert2 = AbstractC5190e.advert(65);
                    AbstractC3420e.vip(this.f26844e, this.f26842e, this.f26841e, this.f26843e, this.f26840e, (C13770e) obj, advert2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
