package defpackage;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۙۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10506e extends AbstractC18495e implements RandomAccess, InterfaceC6692e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C10506e f20729e = new C10506e(new int[0], 0, false);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f20730e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int[] f20731e;

    public C10506e(int[] iArr, int i, boolean z) {
        super(z);
        this.f20731e = iArr;
        this.f20730e = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        appmetrica();
        if (i < 0 || i > (i2 = this.f20730e)) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, this.f20730e, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        int[] iArr = this.f20731e;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[AbstractC10257e.appmetrica(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f20731e, i, iArr2, i3, this.f20730e - i);
            this.f20731e = iArr2;
        }
        this.f20731e[i] = intValue;
        this.f20730e++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        yandex(((Integer) obj).intValue());
        return true;
    }

    @Override // defpackage.AbstractC18495e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        appmetrica();
        Charset charset = AbstractC12312e.ad;
        collection.getClass();
        if (!(collection instanceof C10506e)) {
            return super.addAll(collection);
        }
        C10506e c10506e = (C10506e) collection;
        int i = c10506e.f20730e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f20730e;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f20731e;
        if (i3 > iArr.length) {
            this.f20731e = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c10506e.f20731e, 0, this.f20731e, this.f20730e, c10506e.f20730e);
        this.f20730e = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int billing(int i) {
        startapp(i);
        return this.f20731e[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.AbstractC18495e, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10506e)) {
            return super.equals(obj);
        }
        C10506e c10506e = (C10506e) obj;
        if (this.f20730e != c10506e.f20730e) {
            return false;
        }
        int[] iArr = c10506e.f20731e;
        for (int i = 0; i < this.f20730e; i++) {
            if (this.f20731e[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        startapp(i);
        return Integer.valueOf(this.f20731e[i]);
    }

    @Override // defpackage.AbstractC18495e, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f20730e; i2++) {
            i = (i * 31) + this.f20731e[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f20730e;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f20731e[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC18495e, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        appmetrica();
        startapp(i);
        int[] iArr = this.f20731e;
        int i2 = iArr[i];
        if (i < this.f20730e - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f20730e--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        appmetrica();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f20731e;
        System.arraycopy(iArr, i2, iArr, i, this.f20730e - i2);
        this.f20730e -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        appmetrica();
        startapp(i);
        int[] iArr = this.f20731e;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20730e;
    }

    public final void startapp(int i) {
        if (i < 0 || i >= this.f20730e) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, this.f20730e, "Index:", ", Size:"));
        }
    }

    @Override // defpackage.InterfaceC5024e
    public final /* bridge */ /* synthetic */ InterfaceC5024e vip(int i) {
        if (i >= this.f20730e) {
            return new C10506e(Arrays.copyOf(this.f20731e, i), this.f20730e, true);
        }
        throw new IllegalArgumentException();
    }

    public final void yandex(int i) {
        appmetrica();
        int i2 = this.f20730e;
        int[] iArr = this.f20731e;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[AbstractC10257e.appmetrica(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f20731e = iArr2;
        }
        int[] iArr3 = this.f20731e;
        int i3 = this.f20730e;
        this.f20730e = i3 + 1;
        iArr3[i3] = i;
    }
}
