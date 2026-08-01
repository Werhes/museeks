package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۥۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3752e {
    public static final C2892e ad = new C2892e(478937230, false, new C8171e(29));
    public static final C2892e vip = new C2892e(-1644738313, false, new C10418e(0));
    public static final C2892e metrica = new C2892e(-83189779, false, new C9868e(14));

    static {
        new C2892e(-825320064, false, new C10418e(1));
    }

    public static final void ad(Function0 function0, EnumC10982e enumC10982e, C13770e c13770e, int i) {
        int i2;
        int i3;
        Function0 function02 = function0;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-1121260103);
        int i4 = i | (c13770e2.yandex(function02) ? 4 : 2) | (c13770e2.license(enumC10982e.ordinal()) ? 32 : 16);
        if (c13770e2.m3673protected(i4 & 1, (i4 & 19) != 18)) {
            int ordinal = enumC10982e.ordinal();
            if (ordinal == 0) {
                i2 = R.string.spark_unavailable_gone;
            } else {
                if (ordinal != 1) {
                    throw new C14803e(10);
                }
                i2 = R.string.spark_unavailable_network;
            }
            int ordinal2 = enumC10982e.ordinal();
            if (ordinal2 == 0) {
                i3 = R.string.spark_unavailable_gone_desc;
            } else {
                if (ordinal2 != 1) {
                    throw new C14803e(10);
                }
                i3 = R.string.spark_unavailable_network_desc;
            }
            float f = 16;
            C13964e billing = AbstractC16497e.billing(f);
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e metrica2 = AbstractC18007e.metrica(c0115e, 1.0f);
            C4789e ad2 = AbstractC14801e.ad(billing, C5438e.f11678e, c13770e2, 54);
            long j = c13770e2.f27286case;
            int i5 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, metrica2);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e2, ad2, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e2, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i5);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e2, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e2, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e2, purchase, c14865e4);
            String appmetrica = AbstractC5297e.appmetrica(c13770e2, i2);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC14489e.vip(appmetrica, AbstractC18007e.metrica(c0115e, 1.0f), ((C7019e) c13770e2.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(c15492e)).vip.appmetrica, c13770e, 48, 0, 130040);
            AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, i3), AbstractC18007e.metrica(c0115e, 1.0f), ((C7019e) c13770e.adcel(c15492e)).ad.remoteconfig, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.mopub, c13770e, 48, 0, 130040);
            c13770e2 = c13770e;
            InterfaceC12864e metrica3 = AbstractC18007e.metrica(c0115e, 1.0f);
            C8587e ad3 = AbstractC6451e.ad(AbstractC16497e.billing(f), C5438e.f11685e, c13770e2, 6);
            long j2 = c13770e2.f27286case;
            int i6 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e2.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, metrica3);
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad3, c14865e);
            AbstractC2270e.yandex(c13770e2, advert2, c14865e2);
            AbstractC13501e.mopub(i6, c13770e2, c14865e3, c13770e2, c5430e);
            AbstractC2270e.yandex(c13770e2, purchase2, c14865e4);
            C16005e c16005e = new C16005e(f, f, f, f);
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            function02 = function0;
            AbstractC1513e.ad(function02, new C5228e(1.0f, true), false, ((C7019e) c13770e2.adcel(c15492e)).metrica.metrica, null, null, null, c16005e, AbstractC17352e.ad, c13770e2, (i4 & 14) | 817889280, 372);
            c13770e2.Signature(true);
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C2173e(function02, enumC10982e, i, 3);
        }
    }

    public static final InterfaceC12864e appmetrica(InterfaceC12864e interfaceC12864e, InterfaceC11968e interfaceC11968e) {
        return interfaceC12864e.premium(new C5460e(interfaceC11968e));
    }

    public static final long license(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (numberOfLeadingZeros >= 64) {
            if ((j2 != Long.MIN_VALUE) | (j >= 0)) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static void metrica(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        do {
            try {
                ((AbstractC5113e) list.get(i)).license();
                i++;
            } catch (C3720e e) {
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    ((AbstractC5113e) list.get(i2)).vip();
                }
                throw e;
            }
        } while (i < list.size());
    }

    public static final InterfaceC12864e vip(InterfaceC12864e interfaceC12864e, InterfaceC11968e interfaceC11968e) {
        return interfaceC12864e.premium(new C3571e(interfaceC11968e));
    }
}
