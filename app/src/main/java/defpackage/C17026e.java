package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17026e extends AbstractC11529e implements RandomAccess {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C17026e f33352e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final Object[] f33353e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f33354e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object[] f33355e;

    static {
        Object[] objArr = new Object[0];
        f33353e = objArr;
        f33352e = new C17026e(objArr, 0, false);
    }

    public C17026e(Object[] objArr, int i, boolean z) {
        super(z);
        this.f33355e = objArr;
        this.f33354e = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        appmetrica();
        if (i < 0 || i > (i2 = this.f33354e)) {
            throw new IndexOutOfBoundsException(AbstractC8769e.billing(this.f33354e, i, (byte) 13, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        Object[] objArr = this.f33355e;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[AbstractC1634e.startapp(length, 3, 2, 1, 10)];
            System.arraycopy(this.f33355e, 0, objArr2, 0, i);
            System.arraycopy(this.f33355e, i, objArr2, i3, this.f33354e - i);
            this.f33355e = objArr2;
        }
        this.f33355e[i] = obj;
        this.f33354e++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        appmetrica();
        int i = this.f33354e;
        int length = this.f33355e.length;
        if (i == length) {
            this.f33355e = Arrays.copyOf(this.f33355e, AbstractC1634e.startapp(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f33355e;
        int i2 = this.f33354e;
        this.f33354e = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void billing(int i) {
        if (i < 0 || i >= this.f33354e) {
            throw new IndexOutOfBoundsException(AbstractC8769e.billing(this.f33354e, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        billing(i);
        return this.f33355e[i];
    }

    @Override // defpackage.InterfaceC1958e
    public final /* bridge */ /* synthetic */ InterfaceC1958e mopub(int i) {
        if (i >= this.f33354e) {
            return new C17026e(i == 0 ? f33353e : Arrays.copyOf(this.f33355e, i), this.f33354e, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.AbstractC11529e, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        appmetrica();
        billing(i);
        Object[] objArr = this.f33355e;
        Object obj = objArr[i];
        if (i < this.f33354e - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f33354e--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        appmetrica();
        billing(i);
        Object[] objArr = this.f33355e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33354e;
    }
}
