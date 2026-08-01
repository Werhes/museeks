package defpackage;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؔٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5405e extends AbstractC18495e implements RandomAccess, InterfaceC5787e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C5405e f11589e = new C5405e(new float[0], 0, false);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f11590e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public float[] f11591e;

    public C5405e(float[] fArr, int i, boolean z) {
        super(z);
        this.f11591e = fArr;
        this.f11590e = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        appmetrica();
        if (i < 0 || i > (i2 = this.f11590e)) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, this.f11590e, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        float[] fArr = this.f11591e;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[AbstractC10257e.appmetrica(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f11591e, i, fArr2, i3, this.f11590e - i);
            this.f11591e = fArr2;
        }
        this.f11591e[i] = floatValue;
        this.f11590e++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        billing(((Float) obj).floatValue());
        return true;
    }

    @Override // defpackage.AbstractC18495e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        appmetrica();
        Charset charset = AbstractC12312e.ad;
        collection.getClass();
        if (!(collection instanceof C5405e)) {
            return super.addAll(collection);
        }
        C5405e c5405e = (C5405e) collection;
        int i = c5405e.f11590e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11590e;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f11591e;
        if (i3 > fArr.length) {
            this.f11591e = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(c5405e.f11591e, 0, this.f11591e, this.f11590e, c5405e.f11590e);
        this.f11590e = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void billing(float f) {
        appmetrica();
        int i = this.f11590e;
        float[] fArr = this.f11591e;
        if (i == fArr.length) {
            float[] fArr2 = new float[AbstractC10257e.appmetrica(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f11591e = fArr2;
        }
        float[] fArr3 = this.f11591e;
        int i2 = this.f11590e;
        this.f11590e = i2 + 1;
        fArr3[i2] = f;
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
        if (!(obj instanceof C5405e)) {
            return super.equals(obj);
        }
        C5405e c5405e = (C5405e) obj;
        if (this.f11590e != c5405e.f11590e) {
            return false;
        }
        float[] fArr = c5405e.f11591e;
        for (int i = 0; i < this.f11590e; i++) {
            if (Float.floatToIntBits(this.f11591e[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        yandex(i);
        return Float.valueOf(this.f11591e[i]);
    }

    @Override // defpackage.AbstractC18495e, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f11590e; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f11591e[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f11590e;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f11591e[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC18495e, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        appmetrica();
        yandex(i);
        float[] fArr = this.f11591e;
        float f = fArr[i];
        if (i < this.f11590e - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.f11590e--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        appmetrica();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f11591e;
        System.arraycopy(fArr, i2, fArr, i, this.f11590e - i2);
        this.f11590e -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        appmetrica();
        yandex(i);
        float[] fArr = this.f11591e;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11590e;
    }

    @Override // defpackage.InterfaceC5024e
    public final InterfaceC5024e vip(int i) {
        if (i >= this.f11590e) {
            return new C5405e(Arrays.copyOf(this.f11591e, i), this.f11590e, true);
        }
        throw new IllegalArgumentException();
    }

    public final void yandex(int i) {
        if (i < 0 || i >= this.f11590e) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, this.f11590e, "Index:", ", Size:"));
        }
    }
}
