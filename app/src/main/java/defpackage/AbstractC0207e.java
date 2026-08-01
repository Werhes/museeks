package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؑۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0207e {
    public static final C2892e ad = new C2892e(1616356710, false, new C4509e(27));
    public static final C2892e vip = new C2892e(-1087169018, false, new C4509e(28));
    public static final C2892e metrica = new C2892e(1744177100, false, new C4509e(29));
    public static final C2892e license = new C2892e(-1349648853, false, new C6039e(0));
    public static final C2892e appmetrica = new C2892e(-1725334404, false, new C6039e(1));
    public static final C2892e purchase = new C2892e(773457279, false, new C6039e(2));
    public static final C2892e billing = new C2892e(1606387840, false, new C6039e(3));
    public static final C2892e yandex = new C2892e(-739969505, false, new C6039e(4));

    /* JADX WARN: Removed duplicated region for block: B:100:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(final kotlin.jvm.functions.Function0 r17, defpackage.InterfaceC12864e r18, defpackage.InterfaceC16154e r19, long r20, long r22, defpackage.C3658e r24, final defpackage.C2892e r25, defpackage.C13770e r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0207e.ad(kotlin.jvm.functions.Function0, eّۤۧ, eّٖؖ, long, long, eؕ۟ؖ, eؔ۟ٓ, eٓؕۥ, int, int):void");
    }

    public static final void adcel(C12021e c12021e, int i, Object obj) {
        c12021e.startapp[(c12021e.adcel - c12021e.appmetrica[c12021e.purchase - 1].metrica) + i] = obj;
    }

    public static final C13119e advert(Object obj, String str, C13770e c13770e, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        Object m3681throw = c13770e.m3681throw();
        C5170e c5170e = C2987e.ad;
        if (m3681throw == c5170e) {
            m3681throw = new C13119e(new C0351e(obj), null, str);
            c13770e.m3682throws(m3681throw);
        }
        C13119e c13119e = (C13119e) m3681throw;
        c13119e.ad(obj, c13770e, (i & 8) | 48 | (i & 14));
        Object m3681throw2 = c13770e.m3681throw();
        if (m3681throw2 == c5170e) {
            m3681throw2 = new C4823e(c13119e, 1);
            c13770e.m3682throws(m3681throw2);
        }
        AbstractC17680e.vip(c13119e, (Function1) m3681throw2, c13770e);
        return c13119e;
    }

    public static final C13119e appmetrica(C13119e c13119e, Object obj, Object obj2, String str, C13770e c13770e, int i) {
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && c13770e.purchase(c13119e)) || (i & 6) == 4;
        Object m3681throw = c13770e.m3681throw();
        Object obj3 = C2987e.ad;
        if (z2 || m3681throw == obj3) {
            m3681throw = new C13119e(new C0351e(obj), c13119e, AbstractC8647e.ads(new StringBuilder(), c13119e.metrica, " > ", str));
            c13770e.m3682throws(m3681throw);
        }
        C13119e c13119e2 = (C13119e) m3681throw;
        if ((i2 <= 4 || !c13770e.purchase(c13119e)) && (i & 6) != 4) {
            z = false;
        }
        boolean purchase2 = c13770e.purchase(c13119e2) | z;
        Object m3681throw2 = c13770e.m3681throw();
        if (purchase2 || m3681throw2 == obj3) {
            m3681throw2 = new C13942e(c13119e, c13119e2, 0);
            c13770e.m3682throws(m3681throw2);
        }
        AbstractC17680e.vip(c13119e2, (Function1) m3681throw2, c13770e);
        if (c13119e.billing()) {
            c13119e2.adcel(obj, obj2);
            return c13119e2;
        }
        c13119e2.mopub(obj2);
        c13119e2.mopub.setValue(Boolean.FALSE);
        return c13119e2;
    }

    public static final C11117e billing(C13119e c13119e, Object obj, Object obj2, InterfaceC6512e interfaceC6512e, C11139e c11139e, C13770e c13770e, int i) {
        Object obj3;
        Object obj4;
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && c13770e.purchase(c13119e)) || (i & 6) == 4;
        Object m3681throw = c13770e.m3681throw();
        Object obj5 = C2987e.ad;
        if (z2 || m3681throw == obj5) {
            AbstractC13717e adcel = AbstractC12640e.adcel();
            Function1 appmetrica2 = adcel != null ? adcel.appmetrica() : null;
            AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
            try {
                obj3 = obj2;
                AbstractC3424e abstractC3424e = (AbstractC3424e) c11139e.ad.invoke(obj3);
                abstractC3424e.license();
                obj4 = obj;
                Object c11117e = new C11117e(c13119e, obj4, abstractC3424e, c11139e);
                AbstractC12640e.Signature(adcel, smaato, appmetrica2);
                c13770e.m3682throws(c11117e);
                m3681throw = c11117e;
            } catch (Throwable th) {
                AbstractC12640e.Signature(adcel, smaato, appmetrica2);
                throw th;
            }
        } else {
            obj4 = obj;
            obj3 = obj2;
        }
        C11117e c11117e2 = (C11117e) m3681throw;
        int i4 = (i >> 3) & 8;
        int i5 = i << 3;
        license(c13119e, c11117e2, obj4, obj3, interfaceC6512e, c13770e, i2 | (i4 << 6) | (i5 & 896) | (i4 << 9) | (i5 & 7168) | (57344 & i5));
        if ((i3 <= 4 || !c13770e.purchase(c13119e)) && (i & 6) != 4) {
            z = false;
        }
        boolean purchase2 = c13770e.purchase(c11117e2) | z;
        Object m3681throw2 = c13770e.m3681throw();
        if (purchase2 || m3681throw2 == obj5) {
            m3681throw2 = new C6538e(c13119e, c11117e2, 29);
            c13770e.m3682throws(m3681throw2);
        }
        AbstractC17680e.vip(c11117e2, (Function1) m3681throw2, c13770e);
        return c11117e2;
    }

    public static final void license(C13119e c13119e, C11117e c11117e, Object obj, Object obj2, InterfaceC6512e interfaceC6512e, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(867041821);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(c13119e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.purchase(c11117e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? c13770e.purchase(obj) : c13770e.yandex(obj) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? c13770e.purchase(obj2) : c13770e.yandex(obj2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? c13770e.purchase(interfaceC6512e) : c13770e.yandex(interfaceC6512e) ? 16384 : 8192;
        }
        if (!c13770e.m3673protected(i2 & 1, (i2 & 9363) != 9362)) {
            c13770e.m3659default();
        } else if (c13119e.billing()) {
            c11117e.purchase(obj, obj2, interfaceC6512e);
        } else {
            c11117e.billing(obj2, interfaceC6512e);
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4280e(c13119e, c11117e, obj, obj2, interfaceC6512e, i);
        }
    }

    public static final void metrica(final Function0 function0, final InterfaceC12864e interfaceC12864e, final InterfaceC16154e interfaceC16154e, final long j, final long j2, C3658e c3658e, final C2892e c2892e, C13770e c13770e, final int i) {
        final C3658e c3658e2;
        int i2;
        C3658e metrica2;
        c13770e.m3671package(26608441);
        int i3 = i | (c13770e.yandex(function0) ? 4 : 2) | (c13770e.purchase(interfaceC12864e) ? 32 : 16) | (c13770e.purchase(interfaceC16154e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | 1638400;
        if (c13770e.m3673protected(i3 & 1, (4793491 & i3) != 4793490)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                i2 = i3 & (-458753);
                metrica2 = AbstractC12681e.metrica(0.0f, 0.0f, 0.0f, 0.0f, 15);
            } else {
                c13770e.m3659default();
                i2 = i3 & (-458753);
                metrica2 = c3658e;
            }
            c13770e.admob();
            C3658e c3658e3 = metrica2;
            ad(function0, AbstractC18007e.advert(interfaceC12864e, AbstractC2210e.vip, AbstractC2210e.ad, 0.0f, 0.0f, 12), interfaceC16154e, j, j2, c3658e3, c2892e, c13770e, i2 & 33554318, 0);
            c3658e2 = c3658e3;
        } else {
            c13770e.m3659default();
            c3658e2 = c3658e;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2(interfaceC12864e, interfaceC16154e, j, j2, c3658e2, c2892e, i) { // from class: eٕؑؐ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ long f29997e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC16154e f29998e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f29999e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ long f30000e;

                /* renamed from: eؘَٗ, reason: contains not printable characters */
                public final /* synthetic */ C2892e f30002e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ C3658e f30003e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(12610561);
                    AbstractC0207e.metrica(Function0.this, this.f29999e, this.f29998e, this.f30000e, this.f29997e, this.f30003e, this.f30002e, (C13770e) obj, advert);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void mopub(C12021e c12021e, int i, Object obj, int i2, Object obj2) {
        int i3 = c12021e.adcel - c12021e.appmetrica[c12021e.purchase - 1].metrica;
        Object[] objArr = c12021e.startapp;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [eؚٗٗ, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v5, types: [eؚٗٗ, kotlin.jvm.functions.Function1] */
    public static final C15037e purchase(C13119e c13119e, C11139e c11139e, String str, C13770e c13770e, int i, int i2) {
        C2919e c2919e;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean purchase2 = c13770e.purchase(c13119e);
        Object m3681throw = c13770e.m3681throw();
        Object obj = C2987e.ad;
        if (purchase2 || m3681throw == obj) {
            m3681throw = new C15037e(c13119e, c11139e, str);
            c13770e.m3682throws(m3681throw);
        }
        C15037e c15037e = (C15037e) m3681throw;
        boolean purchase3 = c13770e.purchase(c13119e) | c13770e.yandex(c15037e);
        Object m3681throw2 = c13770e.m3681throw();
        if (purchase3 || m3681throw2 == obj) {
            m3681throw2 = new C13942e(c13119e, c15037e, 1);
            c13770e.m3682throws(m3681throw2);
        }
        AbstractC17680e.vip(c15037e, (Function1) m3681throw2, c13770e);
        if (c13119e.billing() && (c2919e = (C2919e) c15037e.vip.getValue()) != null) {
            C13119e c13119e2 = c15037e.metrica;
            c2919e.f6906e.purchase(c2919e.f6903e.invoke(c13119e2.purchase().ad()), c2919e.f6903e.invoke(c13119e2.purchase().metrica()), (InterfaceC6512e) c2919e.f6904e.invoke(c13119e2.purchase()));
        }
        return c15037e;
    }

    public static final C13119e startapp(C0351e c0351e, String str, C13770e c13770e, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        boolean z = (((i & 14) ^ 6) > 4 && c13770e.purchase(c0351e)) || (i & 6) == 4;
        Object m3681throw = c13770e.m3681throw();
        Object obj = C2987e.ad;
        if (z || m3681throw == obj) {
            AbstractC13717e adcel = AbstractC12640e.adcel();
            Function1 appmetrica2 = adcel != null ? adcel.appmetrica() : null;
            AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
            try {
                Object c13119e = new C13119e(c0351e, null, str);
                AbstractC12640e.Signature(adcel, smaato, appmetrica2);
                c13770e.m3682throws(c13119e);
                m3681throw = c13119e;
            } catch (Throwable th) {
                AbstractC12640e.Signature(adcel, smaato, appmetrica2);
                throw th;
            }
        }
        C13119e c13119e2 = (C13119e) m3681throw;
        c13770e.m3676strictfp(-1356604288);
        c13119e2.ad(c0351e.metrica.getValue(), c13770e, 0);
        c13770e.Signature(false);
        boolean purchase2 = c13770e.purchase(c13119e2);
        Object m3681throw2 = c13770e.m3681throw();
        if (purchase2 || m3681throw2 == obj) {
            m3681throw2 = new C4823e(c13119e2, 0);
            c13770e.m3682throws(m3681throw2);
        }
        AbstractC17680e.vip(c13119e2, (Function1) m3681throw2, c13770e);
        return c13119e2;
    }

    public static final void vip(final Function0 function0, final C1839e c1839e, final InterfaceC12864e interfaceC12864e, final InterfaceC16154e interfaceC16154e, final long j, final long j2, final C3658e c3658e, final C2892e c2892e, C13770e c13770e, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        float f = AbstractC17375e.vip;
        float f2 = AbstractC17375e.ad;
        c13770e.m3671package(121669932);
        if ((i & 6) == 0) {
            i3 = (c13770e.yandex(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c13770e.purchase(c1839e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c13770e.metrica(f) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c13770e.metrica(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c13770e.purchase(interfaceC12864e) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= c13770e.purchase(interfaceC16154e) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= c13770e.appmetrica(j) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= c13770e.appmetrica(j2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= c13770e.purchase(c3658e) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= c13770e.purchase(null) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (c13770e.yandex(c2892e) ? 4 : 2);
        } else {
            i4 = i2;
        }
        boolean z = true;
        if (c13770e.m3673protected(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            c13770e.m3655case();
            if ((i & 1) != 0 && !c13770e.isPro()) {
                c13770e.m3659default();
            }
            c13770e.admob();
            c13770e.m3676strictfp(-282853233);
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (m3681throw == obj) {
                m3681throw = AbstractC17861e.adcel(c13770e);
            }
            C15274e c15274e = (C15274e) m3681throw;
            c13770e.Signature(false);
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == obj) {
                m3681throw2 = new C2163e(28);
                c13770e.m3682throws(m3681throw2);
            }
            InterfaceC12864e ad2 = AbstractC1147e.ad(interfaceC12864e, false, (Function1) m3681throw2);
            float f3 = c3658e.ad;
            int i6 = i3 >> 21;
            int i7 = i6 & 112;
            boolean purchase2 = c13770e.purchase(c15274e);
            Object m3681throw3 = c13770e.m3681throw();
            if (purchase2 || m3681throw3 == obj) {
                i5 = i6;
                m3681throw3 = new C13115e(c3658e.ad, c3658e.vip, c3658e.license, c3658e.metrica);
                c13770e.m3682throws(m3681throw3);
            } else {
                i5 = i6;
            }
            C13115e c13115e = (C13115e) m3681throw3;
            boolean yandex2 = c13770e.yandex(c13115e);
            if (((i7 ^ 48) <= 32 || !c13770e.purchase(c3658e)) && (i5 & 48) != 32) {
                z = false;
            }
            boolean z2 = yandex2 | z;
            Object m3681throw4 = c13770e.m3681throw();
            if (z2 || m3681throw4 == obj) {
                m3681throw4 = new C6626e(c13115e, c3658e, null, 13);
                c13770e.m3682throws(m3681throw4);
            }
            AbstractC17680e.license(c13770e, c3658e, (Function2) m3681throw4);
            boolean purchase3 = c13770e.purchase(c15274e) | c13770e.yandex(c13115e);
            Object m3681throw5 = c13770e.m3681throw();
            if (purchase3 || m3681throw5 == obj) {
                m3681throw5 = new C8857e(c15274e, c13115e, (InterfaceC5083e) null, 12);
                c13770e.m3682throws(m3681throw5);
            }
            AbstractC17680e.license(c13770e, c15274e, (Function2) m3681throw5);
            int i8 = i3 >> 6;
            AbstractC12121e.metrica(function0, ad2, false, interfaceC16154e, j, j2, f3, ((C15765e) c13115e.appmetrica.metrica.f32835e.getValue()).f31051e, null, c15274e, AbstractC16653e.license(-1779603465, new C11653e(j2, c1839e, c2892e), c13770e), c13770e, (i3 & 14) | (i8 & 7168) | (57344 & i8) | (i8 & 458752), 260);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eٌْۖ
                {
                    float f4 = AbstractC17375e.ad;
                    float f5 = AbstractC17375e.ad;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    float f4 = AbstractC17375e.ad;
                    float f5 = AbstractC17375e.ad;
                    ((Integer) obj3).getClass();
                    AbstractC0207e.vip(function0, c1839e, interfaceC12864e, interfaceC16154e, j, j2, c3658e, c2892e, (C13770e) obj2, AbstractC5190e.advert(i | 1), AbstractC5190e.advert(i2));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static void yandex(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }
}
