package defpackage;

import androidx.car.app.model.Alert;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘّؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0878e extends AbstractC1229e implements RandomAccess, InterfaceC3927e, InterfaceC6085e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C0878e f3272e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final long[] f3273e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f3274e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long[] f3275e;

    static {
        long[] jArr = new long[0];
        f3273e = jArr;
        f3272e = new C0878e(jArr, 0, false);
    }

    public C0878e(long[] jArr, int i, boolean z) {
        super(z);
        this.f3275e = jArr;
        this.f3274e = i;
    }

    public final void adcel(int i) {
        if (i < 0 || i >= this.f3274e) {
            throw new IndexOutOfBoundsException(C6313e.ad(this.f3274e, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        appmetrica();
        if (i < 0 || i > (i2 = this.f3274e)) {
            throw new IndexOutOfBoundsException(C6313e.ad(this.f3274e, i, (byte) 13, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        long[] jArr = this.f3275e;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[AbstractC1634e.startapp(length, 3, 2, 1, 10)];
            System.arraycopy(this.f3275e, 0, jArr2, 0, i);
            System.arraycopy(this.f3275e, i, jArr2, i3, this.f3274e - i);
            this.f3275e = jArr2;
        }
        this.f3275e[i] = longValue;
        this.f3274e++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        startapp(((Long) obj).longValue());
        return true;
    }

    @Override // defpackage.AbstractC1229e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        appmetrica();
        collection.getClass();
        if (!(collection instanceof C0878e)) {
            return super.addAll(collection);
        }
        C0878e c0878e = (C0878e) collection;
        int i = c0878e.f3274e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f3274e;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f3275e;
        if (i3 > jArr.length) {
            this.f3275e = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c0878e.f3275e, 0, this.f3275e, this.f3274e, c0878e.f3274e);
        this.f3274e = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long billing(int i) {
        adcel(i);
        return this.f3275e[i];
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
        if (!(obj instanceof C0878e)) {
            return super.equals(obj);
        }
        C0878e c0878e = (C0878e) obj;
        if (this.f3274e != c0878e.f3274e) {
            return false;
        }
        long[] jArr = c0878e.f3275e;
        for (int i = 0; i < this.f3274e; i++) {
            if (this.f3275e[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        adcel(i);
        return Long.valueOf(this.f3275e[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f3274e; i2++) {
            long j = this.f3275e[i2];
            byte[] bArr = AbstractC17904e.ad;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f3274e;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f3275e[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC1229e, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        appmetrica();
        adcel(i);
        long[] jArr = this.f3275e;
        long j = jArr[i];
        if (i < this.f3274e - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f3274e--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        appmetrica();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f3275e;
        System.arraycopy(jArr, i2, jArr, i, this.f3274e - i2);
        this.f3274e -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        appmetrica();
        adcel(i);
        long[] jArr = this.f3275e;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3274e;
    }

    public final void startapp(long j) {
        appmetrica();
        int i = this.f3274e;
        int length = this.f3275e.length;
        if (i == length) {
            long[] jArr = new long[AbstractC1634e.startapp(length, 3, 2, 1, 10)];
            System.arraycopy(this.f3275e, 0, jArr, 0, this.f3274e);
            this.f3275e = jArr;
        }
        long[] jArr2 = this.f3275e;
        int i2 = this.f3274e;
        this.f3274e = i2 + 1;
        jArr2[i2] = j;
    }

    @Override // defpackage.InterfaceC13229e
    /* renamed from: yandex, reason: merged with bridge method [inline-methods] */
    public final C0878e applovin(int i) {
        if (i >= this.f3274e) {
            return new C0878e(i == 0 ? f3273e : Arrays.copyOf(this.f3275e, i), this.f3274e, true);
        }
        throw new IllegalArgumentException();
    }
}
