package defpackage;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒ٘ٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1118e extends AbstractC11529e implements RandomAccess, InterfaceC1833e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C1118e f3664e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final long[] f3665e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f3666e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long[] f3667e;

    static {
        long[] jArr = new long[0];
        f3665e = jArr;
        f3664e = new C1118e(jArr, 0, false);
    }

    public C1118e(long[] jArr, int i, boolean z) {
        super(z);
        this.f3667e = jArr;
        this.f3666e = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        appmetrica();
        if (i < 0 || i > (i2 = this.f3666e)) {
            throw new IndexOutOfBoundsException(AbstractC8769e.billing(this.f3666e, i, (byte) 13, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        long[] jArr = this.f3667e;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[AbstractC1634e.startapp(length, 3, 2, 1, 10)];
            System.arraycopy(this.f3667e, 0, jArr2, 0, i);
            System.arraycopy(this.f3667e, i, jArr2, i3, this.f3666e - i);
            this.f3667e = jArr2;
        }
        this.f3667e[i] = longValue;
        this.f3666e++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        long longValue = ((Long) obj).longValue();
        appmetrica();
        int i = this.f3666e;
        int length = this.f3667e.length;
        if (i == length) {
            long[] jArr = new long[AbstractC1634e.startapp(length, 3, 2, 1, 10)];
            System.arraycopy(this.f3667e, 0, jArr, 0, this.f3666e);
            this.f3667e = jArr;
        }
        long[] jArr2 = this.f3667e;
        int i2 = this.f3666e;
        this.f3666e = i2 + 1;
        jArr2[i2] = longValue;
        return true;
    }

    @Override // defpackage.AbstractC11529e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        appmetrica();
        Charset charset = AbstractC9561e.ad;
        collection.getClass();
        if (!(collection instanceof C1118e)) {
            return super.addAll(collection);
        }
        C1118e c1118e = (C1118e) collection;
        int i = c1118e.f3666e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f3666e;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f3667e;
        if (i3 > jArr.length) {
            this.f3667e = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c1118e.f3667e, 0, this.f3667e, this.f3666e, c1118e.f3666e);
        this.f3666e = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long billing(int i) {
        yandex(i);
        return this.f3667e[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.AbstractC11529e, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1118e)) {
            return super.equals(obj);
        }
        C1118e c1118e = (C1118e) obj;
        if (this.f3666e != c1118e.f3666e) {
            return false;
        }
        long[] jArr = c1118e.f3667e;
        for (int i = 0; i < this.f3666e; i++) {
            if (this.f3667e[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        yandex(i);
        return Long.valueOf(this.f3667e[i]);
    }

    @Override // defpackage.AbstractC11529e, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f3666e; i2++) {
            long j = this.f3667e[i2];
            Charset charset = AbstractC9561e.ad;
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
        int i = this.f3666e;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f3667e[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.InterfaceC1958e
    public final InterfaceC1958e mopub(int i) {
        if (i >= this.f3666e) {
            return new C1118e(i == 0 ? f3665e : Arrays.copyOf(this.f3667e, i), this.f3666e, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.AbstractC11529e, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        appmetrica();
        yandex(i);
        long[] jArr = this.f3667e;
        long j = jArr[i];
        if (i < this.f3666e - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f3666e--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        appmetrica();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f3667e;
        System.arraycopy(jArr, i2, jArr, i, this.f3666e - i2);
        this.f3666e -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        appmetrica();
        yandex(i);
        long[] jArr = this.f3667e;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3666e;
    }

    public final void yandex(int i) {
        if (i < 0 || i >= this.f3666e) {
            throw new IndexOutOfBoundsException(AbstractC8769e.billing(this.f3666e, i, (byte) 13, "Index:", ", Size:"));
        }
    }
}
