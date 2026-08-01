package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ۟ٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9782e extends AbstractC1229e implements RandomAccess {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C9782e f19327e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final Object[] f19328e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f19329e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object[] f19330e;

    static {
        Object[] objArr = new Object[0];
        f19328e = objArr;
        f19327e = new C9782e(objArr, 0, false);
    }

    public C9782e(Object[] objArr, int i, boolean z) {
        super(z);
        this.f19330e = objArr;
        this.f19329e = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        appmetrica();
        if (i < 0 || i > (i2 = this.f19329e)) {
            throw new IndexOutOfBoundsException(C6313e.ad(this.f19329e, i, (byte) 13, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        Object[] objArr = this.f19330e;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[AbstractC1634e.startapp(length, 3, 2, 1, 10)];
            System.arraycopy(this.f19330e, 0, objArr2, 0, i);
            System.arraycopy(this.f19330e, i, objArr2, i3, this.f19329e - i);
            this.f19330e = objArr2;
        }
        this.f19330e[i] = obj;
        this.f19329e++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        appmetrica();
        int i = this.f19329e;
        int length = this.f19330e.length;
        if (i == length) {
            this.f19330e = Arrays.copyOf(this.f19330e, AbstractC1634e.startapp(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f19330e;
        int i2 = this.f19329e;
        this.f19329e = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // defpackage.InterfaceC13229e
    public final /* bridge */ /* synthetic */ InterfaceC13229e applovin(int i) {
        if (i >= this.f19329e) {
            return new C9782e(i == 0 ? f19328e : Arrays.copyOf(this.f19330e, i), this.f19329e, true);
        }
        throw new IllegalArgumentException();
    }

    public final void billing(int i) {
        if (i < 0 || i >= this.f19329e) {
            throw new IndexOutOfBoundsException(C6313e.ad(this.f19329e, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // defpackage.AbstractC1229e, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i = this.f19329e;
        if (i != list.size()) {
            return false;
        }
        if (!(obj instanceof C9782e)) {
            for (int i2 = 0; i2 < i; i2++) {
                if (!this.f19330e[i2].equals(list.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        C9782e c9782e = (C9782e) obj;
        for (int i3 = 0; i3 < i; i3++) {
            if (!this.f19330e[i3].equals(c9782e.f19330e[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        billing(i);
        return this.f19330e[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.f19329e;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + this.f19330e[i3].hashCode();
        }
        return i2;
    }

    @Override // defpackage.AbstractC1229e, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        appmetrica();
        billing(i);
        Object[] objArr = this.f19330e;
        Object obj = objArr[i];
        if (i < this.f19329e - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f19329e--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        appmetrica();
        billing(i);
        Object[] objArr = this.f19330e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19329e;
    }
}
