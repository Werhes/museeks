package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۣؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0885e extends AbstractC18495e implements RandomAccess {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C0885e f3279e = new C0885e(new Object[0], 0, false);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f3280e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object[] f3281e;

    public C0885e(Object[] objArr, int i, boolean z) {
        super(z);
        this.f3281e = objArr;
        this.f3280e = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        appmetrica();
        if (i < 0 || i > (i2 = this.f3280e)) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, this.f3280e, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        Object[] objArr = this.f3281e;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[AbstractC10257e.appmetrica(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f3281e, i, objArr2, i3, this.f3280e - i);
            this.f3281e = objArr2;
        }
        this.f3281e[i] = obj;
        this.f3280e++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        appmetrica();
        int i = this.f3280e;
        Object[] objArr = this.f3281e;
        if (i == objArr.length) {
            this.f3281e = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f3281e;
        int i2 = this.f3280e;
        this.f3280e = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void billing(int i) {
        if (i < 0 || i >= this.f3280e) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, this.f3280e, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        billing(i);
        return this.f3281e[i];
    }

    @Override // defpackage.AbstractC18495e, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        appmetrica();
        billing(i);
        Object[] objArr = this.f3281e;
        Object obj = objArr[i];
        if (i < this.f3280e - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f3280e--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        appmetrica();
        billing(i);
        Object[] objArr = this.f3281e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3280e;
    }

    @Override // defpackage.InterfaceC5024e
    public final /* bridge */ /* synthetic */ InterfaceC5024e vip(int i) {
        if (i >= this.f3280e) {
            return new C0885e(Arrays.copyOf(this.f3281e, i), this.f3280e, true);
        }
        throw new IllegalArgumentException();
    }
}
