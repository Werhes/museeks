package defpackage;

import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٜؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4229e {
    public static final float ad;
    public static final long license;
    public static final float metrica;
    public static final float vip;

    static {
        AbstractC12696e.yandex(300, 2, AbstractC5616e.ad);
        ad = 22;
        vip = 48;
        metrica = 24;
        license = AbstractC9931e.ad(0.5f, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(final defpackage.InterfaceC12864e r24, final defpackage.C3229e r25, final kotlin.jvm.functions.Function0 r26, final float r27, final boolean r28, final kotlin.jvm.functions.Function2 r29, final kotlin.jvm.functions.Function2 r30, final defpackage.InterfaceC16154e r31, final long r32, final long r34, final float r36, float r37, final defpackage.C2892e r38, defpackage.C13770e r39, final int r40) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4229e.ad(eّۤۧ, eٌؕؖ, kotlin.jvm.functions.Function0, float, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, eّٖؖ, long, long, float, float, eؔ۟ٓ, eٓؕۥ, int):void");
    }

    public static final float appmetrica(C10122e c10122e, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c10122e.f19998e & 4294967295L));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (AbstractC15842e.startapp(0.0f, Math.min(c10122e.vip() * metrica, intBitsToFloat), f) / intBitsToFloat);
    }

    public static final float license(C10122e c10122e, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c10122e.f19998e >> 32));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (AbstractC15842e.startapp(0.0f, Math.min(c10122e.vip() * vip, intBitsToFloat), f) / intBitsToFloat);
    }

    public static final void metrica(InterfaceC12864e interfaceC12864e, Function2 function2, C13770e c13770e, int i) {
        c13770e.m3671package(1361920385);
        int i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i | (c13770e.yandex(function2) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            String vip2 = AbstractC9408e.vip(c13770e, R.string.m3c_bottom_sheet_drag_handle_description);
            InterfaceC12864e metrica2 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11700e, false);
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, metrica2);
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
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            AbstractC2241e.metrica(AbstractC10536e.ad(c13770e, 390), AbstractC16653e.license(1497042086, new C7542e(vip2, 3), c13770e), AbstractC2241e.appmetrica(c13770e), interfaceC12864e, null, false, function2, c13770e, ((i2 << 9) & 7168) | 48 | ((i2 << 21) & 234881024), 240);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C15709e(interfaceC12864e, function2, i, 21);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void vip(final float r27, final defpackage.InterfaceC12864e r28, final defpackage.C3229e r29, final kotlin.jvm.functions.Function0 r30, final float r31, final boolean r32, final defpackage.InterfaceC16154e r33, final long r34, final long r36, final float r38, final float r39, final kotlin.jvm.functions.Function2 r40, final kotlin.jvm.functions.Function2 r41, final defpackage.C2892e r42, defpackage.C13770e r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4229e.vip(float, eّۤۧ, eٌؕؖ, kotlin.jvm.functions.Function0, float, boolean, eّٖؖ, long, long, float, float, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, eؔ۟ٓ, eٓؕۥ, int, int):void");
    }
}
