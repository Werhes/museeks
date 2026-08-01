package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٞؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8844e {
    public static final float ad;
    public static final float appmetrica;
    public static final float license;
    public static final float metrica;
    public static final C13594e purchase;
    public static final float vip;

    static {
        float f = AbstractC14463e.vip;
        ad = f;
        vip = AbstractC14463e.billing;
        metrica = AbstractC14463e.purchase;
        float f2 = AbstractC14463e.license;
        license = f2;
        appmetrica = (f2 - f) / 2;
        purchase = new C13594e(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(final boolean r50, final kotlin.jvm.functions.Function1 r51, defpackage.InterfaceC12864e r52, boolean r53, defpackage.C4950e r54, defpackage.C13770e r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8844e.ad(boolean, kotlin.jvm.functions.Function1, eّۤۧ, boolean, eؗ٘ؑ, eٓؕۥ, int, int):void");
    }

    public static final void vip(final InterfaceC12864e interfaceC12864e, final boolean z, final boolean z2, final C4950e c4950e, final C15274e c15274e, final InterfaceC16154e interfaceC16154e, C13770e c13770e, final int i) {
        int i2;
        char c;
        long j;
        char c2;
        long j2;
        InterfaceC16154e interfaceC16154e2;
        long j3;
        c13770e.m3671package(-670917213);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.billing(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.billing(z2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.purchase(c4950e) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e.yandex(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c13770e.purchase(c15274e) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c13770e.purchase(interfaceC16154e) ? 1048576 : 524288;
        }
        if (c13770e.m3673protected(i2 & 1, (599187 & i2) != 599186)) {
            if (!z2) {
                c = ' ';
                j = z ? c4950e.adcel : c4950e.amazon;
            } else if (z) {
                c = ' ';
                j = c4950e.vip;
            } else {
                c = ' ';
                j = c4950e.purchase;
            }
            if (z2) {
                c2 = c;
                j2 = z ? c4950e.ad : c4950e.appmetrica;
            } else {
                c2 = c;
                j2 = z ? c4950e.startapp : c4950e.smaato;
            }
            float f = AbstractC14463e.ad;
            InterfaceC16154e ad2 = AbstractC8949e.ad(c13770e, 7);
            float f2 = AbstractC14463e.appmetrica;
            if (z2) {
                interfaceC16154e2 = ad2;
                j3 = z ? c4950e.metrica : c4950e.billing;
            } else {
                interfaceC16154e2 = ad2;
                j3 = z ? c4950e.mopub : c4950e.loadAd;
            }
            InterfaceC16154e interfaceC16154e3 = interfaceC16154e2;
            InterfaceC12864e metrica2 = AbstractC16136e.metrica(AbstractC13201e.ad(interfaceC12864e, f2, j3, interfaceC16154e3), j, interfaceC16154e3);
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
            long j4 = c13770e.f27286case;
            int i3 = (int) (j4 ^ (j4 >>> c2));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, metrica2);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e, license2, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i3);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
            InterfaceC12864e metrica3 = AbstractC16136e.metrica(AbstractC10746e.ad(C14486e.ad.ad(C0115e.f1276e, C5438e.f11666e).premium(new C8446e(c15274e, z, AbstractC11008e.metrica(c13770e, 2))), c15274e, AbstractC17052e.ad(AbstractC14463e.metrica / 2, 4, 0L, false)), j2, interfaceC16154e);
            InterfaceC2747e license3 = AbstractC17074e.license(C5438e.f11700e, false);
            long j5 = c13770e.f27286case;
            int i4 = (int) (j5 ^ (j5 >>> c2));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, metrica3);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license3, c14865e);
            AbstractC2270e.yandex(c13770e, advert2, c14865e2);
            AbstractC13501e.mopub(i4, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase3, c14865e4);
            c13770e.m3676strictfp(1236071411);
            c13770e.Signature(false);
            c13770e.Signature(true);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eؘُؕ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC8844e.vip(InterfaceC12864e.this, z, z2, c4950e, c15274e, interfaceC16154e, (C13770e) obj, AbstractC5190e.advert(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
