package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٔ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14783e {
    public static final boolean ad(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = C13664e.f27089e;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int billing = AbstractC6874e.billing(arrayList);
                int i = 0;
                while (i < billing) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    C6071e c6071e = (C6071e) obj2;
                    C6071e c6071e2 = (C6071e) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (c6071e2.billing().purchase() >> 32)) - Float.intBitsToFloat((int) (c6071e.billing().purchase() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (c6071e2.billing().purchase() & 4294967295L)) - Float.intBitsToFloat((int) (c6071e.billing().purchase() & 4294967295L)));
                    arrayList2.add(new C2152e((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((C2152e) AbstractC13480e.m3591interface(list)).ad;
            } else {
                if (list.isEmpty()) {
                    AbstractC17404e.metrica("Empty collection can't be reduced.");
                }
                Object m3591interface = AbstractC13480e.m3591interface(list);
                int billing2 = AbstractC6874e.billing(list);
                if (1 <= billing2) {
                    int i2 = 1;
                    while (true) {
                        m3591interface = new C2152e(C2152e.startapp(((C2152e) m3591interface).ad, ((C2152e) list.get(i2)).ad));
                        if (i2 == billing2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((C2152e) m3591interface).ad;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static String adcel(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String concat = BuildConfig.FLAVOR.concat(String.valueOf(str));
        return concat.substring(0, Math.min(concat.length(), 23));
    }

    public static final void appmetrica(C8092e c8092e, C6071e c6071e) {
        Object billing = c6071e.mopub().f2578e.billing(AbstractC9058e.purchase);
        if (billing == null) {
            billing = null;
        }
        C6517e c6517e = (C6517e) billing;
        if (c6517e != null) {
            c8092e.advert(C6594e.m2213finally(c6517e.ad, c6517e.vip, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object billing2 = c6071e.mopub().f2578e.billing(AbstractC9058e.appmetrica);
        if ((billing2 != null ? billing2 : null) != null) {
            List adcel = C6071e.adcel(4, c6071e);
            int size = adcel.size();
            for (int i = 0; i < size; i++) {
                C6071e c6071e2 = (C6071e) adcel.get(i);
                if (c6071e2.mopub().f2578e.metrica(AbstractC9058e.f18136extends)) {
                    arrayList.add(c6071e2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean ad = ad(arrayList);
        c8092e.advert(C6594e.m2213finally(ad ? 1 : arrayList.size(), ad ? arrayList.size() : 1, 0));
    }

    public static final void billing(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final InterfaceC12864e license(InterfaceC12864e interfaceC12864e, InterfaceC14906e interfaceC14906e, C10663e c10663e) {
        return interfaceC12864e.premium(new C13012e(interfaceC14906e, c10663e));
    }

    public static int mopub(Level level) {
        int intValue = level.intValue();
        if (intValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue >= Level.INFO.intValue()) {
            return 4;
        }
        return intValue >= Level.FINE.intValue() ? 3 : 2;
    }

    public static final void purchase(C8092e c8092e, C6071e c6071e) {
        Object billing = c6071e.mopub().f2578e.billing(AbstractC9058e.billing);
        if (billing == null) {
            billing = null;
        }
        if (billing != null) {
            throw new ClassCastException();
        }
        C6071e advert = c6071e.advert();
        if (advert == null) {
            return;
        }
        Object billing2 = advert.mopub().f2578e.billing(AbstractC9058e.appmetrica);
        if (billing2 == null) {
            billing2 = null;
        }
        if (billing2 != null) {
            Object billing3 = advert.mopub().f2578e.billing(AbstractC9058e.purchase);
            C6517e c6517e = (C6517e) (billing3 != null ? billing3 : null);
            if (c6517e == null || (c6517e.ad >= 0 && c6517e.vip >= 0)) {
                if (c6071e.mopub().f2578e.metrica(AbstractC9058e.f18136extends)) {
                    ArrayList arrayList = new ArrayList();
                    List adcel = C6071e.adcel(4, advert);
                    int size = adcel.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        C6071e c6071e2 = (C6071e) adcel.get(i2);
                        if (c6071e2.mopub().f2578e.metrica(AbstractC9058e.f18136extends)) {
                            arrayList.add(c6071e2);
                            if (c6071e2.metrica.isVip() < c6071e.metrica.isVip()) {
                                i++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean ad = ad(arrayList);
                    int i3 = ad ? 0 : i;
                    int i4 = ad ? i : 0;
                    Object billing4 = c6071e.mopub().f2578e.billing(AbstractC9058e.f18136extends);
                    if (billing4 == null) {
                        billing4 = Boolean.FALSE;
                    }
                    c8092e.smaato(C5216e.ad(((Boolean) billing4).booleanValue(), i3, 1, i4, 1));
                }
            }
        }
    }

    public static final void startapp(String str) {
        throw new NoSuchElementException(str);
    }

    public static final void yandex(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public abstract AbstractC12699e metrica();

    public abstract Integer vip();
}
