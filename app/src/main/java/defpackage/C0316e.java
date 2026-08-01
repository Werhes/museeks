package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؑؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316e extends AbstractC14012e implements Collection, InterfaceC12555e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C10914e f2329e = new C10914e(5);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object[] f2330e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object[] f2331e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f2332e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f2333e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public AbstractC8218e f2334e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object[] f2335e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object[] f2336e;

    public C0316e(AbstractC8218e abstractC8218e, Object[] objArr, Object[] objArr2, int i) {
        this.f2334e = abstractC8218e;
        this.f2331e = objArr;
        this.f2330e = objArr2;
        this.f2333e = i;
        this.f2336e = objArr;
        this.f2335e = objArr2;
        this.f2332e = abstractC8218e.subs();
    }

    /* renamed from: interface, reason: not valid java name */
    public static void m296interface(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    /* renamed from: abstract, reason: not valid java name */
    public final Object[] m297abstract(Object[] objArr) {
        if (objArr == null) {
            return m305implements();
        }
        if (m312protected(objArr)) {
            return objArr;
        }
        Object[] m305implements = m305implements();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        AbstractC1660e.loadAd(0, length, 6, objArr, m305implements);
        return m305implements;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        C7582e.appmetrica(i, subs());
        if (i == subs()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int m313return = m313return();
        if (i >= m313return) {
            m322try(i - m313return, obj, this.f2336e);
        } else {
            C8999e c8999e = new C8999e(null);
            m322try(0, c8999e.ad, m323while(this.f2336e, this.f2333e, i, obj, c8999e));
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int m320throws = m320throws();
        if (m320throws < 32) {
            Object[] m297abstract = m297abstract(this.f2335e);
            m297abstract[m320throws] = obj;
            this.f2335e = m297abstract;
            this.f2332e = subs() + 1;
        } else {
            m311private(this.f2336e, this.f2335e, m299case(obj));
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        C0316e c0316e;
        Object[] m305implements;
        C7582e.appmetrica(i, this.f2332e);
        if (i == this.f2332e) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.f2332e - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.f2335e;
            Object[] m297abstract = m297abstract(objArr);
            System.arraycopy(objArr, i3, m297abstract, size2 + 1, m320throws() - i3);
            m296interface(m297abstract, i3, collection.iterator());
            this.f2335e = m297abstract;
            this.f2332e = collection.size() + this.f2332e;
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int m320throws = m320throws();
        int size3 = collection.size() + this.f2332e;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= m313return()) {
            m305implements = m305implements();
            collection2 = collection;
            m317switch(collection2, i, this.f2335e, m320throws, objArr2, size, m305implements);
            c0316e = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            c0316e = this;
            if (size3 > m320throws) {
                int i4 = size3 - m320throws;
                Object[] m302default = m302default(i4, c0316e.f2335e);
                c0316e.m308native(collection2, i, i4, objArr2, size, m302default);
                objArr2 = objArr2;
                m305implements = m302default;
            } else {
                Object[] objArr3 = c0316e.f2335e;
                m305implements = m305implements();
                int i5 = m320throws - size3;
                System.arraycopy(objArr3, i5, m305implements, 0, m320throws - i5);
                int i6 = 32 - i5;
                Object[] m302default2 = m302default(i6, c0316e.f2335e);
                int i7 = size - 1;
                objArr2[i7] = m302default2;
                c0316e.m308native(collection2, i, i6, objArr2, i7, m302default2);
                collection2 = collection2;
            }
        }
        c0316e.f2336e = m315strictfp(c0316e.f2336e, i2, objArr2);
        c0316e.f2335e = m305implements;
        c0316e.f2332e = collection2.size() + c0316e.f2332e;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int m320throws = m320throws();
        Iterator it = collection.iterator();
        if (32 - m320throws >= collection.size()) {
            Object[] m297abstract = m297abstract(this.f2335e);
            m296interface(m297abstract, m320throws, it);
            this.f2335e = m297abstract;
            this.f2332e = collection.size() + this.f2332e;
            return true;
        }
        int size = ((collection.size() + m320throws) - 1) / 32;
        Object[][] objArr = new Object[size];
        Object[] m297abstract2 = m297abstract(this.f2335e);
        m296interface(m297abstract2, m320throws, it);
        objArr[0] = m297abstract2;
        for (int i = 1; i < size; i++) {
            Object[] m305implements = m305implements();
            m296interface(m305implements, 0, it);
            objArr[i] = m305implements;
        }
        this.f2336e = m315strictfp(this.f2336e, m313return(), objArr);
        Object[] m305implements2 = m305implements();
        m296interface(m305implements2, 0, it);
        this.f2335e = m305implements2;
        this.f2332e = collection.size() + this.f2332e;
        return true;
    }

    /* renamed from: break, reason: not valid java name */
    public final AbstractC9649e m298break(int i) {
        Object[] objArr = this.f2336e;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int m313return = m313return() >> 5;
        C7582e.appmetrica(i, m313return);
        int i2 = this.f2333e;
        return i2 == 0 ? new C5921e(i, objArr) : new C7594e(objArr, i, m313return, i2 / 5);
    }

    /* renamed from: case, reason: not valid java name */
    public final Object[] m299case(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f2329e;
        return objArr;
    }

    /* renamed from: catch, reason: not valid java name */
    public final Object[] m300catch(int i, int i2, Object[] objArr) {
        if (!(i2 >= 0)) {
            AbstractC6536e.ad("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int metrica = AbstractC13083e.metrica(i, i2);
        Object m300catch = m300catch(i, i2 - 5, (Object[]) objArr[metrica]);
        if (metrica < 31) {
            int i3 = metrica + 1;
            if (objArr[i3] != null) {
                if (m312protected(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] m305implements = m305implements();
                System.arraycopy(objArr, 0, m305implements, 0, i3);
                objArr = m305implements;
            }
        }
        if (m300catch == objArr[metrica]) {
            return objArr;
        }
        Object[] m297abstract = m297abstract(objArr);
        m297abstract[metrica] = m300catch;
        return m297abstract;
    }

    /* renamed from: class, reason: not valid java name */
    public final AbstractC8218e m301class() {
        AbstractC8218e c0292e;
        Object[] objArr = this.f2336e;
        if (objArr == this.f2331e && this.f2335e == this.f2330e) {
            c0292e = this.f2334e;
        } else {
            this.f2329e = new C10914e(5);
            this.f2331e = objArr;
            Object[] objArr2 = this.f2335e;
            this.f2330e = objArr2;
            c0292e = objArr == null ? objArr2.length == 0 ? C0292e.f2297e : new C0292e(Arrays.copyOf(this.f2335e, subs())) : new C14686e(objArr, objArr2, subs(), this.f2333e);
        }
        this.f2334e = c0292e;
        return c0292e;
    }

    /* renamed from: default, reason: not valid java name */
    public final Object[] m302default(int i, Object[] objArr) {
        if (m312protected(objArr)) {
            System.arraycopy(objArr, 0, objArr, i, 32 - i);
            return objArr;
        }
        Object[] m305implements = m305implements();
        System.arraycopy(objArr, 0, m305implements, i, 32 - i);
        return m305implements;
    }

    /* renamed from: else, reason: not valid java name */
    public final Object[] m303else(Object[] objArr, int i, int i2, Object obj, C8999e c8999e) {
        int metrica = AbstractC13083e.metrica(i2, i);
        Object[] m297abstract = m297abstract(objArr);
        if (i != 0) {
            m297abstract[metrica] = m303else((Object[]) m297abstract[metrica], i - 5, i2, obj, c8999e);
            return m297abstract;
        }
        if (m297abstract != objArr) {
            ((AbstractList) this).modCount++;
        }
        c8999e.ad = m297abstract[metrica];
        m297abstract[metrica] = obj;
        return m297abstract;
    }

    /* renamed from: final, reason: not valid java name */
    public final Object[] m304final(Object[] objArr, int i, int i2, C8999e c8999e) {
        Object[] m304final;
        int metrica = AbstractC13083e.metrica(i2 - 1, i);
        if (i == 5) {
            c8999e.ad = objArr[metrica];
            m304final = null;
        } else {
            m304final = m304final((Object[]) objArr[metrica], i - 5, i2, c8999e);
        }
        if (m304final == null && metrica == 0) {
            return null;
        }
        Object[] m297abstract = m297abstract(objArr);
        m297abstract[metrica] = m304final;
        return m297abstract;
    }

    @Override // defpackage.AbstractC14012e
    public final Object firebase(int i) {
        C7582e.license(i, subs());
        ((AbstractList) this).modCount++;
        int m313return = m313return();
        if (i >= m313return) {
            return m318synchronized(this.f2336e, m313return, this.f2333e, i - m313return);
        }
        C8999e c8999e = new C8999e(this.f2335e[0]);
        m318synchronized(m314static(this.f2336e, this.f2333e, i, c8999e), m313return, this.f2333e, 0);
        return c8999e.ad;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        C7582e.license(i, subs());
        if (m313return() <= i) {
            objArr = this.f2335e;
        } else {
            objArr = this.f2336e;
            for (int i2 = this.f2333e; i2 > 0; i2 -= 5) {
                objArr = (Object[]) objArr[AbstractC13083e.metrica(i, i2)];
            }
        }
        return objArr[i & 31];
    }

    /* renamed from: implements, reason: not valid java name */
    public final Object[] m305implements() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f2329e;
        return objArr;
    }

    /* renamed from: import, reason: not valid java name */
    public final int m306import(Function1 function1, Object[] objArr, int i, C8999e c8999e) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = m297abstract(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        c8999e.ad = objArr2;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r0 != r8) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r0 != r8) goto L9;
     */
    /* renamed from: instanceof, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m307instanceof(kotlin.jvm.functions.Function1 r16) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0316e.m307instanceof(kotlin.jvm.functions.Function1):boolean");
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
        C7582e.appmetrica(i, this.f2332e);
        return new C3290e(this, i);
    }

    /* renamed from: native, reason: not valid java name */
    public final void m308native(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f2336e == null) {
            throw new IllegalStateException("root is null");
        }
        int i4 = i >> 5;
        AbstractC9649e m298break = m298break(m313return() >> 5);
        int i5 = i3;
        Object[] objArr3 = objArr2;
        while (m298break.f19132e - 1 != i4) {
            Object[] objArr4 = (Object[]) m298break.previous();
            AbstractC1660e.mopub(0, 32 - i2, 32, objArr4, objArr3);
            objArr3 = m302default(i2, objArr4);
            i5--;
            objArr[i5] = objArr3;
        }
        Object[] objArr5 = (Object[]) m298break.previous();
        int m313return = i3 - (((m313return() >> 5) - 1) - i4);
        if (m313return < i3) {
            objArr2 = objArr[m313return];
        }
        m317switch(collection, i, objArr5, 32, objArr, m313return, objArr2);
    }

    /* renamed from: new, reason: not valid java name */
    public final Object[] m309new(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            AbstractC6536e.ad("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            AbstractC6536e.ad("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] m297abstract = m297abstract(objArr);
        int metrica = AbstractC13083e.metrica(i, i2);
        int i3 = i2 - 5;
        m297abstract[metrica] = m309new((Object[]) m297abstract[metrica], i, i3, it);
        while (true) {
            metrica++;
            if (metrica >= 32 || !it.hasNext()) {
                break;
            }
            m297abstract[metrica] = m309new((Object[]) m297abstract[metrica], 0, i3, it);
        }
        return m297abstract;
    }

    /* renamed from: package, reason: not valid java name */
    public final Object[] m310package(int i, Object[] objArr, Object[] objArr2) {
        int metrica = AbstractC13083e.metrica(subs() - 1, i);
        Object[] m297abstract = m297abstract(objArr);
        if (i == 5) {
            m297abstract[metrica] = objArr2;
            return m297abstract;
        }
        m297abstract[metrica] = m310package(i - 5, (Object[]) m297abstract[metrica], objArr2);
        return m297abstract;
    }

    /* renamed from: private, reason: not valid java name */
    public final void m311private(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f2332e;
        int i2 = i >> 5;
        int i3 = this.f2333e;
        if (i2 > (1 << i3)) {
            this.f2336e = m310package(this.f2333e + 5, m299case(objArr), objArr2);
            this.f2335e = objArr3;
            this.f2333e += 5;
            this.f2332e++;
            return;
        }
        if (objArr == null) {
            this.f2336e = objArr2;
            this.f2335e = objArr3;
            this.f2332e = i + 1;
        } else {
            this.f2336e = m310package(i3, objArr, objArr2);
            this.f2335e = objArr3;
            this.f2332e++;
        }
    }

    /* renamed from: protected, reason: not valid java name */
    public final boolean m312protected(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f2329e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return m307instanceof(new C9501e(2, collection));
    }

    /* renamed from: return, reason: not valid java name */
    public final int m313return() {
        int i = this.f2332e;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        C7582e.license(i, subs());
        if (m313return() > i) {
            C8999e c8999e = new C8999e(null);
            this.f2336e = m303else(this.f2336e, this.f2333e, i, obj, c8999e);
            return c8999e.ad;
        }
        Object[] m297abstract = m297abstract(this.f2335e);
        if (m297abstract != this.f2335e) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = m297abstract[i2];
        m297abstract[i2] = obj;
        this.f2335e = m297abstract;
        return obj2;
    }

    /* renamed from: static, reason: not valid java name */
    public final Object[] m314static(Object[] objArr, int i, int i2, C8999e c8999e) {
        int metrica = AbstractC13083e.metrica(i2, i);
        if (i == 0) {
            Object obj = objArr[metrica];
            Object[] m297abstract = m297abstract(objArr);
            int i3 = metrica + 1;
            System.arraycopy(objArr, i3, m297abstract, metrica, 32 - i3);
            m297abstract[31] = c8999e.ad;
            c8999e.ad = obj;
            return m297abstract;
        }
        int metrica2 = objArr[31] == null ? AbstractC13083e.metrica(m313return() - 1, i) : 31;
        Object[] m297abstract2 = m297abstract(objArr);
        int i4 = i - 5;
        int i5 = metrica + 1;
        if (i5 <= metrica2) {
            while (true) {
                m297abstract2[metrica2] = m314static((Object[]) m297abstract2[metrica2], i4, 0, c8999e);
                if (metrica2 == i5) {
                    break;
                }
                metrica2--;
            }
        }
        m297abstract2[metrica] = m314static((Object[]) m297abstract2[metrica], i4, i2, c8999e);
        return m297abstract2;
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final Object[] m315strictfp(Object[] objArr, int i, Object[][] objArr2) {
        C1630e c1630e = new C1630e(1, objArr2);
        int i2 = i >> 5;
        int i3 = this.f2333e;
        Object[] m309new = i2 < (1 << i3) ? m309new(objArr, i, i3, c1630e) : m297abstract(objArr);
        while (c1630e.hasNext()) {
            this.f2333e += 5;
            m309new = m299case(m309new);
            int i4 = this.f2333e;
            m309new(m309new, 1 << i4, i4, c1630e);
        }
        return m309new;
    }

    @Override // defpackage.AbstractC14012e
    public final int subs() {
        return this.f2332e;
    }

    /* renamed from: super, reason: not valid java name */
    public final void m316super(int i, int i2, Object[] objArr) {
        if (i2 == 0) {
            this.f2336e = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f2335e = objArr;
            this.f2332e = i;
            this.f2333e = i2;
            return;
        }
        C8999e c8999e = new C8999e(null);
        Object[] m304final = m304final(objArr, i2, i, c8999e);
        this.f2335e = (Object[]) c8999e.ad;
        this.f2332e = i;
        if (m304final[1] == null) {
            this.f2336e = (Object[]) m304final[0];
            this.f2333e = i2 - 5;
        } else {
            this.f2336e = m304final;
            this.f2333e = i2;
        }
    }

    /* renamed from: switch, reason: not valid java name */
    public final void m317switch(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] m305implements;
        if (i3 < 1) {
            AbstractC6536e.ad("requires at least one nullBuffer");
        }
        Object[] m297abstract = m297abstract(objArr);
        objArr2[0] = m297abstract;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            AbstractC1660e.mopub(size + 1, i4, i2, m297abstract, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                m305implements = m297abstract;
            } else {
                m305implements = m305implements();
                i3--;
                objArr2[i3] = m305implements;
            }
            int i7 = i2 - i6;
            AbstractC1660e.mopub(0, i7, i2, m297abstract, objArr3);
            AbstractC1660e.mopub(size + 1, i4, i7, m297abstract, m305implements);
            objArr3 = m305implements;
        }
        Iterator it = collection.iterator();
        m296interface(m297abstract, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] m305implements2 = m305implements();
            m296interface(m305implements2, 0, it);
            objArr2[i8] = m305implements2;
        }
        m296interface(objArr3, 0, it);
    }

    /* renamed from: synchronized, reason: not valid java name */
    public final Object m318synchronized(Object[] objArr, int i, int i2, int i3) {
        int subs = subs() - i;
        if (subs == 1) {
            Object obj = this.f2335e[0];
            m316super(i, i2, objArr);
            return obj;
        }
        Object[] objArr2 = this.f2335e;
        Object obj2 = objArr2[i3];
        Object[] m297abstract = m297abstract(objArr2);
        int i4 = i3 + 1;
        System.arraycopy(objArr2, i4, m297abstract, i3, subs - i4);
        m297abstract[subs - 1] = null;
        this.f2336e = objArr;
        this.f2335e = m297abstract;
        this.f2332e = (i + subs) - 1;
        this.f2333e = i2;
        return obj2;
    }

    /* renamed from: this, reason: not valid java name */
    public final int m319this() {
        return ((AbstractList) this).modCount;
    }

    /* renamed from: throws, reason: not valid java name */
    public final int m320throws() {
        int i = this.f2332e;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    /* renamed from: transient, reason: not valid java name */
    public final int m321transient(Function1 function1, Object[] objArr, int i, int i2, C8999e c8999e, ArrayList arrayList, ArrayList arrayList2) {
        if (m312protected(objArr)) {
            arrayList.add(objArr);
        }
        Object[] objArr2 = (Object[]) c8999e.ad;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m305implements();
                    i2 = 0;
                }
                objArr3[i2] = obj;
                i2++;
            }
        }
        c8999e.ad = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    /* renamed from: try, reason: not valid java name */
    public final void m322try(int i, Object obj, Object[] objArr) {
        int m320throws = m320throws();
        Object[] m297abstract = m297abstract(this.f2335e);
        if (m320throws >= 32) {
            Object[] objArr2 = this.f2335e;
            Object obj2 = objArr2[31];
            AbstractC1660e.mopub(i + 1, i, 31, objArr2, m297abstract);
            m297abstract[i] = obj;
            m311private(objArr, m297abstract, m299case(obj2));
            return;
        }
        AbstractC1660e.mopub(i + 1, i, m320throws, this.f2335e, m297abstract);
        m297abstract[i] = obj;
        this.f2336e = objArr;
        this.f2335e = m297abstract;
        this.f2332e++;
    }

    /* renamed from: while, reason: not valid java name */
    public final Object[] m323while(Object[] objArr, int i, int i2, Object obj, C8999e c8999e) {
        Object obj2;
        int metrica = AbstractC13083e.metrica(i2, i);
        if (i == 0) {
            c8999e.ad = objArr[31];
            Object[] m297abstract = m297abstract(objArr);
            System.arraycopy(objArr, metrica, m297abstract, metrica + 1, 31 - metrica);
            m297abstract[metrica] = obj;
            return m297abstract;
        }
        Object[] m297abstract2 = m297abstract(objArr);
        int i3 = i - 5;
        m297abstract2[metrica] = m323while((Object[]) m297abstract2[metrica], i3, i2, obj, c8999e);
        while (true) {
            metrica++;
            if (metrica >= 32 || (obj2 = m297abstract2[metrica]) == null) {
                break;
            }
            m297abstract2[metrica] = m323while((Object[]) obj2, i3, 0, c8999e.ad, c8999e);
        }
        return m297abstract2;
    }
}
