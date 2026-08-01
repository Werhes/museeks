package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1474e extends AbstractC17557e implements RandomAccess {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f4318e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f4319e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f4320e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object[] f4321e;

    public C1474e(int i, Object[] objArr) {
        this.f4321e = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i <= objArr.length) {
            this.f4319e = objArr.length;
            this.f4320e = i;
        } else {
            StringBuilder premium = AbstractC4653e.premium("ring buffer filled size: ", i, " cannot be larger than the buffer size: ");
            premium.append(objArr.length);
            throw new IllegalArgumentException(premium.toString().toString());
        }
    }

    public final void firebase(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "n shouldn't be negative but it is ").toString());
        }
        if (i > this.f4320e) {
            StringBuilder premium = AbstractC4653e.premium("n shouldn't be greater than the buffer size: n = ", i, ", size = ");
            premium.append(this.f4320e);
            throw new IllegalArgumentException(premium.toString().toString());
        }
        if (i > 0) {
            int i2 = this.f4318e;
            int i3 = this.f4319e;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.f4321e;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.f4318e = i4;
            this.f4320e -= i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int subs = subs();
        if (i < 0 || i >= subs) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, subs, "index: ", ", size: "));
        }
        return this.f4321e[(this.f4318e + i) % this.f4319e];
    }

    @Override // defpackage.AbstractC17557e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C0155e(this);
    }

    @Override // defpackage.AbstractC7674e
    public final int subs() {
        return this.f4320e;
    }

    @Override // defpackage.AbstractC7674e, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[subs()]);
    }

    @Override // defpackage.AbstractC7674e, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        int length = objArr.length;
        int i = this.f4320e;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.f4320e;
        int i3 = this.f4318e;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.f4321e;
            if (i5 >= i2 || i3 >= this.f4319e) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
