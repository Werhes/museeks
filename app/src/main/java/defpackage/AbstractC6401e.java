package defpackage;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖٔ */
/* loaded from: classes3.dex */
public abstract class AbstractC6401e {
    public static final C2892e ad = new C2892e(-1354776900, false, new C9012e(13));
    public static final C2892e vip = new C2892e(456385052, false, new C9012e(14));
    public static final C2892e metrica = new C2892e(1753377416, false, new C10417e(22));
    public static final C2892e license = new C2892e(-813842497, false, new C10417e(23));
    public static final C2892e appmetrica = new C2892e(12814930, false, new C10417e(24));

    public static final void ad(InterfaceC10799e interfaceC10799e, C2892e c2892e, C2892e c2892e2, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(361955440);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(interfaceC10799e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(c2892e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(c2892e2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            InterfaceC12864e ad2 = interfaceC10799e.ad(C0115e.f1276e, 1.0f, true);
            C4789e ad3 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e, 0);
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, ad2);
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
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC14489e.ad(((C7019e) c13770e.adcel(c15492e)).vip.adcel, c2892e, c13770e, i2 & 112);
            AbstractC1101e.ad(AbstractC8703e.loadAd(((C7019e) c13770e.adcel(c15492e)).ad.remoteconfig, AbstractC0608e.ad), AbstractC16653e.license(-1424395398, new C7099e(c2892e2, 14), c13770e), c13770e, 56);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9381e(interfaceC10799e, c2892e, c2892e2, i);
        }
    }

    public static final void adcel(C13506e c13506e) {
        C6405e c6405e = AbstractC1787e.ad;
        C15937e c15937e = EnumC1227e.f3878e;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(c15937e, 10));
        C1630e c1630e = new C1630e(0, c15937e);
        while (c1630e.hasNext()) {
            arrayList.add(((EnumC1227e) c1630e.next()).f3880e);
        }
    }

    public static final Csuper advert(C10861e c10861e) {
        return new Csuper(C2526e.f6374e, c10861e);
    }

    public static final C14803e appmetrica(Function1 function1, Object obj, C14803e c14803e) {
        try {
            function1.invoke(obj);
            return c14803e;
        } catch (Throwable th) {
            if (c14803e == null || c14803e.getCause() == th) {
                return new C14803e(15, AbstractC1634e.advert(obj, "Exception in undelivered element handler for "), th);
            }
            AbstractC13362e.license(c14803e, th);
            return c14803e;
        }
    }

    public static final Object billing(Class cls, Map map, List list) {
        C5363e c5363e = new C5363e(new C3411e(3, map));
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C13791e(cls, map, new C5363e(new C12056e(cls, map, 2)), c5363e, list));
    }

    public static final void license(Function1 function1, Object obj, InterfaceC8850e interfaceC8850e) {
        C14803e appmetrica2 = appmetrica(function1, obj, null);
        if (appmetrica2 != null) {
            AbstractC15849e.license(interfaceC8850e, appmetrica2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void metrica(final java.lang.String r39, java.lang.String r40, long r41, long r43, defpackage.InterfaceC12864e r45, defpackage.C13770e r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6401e.metrica(java.lang.String, java.lang.String, long, long, eّۤۧ, eٓؕۥ, int, int):void");
    }

    public static final C11980e mopub(C13506e c13506e) {
        C11853e c11853e = AbstractC1787e.appmetrica;
        C15937e c15937e = EnumC14920e.f29596e;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(c15937e, 10));
        C1630e c1630e = new C1630e(0, c15937e);
        while (c1630e.hasNext()) {
            arrayList.add(((EnumC14920e) c1630e.next()).f29598e);
        }
        return new C11980e(c13506e, c11853e, c15937e, arrayList, 9);
    }

    public static final Csuper purchase(C10861e c10861e) {
        return new Csuper(C10321e.f20367e, c10861e);
    }

    public static final C11980e smaato(C13506e c13506e) {
        C11853e c11853e = AbstractC1787e.license;
        C15937e c15937e = EnumC0009e.f1140e;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(c15937e, 10));
        C1630e c1630e = new C1630e(0, c15937e);
        while (c1630e.hasNext()) {
            arrayList.add(((EnumC0009e) c1630e.next()).f1141e);
        }
        return new C11980e(c13506e, c11853e, c15937e, arrayList, 9);
    }

    public static final void startapp(C10861e c10861e) {
        int i = C5622e.f11981e;
        if (c10861e.vip == 1 && c10861e.metrica == 1) {
            return;
        }
        throw new IllegalArgumentException(("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but " + c10861e + " was passed").toString());
    }

    public static final void vip(C2892e c2892e, C2892e c2892e2, InterfaceC12864e interfaceC12864e, Function3 function3, C13770e c13770e, int i, int i2) {
        int i3;
        Function3 function32;
        c13770e.m3671package(655292407);
        if ((i & 6) == 0) {
            i3 = (c13770e.yandex(c2892e) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c13770e.yandex(c2892e2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c13770e.purchase(interfaceC12864e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= c13770e.yandex(function3) ? 2048 : 1024;
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                function3 = AbstractC14059e.ad;
            }
            Function3 function33 = function3;
            AbstractC1101e.ad(AbstractC8703e.loadAd(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.admob, AbstractC0608e.ad), AbstractC16653e.license(1042344759, new C6409e(interfaceC12864e, c2892e, c2892e2, function33, 28), c13770e), c13770e, 56);
            function32 = function33;
        } else {
            c13770e.m3659default();
            function32 = function3;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C3015e(c2892e, c2892e2, interfaceC12864e, function32, i, i2, 4);
        }
    }

    public static /* synthetic */ Object yandex(Class cls, Map map) {
        Set keySet = map.keySet();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        return billing(cls, map, arrayList);
    }
}
