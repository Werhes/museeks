package defpackage;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖ٘ۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4178e extends AbstractC5360e implements InterfaceC5189e, RandomAccess, InterfaceC6294e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C4178e f9213e = new C4178e(new int[0], 0, false);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f9214e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int[] f9215e;

    public C4178e(int[] iArr, int i, boolean z) {
        super(z);
        this.f9215e = iArr;
        this.f9214e = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        appmetrica();
        if (i < 0 || i > (i2 = this.f9214e)) {
            StringBuilder premium = AbstractC4653e.premium("Index:", i, ", Size:");
            premium.append(this.f9214e);
            throw new IndexOutOfBoundsException(premium.toString());
        }
        int[] iArr = this.f9215e;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[AbstractC10257e.appmetrica(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f9215e, i, iArr2, i + 1, this.f9214e - i);
            this.f9215e = iArr2;
        }
        this.f9215e[i] = intValue;
        this.f9214e++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        billing(((Integer) obj).intValue());
        return true;
    }

    @Override // defpackage.AbstractC5360e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        appmetrica();
        Charset charset = AbstractC0352e.ad;
        collection.getClass();
        if (!(collection instanceof C4178e)) {
            return super.addAll(collection);
        }
        C4178e c4178e = (C4178e) collection;
        int i = c4178e.f9214e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9214e;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f9215e;
        if (i3 > iArr.length) {
            this.f9215e = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c4178e.f9215e, 0, this.f9215e, this.f9214e, c4178e.f9214e);
        this.f9214e = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void billing(int i) {
        appmetrica();
        int i2 = this.f9214e;
        int[] iArr = this.f9215e;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[AbstractC10257e.appmetrica(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f9215e = iArr2;
        }
        int[] iArr3 = this.f9215e;
        int i3 = this.f9214e;
        this.f9214e = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.AbstractC5360e, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4178e)) {
            return super.equals(obj);
        }
        C4178e c4178e = (C4178e) obj;
        if (this.f9214e != c4178e.f9214e) {
            return false;
        }
        int[] iArr = c4178e.f9215e;
        for (int i = 0; i < this.f9214e; i++) {
            if (this.f9215e[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(startapp(i));
    }

    @Override // defpackage.AbstractC5360e, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9214e; i2++) {
            i = (i * 31) + this.f9215e[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f9214e;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f9215e[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.InterfaceC4115e
    public final InterfaceC4115e metrica(int i) {
        if (i >= this.f9214e) {
            return new C4178e(Arrays.copyOf(this.f9215e, i), this.f9214e, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.AbstractC5360e, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        appmetrica();
        yandex(i);
        int[] iArr = this.f9215e;
        int i2 = iArr[i];
        if (i < this.f9214e - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f9214e--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        appmetrica();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f9215e;
        System.arraycopy(iArr, i2, iArr, i, this.f9214e - i2);
        this.f9214e -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        appmetrica();
        yandex(i);
        int[] iArr = this.f9215e;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9214e;
    }

    public final int startapp(int i) {
        yandex(i);
        return this.f9215e[i];
    }

    public final void yandex(int i) {
        if (i < 0 || i >= this.f9214e) {
            StringBuilder premium = AbstractC4653e.premium("Index:", i, ", Size:");
            premium.append(this.f9214e);
            throw new IndexOutOfBoundsException(premium.toString());
        }
    }
}
