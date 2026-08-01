package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٟؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15265e {
    public static final C6571e ad;

    static {
        C13664e c13664e = C13664e.f27089e;
        ad = new C6571e(c13664e, c13664e);
    }

    public static final void ad(C10566e c10566e, List list, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(-1794596951);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(c10566e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        char c = ' ';
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(list) ? 32 : 16;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            int i3 = 0;
            while (i3 < size) {
                C9363e c9363e = (C9363e) list.get(i3);
                Function3 function3 = (Function3) c9363e.ad;
                int i4 = c9363e.vip;
                int i5 = c9363e.metrica;
                Object m3681throw = c13770e.m3681throw();
                if (m3681throw == C2987e.ad) {
                    m3681throw = C3783e.license;
                    c13770e.m3682throws(m3681throw);
                }
                InterfaceC2747e interfaceC2747e = (InterfaceC2747e) m3681throw;
                long j = c13770e.f27286case;
                int i6 = (int) (j ^ (j >>> c));
                InterfaceC3483e advert = c13770e.advert();
                InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, C0115e.f1276e);
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
                AbstractC2270e.yandex(c13770e, Integer.valueOf(i6), C2721e.adcel);
                AbstractC2270e.purchase(c13770e, C2721e.mopub);
                AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                function3.invoke(c10566e.subSequence(i4, i5).f20850e, c13770e, 0);
                c13770e.Signature(true);
                i3++;
                c = ' ';
            }
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C0205e(c10566e, list, i, 1);
        }
    }
}
