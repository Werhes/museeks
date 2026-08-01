package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؑۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17480e {
    public static final float ad = 4;
    public static final C9340e vip = new C9340e(0, null);
    public static final C9340e metrica = new C9340e(1, null);

    public static final void ad(InterfaceC12864e interfaceC12864e, final long j, final long j2, final Function3 function3, C13770e c13770e, final int i) {
        final InterfaceC12864e interfaceC12864e2;
        InterfaceC12864e interfaceC12864e3;
        InterfaceC16154e ad2;
        char c;
        c13770e.m3671package(1428256508);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= c13770e.appmetrica(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.appmetrica(j2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            c13770e.m3655case();
            int i3 = i & 1;
            InterfaceC12864e interfaceC12864e4 = C0115e.f1276e;
            if (i3 == 0 || c13770e.isPro()) {
                interfaceC12864e3 = interfaceC12864e4;
            } else {
                c13770e.m3659default();
                interfaceC12864e3 = interfaceC12864e;
            }
            c13770e.admob();
            float f = function3 != null ? AbstractC0345e.ad : AbstractC0345e.vip;
            if (function3 != null) {
                c13770e.m3676strictfp(-1051024814);
                ad2 = AbstractC8949e.ad(c13770e, 7);
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(-1050967433);
                ad2 = AbstractC8949e.ad(c13770e, 7);
                c13770e.Signature(false);
            }
            InterfaceC12864e metrica2 = AbstractC16136e.metrica(AbstractC18007e.ad(interfaceC12864e3, f, f), j, ad2);
            if (function3 != null) {
                c = ' ';
                interfaceC12864e4 = AbstractC12220e.smaato(interfaceC12864e4, ad, 0.0f, 2);
            } else {
                c = ' ';
            }
            InterfaceC12864e premium = metrica2.premium(interfaceC12864e4);
            C8587e ad3 = AbstractC6451e.ad(AbstractC16497e.appmetrica, C5438e.f11668e, c13770e, 54);
            long j3 = c13770e.f27286case;
            int i4 = (int) (j3 ^ (j3 >>> c));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, premium);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad3, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i4), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            if (function3 != null) {
                c13770e.m3676strictfp(1345815094);
                AbstractC5750e.ad(j2, AbstractC16475e.ad(c13770e, 12), AbstractC16653e.license(541712501, new C2954e(0, function3), c13770e), c13770e, ((i2 >> 6) & 14) | 384);
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(1346141834);
                c13770e.Signature(false);
            }
            c13770e.Signature(true);
            interfaceC12864e2 = interfaceC12864e3;
        } else {
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eٖۖؕ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC17480e.ad(InterfaceC12864e.this, j, j2, function3, (C13770e) obj, AbstractC5190e.advert(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
