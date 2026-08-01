package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۖۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14172e {
    public static final ArrayList appmetrica;
    public final List ad;
    public final int vip;
    public final ThreadLocal metrica = new ThreadLocal();
    public final LinkedHashMap license = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        appmetrica = arrayList;
        arrayList.add(AbstractC11750e.metrica);
        arrayList.add(C12497e.metrica);
        arrayList.add(C1883e.appmetrica);
        arrayList.add(C1883e.license);
        arrayList.add(AbstractC5383e.ad);
        arrayList.add(C0253e.license);
    }

    public C14172e(C7417e c7417e) {
        ArrayList arrayList = c7417e.vip;
        int size = arrayList.size();
        ArrayList arrayList2 = appmetrica;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.ad = DesugarCollections.unmodifiableList(arrayList3);
        this.vip = c7417e.ad;
    }

    public final AbstractC13345e ad(Type type) {
        return vip(type, AbstractC7644e.ad, null);
    }

    public final C7417e metrica() {
        int i = 0;
        C7417e c7417e = new C7417e(0);
        while (true) {
            List list = this.ad;
            ArrayList arrayList = c7417e.vip;
            int i2 = this.vip;
            if (i >= i2) {
                int size = list.size() - appmetrica.size();
                while (i2 < size) {
                    InterfaceC10361e interfaceC10361e = (InterfaceC10361e) list.get(i2);
                    if (interfaceC10361e == null) {
                        throw new IllegalArgumentException("factory == null");
                    }
                    arrayList.add(interfaceC10361e);
                    i2++;
                }
                return c7417e;
            }
            InterfaceC10361e interfaceC10361e2 = (InterfaceC10361e) list.get(i);
            if (interfaceC10361e2 == null) {
                throw new IllegalArgumentException("factory == null");
            }
            int i3 = c7417e.ad;
            c7417e.ad = i3 + 1;
            arrayList.add(i3, interfaceC10361e2);
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [eْٚٙ] */
    public final AbstractC13345e vip(Type type, Set set, String str) {
        C13565e c13565e;
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type ad = AbstractC7644e.ad(type);
        if (ad instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) ad;
            if (wildcardType.getLowerBounds().length == 0) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                if (upperBounds.length != 1) {
                    throw new IllegalArgumentException();
                }
                ad = upperBounds[0];
            }
        }
        Object asList = set.isEmpty() ? ad : Arrays.asList(ad, set);
        synchronized (this.license) {
            try {
                AbstractC13345e abstractC13345e = (AbstractC13345e) this.license.get(asList);
                if (abstractC13345e != null) {
                    return abstractC13345e;
                }
                C10723e c10723e = (C10723e) this.metrica.get();
                if (c10723e == null) {
                    c10723e = new C10723e(this);
                    this.metrica.set(c10723e);
                }
                ArrayDeque arrayDeque = c10723e.vip;
                ArrayList arrayList = c10723e.ad;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        C13565e c13565e2 = new C13565e(ad, str, asList);
                        arrayList.add(c13565e2);
                        arrayDeque.add(c13565e2);
                        c13565e = null;
                        break;
                    }
                    c13565e = (C13565e) arrayList.get(i);
                    if (c13565e.metrica.equals(asList)) {
                        arrayDeque.add(c13565e);
                        ?? r13 = c13565e.license;
                        if (r13 != 0) {
                            c13565e = r13;
                        }
                    } else {
                        i++;
                    }
                }
                try {
                    if (c13565e != null) {
                        return c13565e;
                    }
                    try {
                        int size2 = this.ad.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            AbstractC13345e ad2 = ((InterfaceC10361e) this.ad.get(i2)).ad(ad, set, this);
                            if (ad2 != null) {
                                ((C13565e) c10723e.vip.getLast()).license = ad2;
                                c10723e.vip(true);
                                return ad2;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + AbstractC7644e.yandex(ad, set));
                    } catch (IllegalArgumentException e) {
                        throw c10723e.ad(e);
                    }
                } finally {
                    c10723e.vip(false);
                }
            } finally {
            }
        }
    }
}
