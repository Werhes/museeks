package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٚۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12576e extends AbstractC11110e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f25241e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object[] f25242e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f25243e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object[] f25244e;

    public C12576e(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.f25244e = objArr;
        this.f25242e = objArr2;
        this.f25241e = i;
        this.f25243e = i2;
        if (subs() > 32) {
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + subs()).toString());
    }

    /* renamed from: native, reason: not valid java name */
    public static Object[] m3369native(Object[] objArr, int i, int i2, C5216e c5216e) {
        Object[] m3369native;
        int pro = AbstractC2301e.pro(i2, i);
        if (i == 5) {
            c5216e.ad = objArr[pro];
            m3369native = null;
        } else {
            m3369native = m3369native((Object[]) objArr[pro], i - 5, i2, c5216e);
        }
        if (m3369native == null && pro == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[pro] = m3369native;
        return copyOf;
    }

    @Override // defpackage.AbstractC11110e
    public final AbstractC11110e firebase(Object obj) {
        int i = this.f25241e;
        int i2 = i - ((i - 1) & (-32));
        int i3 = this.f25243e;
        Object[] objArr = this.f25244e;
        Object[] objArr2 = this.f25242e;
        if (i2 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i2] = obj;
            return new C12576e(objArr, copyOf, i + 1, i3);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        if ((i >> 5) <= (1 << i3)) {
            return new C12576e(m3372while(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new C12576e(m3372while(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        int i2 = this.f25241e;
        AbstractC6494e.license(i, i2);
        if (((i2 - 1) & (-32)) <= i) {
            objArr = this.f25242e;
        } else {
            objArr = this.f25244e;
            for (int i3 = this.f25243e; i3 > 0; i3 -= 5) {
                objArr = (Object[]) objArr[AbstractC2301e.pro(i, i3)];
            }
        }
        return objArr[i & 31];
    }

    @Override // defpackage.AbstractC11110e
    /* renamed from: interface */
    public final C4009e mo2798interface() {
        return new C4009e(this, this.f25244e, this.f25242e, this.f25243e);
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final ListIterator listIterator(int i) {
        AbstractC6494e.appmetrica(i, this.f25241e);
        return new C1706e(i, this.f25241e, (this.f25243e / 5) + 1, this.f25244e, this.f25242e);
    }

    /* renamed from: protected, reason: not valid java name */
    public final AbstractC11110e m3370protected(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f25241e - i;
        if (i4 != 1) {
            Object[] objArr2 = this.f25242e;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                AbstractC1660e.mopub(i3, i3 + 1, i4, objArr2, copyOf);
            }
            copyOf[i5] = null;
            return new C12576e(objArr, copyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new C10327e(objArr);
        }
        C5216e c5216e = new C5216e(null);
        Object[] m3369native = m3369native(objArr, i2, i - 1, c5216e);
        Object[] objArr3 = (Object[]) c5216e.ad;
        return m3369native[1] == null ? new C12576e((Object[]) m3369native[0], objArr3, i, i2 - 5) : new C12576e(m3369native, objArr3, i, i2);
    }

    @Override // defpackage.AbstractC7674e
    public final int subs() {
        return this.f25241e;
    }

    @Override // defpackage.AbstractC11110e
    /* renamed from: this */
    public final AbstractC11110e mo2799this(int i) {
        int i2 = this.f25241e;
        AbstractC6494e.license(i, i2);
        int i3 = (i2 - 1) & (-32);
        Object[] objArr = this.f25244e;
        int i4 = this.f25243e;
        return i >= i3 ? m3370protected(objArr, i3, i4, i - i3) : m3370protected(m3371try(objArr, i4, i, new C5216e(this.f25242e[0])), i3, i4, 0);
    }

    /* renamed from: try, reason: not valid java name */
    public final Object[] m3371try(Object[] objArr, int i, int i2, C5216e c5216e) {
        int pro = AbstractC2301e.pro(i2, i);
        if (i == 0) {
            Object[] copyOf = pro == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC1660e.mopub(pro, pro + 1, 32, objArr, copyOf);
            copyOf[31] = c5216e.ad;
            c5216e.ad = objArr[pro];
            return copyOf;
        }
        int pro2 = objArr[31] == null ? AbstractC2301e.pro(((this.f25241e - 1) & (-32)) - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = pro + 1;
        if (i4 <= pro2) {
            while (true) {
                copyOf2[pro2] = m3371try((Object[]) copyOf2[pro2], i3, 0, c5216e);
                if (pro2 == i4) {
                    break;
                }
                pro2--;
            }
        }
        copyOf2[pro] = m3371try((Object[]) copyOf2[pro], i3, i2, c5216e);
        return copyOf2;
    }

    /* renamed from: while, reason: not valid java name */
    public final Object[] m3372while(int i, Object[] objArr, Object[] objArr2) {
        int pro = AbstractC2301e.pro(subs() - 1, i);
        Object[] copyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            copyOf[pro] = objArr2;
            return copyOf;
        }
        copyOf[pro] = m3372while(i - 5, (Object[]) copyOf[pro], objArr2);
        return copyOf;
    }
}
