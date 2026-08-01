package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7111e {
    public static final C2493e ad = new C2493e(Float.POSITIVE_INFINITY);
    public static final C14443e vip = new C14443e(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final C18062e metrica = new C18062e(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final C8683e license = new C8683e(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final C2493e appmetrica = new C2493e(Float.NEGATIVE_INFINITY);
    public static final C14443e purchase = new C14443e(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final C18062e billing = new C18062e(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final C8683e yandex = new C8683e(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final StackTraceElement[] startapp = new StackTraceElement[0];

    public static C7558e ad(float f) {
        return new C7558e(Float.valueOf(f), AbstractC9546e.ad, Float.valueOf(0.01f), 8);
    }

    public static long appmetrica(int i, int i2) {
        int i3 = -1;
        int i4 = i2 == 0 ? -1 : AbstractC4382e.ad[AbstractC8703e.m2467class(i2)];
        if (i4 != -1) {
            i3 = 1;
            if (i4 == 1) {
                i3 = 0;
            } else if (i4 != 2) {
                throw new C14803e(10);
            }
        }
        return (i << 32) | (i3 & 4294967295L);
    }

    public static final boolean billing(InterfaceC4911e interfaceC4911e) {
        return interfaceC4911e.yandex();
    }

    public static final int license(long j) {
        int i = (int) (j & 4294967295L);
        if (i < 0) {
            return 0;
        }
        return i == 0 ? 1 : 2;
    }

    public static final void metrica(C2317e c2317e, InterfaceC12864e interfaceC12864e, C2892e c2892e, C13770e c13770e, int i) {
        InterfaceC12864e interfaceC12864e2;
        c13770e.m3671package(-1077081618);
        int i2 = i | 48;
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            C18362e c18362e = (C18362e) c2317e.vip.getValue();
            InterfaceC14181e interfaceC14181e = (InterfaceC14181e) c13770e.adcel(AbstractC11473e.ad);
            boolean purchase2 = c13770e.purchase(c18362e) | c13770e.yandex(interfaceC14181e);
            Object m3681throw = c13770e.m3681throw();
            if (purchase2 || m3681throw == C2987e.ad) {
                m3681throw = new C7602e(c18362e, interfaceC14181e, null, 17);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC17680e.license(c13770e, c18362e, (Function2) m3681throw);
            C18362e c18362e2 = (C18362e) c2317e.vip.getValue();
            C0115e c0115e = C0115e.f1276e;
            vip(c18362e2, c0115e, c2892e, c13770e, 432);
            interfaceC12864e2 = c0115e;
        } else {
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C18522e(i, 3, c2317e, interfaceC12864e2, c2892e);
        }
    }

    public static final String purchase(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [eْٕ٘, java.lang.Object] */
    public static final void vip(C18362e c18362e, InterfaceC12864e interfaceC12864e, C2892e c2892e, C13770e c13770e, int i) {
        char c;
        C18362e c18362e2 = c18362e;
        c13770e.m3671package(-977568115);
        int i2 = (i & 6) == 0 ? (c13770e.purchase(c18362e2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(c2892e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            String vip2 = AbstractC9408e.vip(c13770e, R.string.m3c_snackbar_pane_title);
            Object m3681throw = c13770e.m3681throw();
            Object obj = m3681throw;
            if (m3681throw == C2987e.ad) {
                ?? obj2 = new Object();
                obj2.ad = new Object();
                obj2.vip = new ArrayList();
                c13770e.m3682throws(obj2);
                obj = obj2;
            }
            C17778e c17778e = (C17778e) obj;
            Object obj3 = c17778e.ad;
            ArrayList arrayList = c17778e.vip;
            if (AbstractC7890e.billing(c18362e2, obj3)) {
                c = ' ';
                c13770e.m3676strictfp(1443889109);
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(1441886385);
                c17778e.ad = c18362e2;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add((C18362e) ((C17932e) arrayList.get(i3)).ad);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(c18362e2)) {
                    arrayList3.add(c18362e2);
                }
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Object obj4 = arrayList3.get(i4);
                    if (obj4 != null) {
                        arrayList4.add(obj4);
                    }
                }
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    C18362e c18362e3 = (C18362e) arrayList4.get(i5);
                    arrayList.add(new C17932e(c18362e3, AbstractC16653e.license(-1952400805, new C12050e(c18362e3, c18362e2, c17778e, vip2, 26), c13770e)));
                    i5++;
                    c18362e2 = c18362e;
                }
                c = ' ';
                c13770e.Signature(false);
            }
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
            long j = c13770e.f27286case;
            int i6 = (int) (j ^ (j >>> c));
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
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i6), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase2, C2721e.license);
            C2846e inmobi = c13770e.inmobi();
            if (inmobi == null) {
                throw new IllegalStateException("no recompose scope found");
            }
            inmobi.purchase();
            c17778e.metrica = inmobi;
            c13770e.m3676strictfp(-1888182177);
            int size4 = arrayList.size();
            for (int i7 = 0; i7 < size4; i7++) {
                C17932e c17932e = (C17932e) arrayList.get(i7);
                C18362e c18362e4 = (C18362e) c17932e.ad;
                C2892e c2892e2 = c17932e.vip;
                c13770e.m3662final(1325010085, c18362e4);
                c2892e2.invoke(AbstractC16653e.license(-1893791890, new C15709e(c2892e, c18362e4, 27), c13770e), c13770e, 6);
                c13770e.Signature(false);
            }
            c13770e.Signature(false);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9381e(i, 21, c18362e, interfaceC12864e, c2892e);
        }
    }

    public static final String yandex(InterfaceC5083e interfaceC5083e) {
        Object c12763e;
        if (interfaceC5083e instanceof C3843e) {
            return ((C3843e) interfaceC5083e).toString();
        }
        try {
            c12763e = interfaceC5083e + '@' + purchase(interfaceC5083e);
        } catch (Throwable th) {
            c12763e = new C12763e(th);
        }
        if (C13523e.ad(c12763e) != null) {
            c12763e = interfaceC5083e.getClass().getName() + '@' + purchase(interfaceC5083e);
        }
        return (String) c12763e;
    }
}
