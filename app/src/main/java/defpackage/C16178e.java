package defpackage;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16178e extends AbstractC11529e implements RandomAccess, InterfaceC17524e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C16178e f31781e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final float[] f31782e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f31783e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public float[] f31784e;

    static {
        float[] fArr = new float[0];
        f31782e = fArr;
        f31781e = new C16178e(fArr, 0, false);
    }

    public C16178e(float[] fArr, int i, boolean z) {
        super(z);
        this.f31784e = fArr;
        this.f31783e = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        appmetrica();
        if (i < 0 || i > (i2 = this.f31783e)) {
            throw new IndexOutOfBoundsException(AbstractC8769e.billing(this.f31783e, i, (byte) 13, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        float[] fArr = this.f31784e;
        int length = fArr.length;
        if (i2 < length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[AbstractC1634e.startapp(length, 3, 2, 1, 10)];
            System.arraycopy(this.f31784e, 0, fArr2, 0, i);
            System.arraycopy(this.f31784e, i, fArr2, i3, this.f31783e - i);
            this.f31784e = fArr2;
        }
        this.f31784e[i] = floatValue;
        this.f31783e++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        float floatValue = ((Float) obj).floatValue();
        appmetrica();
        int i = this.f31783e;
        int length = this.f31784e.length;
        if (i == length) {
            float[] fArr = new float[AbstractC1634e.startapp(length, 3, 2, 1, 10)];
            System.arraycopy(this.f31784e, 0, fArr, 0, this.f31783e);
            this.f31784e = fArr;
        }
        float[] fArr2 = this.f31784e;
        int i2 = this.f31783e;
        this.f31783e = i2 + 1;
        fArr2[i2] = floatValue;
        return true;
    }

    @Override // defpackage.AbstractC11529e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        appmetrica();
        Charset charset = AbstractC9561e.ad;
        collection.getClass();
        if (!(collection instanceof C16178e)) {
            return super.addAll(collection);
        }
        C16178e c16178e = (C16178e) collection;
        int i = c16178e.f31783e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f31783e;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f31784e;
        if (i3 > fArr.length) {
            this.f31784e = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(c16178e.f31784e, 0, this.f31784e, this.f31783e, c16178e.f31783e);
        this.f31783e = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void billing(int i) {
        if (i < 0 || i >= this.f31783e) {
            throw new IndexOutOfBoundsException(AbstractC8769e.billing(this.f31783e, i, (byte) 13, "Index:", ", Size:"));
        }
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
        if (!(obj instanceof C16178e)) {
            return super.equals(obj);
        }
        C16178e c16178e = (C16178e) obj;
        if (this.f31783e != c16178e.f31783e) {
            return false;
        }
        float[] fArr = c16178e.f31784e;
        for (int i = 0; i < this.f31783e; i++) {
            if (Float.floatToIntBits(this.f31784e[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        billing(i);
        return Float.valueOf(this.f31784e[i]);
    }

    @Override // defpackage.AbstractC11529e, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f31783e; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f31784e[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f31783e;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f31784e[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.InterfaceC1958e
    public final InterfaceC1958e mopub(int i) {
        if (i >= this.f31783e) {
            return new C16178e(i == 0 ? f31782e : Arrays.copyOf(this.f31784e, i), this.f31783e, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.AbstractC11529e, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        appmetrica();
        billing(i);
        float[] fArr = this.f31784e;
        float f = fArr[i];
        if (i < this.f31783e - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.f31783e--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        appmetrica();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f31784e;
        System.arraycopy(fArr, i2, fArr, i, this.f31783e - i2);
        this.f31783e -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        appmetrica();
        billing(i);
        float[] fArr = this.f31784e;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31783e;
    }
}
