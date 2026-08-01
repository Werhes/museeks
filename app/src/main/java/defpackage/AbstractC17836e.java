package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٙۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17836e {
    protected transient int zza;

    public static void license(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof InterfaceC5452e) {
            List ad = ((InterfaceC5452e) iterable).ad();
            if (list != null) {
                throw new ClassCastException();
            }
            list.size();
            Iterator it = ad.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof AbstractC7244e) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                AbstractC7244e.loadAd(0, bArr.length, bArr);
                throw null;
            }
            return;
        }
        if (iterable instanceof InterfaceC6085e) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof C9782e) {
                C9782e c9782e = (C9782e) list;
                int i = c9782e.f19329e + size;
                int length = c9782e.f19330e.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = AbstractC1634e.startapp(length, 3, 2, 1, 10);
                        }
                        c9782e.f19330e = Arrays.copyOf(c9782e.f19330e, length);
                    } else {
                        c9782e.f19330e = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    AbstractC6041e.ad(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj2 = list2.get(i2);
            if (obj2 == null) {
                AbstractC6041e.ad(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final byte[] ad() {
        try {
            AbstractC15319e abstractC15319e = (AbstractC15319e) this;
            int amazon = abstractC15319e.amazon();
            byte[] bArr = new byte[amazon];
            boolean z = AbstractC13874e.metrica;
            C2749e c2749e = new C2749e(amazon, bArr);
            abstractC15319e.purchase(c2749e);
            if (c2749e.m1203try() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (c2749e.m1203try() >= 0) {
                return bArr;
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(AbstractC8647e.ads(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    public abstract int metrica(InterfaceC16984e interfaceC16984e);

    public final void vip(OutputStream outputStream) {
        AbstractC15319e abstractC15319e = (AbstractC15319e) this;
        int amazon = abstractC15319e.amazon();
        boolean z = AbstractC13874e.metrica;
        if (amazon > 4096) {
            amazon = 4096;
        }
        C17837e c17837e = new C17837e(outputStream, amazon);
        abstractC15319e.purchase(c17837e);
        if (c17837e.purchase > 0) {
            c17837e.m4439default();
        }
    }
}
