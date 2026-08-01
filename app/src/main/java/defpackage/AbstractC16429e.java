package defpackage;

import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16429e {
    public static final float adcel;
    public static final float appmetrica;
    public static final float billing;
    public static final float license;
    public static final float metrica;
    public static final float purchase;
    public static final float startapp;
    public static final float yandex;
    public static final float ad = 8;
    public static final float vip = 12;

    static {
        float f = 16;
        metrica = f;
        license = f;
        appmetrica = f;
        purchase = f;
        float f2 = AbstractC14493e.ad;
        billing = AbstractC14493e.startapp;
        yandex = AbstractC14493e.amazon;
        startapp = AbstractC14493e.advert;
        adcel = AbstractC14493e.ad;
        float f3 = AbstractC14493e.ad;
        float f4 = AbstractC14493e.ad;
        float f5 = AbstractC14493e.ad;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(final kotlin.jvm.functions.Function2 r23, defpackage.InterfaceC12864e r24, kotlin.jvm.functions.Function2 r25, kotlin.jvm.functions.Function2 r26, kotlin.jvm.functions.Function2 r27, kotlin.jvm.functions.Function2 r28, defpackage.C8872e r29, float r30, float r31, defpackage.C13770e r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16429e.ad(kotlin.jvm.functions.Function2, eّۤۧ, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, eٌّٟ, float, float, eٓؕۥ, int, int):void");
    }

    public static final int license(InterfaceC0732e interfaceC0732e, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        int max = Math.max(Math.max(C5602e.startapp(j), interfaceC0732e.mo493e(i6 == 1 ? AbstractC14493e.adcel : i6 == 2 ? AbstractC14493e.loadAd : AbstractC14493e.mopub)), Math.max(i, Math.max(i3 + i4 + i5, i2)) + i7);
        int billing2 = C5602e.billing(j);
        return max > billing2 ? billing2 : max;
    }

    public static final void metrica(long j, int i, Function2 function2, C13770e c13770e, int i2) {
        long j2;
        C13770e c13770e2;
        Function2 function22;
        c13770e.m3671package(-285397024);
        int i3 = (c13770e.appmetrica(j) ? 4 : 2) | i2 | (c13770e.yandex(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e.m3673protected(i3 & 1, (i3 & 147) != 146)) {
            j2 = j;
            c13770e2 = c13770e;
            AbstractC5750e.ad(j2, AbstractC16475e.ad(c13770e, i), function2, c13770e2, i3 & 910);
            function22 = function2;
        } else {
            j2 = j;
            c13770e2 = c13770e;
            function22 = function2;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C13581e(j2, i, function22, i2);
        }
    }

    public static final void vip(Function2 function2, Function2 function22, C2892e c2892e, Function2 function23, Function2 function24, C13770e c13770e, int i) {
        c13770e.m3671package(-61277522);
        int i2 = i | (c13770e.yandex(function2) ? 4 : 2) | (c13770e.yandex(function22) ? 32 : 16) | (c13770e.yandex(function23) ? 2048 : 1024) | (c13770e.yandex(function24) ? 16384 : 8192);
        if (c13770e.m3673protected(i2 & 1, (i2 & 9363) != 9362)) {
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = new Object();
                c13770e.m3682throws(m3681throw);
            }
            C10116e c10116e = (C10116e) m3681throw;
            C2892e metrica2 = AbstractC16653e.metrica(AbstractC6874e.startapp(c2892e, function23 == null ? AbstractC13362e.ad : function23, function24 == null ? AbstractC13362e.vip : function24, function2 == null ? AbstractC13362e.metrica : function2, function22 == null ? AbstractC13362e.license : function22));
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = new C3045e(c10116e);
                c13770e.m3682throws(m3681throw2);
            }
            InterfaceC2747e interfaceC2747e = (InterfaceC2747e) m3681throw2;
            long j = c13770e.f27286case;
            int i3 = (int) ((j >>> 32) ^ j);
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, C0115e.f1276e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, interfaceC2747e, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase2, C2721e.license);
            metrica2.invoke(c13770e, 0);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C14075e(function2, function22, c2892e, function23, function24, i);
        }
    }
}
