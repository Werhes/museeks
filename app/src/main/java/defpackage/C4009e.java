package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4009e extends AbstractC14012e implements InterfaceC16210e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object[] f8922e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C14595e f8923e = new C14595e(5);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public AbstractC11110e f8924e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object[] f8925e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f8926e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f8927e;

    public C4009e(AbstractC11110e abstractC11110e, Object[] objArr, Object[] objArr2, int i) {
        this.f8926e = i;
        this.f8924e = abstractC11110e;
        this.f8925e = objArr;
        this.f8922e = objArr2;
        this.f8927e = abstractC11110e.subs();
    }

    /* renamed from: interface, reason: not valid java name */
    public static void m1416interface(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    /* renamed from: abstract, reason: not valid java name */
    public final Object[] m1417abstract(Object[] objArr) {
        if (objArr == null) {
            return m1427implements();
        }
        if (m1434protected(objArr)) {
            return objArr;
        }
        Object[] m1427implements = m1427implements();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        AbstractC1660e.loadAd(0, length, 6, objArr, m1427implements);
        return m1427implements;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        AbstractC6494e.appmetrica(i, subs());
        if (i == subs()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int m1435return = m1435return();
        if (i >= m1435return) {
            m1444try(i - m1435return, obj, this.f8925e);
        } else {
            C5216e c5216e = new C5216e(null);
            m1444try(0, c5216e.ad, m1430native(this.f8925e, this.f8926e, i, obj, c5216e));
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int m1422const = m1422const();
        if (m1422const < 32) {
            Object[] m1417abstract = m1417abstract(this.f8922e);
            m1417abstract[m1422const] = obj;
            m1442throws(m1417abstract);
            this.f8927e = subs() + 1;
        } else {
            m1433private(this.f8925e, this.f8922e, m1419case(obj));
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        C4009e c4009e;
        Object[] m1427implements;
        AbstractC6494e.appmetrica(i, this.f8927e);
        if (i == this.f8927e) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.f8927e - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.f8922e;
            Object[] m1417abstract = m1417abstract(objArr);
            System.arraycopy(objArr, i3, m1417abstract, size2 + 1, m1422const() - i3);
            m1416interface(m1417abstract, i3, collection.iterator());
            m1442throws(m1417abstract);
            this.f8927e = collection.size() + this.f8927e;
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int m1422const = m1422const();
        int size3 = collection.size() + this.f8927e;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= m1435return()) {
            m1427implements = m1427implements();
            collection2 = collection;
            m1426finally(collection2, i, this.f8922e, m1422const, objArr2, size, m1427implements);
            c4009e = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            c4009e = this;
            if (size3 > m1422const) {
                int i4 = size3 - m1422const;
                Object[] m1423default = m1423default(i4, c4009e.f8922e);
                c4009e.m1445while(collection2, i, i4, objArr2, size, m1423default);
                objArr2 = objArr2;
                m1427implements = m1423default;
            } else {
                Object[] objArr3 = c4009e.f8922e;
                m1427implements = m1427implements();
                int i5 = m1422const - size3;
                System.arraycopy(objArr3, i5, m1427implements, 0, m1422const - i5);
                int i6 = 32 - i5;
                Object[] m1423default2 = m1423default(i6, c4009e.f8922e);
                int i7 = size - 1;
                objArr2[i7] = m1423default2;
                c4009e.m1445while(collection2, i, i6, objArr2, i7, m1423default2);
                collection2 = collection2;
            }
        }
        m1439switch(m1437strictfp(c4009e.f8925e, i2, objArr2));
        m1442throws(m1427implements);
        c4009e.f8927e = collection2.size() + c4009e.f8927e;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int m1422const = m1422const();
        Iterator it = collection.iterator();
        if (32 - m1422const >= collection.size()) {
            Object[] m1417abstract = m1417abstract(this.f8922e);
            m1416interface(m1417abstract, m1422const, it);
            m1442throws(m1417abstract);
            this.f8927e = collection.size() + this.f8927e;
            return true;
        }
        int size = ((collection.size() + m1422const) - 1) / 32;
        Object[][] objArr = new Object[size];
        Object[] m1417abstract2 = m1417abstract(this.f8922e);
        m1416interface(m1417abstract2, m1422const, it);
        objArr[0] = m1417abstract2;
        for (int i = 1; i < size; i++) {
            Object[] m1427implements = m1427implements();
            m1416interface(m1427implements, 0, it);
            objArr[i] = m1427implements;
        }
        m1439switch(m1437strictfp(this.f8925e, m1435return(), objArr));
        Object[] m1427implements2 = m1427implements();
        m1416interface(m1427implements2, 0, it);
        m1442throws(m1427implements2);
        this.f8927e = collection.size() + this.f8927e;
        return true;
    }

    /* renamed from: break, reason: not valid java name */
    public final AbstractC9649e m1418break(int i) {
        if (this.f8925e == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int m1435return = m1435return() >> 5;
        AbstractC6494e.appmetrica(i, m1435return);
        int i2 = this.f8926e;
        if (i2 == 0) {
            return new C5583e(i, this.f8925e);
        }
        return new C17313e(this.f8925e, i, m1435return, i2 / 5);
    }

    /* renamed from: case, reason: not valid java name */
    public final Object[] m1419case(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f8923e;
        return objArr;
    }

    /* renamed from: catch, reason: not valid java name */
    public final Object[] m1420catch(int i, int i2, Object[] objArr) {
        if (i2 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 == 0) {
            return objArr;
        }
        int pro = AbstractC2301e.pro(i, i2);
        Object m1420catch = m1420catch(i, i2 - 5, (Object[]) objArr[pro]);
        if (pro < 31) {
            int i3 = pro + 1;
            if (objArr[i3] != null) {
                if (m1434protected(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] m1427implements = m1427implements();
                System.arraycopy(objArr, 0, m1427implements, 0, i3);
                objArr = m1427implements;
            }
        }
        if (m1420catch == objArr[pro]) {
            return objArr;
        }
        Object[] m1417abstract = m1417abstract(objArr);
        m1417abstract[pro] = m1420catch;
        return m1417abstract;
    }

    /* renamed from: class, reason: not valid java name */
    public final AbstractC11110e m1421class() {
        AbstractC11110e abstractC11110e = this.f8924e;
        if (abstractC11110e == null) {
            Object[] objArr = this.f8925e;
            Object[] objArr2 = this.f8922e;
            this.f8923e = new C14595e(5);
            abstractC11110e = objArr == null ? objArr2.length == 0 ? C10327e.f20377e : new C10327e(Arrays.copyOf(objArr2, this.f8927e)) : new C12576e(objArr, objArr2, this.f8927e, this.f8926e);
            this.f8924e = abstractC11110e;
        }
        return abstractC11110e;
    }

    /* renamed from: const, reason: not valid java name */
    public final int m1422const() {
        int i = this.f8927e;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    /* renamed from: default, reason: not valid java name */
    public final Object[] m1423default(int i, Object[] objArr) {
        if (m1434protected(objArr)) {
            System.arraycopy(objArr, 0, objArr, i, 32 - i);
            return objArr;
        }
        Object[] m1427implements = m1427implements();
        System.arraycopy(objArr, 0, m1427implements, i, 32 - i);
        return m1427implements;
    }

    /* renamed from: else, reason: not valid java name */
    public final Object[] m1424else(Object[] objArr, int i, int i2, Object obj, C5216e c5216e) {
        int pro = AbstractC2301e.pro(i2, i);
        Object[] m1417abstract = m1417abstract(objArr);
        if (i != 0) {
            m1417abstract[pro] = m1424else((Object[]) m1417abstract[pro], i - 5, i2, obj, c5216e);
            return m1417abstract;
        }
        if (m1417abstract != objArr) {
            ((AbstractList) this).modCount++;
        }
        c5216e.ad = m1417abstract[pro];
        m1417abstract[pro] = obj;
        return m1417abstract;
    }

    /* renamed from: final, reason: not valid java name */
    public final Object[] m1425final(Object[] objArr, int i, int i2, C5216e c5216e) {
        Object[] m1425final;
        int pro = AbstractC2301e.pro(i2 - 1, i);
        if (i == 5) {
            c5216e.ad = objArr[pro];
            m1425final = null;
        } else {
            m1425final = m1425final((Object[]) objArr[pro], i - 5, i2, c5216e);
        }
        if (m1425final == null && pro == 0) {
            return null;
        }
        Object[] m1417abstract = m1417abstract(objArr);
        m1417abstract[pro] = m1425final;
        return m1417abstract;
    }

    /* renamed from: finally, reason: not valid java name */
    public final void m1426finally(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] m1427implements;
        if (i3 < 1) {
            throw new IllegalStateException("Check failed.");
        }
        Object[] m1417abstract = m1417abstract(objArr);
        objArr2[0] = m1417abstract;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            AbstractC1660e.mopub(size + 1, i4, i2, m1417abstract, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                m1427implements = m1417abstract;
            } else {
                m1427implements = m1427implements();
                i3--;
                objArr2[i3] = m1427implements;
            }
            int i7 = i2 - i6;
            AbstractC1660e.mopub(0, i7, i2, m1417abstract, objArr3);
            AbstractC1660e.mopub(size + 1, i4, i7, m1417abstract, m1427implements);
            objArr3 = m1427implements;
        }
        Iterator it = collection.iterator();
        m1416interface(m1417abstract, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] m1427implements2 = m1427implements();
            m1416interface(m1427implements2, 0, it);
            objArr2[i8] = m1427implements2;
        }
        m1416interface(objArr3, 0, it);
    }

    @Override // defpackage.AbstractC14012e
    public final Object firebase(int i) {
        AbstractC6494e.license(i, subs());
        ((AbstractList) this).modCount++;
        int m1435return = m1435return();
        if (i >= m1435return) {
            return m1440synchronized(this.f8925e, m1435return, this.f8926e, i - m1435return);
        }
        C5216e c5216e = new C5216e(this.f8922e[0]);
        m1440synchronized(m1436static(this.f8925e, this.f8926e, i, c5216e), m1435return, this.f8926e, 0);
        return c5216e.ad;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        AbstractC6494e.license(i, subs());
        if (m1435return() <= i) {
            objArr = this.f8922e;
        } else {
            objArr = this.f8925e;
            for (int i2 = this.f8926e; i2 > 0; i2 -= 5) {
                objArr = (Object[]) objArr[AbstractC2301e.pro(i, i2)];
            }
        }
        return objArr[i & 31];
    }

    /* renamed from: implements, reason: not valid java name */
    public final Object[] m1427implements() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f8923e;
        return objArr;
    }

    /* renamed from: import, reason: not valid java name */
    public final int m1428import(C9501e c9501e, Object[] objArr, int i, C5216e c5216e) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) c9501e.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = m1417abstract(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        c5216e.ad = objArr2;
        return i2;
    }

    /* renamed from: instanceof, reason: not valid java name */
    public final int m1429instanceof(C9501e c9501e, int i, C5216e c5216e) {
        int m1428import = m1428import(c9501e, this.f8922e, i, c5216e);
        if (m1428import == i) {
            return i;
        }
        Object[] objArr = (Object[]) c5216e.ad;
        Arrays.fill(objArr, m1428import, i, (Object) null);
        m1442throws(objArr);
        this.f8927e -= i - m1428import;
        return m1428import;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        AbstractC6494e.appmetrica(i, this.f8927e);
        return new C1917e(this, i);
    }

    /* renamed from: native, reason: not valid java name */
    public final Object[] m1430native(Object[] objArr, int i, int i2, Object obj, C5216e c5216e) {
        Object obj2;
        int pro = AbstractC2301e.pro(i2, i);
        if (i == 0) {
            c5216e.ad = objArr[31];
            Object[] m1417abstract = m1417abstract(objArr);
            System.arraycopy(objArr, pro, m1417abstract, pro + 1, 31 - pro);
            m1417abstract[pro] = obj;
            return m1417abstract;
        }
        Object[] m1417abstract2 = m1417abstract(objArr);
        int i3 = i - 5;
        m1417abstract2[pro] = m1430native((Object[]) m1417abstract2[pro], i3, i2, obj, c5216e);
        while (true) {
            pro++;
            if (pro >= 32 || (obj2 = m1417abstract2[pro]) == null) {
                break;
            }
            m1417abstract2[pro] = m1430native((Object[]) obj2, i3, 0, c5216e.ad, c5216e);
        }
        return m1417abstract2;
    }

    /* renamed from: new, reason: not valid java name */
    public final Object[] m1431new(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] m1417abstract = m1417abstract(objArr);
        int pro = AbstractC2301e.pro(i, i2);
        int i3 = i2 - 5;
        m1417abstract[pro] = m1431new((Object[]) m1417abstract[pro], i, i3, it);
        while (true) {
            pro++;
            if (pro >= 32 || !it.hasNext()) {
                break;
            }
            m1417abstract[pro] = m1431new((Object[]) m1417abstract[pro], 0, i3, it);
        }
        return m1417abstract;
    }

    /* renamed from: package, reason: not valid java name */
    public final Object[] m1432package(int i, Object[] objArr, Object[] objArr2) {
        int pro = AbstractC2301e.pro(subs() - 1, i);
        Object[] m1417abstract = m1417abstract(objArr);
        if (i == 5) {
            m1417abstract[pro] = objArr2;
            return m1417abstract;
        }
        m1417abstract[pro] = m1432package(i - 5, (Object[]) m1417abstract[pro], objArr2);
        return m1417abstract;
    }

    /* renamed from: private, reason: not valid java name */
    public final void m1433private(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f8927e >> 5;
        int i2 = this.f8926e;
        if (i > (1 << i2)) {
            m1439switch(m1432package(this.f8926e + 5, m1419case(objArr), objArr2));
            m1442throws(objArr3);
            this.f8926e += 5;
            this.f8927e++;
            return;
        }
        if (objArr == null) {
            m1439switch(objArr2);
            m1442throws(objArr3);
            this.f8927e++;
        } else {
            m1439switch(m1432package(i2, objArr, objArr2));
            m1442throws(objArr3);
            this.f8927e++;
        }
    }

    /* renamed from: protected, reason: not valid java name */
    public final boolean m1434protected(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f8923e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (r0 != r15) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (m1429instanceof(r3, r15, r7) != r15) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r2 = r14;
     */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection r15) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4009e.removeAll(java.util.Collection):boolean");
    }

    /* renamed from: return, reason: not valid java name */
    public final int m1435return() {
        int i = this.f8927e;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        AbstractC6494e.license(i, subs());
        if (m1435return() > i) {
            C5216e c5216e = new C5216e(null);
            m1439switch(m1424else(this.f8925e, this.f8926e, i, obj, c5216e));
            return c5216e.ad;
        }
        Object[] m1417abstract = m1417abstract(this.f8922e);
        if (m1417abstract != this.f8922e) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = m1417abstract[i2];
        m1417abstract[i2] = obj;
        m1442throws(m1417abstract);
        return obj2;
    }

    /* renamed from: static, reason: not valid java name */
    public final Object[] m1436static(Object[] objArr, int i, int i2, C5216e c5216e) {
        int pro = AbstractC2301e.pro(i2, i);
        if (i == 0) {
            Object obj = objArr[pro];
            Object[] m1417abstract = m1417abstract(objArr);
            int i3 = pro + 1;
            System.arraycopy(objArr, i3, m1417abstract, pro, 32 - i3);
            m1417abstract[31] = c5216e.ad;
            c5216e.ad = obj;
            return m1417abstract;
        }
        int pro2 = objArr[31] == null ? AbstractC2301e.pro(m1435return() - 1, i) : 31;
        Object[] m1417abstract2 = m1417abstract(objArr);
        int i4 = i - 5;
        int i5 = pro + 1;
        if (i5 <= pro2) {
            while (true) {
                m1417abstract2[pro2] = m1436static((Object[]) m1417abstract2[pro2], i4, 0, c5216e);
                if (pro2 == i5) {
                    break;
                }
                pro2--;
            }
        }
        m1417abstract2[pro] = m1436static((Object[]) m1417abstract2[pro], i4, i2, c5216e);
        return m1417abstract2;
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final Object[] m1437strictfp(Object[] objArr, int i, Object[][] objArr2) {
        C1630e c1630e = new C1630e(1, objArr2);
        int i2 = i >> 5;
        int i3 = this.f8926e;
        Object[] m1431new = i2 < (1 << i3) ? m1431new(objArr, i, i3, c1630e) : m1417abstract(objArr);
        while (c1630e.hasNext()) {
            this.f8926e += 5;
            m1431new = m1419case(m1431new);
            int i4 = this.f8926e;
            m1431new(m1431new, 1 << i4, i4, c1630e);
        }
        return m1431new;
    }

    @Override // defpackage.AbstractC14012e
    public final int subs() {
        return this.f8927e;
    }

    /* renamed from: super, reason: not valid java name */
    public final void m1438super(int i, int i2, Object[] objArr) {
        if (i2 == 0) {
            m1439switch(null);
            if (objArr == null) {
                objArr = new Object[0];
            }
            m1442throws(objArr);
            this.f8927e = i;
            this.f8926e = i2;
            return;
        }
        C5216e c5216e = new C5216e(null);
        Object[] m1425final = m1425final(objArr, i2, i, c5216e);
        m1442throws((Object[]) c5216e.ad);
        this.f8927e = i;
        if (m1425final[1] == null) {
            m1439switch((Object[]) m1425final[0]);
            this.f8926e = i2 - 5;
        } else {
            m1439switch(m1425final);
            this.f8926e = i2;
        }
    }

    /* renamed from: switch, reason: not valid java name */
    public final void m1439switch(Object[] objArr) {
        if (objArr != this.f8925e) {
            this.f8924e = null;
            this.f8925e = objArr;
        }
    }

    /* renamed from: synchronized, reason: not valid java name */
    public final Object m1440synchronized(Object[] objArr, int i, int i2, int i3) {
        int subs = subs() - i;
        if (subs == 1) {
            Object obj = this.f8922e[0];
            m1438super(i, i2, objArr);
            return obj;
        }
        Object[] objArr2 = this.f8922e;
        Object obj2 = objArr2[i3];
        Object[] m1417abstract = m1417abstract(objArr2);
        int i4 = i3 + 1;
        System.arraycopy(objArr2, i4, m1417abstract, i3, subs - i4);
        m1417abstract[subs - 1] = null;
        m1439switch(objArr);
        m1442throws(m1417abstract);
        this.f8927e = (i + subs) - 1;
        this.f8926e = i2;
        return obj2;
    }

    /* renamed from: this, reason: not valid java name */
    public final int m1441this() {
        return ((AbstractList) this).modCount;
    }

    /* renamed from: throws, reason: not valid java name */
    public final void m1442throws(Object[] objArr) {
        if (objArr != this.f8922e) {
            this.f8924e = null;
            this.f8922e = objArr;
        }
    }

    /* renamed from: transient, reason: not valid java name */
    public final int m1443transient(C9501e c9501e, Object[] objArr, int i, int i2, C5216e c5216e, ArrayList arrayList, ArrayList arrayList2) {
        if (m1434protected(objArr)) {
            arrayList.add(objArr);
        }
        Object[] objArr2 = (Object[]) c5216e.ad;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!((Boolean) c9501e.invoke(obj)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m1427implements();
                    i2 = 0;
                }
                objArr3[i2] = obj;
                i2++;
            }
        }
        c5216e.ad = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    /* renamed from: try, reason: not valid java name */
    public final void m1444try(int i, Object obj, Object[] objArr) {
        int m1422const = m1422const();
        Object[] m1417abstract = m1417abstract(this.f8922e);
        if (m1422const >= 32) {
            Object[] objArr2 = this.f8922e;
            Object obj2 = objArr2[31];
            AbstractC1660e.mopub(i + 1, i, 31, objArr2, m1417abstract);
            m1417abstract[i] = obj;
            m1433private(objArr, m1417abstract, m1419case(obj2));
            return;
        }
        AbstractC1660e.mopub(i + 1, i, m1422const, this.f8922e, m1417abstract);
        m1417abstract[i] = obj;
        m1439switch(objArr);
        m1442throws(m1417abstract);
        this.f8927e++;
    }

    /* renamed from: while, reason: not valid java name */
    public final void m1445while(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f8925e == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i4 = i >> 5;
        AbstractC9649e m1418break = m1418break(m1435return() >> 5);
        int i5 = i3;
        Object[] objArr3 = objArr2;
        while (m1418break.f19132e - 1 != i4) {
            Object[] objArr4 = (Object[]) m1418break.previous();
            AbstractC1660e.mopub(0, 32 - i2, 32, objArr4, objArr3);
            objArr3 = m1423default(i2, objArr4);
            i5--;
            objArr[i5] = objArr3;
        }
        Object[] objArr5 = (Object[]) m1418break.previous();
        int m1435return = i3 - (((m1435return() >> 5) - 1) - i4);
        if (m1435return < i3) {
            objArr2 = objArr[m1435return];
        }
        m1426finally(collection, i, objArr5, 32, objArr, m1435return, objArr2);
    }
}
