package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٔۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14924e {
    public static final float ad = 90;
    public static final float metrica;
    public static final C12870e vip;

    static {
        C13789e c13789e = AbstractC5616e.ad;
        vip = AbstractC12696e.yandex(250, 2, c13789e);
        AbstractC12696e.yandex(250, 2, c13789e);
        metrica = 16;
    }

    public static final void ad(float f, float f2, int i, int i2, long j, long j2, C10156e c10156e, C2892e c2892e, C2892e c2892e2, C2892e c2892e3, C13770e c13770e, InterfaceC12864e interfaceC12864e, C9137e c9137e) {
        float f3;
        C9137e c9137e2;
        int i3;
        C9137e appmetrica;
        float f4;
        c13770e.m3671package(798744196);
        int i4 = i2 | (c13770e.license(i) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i4 |= c13770e.purchase(interfaceC12864e) ? 32 : 16;
        }
        int i5 = i4 | 128 | (c13770e.appmetrica(j2) ? 16384 : 8192) | 1572864;
        if ((i2 & 12582912) == 0) {
            i5 |= c13770e.purchase(c10156e) ? 8388608 : 4194304;
        }
        if (c13770e.m3673protected(i5 & 1, (306783379 & i5) != 306783378)) {
            c13770e.m3655case();
            if ((i2 & 1) == 0 || c13770e.isPro()) {
                i3 = i5 & (-897);
                appmetrica = AbstractC5967e.appmetrica(c13770e);
                f4 = 0;
            } else {
                c13770e.m3659default();
                i3 = i5 & (-897);
                f4 = f2;
                appmetrica = c9137e;
            }
            c13770e.admob();
            vip(f, f4, i, 905969664 | (i3 & 29360128) | (i3 & 126) | 384 | ((i3 >> 3) & 7168) | 221184, j, j2, c10156e, c2892e, c2892e2, c2892e3, c13770e, interfaceC12864e, appmetrica);
            f3 = f4;
            c9137e2 = appmetrica;
        } else {
            c13770e.m3659default();
            f3 = f2;
            c9137e2 = c9137e;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C11107e(i, interfaceC12864e, c9137e2, j, j2, f, f3, c10156e, c2892e, c2892e2, c2892e3, i2);
        }
    }

    public static final void vip(float f, float f2, int i, int i2, long j, long j2, C10156e c10156e, C2892e c2892e, C2892e c2892e2, C2892e c2892e3, C13770e c13770e, InterfaceC12864e interfaceC12864e, C9137e c9137e) {
        int i3;
        float f3;
        C2892e c2892e4;
        C2892e c2892e5;
        InterfaceC12864e interfaceC12864e2;
        c13770e.m3671package(1263070953);
        if ((i2 & 6) == 0) {
            i3 = (c13770e.license(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c13770e.purchase(interfaceC12864e) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c13770e.appmetrica(j) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c13770e.appmetrica(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            f3 = f;
            i3 |= c13770e.metrica(f3) ? 16384 : 8192;
        } else {
            f3 = f;
        }
        if ((196608 & i2) == 0) {
            i3 |= c13770e.metrica(f2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= c13770e.purchase(c9137e) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= c13770e.purchase(c10156e) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            c2892e4 = c2892e;
            i3 |= c13770e.yandex(c2892e4) ? 67108864 : 33554432;
        } else {
            c2892e4 = c2892e;
        }
        if ((805306368 & i2) == 0) {
            c2892e5 = c2892e2;
            i3 |= c13770e.yandex(c2892e5) ? 536870912 : 268435456;
        } else {
            c2892e5 = c2892e2;
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 306783379) != 306783378)) {
            interfaceC12864e2 = interfaceC12864e;
            float f4 = f3;
            C2892e c2892e6 = c2892e4;
            int i4 = i3;
            AbstractC12121e.ad(AbstractC12447e.vip(AbstractC1147e.ad(AbstractC12220e.smaato(AbstractC5967e.purchase(AbstractC18007e.Signature(AbstractC18007e.metrica(interfaceC12864e2, 1.0f), c10156e), c9137e, false), f2, 0.0f, 2), false, new C7983e(8)), AbstractC6549e.ad), null, j, j2, 0.0f, 0.0f, null, AbstractC16653e.license(744721476, new C4305e(c9137e, c2892e3, c2892e5, f4, i, c2892e6), c13770e), c13770e, (i4 & 896) | 12582912 | (i4 & 7168), 114);
        } else {
            interfaceC12864e2 = interfaceC12864e;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C11107e(i, interfaceC12864e2, j, j2, f, f2, c9137e, c10156e, c2892e, c2892e2, c2892e3, i2);
        }
    }
}
