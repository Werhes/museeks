package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؓۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2003e {
    public final /* synthetic */ int ad;

    public /* synthetic */ AbstractC2003e(int i) {
        this.ad = i;
    }

    public static final void ad(C15369e c15369e, InterfaceC12864e interfaceC12864e, C2892e c2892e, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(100558968);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(c15369e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? 32 : 16;
        }
        Object obj = null;
        if ((i & 384) == 0) {
            i2 |= (i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? c13770e.purchase(null) : c13770e.yandex(null) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.yandex(c2892e) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && c13770e.ads()) {
            c13770e.m3659default();
        } else {
            C10304e metrica = AbstractC6437e.metrica(c13770e);
            C13070e c13070e = c15369e.metrica;
            HashSet hashSet = new HashSet();
            Iterator it = c13070e.iterator();
            while (it.hasNext()) {
                hashSet.add(((AbstractC6986e) it.next()).metrica());
            }
            appmetrica(metrica, hashSet, c13770e, 0);
            C13952e c13952e = (C13952e) c13770e.adcel(AbstractC2683e.ad);
            c13770e.m3676strictfp(1543417698);
            c13770e.m3676strictfp(1543418101);
            boolean purchase = c13770e.purchase(c13952e);
            Object m3681throw = c13770e.m3681throw();
            if (purchase || m3681throw == C2987e.ad) {
                c13952e.getClass();
                c13770e.m3682throws(null);
            } else {
                obj = m3681throw;
            }
            c13770e.Signature(false);
            c13770e.Signature(false);
            C2892e license = AbstractC16653e.license(-1548770973, new C1616e(metrica, c2892e, 0), c13770e);
            c13770e.m3676strictfp(1800734984);
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, interfaceC12864e);
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
            C14865e c14865e = C2721e.adcel;
            if (c13770e.f27292implements || !AbstractC7890e.billing(c13770e.m3681throw(), Integer.valueOf(i3))) {
                c13770e.m3682throws(Integer.valueOf(i3));
                c13770e.vip(Integer.valueOf(i3), c14865e);
            }
            AbstractC2270e.yandex(c13770e, purchase2, C2721e.license);
            license.invoke(c15369e.ad, c13770e, 48);
            c13770e.Signature(true);
            c13770e.Signature(false);
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9381e(i, 6, c15369e, interfaceC12864e, c2892e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [eؘؕ۟, java.lang.Object] */
    public static final void appmetrica(InterfaceC10545e interfaceC10545e, HashSet hashSet, C13770e c13770e, int i) {
        c13770e.m3671package(-290867539);
        if ((((c13770e.yandex(interfaceC10545e) ? 4 : 2) | i | (c13770e.yandex(hashSet) ? 32 : 16)) & 19) == 18 && c13770e.ads()) {
            c13770e.m3659default();
        } else {
            c13770e.m3676strictfp(647262698);
            boolean purchase = c13770e.purchase(interfaceC10545e);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            Object obj = m3681throw;
            if (purchase || m3681throw == c5170e) {
                ?? obj2 = new Object();
                obj2.ad = hashSet;
                c13770e.m3682throws(obj2);
                obj = obj2;
            }
            C5423e c5423e = (C5423e) obj;
            c13770e.Signature(false);
            c13770e.m3676strictfp(647265340);
            boolean yandex = c13770e.yandex(c5423e) | c13770e.yandex(hashSet) | c13770e.yandex(interfaceC10545e);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex || m3681throw2 == c5170e) {
                m3681throw2 = new Cthrows(9, c5423e, hashSet, interfaceC10545e);
                c13770e.m3682throws(m3681throw2);
            }
            c13770e.Signature(false);
            AbstractC17680e.ad(interfaceC10545e, hashSet, (Function1) m3681throw2, c13770e);
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C1743e(interfaceC10545e, hashSet, i, 12);
        }
    }

    public static final InterfaceC12864e license(InterfaceC12864e interfaceC12864e, InterfaceC9959e interfaceC9959e, InterfaceC5495e interfaceC5495e, EnumC17426e enumC17426e, boolean z) {
        return interfaceC12864e.premium(new C2612e(interfaceC9959e, interfaceC5495e, enumC17426e, z));
    }

    public static final void purchase(Object obj) {
        if (obj instanceof C12763e) {
            throw ((C12763e) obj).f25537e;
        }
    }

    public static final void vip(C5609e c5609e, InterfaceC12864e interfaceC12864e, C2892e c2892e, C13770e c13770e, int i, int i2) {
        int i3;
        c13770e.m3671package(669199561);
        int i4 = (c13770e.yandex(c5609e) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (c13770e.purchase(interfaceC12864e) ? 32 : 16);
        }
        int i6 = i3 | 384;
        if ((i6 & 1171) == 1170 && c13770e.ads()) {
            c13770e.m3659default();
        } else {
            if (i5 != 0) {
                interfaceC12864e = C0115e.f1276e;
            }
            ad((C15369e) AbstractC3265e.vip(c5609e, c13770e, i6 & 14).getValue(), interfaceC12864e, c2892e, c13770e, i6 & 8176);
        }
        InterfaceC12864e interfaceC12864e2 = interfaceC12864e;
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9381e(i, i2, 5, c5609e, interfaceC12864e2, c2892e);
        }
    }

    public abstract String metrica();

    public String toString() {
        switch (this.ad) {
            case 3:
                return metrica();
            default:
                return super.toString();
        }
    }
}
