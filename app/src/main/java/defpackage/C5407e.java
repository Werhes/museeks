package defpackage;

import androidx.car.app.model.Alert;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؔۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5407e extends AbstractC1229e implements RandomAccess, InterfaceC7569e, InterfaceC6085e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C5407e f11592e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final int[] f11593e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f11594e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int[] f11595e;

    static {
        int[] iArr = new int[0];
        f11593e = iArr;
        f11592e = new C5407e(iArr, 0, false);
    }

    public C5407e(int[] iArr, int i, boolean z) {
        super(z);
        this.f11595e = iArr;
        this.f11594e = i;
    }

    public final void adcel(int i) {
        if (i < 0 || i >= this.f11594e) {
            throw new IndexOutOfBoundsException(C6313e.ad(this.f11594e, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        appmetrica();
        if (i < 0 || i > (i2 = this.f11594e)) {
            throw new IndexOutOfBoundsException(C6313e.ad(this.f11594e, i, (byte) 13, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        int[] iArr = this.f11595e;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[AbstractC1634e.startapp(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11595e, 0, iArr2, 0, i);
            System.arraycopy(this.f11595e, i, iArr2, i3, this.f11594e - i);
            this.f11595e = iArr2;
        }
        this.f11595e[i] = intValue;
        this.f11594e++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        startapp(((Integer) obj).intValue());
        return true;
    }

    @Override // defpackage.AbstractC1229e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        appmetrica();
        collection.getClass();
        if (!(collection instanceof C5407e)) {
            return super.addAll(collection);
        }
        C5407e c5407e = (C5407e) collection;
        int i = c5407e.f11594e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11594e;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f11595e;
        if (i3 > iArr.length) {
            this.f11595e = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c5407e.f11595e, 0, this.f11595e, this.f11594e, c5407e.f11594e);
        this.f11594e = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // defpackage.InterfaceC13229e
    /* renamed from: billing, reason: merged with bridge method [inline-methods] */
    public final C5407e applovin(int i) {
        if (i >= this.f11594e) {
            return new C5407e(i == 0 ? f11593e : Arrays.copyOf(this.f11595e, i), this.f11594e, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.AbstractC1229e, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5407e)) {
            return super.equals(obj);
        }
        C5407e c5407e = (C5407e) obj;
        if (this.f11594e != c5407e.f11594e) {
            return false;
        }
        int[] iArr = c5407e.f11595e;
        for (int i = 0; i < this.f11594e; i++) {
            if (this.f11595e[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        adcel(i);
        return Integer.valueOf(this.f11595e[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f11594e; i2++) {
            i = (i * 31) + this.f11595e[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f11594e;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f11595e[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC1229e, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        appmetrica();
        adcel(i);
        int[] iArr = this.f11595e;
        int i2 = iArr[i];
        if (i < this.f11594e - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f11594e--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        appmetrica();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f11595e;
        System.arraycopy(iArr, i2, iArr, i, this.f11594e - i2);
        this.f11594e -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        appmetrica();
        adcel(i);
        int[] iArr = this.f11595e;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11594e;
    }

    public final void startapp(int i) {
        appmetrica();
        int i2 = this.f11594e;
        int length = this.f11595e.length;
        if (i2 == length) {
            int[] iArr = new int[AbstractC1634e.startapp(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11595e, 0, iArr, 0, this.f11594e);
            this.f11595e = iArr;
        }
        int[] iArr2 = this.f11595e;
        int i3 = this.f11594e;
        this.f11594e = i3 + 1;
        iArr2[i3] = i;
    }

    public final int yandex(int i) {
        adcel(i);
        return this.f11595e[i];
    }
}
