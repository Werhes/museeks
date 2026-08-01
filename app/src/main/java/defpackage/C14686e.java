package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚْٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14686e extends AbstractC8218e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f28934e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object[] f28935e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f28936e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object[] f28937e;

    public C14686e(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.f28937e = objArr;
        this.f28935e = objArr2;
        this.f28934e = i;
        this.f28936e = i2;
        if (!(subs() > 32)) {
            AbstractC6536e.ad("Trie-based persistent vector should have at least 33 elements, got " + subs());
        }
        int length = objArr2.length;
    }

    /* renamed from: abstract, reason: not valid java name */
    public static Object[] m3832abstract(Object[] objArr, int i, int i2, C8999e c8999e) {
        Object[] m3832abstract;
        int metrica = AbstractC13083e.metrica(i2, i);
        if (i == 5) {
            c8999e.ad = objArr[metrica];
            m3832abstract = null;
        } else {
            m3832abstract = m3832abstract((Object[]) objArr[metrica], i - 5, i2, c8999e);
        }
        if (m3832abstract == null && metrica == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[metrica] = m3832abstract;
        return copyOf;
    }

    /* renamed from: protected, reason: not valid java name */
    public static Object[] m3833protected(Object[] objArr, int i, int i2, Object obj, C8999e c8999e) {
        int metrica = AbstractC13083e.metrica(i2, i);
        if (i == 0) {
            Object[] copyOf = metrica == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC1660e.mopub(metrica + 1, metrica, 31, objArr, copyOf);
            c8999e.ad = objArr[31];
            copyOf[metrica] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        copyOf2[metrica] = m3833protected((Object[]) objArr[metrica], i3, i2, obj, c8999e);
        while (true) {
            metrica++;
            if (metrica >= 32 || copyOf2[metrica] == null) {
                break;
            }
            copyOf2[metrica] = m3833protected((Object[]) objArr[metrica], i3, 0, c8999e.ad, c8999e);
        }
        return copyOf2;
    }

    /* renamed from: super, reason: not valid java name */
    public static Object[] m3834super(Object[] objArr, int i, int i2, Object obj) {
        int metrica = AbstractC13083e.metrica(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[metrica] = obj;
            return copyOf;
        }
        copyOf[metrica] = m3834super((Object[]) copyOf[metrica], i - 5, i2, obj);
        return copyOf;
    }

    /* renamed from: break, reason: not valid java name */
    public final C14686e m3835break(int i, Object obj, Object[] objArr) {
        int m3839final = m3839final();
        int i2 = this.f28934e;
        int i3 = i2 - m3839final;
        Object[] objArr2 = this.f28935e;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            AbstractC1660e.mopub(i + 1, i, i3, objArr2, copyOf);
            copyOf[i] = obj;
            return new C14686e(objArr, copyOf, i2 + 1, this.f28936e);
        }
        Object obj2 = objArr2[31];
        AbstractC1660e.mopub(i + 1, i, i3 - 1, objArr2, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m3838default(objArr, copyOf, objArr3);
    }

    /* renamed from: case, reason: not valid java name */
    public final Object[] m3836case(Object[] objArr, int i, int i2, C8999e c8999e) {
        int metrica = AbstractC13083e.metrica(i2, i);
        if (i == 0) {
            Object[] copyOf = metrica == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC1660e.mopub(metrica, metrica + 1, 32, objArr, copyOf);
            copyOf[31] = c8999e.ad;
            c8999e.ad = objArr[metrica];
            return copyOf;
        }
        int metrica2 = objArr[31] == null ? AbstractC13083e.metrica(m3839final() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = metrica + 1;
        if (i4 <= metrica2) {
            while (true) {
                copyOf2[metrica2] = m3836case((Object[]) copyOf2[metrica2], i3, 0, c8999e);
                if (metrica2 == i4) {
                    break;
                }
                metrica2--;
            }
        }
        copyOf2[metrica] = m3836case((Object[]) copyOf2[metrica], i3, i2, c8999e);
        return copyOf2;
    }

    /* renamed from: catch, reason: not valid java name */
    public final AbstractC8218e m3837catch(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f28934e - i;
        if (i4 != 1) {
            Object[] objArr2 = this.f28935e;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                AbstractC1660e.mopub(i3, i3 + 1, i4, objArr2, copyOf);
            }
            copyOf[i5] = null;
            return new C14686e(objArr, copyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new C0292e(objArr);
        }
        C8999e c8999e = new C8999e(null);
        Object[] m3832abstract = m3832abstract(objArr, i2, i - 1, c8999e);
        Object[] objArr3 = (Object[]) c8999e.ad;
        return m3832abstract[1] == null ? new C14686e((Object[]) m3832abstract[0], objArr3, i, i2 - 5) : new C14686e(m3832abstract, objArr3, i, i2);
    }

    @Override // defpackage.AbstractC8218e
    /* renamed from: class */
    public final AbstractC8218e mo286class(Object obj) {
        int m3839final = m3839final();
        int i = this.f28934e;
        int i2 = i - m3839final;
        Object[] objArr = this.f28937e;
        Object[] objArr2 = this.f28935e;
        if (i2 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i2] = obj;
            return new C14686e(objArr, copyOf, i + 1, this.f28936e);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return m3838default(objArr, objArr2, objArr3);
    }

    /* renamed from: default, reason: not valid java name */
    public final C14686e m3838default(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f28934e;
        int i2 = i >> 5;
        int i3 = this.f28936e;
        if (i2 <= (1 << i3)) {
            return new C14686e(m3840implements(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new C14686e(m3840implements(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    /* renamed from: final, reason: not valid java name */
    public final int m3839final() {
        return (this.f28934e - 1) & (-32);
    }

    @Override // defpackage.AbstractC8218e
    public final AbstractC8218e firebase(int i, Object obj) {
        int i2 = this.f28934e;
        C7582e.appmetrica(i, i2);
        if (i == i2) {
            return mo286class(obj);
        }
        int m3839final = m3839final();
        Object[] objArr = this.f28937e;
        if (i >= m3839final) {
            return m3835break(i - m3839final, obj, objArr);
        }
        C8999e c8999e = new C8999e(null);
        return m3835break(0, c8999e.ad, m3833protected(objArr, this.f28936e, i, obj, c8999e));
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        C7582e.license(i, subs());
        if (m3839final() <= i) {
            objArr = this.f28935e;
        } else {
            objArr = this.f28937e;
            for (int i2 = this.f28936e; i2 > 0; i2 -= 5) {
                objArr = (Object[]) objArr[AbstractC13083e.metrica(i, i2)];
            }
        }
        return objArr[i & 31];
    }

    /* renamed from: implements, reason: not valid java name */
    public final Object[] m3840implements(int i, Object[] objArr, Object[] objArr2) {
        int metrica = AbstractC13083e.metrica(subs() - 1, i);
        Object[] copyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            copyOf[metrica] = objArr2;
            return copyOf;
        }
        copyOf[metrica] = m3840implements(i - 5, (Object[]) copyOf[metrica], objArr2);
        return copyOf;
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final ListIterator listIterator(int i) {
        C7582e.appmetrica(i, this.f28934e);
        return new C14490e(i, this.f28934e, (this.f28936e / 5) + 1, this.f28937e, this.f28935e);
    }

    @Override // defpackage.AbstractC8218e
    /* renamed from: native */
    public final AbstractC8218e mo288native(C9501e c9501e) {
        C0316e c0316e = new C0316e(this, this.f28937e, this.f28935e, this.f28936e);
        c0316e.m307instanceof(c9501e);
        return c0316e.m301class();
    }

    @Override // defpackage.AbstractC7674e
    public final int subs() {
        return this.f28934e;
    }

    @Override // defpackage.AbstractC8218e
    /* renamed from: this */
    public final C0316e mo289this() {
        return new C0316e(this, this.f28937e, this.f28935e, this.f28936e);
    }

    @Override // defpackage.AbstractC8218e
    /* renamed from: try */
    public final AbstractC8218e mo290try(int i, Object obj) {
        int i2 = this.f28934e;
        C7582e.license(i, i2);
        int m3839final = m3839final();
        Object[] objArr = this.f28937e;
        Object[] objArr2 = this.f28935e;
        int i3 = this.f28936e;
        if (m3839final > i) {
            return new C14686e(m3834super(objArr, i3, i, obj), objArr2, i2, i3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        copyOf[i & 31] = obj;
        return new C14686e(objArr, copyOf, i2, i3);
    }

    @Override // defpackage.AbstractC8218e
    /* renamed from: while */
    public final AbstractC8218e mo291while(int i) {
        C7582e.license(i, this.f28934e);
        int m3839final = m3839final();
        Object[] objArr = this.f28937e;
        int i2 = this.f28936e;
        return i >= m3839final ? m3837catch(objArr, m3839final, i2, i - m3839final) : m3837catch(m3836case(objArr, i2, i, new C8999e(this.f28935e[0])), m3839final, i2, 0);
    }
}
