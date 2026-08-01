package defpackage;

import android.widget.RemoteViews;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٝۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11138e {
    public static final C2892e ad = new C2892e(343441346, false, new C8580e(6));
    public static final C2892e vip = new C2892e(1439930443, false, new C11789e(26));

    /* JADX WARN: Type inference failed for: r2v1, types: [eؚ۟, java.lang.Object] */
    public static final void ad(Function0 function0, InterfaceC12864e interfaceC12864e, C9010e c9010e, InterfaceC12123e interfaceC12123e, Function3 function3, C13770e c13770e, int i, int i2) {
        InterfaceC12864e interfaceC12864e2 = (i2 & 2) != 0 ? C0115e.f1276e : interfaceC12864e;
        C3924e c3924e = AbstractC2373e.ad;
        ?? obj = new Object();
        C14878e c14878e = C14878e.metrica;
        C8717e c8717e = new C8717e(c14878e, c14878e, c14878e);
        C3924e c3924e2 = AbstractC2373e.ad;
        C11465e c11465e = new C11465e(c3924e2, c3924e2, c3924e2, c3924e2, c3924e2);
        C9010e ad2 = (i2 & 128) != 0 ? AbstractC2373e.ad(0L, c13770e, 255) : c9010e;
        float f = AbstractC18458e.ad;
        C9630e c9630e = C9630e.license;
        vip(function0, interfaceC12864e2, obj, c8717e, c11465e, ad2, new C14364e(c9630e, c9630e, c9630e, c9630e, new C9630e(AbstractC16619e.ad((float) 1.5d, C3618e.vip(0.2f, ((C6032e) c13770e.adcel(AbstractC12491e.ad)).purchase())), c3924e2, 2)), (i2 & 1024) != 0 ? AbstractC2373e.vip : interfaceC12123e, function3, c13770e, i & 2147483646);
    }

    public static C0680e appmetrica(C5031e c5031e) {
        if (c5031e == C5031e.license) {
            return new C0680e("HmacSha256", false);
        }
        if (c5031e == C5031e.appmetrica) {
            return new C0680e("HmacSha384", false);
        }
        if (c5031e == C5031e.purchase) {
            return new C0680e("HmacSha512", false);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }

    public static final int billing(RemoteViews remoteViews, C6555e c6555e, int i, int i2, Integer num) {
        int i3;
        if (i == -1) {
            throw new IllegalArgumentException("viewStubId must not be View.NO_ID");
        }
        if (num != null) {
            i3 = num.intValue();
        } else {
            int incrementAndGet = c6555e.billing.incrementAndGet();
            if (incrementAndGet >= AbstractC16067e.adcel) {
                throw new IllegalStateException("There are too many views");
            }
            i3 = incrementAndGet + AbstractC16067e.startapp;
        }
        if (i3 != -1) {
            remoteViews.setInt(i, "setInflatedId", i3);
        }
        if (i2 != 0) {
            remoteViews.setInt(i, "setLayoutResource", i2);
        }
        remoteViews.setViewVisibility(i, 0);
        return i3;
    }

    public static InterfaceC17063e license(C1062e c1062e) {
        if (c1062e == C1062e.license) {
            return new C5401e(16);
        }
        if (c1062e == C1062e.appmetrica) {
            return new C5401e(32);
        }
        if (c1062e == C1062e.purchase) {
            return new C4524e(25);
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    public static void metrica(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static C3168e purchase(C13903e c13903e) {
        if (c13903e == C13903e.billing) {
            return new C3168e(new C0680e("HmacSha256", false));
        }
        if (c13903e == C13903e.license) {
            return C3168e.m1232protected(EnumC6205e.f12969e);
        }
        if (c13903e == C13903e.appmetrica) {
            return C3168e.m1232protected(EnumC6205e.f12967e);
        }
        if (c13903e == C13903e.purchase) {
            return C3168e.m1232protected(EnumC6205e.f12966e);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    public static final void vip(Function0 function0, InterfaceC12864e interfaceC12864e, C18387e c18387e, C8717e c8717e, C11465e c11465e, C9010e c9010e, C14364e c14364e, InterfaceC12123e interfaceC12123e, Function3 function3, C13770e c13770e, int i) {
        int i2;
        Function3 function32;
        float f = AbstractC18458e.ad;
        c13770e.m3671package(-2020606796);
        if ((i & 6) == 0) {
            i2 = i | (c13770e.yandex(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (c13770e.purchase(interfaceC12864e) ? 32 : 16) | (c13770e.yandex(null) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.billing(true) ? 2048 : 1024) | (c13770e.purchase(c18387e) ? 16384 : 8192) | (c13770e.purchase(c8717e) ? 131072 : 65536) | (c13770e.purchase(c11465e) ? 1048576 : 524288) | (c13770e.purchase(c9010e) ? 8388608 : 4194304) | (c13770e.metrica(f) ? 67108864 : 33554432) | (c13770e.purchase(c14364e) ? 536870912 : 268435456);
        int i4 = (c13770e.purchase(interfaceC12123e) ? 4 : 2) | 384 | (c13770e.purchase(null) ? 32 : 16);
        if (c13770e.m3673protected(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 147) == 146) ? false : true)) {
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = new C17014e(21);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC12864e ad2 = AbstractC1147e.ad(interfaceC12864e, false, (Function1) m3681throw);
            int i5 = AbstractC5746e.ad;
            function32 = function3;
            AbstractC11160e.vip(function0, ad2, true, f, new C2932e(c11465e.ad, c11465e.vip, c11465e.metrica, c11465e.license, c11465e.appmetrica), new C18136e(c9010e.ad, c9010e.vip, c9010e.metrica, c9010e.license, c9010e.appmetrica, c9010e.purchase, c9010e.billing, c9010e.yandex), new C0095e(1.0f, 1.1f, 1.0f, 1.0f, 1.0f), new C15850e(c14364e.ad, c14364e.vip, c14364e.metrica, c14364e.license, c14364e.appmetrica), new C12586e(c8717e.ad, c8717e.vip, c8717e.metrica), null, AbstractC16653e.license(-86283501, new C17630e(interfaceC12123e, function32, 1), c13770e), c13770e, ((i3 >> 12) & 57344) | (i3 & 8078), ((i4 >> 3) & 14) | 48, 0);
        } else {
            function32 = function3;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C13881e(function0, interfaceC12864e, c18387e, c8717e, c11465e, c9010e, c14364e, interfaceC12123e, function32, i);
        }
    }
}
