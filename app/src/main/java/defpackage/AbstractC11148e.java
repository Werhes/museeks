package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11148e {
    public static final float ad = (float) 2.5d;
    public static final float vip = (float) 5.5d;
    public static final float metrica = 16;
    public static final float license = 40;
    public static final float appmetrica = 10;
    public static final float purchase = 5;

    static {
        float f = AbstractC5924e.ad;
    }

    public static final void ad(InterfaceC14468e interfaceC14468e, long j, C13770e c13770e, int i) {
        C13770e c13770e2;
        c13770e.m3671package(-1353562852);
        int i2 = i | (c13770e.purchase(interfaceC14468e) ? 4 : 2) | (c13770e.appmetrica(j) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
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
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == obj) {
                m3681throw2 = AbstractC14533e.purchase(new C13465e(16, interfaceC14468e));
                c13770e.m3682throws(m3681throw2);
            }
            Object vip2 = AbstractC16102e.vip(((Number) ((InterfaceC16132e) m3681throw2).getValue()).floatValue(), AbstractC11008e.metrica(c13770e, 4), null, null, c13770e, 0, 28);
            c13770e2 = c13770e;
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object m3681throw3 = c13770e2.m3681throw();
            if (z || m3681throw3 == obj) {
                m3681throw3 = new C13749e(4, interfaceC14468e);
                c13770e2.m3682throws(m3681throw3);
            }
            InterfaceC12864e startapp = AbstractC18007e.startapp(new C0434e((Function1) m3681throw3), metrica);
            boolean purchase2 = (i3 == 4) | c13770e2.purchase(vip2) | ((i2 & 112) == 32) | c13770e2.yandex(obj3);
            Object m3681throw4 = c13770e2.m3681throw();
            if (purchase2 || m3681throw4 == obj) {
                Object c8830e = new C8830e(interfaceC14468e, vip2, j, obj3, 6);
                c13770e2.m3682throws(c8830e);
                m3681throw4 = c8830e;
            }
            AbstractC18366e.ad(startapp, (Function1) m3681throw4, c13770e2, 0);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C9560e(interfaceC14468e, j, i, 2);
        }
    }

    public static final void metrica(InterfaceC2235e interfaceC2235e, C17985e c17985e, C0763e c0763e, long j, float f, C18211e c18211e) {
        c17985e.yandex();
        c17985e.purchase(0.0f, 0.0f);
        float f2 = appmetrica;
        float mo497instanceof = interfaceC2235e.mo497instanceof(f2);
        float f3 = c18211e.f35652e;
        c17985e.appmetrica((mo497instanceof * f3) / 2, interfaceC2235e.mo497instanceof(purchase) * f3);
        c17985e.appmetrica(interfaceC2235e.mo497instanceof(f2) * f3, 0.0f);
        float intBitsToFloat = (Float.intBitsToFloat((int) (c0763e.purchase() >> 32)) + (Math.min(c0763e.metrica - c0763e.ad, c0763e.license - c0763e.vip) / 2.0f)) - ((interfaceC2235e.mo497instanceof(f2) * f3) / 2.0f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (c0763e.purchase() & 4294967295L));
        float f4 = ad;
        float mo497instanceof2 = intBitsToFloat2 - interfaceC2235e.mo497instanceof(f4);
        c17985e.advert((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(mo497instanceof2) & 4294967295L));
        float mo497instanceof3 = c18211e.f35653e - interfaceC2235e.mo497instanceof(f4);
        long mo779e = interfaceC2235e.mo779e();
        C18478e mo782finally = interfaceC2235e.mo782finally();
        long m4560try = mo782finally.m4560try();
        mo782finally.m4557this().billing();
        try {
            ((C5389e) mo782finally.f36228e).crashlytics(mo497instanceof3, mo779e);
            AbstractC4653e.Signature(interfaceC2235e, c17985e, j, f, new C13121e(interfaceC2235e.mo497instanceof(f4), 0.0f, 0, 0, null, 30), 48);
        } finally {
            AbstractC0054e.m224this(mo782finally, m4560try);
        }
    }

    public static final void vip(final boolean z, final Function0 function0, InterfaceC12864e interfaceC12864e, C11200e c11200e, InterfaceC8079e interfaceC8079e, Function3 function3, boolean z2, float f, final C2892e c2892e, C13770e c13770e, final int i, final int i2) {
        InterfaceC12864e interfaceC12864e2;
        int i3;
        final C11200e c11200e2;
        final InterfaceC8079e interfaceC8079e2;
        final Function3 function32;
        final boolean z3;
        final InterfaceC12864e interfaceC12864e3;
        final float f2;
        C11200e c11200e3;
        Function3 license2;
        float f3;
        boolean z4;
        c13770e.m3671package(492221845);
        int i4 = i | (c13770e.billing(z) ? 4 : 2) | (c13770e.yandex(function0) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            interfaceC12864e2 = interfaceC12864e;
        } else {
            interfaceC12864e2 = interfaceC12864e;
            i3 = i4 | (c13770e.purchase(interfaceC12864e2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        }
        int i6 = i3 | 14377984;
        if (c13770e.m3673protected(i6 & 1, (38347923 & i6) != 38347922)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                if (i5 != 0) {
                    interfaceC12864e2 = C0115e.f1276e;
                }
                Object[] objArr = new Object[0];
                Object m3681throw = c13770e.m3681throw();
                if (m3681throw == C2987e.ad) {
                    m3681throw = new C11689e(16);
                    c13770e.m3682throws(m3681throw);
                }
                c11200e3 = (C11200e) AbstractC10510e.appmetrica(objArr, C11200e.vip, (Function0) m3681throw, c13770e, 384);
                interfaceC8079e2 = C5438e.f11676e;
                license2 = AbstractC16653e.license(419143791, new C15147e(c11200e3, z, 3), c13770e);
                f3 = C17194e.metrica;
                z4 = true;
            } else {
                c13770e.m3659default();
                c11200e3 = c11200e;
                interfaceC8079e2 = interfaceC8079e;
                license2 = function3;
                z4 = z2;
                f3 = f;
            }
            c13770e.admob();
            boolean z5 = z4;
            float f4 = f3;
            InterfaceC12864e premium = interfaceC12864e2.premium(new C17937e(z, function0, z5, c11200e3, f4));
            InterfaceC2747e license3 = AbstractC17074e.license(interfaceC8079e2, false);
            long j = c13770e.f27286case;
            int i7 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, premium);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license3, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i7), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase2, C2721e.license);
            C14486e c14486e = C14486e.ad;
            c2892e.invoke(c14486e, c13770e, 54);
            license2.invoke(c14486e, c13770e, 54);
            c13770e.Signature(true);
            c11200e2 = c11200e3;
            function32 = license2;
            interfaceC12864e3 = interfaceC12864e2;
            f2 = f4;
            z3 = z5;
        } else {
            c13770e.m3659default();
            c11200e2 = c11200e;
            interfaceC8079e2 = interfaceC8079e;
            function32 = function3;
            z3 = z2;
            interfaceC12864e3 = interfaceC12864e2;
            f2 = f;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2(z, function0, interfaceC12864e3, c11200e2, interfaceC8079e2, function32, z3, f2, c2892e, i, i2) { // from class: eْٖؑ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC8079e f25818e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f25819e;

                /* renamed from: eؙؔٞ, reason: contains not printable characters */
                public final /* synthetic */ int f25820e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ Function0 f25821e;

                /* renamed from: eٌٍٚ, reason: contains not printable characters */
                public final /* synthetic */ float f25822e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ C11200e f25823e;

                /* renamed from: eّٕۜ, reason: contains not printable characters */
                public final /* synthetic */ C2892e f25824e;

                /* renamed from: eّٖۦ, reason: contains not printable characters */
                public final /* synthetic */ boolean f25825e;

                /* renamed from: eؘَٗ, reason: contains not printable characters */
                public final /* synthetic */ boolean f25826e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ Function3 f25827e;

                {
                    this.f25820e = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert2 = AbstractC5190e.advert(100663297);
                    AbstractC11148e.vip(this.f25825e, this.f25821e, this.f25819e, this.f25823e, this.f25818e, this.f25827e, this.f25826e, this.f25822e, this.f25824e, (C13770e) obj, advert2, this.f25820e);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
