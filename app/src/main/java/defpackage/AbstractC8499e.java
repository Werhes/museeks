package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؖۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8499e {
    static {
        new C4988e(7, 0, 121);
    }

    public static final void ad(final C12380e c12380e, final InterfaceC12864e interfaceC12864e, boolean z, C1839e c1839e, C8651e c8651e, final Function2 function2, final Function2 function22, final Function2 function23, final boolean z2, InterfaceC12006e interfaceC12006e, final int i, char c, final C4988e c4988e, final InterfaceC13435e interfaceC13435e, InterfaceC16154e interfaceC16154e, C17085e c17085e, InterfaceC12123e interfaceC12123e, C13770e c13770e, final int i2, final int i3, final int i4) {
        boolean z3;
        int i5;
        Function2 function24;
        InterfaceC12006e interfaceC12006e2;
        int i6;
        C13770e c13770e2;
        final C1839e c1839e2;
        final C8651e c8651e2;
        final char c2;
        final InterfaceC16154e interfaceC16154e2;
        final InterfaceC12123e interfaceC12123e2;
        final C17085e c17085e2;
        final InterfaceC12006e interfaceC12006e3;
        C1839e c1839e3;
        final C8651e c8651e3;
        final InterfaceC16154e interfaceC16154e3;
        final char c3;
        final InterfaceC12006e interfaceC12006e4;
        final InterfaceC12123e appmetrica;
        c13770e.m3671package(-273370384);
        int i7 = i2 | (c13770e.purchase(c12380e) ? 4 : 2) | (c13770e.purchase(interfaceC12864e) ? 32 : 16);
        int i8 = i4 & 4;
        if (i8 != 0) {
            i5 = i7 | 384;
            z3 = z;
        } else {
            z3 = z;
            i5 = i7 | (c13770e.billing(z3) ? 256 : 128);
        }
        int i9 = i5 | 12788736;
        if ((i2 & 100663296) == 0) {
            function24 = function22;
            i9 |= c13770e.yandex(function24) ? 67108864 : 33554432;
        } else {
            function24 = function22;
        }
        int i10 = i9 | 805306368;
        int i11 = (c13770e.yandex(function23) ? 32 : 16) | i3 | 6 | (c13770e.billing(z2) ? 256 : 128);
        int i12 = i4 & 8192;
        if (i12 != 0) {
            i6 = i11 | 3072;
            interfaceC12006e2 = interfaceC12006e;
        } else {
            interfaceC12006e2 = interfaceC12006e;
            i6 = i11 | (c13770e.purchase(interfaceC12006e2) ? 2048 : 1024);
        }
        int i13 = i6 | (c13770e.license(i) ? 16384 : 8192) | 196608;
        if ((i3 & 1572864) == 0) {
            i13 |= c13770e.purchase(c4988e) ? 1048576 : 524288;
        }
        C17085e c17085e3 = c17085e;
        if (c13770e.m3673protected(i10 & 1, ((i10 & 306783379) == 306783378 && (((i13 | (c13770e.purchase(interfaceC13435e) ? 8388608 : 4194304)) | 369098752) & 306783379) == 306783378 && (((((i4 & 1048576) != 0 || !c13770e.purchase(c17085e3)) ? (char) 2 : (char) 4) | 400) & 147) == 146) ? false : true)) {
            c13770e.m3655case();
            if ((i2 & 1) == 0 || c13770e.isPro()) {
                if (i8 != 0) {
                    z3 = true;
                }
                c1839e3 = (C1839e) c13770e.adcel(AbstractC14489e.ad);
                c8651e3 = new C8651e();
                if (i12 != 0) {
                    interfaceC12006e2 = null;
                }
                C18121e c18121e = C18121e.ad;
                InterfaceC16154e ad = AbstractC8949e.ad(c13770e, 5);
                if ((i4 & 1048576) != 0) {
                    c17085e3 = C18121e.metrica(c13770e, 6);
                }
                interfaceC16154e3 = ad;
                c3 = 8226;
                interfaceC12006e4 = interfaceC12006e2;
                appmetrica = C18121e.appmetrica(c18121e);
            } else {
                c13770e.m3659default();
                c1839e3 = c1839e;
                c8651e3 = c8651e;
                c3 = c;
                interfaceC16154e3 = interfaceC16154e;
                interfaceC12006e4 = interfaceC12006e2;
                appmetrica = interfaceC12123e;
            }
            final C17085e c17085e4 = c17085e3;
            final boolean z4 = z3;
            c13770e.admob();
            c13770e.m3676strictfp(-717731477);
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = AbstractC17861e.adcel(c13770e);
            }
            final C15274e c15274e = (C15274e) m3681throw;
            c13770e.Signature(false);
            c13770e.m3676strictfp(-715883830);
            long metrica = c1839e3.metrica();
            if (metrica == 16) {
                metrica = c17085e4.appmetrica(z4, z2, ((Boolean) AbstractC13281e.metrica(c15274e, c13770e, 0).getValue()).booleanValue());
            }
            long j = metrica;
            c13770e.Signature(false);
            final C1839e appmetrica2 = c1839e3.appmetrica(new C1839e(j, 0L, null, null, 0L, 0L, 0, 0, 0L, 16777214));
            final Function2 function25 = function24;
            c13770e2 = c13770e;
            AbstractC1101e.ad(AbstractC8389e.ad.ad(c17085e4.mopub), AbstractC16653e.license(1147500080, new Function2() { // from class: eؘؘؔ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C13770e c13770e3 = (C13770e) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (c13770e3.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                        c13770e3.m3676strictfp(1530795410);
                        c13770e3.Signature(false);
                        InterfaceC12864e premium = InterfaceC12864e.this.premium(C0115e.f1276e);
                        String vip = AbstractC9408e.vip(c13770e3, R.string.default_error_message);
                        boolean z5 = z2;
                        InterfaceC12864e appmetrica3 = AbstractC2754e.appmetrica(premium, z5, vip);
                        C18121e c18121e2 = C18121e.ad;
                        InterfaceC12864e ad2 = AbstractC18007e.ad(appmetrica3, C18121e.metrica, C18121e.vip);
                        C17085e c17085e5 = c17085e4;
                        C18466e c18466e = new C18466e(z5 ? c17085e5.adcel : c17085e5.startapp);
                        C6114e c6114e = C6114e.f12844e;
                        boolean z6 = z4;
                        C15274e c15274e2 = c15274e;
                        C2892e license = AbstractC16653e.license(-1406782897, new C8965e(z6, z5, c15274e2, c17085e5, interfaceC16154e3, 2), c13770e3);
                        C12380e c12380e2 = c12380e;
                        AbstractC12184e.ad(c12380e2, ad2, z6, interfaceC12006e4, appmetrica2, c4988e, interfaceC13435e, c15274e2, c18466e, new C11431e(c12380e2, c6114e, c8651e3, function2, function25, function23, z6, z5, c15274e2, appmetrica, c17085e5, license), i, c3, null, c13770e3, 0);
                    } else {
                        c13770e3.m3659default();
                    }
                    return Unit.INSTANCE;
                }
            }, c13770e2), c13770e2, 56);
            c8651e2 = c8651e3;
            c17085e2 = c17085e4;
            z3 = z4;
            interfaceC12006e3 = interfaceC12006e4;
            c2 = c3;
            interfaceC16154e2 = interfaceC16154e3;
            c1839e2 = c1839e3;
            interfaceC12123e2 = appmetrica;
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
            c1839e2 = c1839e;
            c8651e2 = c8651e;
            c2 = c;
            interfaceC16154e2 = interfaceC16154e;
            interfaceC12123e2 = interfaceC12123e;
            c17085e2 = c17085e3;
            interfaceC12006e3 = interfaceC12006e2;
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            final boolean z5 = z3;
            subscription.license = new Function2() { // from class: eًٗٙ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(i2 | 1);
                    int advert2 = AbstractC5190e.advert(i3);
                    AbstractC8499e.ad(C12380e.this, interfaceC12864e, z5, c1839e2, c8651e2, function2, function22, function23, z2, interfaceC12006e3, i, c2, c4988e, interfaceC13435e, interfaceC16154e2, c17085e2, interfaceC12123e2, (C13770e) obj, advert, advert2, i4);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
