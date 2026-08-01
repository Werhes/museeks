package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۣٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11361e extends AbstractC5360e implements RandomAccess {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C11361e f22872e = new C11361e(new Object[0], 0, false);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f22873e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object[] f22874e;

    public C11361e(Object[] objArr, int i, boolean z) {
        super(z);
        this.f22874e = objArr;
        this.f22873e = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        appmetrica();
        if (i < 0 || i > (i2 = this.f22873e)) {
            StringBuilder premium = AbstractC4653e.premium("Index:", i, ", Size:");
            premium.append(this.f22873e);
            throw new IndexOutOfBoundsException(premium.toString());
        }
        Object[] objArr = this.f22874e;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[AbstractC10257e.appmetrica(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f22874e, i, objArr2, i + 1, this.f22873e - i);
            this.f22874e = objArr2;
        }
        this.f22874e[i] = obj;
        this.f22873e++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        appmetrica();
        int i = this.f22873e;
        Object[] objArr = this.f22874e;
        if (i == objArr.length) {
            this.f22874e = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f22874e;
        int i2 = this.f22873e;
        this.f22873e = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void billing(int i) {
        if (i < 0 || i >= this.f22873e) {
            StringBuilder premium = AbstractC4653e.premium("Index:", i, ", Size:");
            premium.append(this.f22873e);
            throw new IndexOutOfBoundsException(premium.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        billing(i);
        return this.f22874e[i];
    }

    @Override // defpackage.InterfaceC4115e
    public final InterfaceC4115e metrica(int i) {
        if (i >= this.f22873e) {
            return new C11361e(Arrays.copyOf(this.f22874e, i), this.f22873e, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.AbstractC5360e, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        appmetrica();
        billing(i);
        Object[] objArr = this.f22874e;
        Object obj = objArr[i];
        if (i < this.f22873e - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f22873e--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        appmetrica();
        billing(i);
        Object[] objArr = this.f22874e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22873e;
    }
}
