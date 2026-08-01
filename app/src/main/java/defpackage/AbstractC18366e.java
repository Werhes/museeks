package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18366e {
    public static final void ad(InterfaceC12864e interfaceC12864e, Function1 function1, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(-932836462);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(function1) ? 32 : 16;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            AbstractC12534e.ad(c13770e, AbstractC5750e.metrica(interfaceC12864e, function1));
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C0205e(interfaceC12864e, function1, i);
        }
    }

    public static String appmetrica(C16320e c16320e) {
        int i;
        InterfaceC10650e interfaceC10650e = c16320e.ad;
        C3645e c3645e = interfaceC10650e instanceof C3645e ? (C3645e) interfaceC10650e : null;
        int i2 = c3645e != null ? c3645e.ad : 0;
        InterfaceC10650e interfaceC10650e2 = c16320e.vip;
        C3645e c3645e2 = interfaceC10650e2 instanceof C3645e ? (C3645e) interfaceC10650e2 : null;
        int max = Math.max(i2, c3645e2 != null ? c3645e2.ad : 0);
        if (max >= 1200) {
            i = 5;
        } else if (max >= 600) {
            i = 4;
        } else {
            if (max < 300) {
                if (max >= 270) {
                    i = 2;
                } else if (max < 270) {
                    i = 1;
                }
            }
            i = 3;
        }
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            return "vs";
        }
        if (m2467class == 1) {
            return "s";
        }
        if (m2467class == 2) {
            return "r";
        }
        if (m2467class == 3) {
            return "m";
        }
        if (m2467class == 4) {
            return "l";
        }
        throw new C14803e(10);
    }

    public static final InterfaceC12864e license(InterfaceC12864e interfaceC12864e, C6260e c6260e) {
        return interfaceC12864e.premium(new C5027e(c6260e));
    }

    public static final InterfaceC10518e metrica(C14097e c14097e) {
        return c14097e.license().ad();
    }

    public static final C10163e purchase(C0763e c0763e) {
        return new C10163e(Math.round(c0763e.ad), Math.round(c0763e.vip), Math.round(c0763e.metrica), Math.round(c0763e.license));
    }

    public static final C10163e vip(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new C10163e(i, i2, ((int) (j2 >> 32)) + i, ((int) (j2 & 4294967295L)) + i2);
    }
}
