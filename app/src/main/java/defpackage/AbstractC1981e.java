package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٞٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1981e {
    public static final C16005e appmetrica;
    public static final C16005e billing;
    public static final float license;
    public static final float metrica;
    public static final C16005e purchase;
    public static final C5015e startapp;
    public static final C16005e yandex;
    public static final float ad = 280;
    public static final float vip = 560;

    static {
        float f = 8;
        metrica = f;
        license = f;
        C0576e c0576e = AbstractC8882e.ad;
        float f2 = ((Boolean) c0576e.getValue()).booleanValue() ? 20 : 24;
        float f3 = ((Boolean) c0576e.getValue()).booleanValue() ? 16 : 24;
        appmetrica = new C16005e(f2, f2, f2, f2);
        float f4 = 16;
        purchase = AbstractC12220e.appmetrica(0.0f, 0.0f, 0.0f, f4, 7);
        billing = AbstractC12220e.appmetrica(0.0f, 0.0f, 0.0f, f4, 7);
        yandex = AbstractC12220e.appmetrica(0.0f, 0.0f, 0.0f, f3, 7);
        startapp = new C5015e(new C0743e(4));
    }

    public static final void ad(final C2892e c2892e, InterfaceC12864e interfaceC12864e, final Function2 function2, final Function2 function22, final Function2 function23, final InterfaceC16154e interfaceC16154e, final long j, final float f, final long j2, final long j3, final long j4, final long j5, C13770e c13770e, final int i) {
        final InterfaceC12864e interfaceC12864e2;
        c13770e.m3671package(1378716401);
        int i2 = i | 48 | (c13770e.yandex(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.yandex(function22) ? 2048 : 1024) | (c13770e.yandex(function23) ? 16384 : 8192) | (c13770e.purchase(interfaceC16154e) ? 131072 : 65536) | (c13770e.appmetrica(j) ? 1048576 : 524288) | (c13770e.metrica(f) ? 8388608 : 4194304) | (c13770e.appmetrica(j2) ? 67108864 : 33554432) | (c13770e.appmetrica(j3) ? 536870912 : 268435456);
        if (c13770e.m3673protected(i2 & 1, ((306783379 & i2) == 306783378 && (((c13770e.appmetrica(j4) ? (char) 4 : (char) 2) | (c13770e.appmetrica(j5) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            C2892e license2 = AbstractC16653e.license(-652798794, new C6680e(function2, function22, function23, j3, j4, j5, j2, c2892e), c13770e);
            int i3 = i2 >> 12;
            int i4 = (i3 & 896) | (i3 & 112) | 12582918 | ((i2 >> 9) & 57344);
            C0115e c0115e = C0115e.f1276e;
            AbstractC12121e.ad(c0115e, interfaceC16154e, j, 0L, f, 0.0f, null, license2, c13770e, i4, 104);
            interfaceC12864e2 = c0115e;
        } else {
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2(interfaceC12864e2, function2, function22, function23, interfaceC16154e, j, f, j2, j3, j4, j5, i) { // from class: eٕۤؕ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ Function2 f31192e;

                /* renamed from: eٕؓۥ, reason: contains not printable characters */
                public final /* synthetic */ long f31193e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ Function2 f31194e;

                /* renamed from: eؙؔٞ, reason: contains not printable characters */
                public final /* synthetic */ long f31195e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f31196e;

                /* renamed from: eٌٍٚ, reason: contains not printable characters */
                public final /* synthetic */ float f31197e;

                /* renamed from: eٍۗۛ, reason: contains not printable characters */
                public final /* synthetic */ long f31198e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ Function2 f31199e;

                /* renamed from: eّٕۜ, reason: contains not printable characters */
                public final /* synthetic */ long f31200e;

                /* renamed from: eؘَٗ, reason: contains not printable characters */
                public final /* synthetic */ long f31202e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC16154e f31203e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(7);
                    AbstractC1981e.ad(C2892e.this, this.f31196e, this.f31194e, this.f31199e, this.f31192e, this.f31203e, this.f31202e, this.f31197e, this.f31200e, this.f31195e, this.f31198e, this.f31193e, (C13770e) obj, advert);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void license(Function0 function0, InterfaceC12864e interfaceC12864e, C9207e c9207e, C2892e c2892e, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(24925658);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.purchase(c9207e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.yandex(c2892e) ? 2048 : 1024;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            ((C11527e) c13770e.adcel(startapp)).ad(new C11467e(function0, interfaceC12864e, c9207e, c2892e), c13770e, 0);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C7303e(function0, interfaceC12864e, c9207e, c2892e, i, 1);
        }
    }

    public static final void metrica(final Function0 function0, final C2892e c2892e, final InterfaceC12864e interfaceC12864e, final Function2 function2, final Function2 function22, final Function2 function23, final Function2 function24, final InterfaceC16154e interfaceC16154e, final long j, final long j2, final long j3, final long j4, final float f, final C9207e c9207e, C13770e c13770e, final int i, final int i2) {
        int i3;
        C2892e c2892e2;
        Function2 function25;
        int i4;
        c13770e.m3671package(-867616355);
        if ((i & 6) == 0) {
            i3 = (c13770e.yandex(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            c2892e2 = c2892e;
            i3 |= c13770e.yandex(c2892e2) ? 32 : 16;
        } else {
            c2892e2 = c2892e;
        }
        if ((i & 384) == 0) {
            i3 |= c13770e.purchase(interfaceC12864e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            function25 = function2;
            i3 |= c13770e.yandex(function25) ? 2048 : 1024;
        } else {
            function25 = function2;
        }
        if ((i & 24576) == 0) {
            i3 |= c13770e.yandex(function22) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= c13770e.yandex(function23) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= c13770e.yandex(function24) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= c13770e.purchase(interfaceC16154e) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= c13770e.appmetrica(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= c13770e.appmetrica(j2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (c13770e.appmetrica(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c13770e.appmetrica(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c13770e.metrica(f) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c13770e.purchase(c9207e) ? 2048 : 1024;
        }
        int i5 = i4;
        if (c13770e.m3673protected(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            final C2892e c2892e3 = c2892e2;
            final Function2 function26 = function25;
            license(function0, interfaceC12864e, c9207e, AbstractC16653e.license(527420759, new Function2() { // from class: eٓ٘ٔ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C13770e c13770e2 = (C13770e) obj;
                    int intValue = ((Integer) obj2).intValue();
                    int i6 = 0;
                    if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                        C2892e license2 = AbstractC16653e.license(1367541877, new C12638e(c2892e3, function26, i6), c13770e2);
                        int i7 = AbstractC3935e.ad;
                        AbstractC1981e.ad(license2, null, Function2.this, function23, function24, interfaceC16154e, j, f, AbstractC7893e.appmetrica(c13770e2, 26), j2, j3, j4, c13770e2, 6);
                    } else {
                        c13770e2.m3659default();
                    }
                    return Unit.INSTANCE;
                }
            }, c13770e), c13770e, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i5 >> 3) & 896));
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eٍۖؖ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(i | 1);
                    int advert2 = AbstractC5190e.advert(i2);
                    AbstractC1981e.metrica(Function0.this, c2892e, interfaceC12864e, function2, function22, function23, function24, interfaceC16154e, j, j2, j3, j4, f, c9207e, (C13770e) obj, advert, advert2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void vip(float f, C2892e c2892e, C13770e c13770e, int i) {
        EnumC7792e enumC7792e;
        c13770e.m3671package(-917637668);
        int i2 = (c13770e.metrica(f) ? 32 : 16) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            C15492e c15492e = AbstractC11473e.amazon;
            EnumC7792e enumC7792e2 = (EnumC7792e) c13770e.adcel(c15492e);
            int ordinal = enumC7792e2.ordinal();
            if (ordinal == 0) {
                enumC7792e = EnumC7792e.f15793e;
            } else {
                if (ordinal != 1) {
                    throw new C14803e(10);
                }
                enumC7792e = EnumC7792e.f15794e;
            }
            AbstractC1101e.ad(c15492e.ad(enumC7792e), AbstractC16653e.license(-1986402020, new C17840e(f, enumC7792e2, c2892e), c13770e), c13770e, 56);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C17111e(f, c2892e, i);
        }
    }
}
