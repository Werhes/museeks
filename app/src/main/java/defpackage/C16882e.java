package defpackage;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16882e extends AbstractC11529e implements RandomAccess, InterfaceC5846e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C16882e f33084e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final int[] f33085e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f33086e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int[] f33087e;

    static {
        int[] iArr = new int[0];
        f33085e = iArr;
        f33084e = new C16882e(iArr, 0, false);
    }

    public C16882e(int[] iArr, int i, boolean z) {
        super(z);
        this.f33087e = iArr;
        this.f33086e = i;
    }

    public final void adcel(int i) {
        if (i < 0 || i >= this.f33086e) {
            throw new IndexOutOfBoundsException(AbstractC8769e.billing(this.f33086e, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        appmetrica();
        if (i < 0 || i > (i2 = this.f33086e)) {
            throw new IndexOutOfBoundsException(AbstractC8769e.billing(this.f33086e, i, (byte) 13, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        int[] iArr = this.f33087e;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[AbstractC1634e.startapp(length, 3, 2, 1, 10)];
            System.arraycopy(this.f33087e, 0, iArr2, 0, i);
            System.arraycopy(this.f33087e, i, iArr2, i3, this.f33086e - i);
            this.f33087e = iArr2;
        }
        this.f33087e[i] = intValue;
        this.f33086e++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        startapp(((Integer) obj).intValue());
        return true;
    }

    @Override // defpackage.AbstractC11529e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        appmetrica();
        Charset charset = AbstractC9561e.ad;
        collection.getClass();
        if (!(collection instanceof C16882e)) {
            return super.addAll(collection);
        }
        C16882e c16882e = (C16882e) collection;
        int i = c16882e.f33086e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f33086e;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f33087e;
        if (i3 > iArr.length) {
            this.f33087e = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c16882e.f33087e, 0, this.f33087e, this.f33086e, c16882e.f33086e);
        this.f33086e = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // defpackage.InterfaceC1958e
    /* renamed from: billing, reason: merged with bridge method [inline-methods] */
    public final C16882e mopub(int i) {
        if (i >= this.f33086e) {
            return new C16882e(i == 0 ? f33085e : Arrays.copyOf(this.f33087e, i), this.f33086e, true);
        }
        throw new IllegalArgumentException();
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
        if (!(obj instanceof C16882e)) {
            return super.equals(obj);
        }
        C16882e c16882e = (C16882e) obj;
        if (this.f33086e != c16882e.f33086e) {
            return false;
        }
        int[] iArr = c16882e.f33087e;
        for (int i = 0; i < this.f33086e; i++) {
            if (this.f33087e[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        adcel(i);
        return Integer.valueOf(this.f33087e[i]);
    }

    @Override // defpackage.AbstractC11529e, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f33086e; i2++) {
            i = (i * 31) + this.f33087e[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f33086e;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f33087e[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC11529e, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        appmetrica();
        adcel(i);
        int[] iArr = this.f33087e;
        int i2 = iArr[i];
        if (i < this.f33086e - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f33086e--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        appmetrica();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f33087e;
        System.arraycopy(iArr, i2, iArr, i, this.f33086e - i2);
        this.f33086e -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        appmetrica();
        adcel(i);
        int[] iArr = this.f33087e;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33086e;
    }

    public final void startapp(int i) {
        appmetrica();
        int i2 = this.f33086e;
        int length = this.f33087e.length;
        if (i2 == length) {
            int[] iArr = new int[AbstractC1634e.startapp(length, 3, 2, 1, 10)];
            System.arraycopy(this.f33087e, 0, iArr, 0, this.f33086e);
            this.f33087e = iArr;
        }
        int[] iArr2 = this.f33087e;
        int i3 = this.f33086e;
        this.f33086e = i3 + 1;
        iArr2[i3] = i;
    }

    public final int yandex(int i) {
        adcel(i);
        return this.f33087e[i];
    }
}
