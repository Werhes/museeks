package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؔۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2423e extends AbstractC11000e implements RandomAccess {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C2423e f6221e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final Object[] f6222e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f6223e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object[] f6224e;

    static {
        Object[] objArr = new Object[0];
        f6222e = objArr;
        f6221e = new C2423e(objArr, 0, false);
    }

    public C2423e(Object[] objArr, int i, boolean z) {
        this.f21788e = z;
        this.f6224e = objArr;
        this.f6223e = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        appmetrica();
        if (i < 0 || i > (i2 = this.f6223e)) {
            StringBuilder premium = AbstractC4653e.premium("Index:", i, ", Size:");
            premium.append(this.f6223e);
            throw new IndexOutOfBoundsException(premium.toString());
        }
        Object[] objArr = this.f6224e;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[AbstractC1634e.startapp(objArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f6224e, 0, objArr2, 0, i);
            System.arraycopy(this.f6224e, i, objArr2, i + 1, this.f6223e - i);
            this.f6224e = objArr2;
        }
        this.f6224e[i] = obj;
        this.f6223e++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        appmetrica();
        int i = this.f6223e;
        Object[] objArr = this.f6224e;
        if (i == objArr.length) {
            this.f6224e = Arrays.copyOf(this.f6224e, AbstractC1634e.startapp(objArr.length, 3, 2, 1, 10));
        }
        Object[] objArr2 = this.f6224e;
        int i2 = this.f6223e;
        this.f6223e = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void billing(int i) {
        if (i < 0 || i >= this.f6223e) {
            StringBuilder premium = AbstractC4653e.premium("Index:", i, ", Size:");
            premium.append(this.f6223e);
            throw new IndexOutOfBoundsException(premium.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        billing(i);
        return this.f6224e[i];
    }

    @Override // defpackage.AbstractC11000e, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        appmetrica();
        billing(i);
        Object[] objArr = this.f6224e;
        Object obj = objArr[i];
        if (i < this.f6223e - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f6223e--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        appmetrica();
        billing(i);
        Object[] objArr = this.f6224e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6223e;
    }

    public final C2423e yandex(int i) {
        if (i >= this.f6223e) {
            return new C2423e(i == 0 ? f6222e : Arrays.copyOf(this.f6224e, i), this.f6223e, true);
        }
        throw new IllegalArgumentException();
    }
}
