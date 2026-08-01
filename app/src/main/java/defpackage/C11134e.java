package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٝٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11134e extends AbstractC11556e implements RandomAccess {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C11134e f22052e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final Object[] f22053e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f22054e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object[] f22055e;

    static {
        Object[] objArr = new Object[0];
        f22053e = objArr;
        f22052e = new C11134e(objArr, 0, false);
    }

    public C11134e(Object[] objArr, int i, boolean z) {
        this.f23215e = z;
        this.f22055e = objArr;
        this.f22054e = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        appmetrica();
        if (i < 0 || i > (i2 = this.f22054e)) {
            StringBuilder premium = AbstractC4653e.premium("Index:", i, ", Size:");
            premium.append(this.f22054e);
            throw new IndexOutOfBoundsException(premium.toString());
        }
        Object[] objArr = this.f22055e;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[AbstractC1634e.startapp(objArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f22055e, 0, objArr2, 0, i);
            System.arraycopy(this.f22055e, i, objArr2, i + 1, this.f22054e - i);
            this.f22055e = objArr2;
        }
        this.f22055e[i] = obj;
        this.f22054e++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        appmetrica();
        int i = this.f22054e;
        Object[] objArr = this.f22055e;
        if (i == objArr.length) {
            this.f22055e = Arrays.copyOf(this.f22055e, AbstractC1634e.startapp(objArr.length, 3, 2, 1, 10));
        }
        Object[] objArr2 = this.f22055e;
        int i2 = this.f22054e;
        this.f22054e = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void billing(int i) {
        if (i < 0 || i >= this.f22054e) {
            StringBuilder premium = AbstractC4653e.premium("Index:", i, ", Size:");
            premium.append(this.f22054e);
            throw new IndexOutOfBoundsException(premium.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        billing(i);
        return this.f22055e[i];
    }

    @Override // defpackage.InterfaceC16489e
    public final InterfaceC16489e metrica(int i) {
        if (i >= this.f22054e) {
            return new C11134e(i == 0 ? f22053e : Arrays.copyOf(this.f22055e, i), this.f22054e, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.AbstractC11556e, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        appmetrica();
        billing(i);
        Object[] objArr = this.f22055e;
        Object obj = objArr[i];
        if (i < this.f22054e - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f22054e--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        appmetrica();
        billing(i);
        Object[] objArr = this.f22055e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22054e;
    }
}
