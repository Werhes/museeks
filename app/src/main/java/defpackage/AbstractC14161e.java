package defpackage;

import android.text.Layout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٓۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14161e {
    public static final InterfaceC9998e[] ad = new InterfaceC9998e[0];

    public static final Set ad(InterfaceC9998e interfaceC9998e) {
        if (interfaceC9998e instanceof InterfaceC15234e) {
            return ((InterfaceC15234e) interfaceC9998e).vip();
        }
        HashSet hashSet = new HashSet(interfaceC9998e.purchase());
        int purchase = interfaceC9998e.purchase();
        for (int i = 0; i < purchase; i++) {
            hashSet.add(interfaceC9998e.billing(i));
        }
        return hashSet;
    }

    public static int adcel(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static void advert(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static final InterfaceC7227e appmetrica(InterfaceC13984e interfaceC13984e) {
        InterfaceC0861e isVip = interfaceC13984e.isVip();
        if (isVip instanceof InterfaceC7227e) {
            return (InterfaceC7227e) isVip;
        }
        if (!(isVip instanceof InterfaceC12635e)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + isVip);
        }
        throw new IllegalArgumentException("Captured type parameter " + isVip + " from generic non-reified function. Such functionality cannot be supported because " + isVip + " is erased, either specify serializer explicitly or make calling function inline with reified " + isVip + '.');
    }

    public static final Object billing(Object obj) {
        return obj instanceof C1427e ? new C12763e(((C1427e) obj).ad) : obj;
    }

    public static final int license(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final Collection metrica(Collection collection, Collection collection2) {
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static Object mopub(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static final C15587e purchase(ArrayList arrayList) {
        C15587e c15587e = new C15587e();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC8528e interfaceC8528e = (InterfaceC8528e) next;
            if (interfaceC8528e != null && interfaceC8528e != C9494e.vip) {
                c15587e.add(next);
            }
        }
        return c15587e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        advert(r1, r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int startapp(java.lang.Object r8, java.lang.Object r9, int r10, java.lang.Object r11, int[] r12, java.lang.Object[] r13, java.lang.Object[] r14) {
        /*
            int r0 = defpackage.AbstractC0890e.billing(r8)
            r1 = r0 & r10
            int r2 = adcel(r1, r11)
            r3 = -1
            if (r2 == 0) goto L3e
            int r4 = ~r10
            r0 = r0 & r4
            r5 = r3
        L10:
            int r2 = r2 + r3
            r6 = r12[r2]
            r7 = r6 & r10
            r6 = r6 & r4
            if (r6 != r0) goto L39
            r6 = r13[r2]
            boolean r6 = defpackage.AbstractC6437e.license(r8, r6)
            if (r6 == 0) goto L39
            if (r14 == 0) goto L2a
            r6 = r14[r2]
            boolean r6 = defpackage.AbstractC6437e.license(r9, r6)
            if (r6 == 0) goto L39
        L2a:
            if (r5 != r3) goto L30
            advert(r1, r7, r11)
            return r2
        L30:
            r8 = r12[r5]
            r8 = r8 & r4
            r9 = r7 & r10
            r8 = r8 | r9
            r12[r5] = r8
            return r2
        L39:
            if (r7 == 0) goto L3e
            r5 = r2
            r2 = r7
            goto L10
        L3e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC14161e.startapp(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static final InterfaceC9998e[] vip(List list) {
        InterfaceC9998e[] interfaceC9998eArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (interfaceC9998eArr = (InterfaceC9998e[]) list.toArray(new InterfaceC9998e[0])) == null) ? ad : interfaceC9998eArr;
    }

    public static final void yandex(InterfaceC7227e interfaceC7227e) {
        String mopub = interfaceC7227e.mopub();
        if (mopub == null) {
            mopub = "<local class name not available>";
        }
        throw new IllegalArgumentException(AbstractC5087e.m1746extends("Serializer for class '", mopub, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }
}
