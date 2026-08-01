package defpackage;

import androidx.car.app.model.Alert;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٚٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1152e extends AbstractC6732e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final int[] f3729e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f3730e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AbstractC6732e f3731e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f3732e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AbstractC6732e f3733e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f3734e = 0;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f3735e;

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY));
        f3729e = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f3729e;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public C1152e(AbstractC6732e abstractC6732e, AbstractC6732e abstractC6732e2) {
        this.f3731e = abstractC6732e;
        this.f3733e = abstractC6732e2;
        int size = abstractC6732e.size();
        this.f3730e = size;
        this.f3732e = abstractC6732e2.size() + size;
        this.f3735e = Math.max(abstractC6732e.adcel(), abstractC6732e2.adcel()) + 1;
    }

    @Override // defpackage.AbstractC6732e
    public final int Signature(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC6732e abstractC6732e = this.f3731e;
        int i5 = this.f3730e;
        if (i4 <= i5) {
            return abstractC6732e.Signature(i, i2, i3);
        }
        AbstractC6732e abstractC6732e2 = this.f3733e;
        if (i2 >= i5) {
            return abstractC6732e2.Signature(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC6732e2.Signature(abstractC6732e.Signature(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.AbstractC6732e
    public final int adcel() {
        return this.f3735e;
    }

    @Override // defpackage.AbstractC6732e
    public final int admob(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC6732e abstractC6732e = this.f3731e;
        int i5 = this.f3730e;
        if (i4 <= i5) {
            return abstractC6732e.admob(i, i2, i3);
        }
        AbstractC6732e abstractC6732e2 = this.f3733e;
        if (i2 >= i5) {
            return abstractC6732e2.admob(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC6732e2.admob(abstractC6732e.admob(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.AbstractC6732e
    public final boolean advert() {
        return this.f3732e >= f3729e[this.f3735e];
    }

    public final boolean equals(Object obj) {
        int subscription;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6732e) {
            AbstractC6732e abstractC6732e = (AbstractC6732e) obj;
            int size = abstractC6732e.size();
            int i = this.f3732e;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                if (this.f3734e == 0 || (subscription = abstractC6732e.subscription()) == 0 || this.f3734e == subscription) {
                    C5414e c5414e = new C5414e(this);
                    C1884e ad = c5414e.ad();
                    C5414e c5414e2 = new C5414e(abstractC6732e);
                    C1884e ad2 = c5414e2.ad();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int length = ad.f5020e.length - i2;
                        int length2 = ad2.f5020e.length - i3;
                        int min = Math.min(length, length2);
                        if (!(i2 == 0 ? ad.inmobi(ad2, i3, min) : ad2.inmobi(ad, i2, min))) {
                            break;
                        }
                        i4 += min;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (min == length) {
                            ad = c5414e.ad();
                            i2 = 0;
                        } else {
                            i2 += min;
                        }
                        if (min == length2) {
                            ad2 = c5414e2.ad();
                            i3 = 0;
                        } else {
                            i3 += min;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f3734e;
        if (i == 0) {
            int i2 = this.f3732e;
            i = Signature(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.f3734e = i;
        }
        return i;
    }

    @Override // defpackage.AbstractC6732e
    public final void isVip(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        AbstractC6732e abstractC6732e = this.f3731e;
        int i4 = this.f3730e;
        if (i3 <= i4) {
            abstractC6732e.isVip(outputStream, i, i2);
            return;
        }
        AbstractC6732e abstractC6732e2 = this.f3733e;
        if (i >= i4) {
            abstractC6732e2.isVip(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        abstractC6732e.isVip(outputStream, i, i5);
        abstractC6732e2.isVip(outputStream, 0, i2 - i5);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C16395e(this);
    }

    @Override // defpackage.AbstractC6732e
    public final String remoteconfig() {
        byte[] bArr;
        int i = this.f3732e;
        if (i == 0) {
            bArr = AbstractC6172e.ad;
        } else {
            byte[] bArr2 = new byte[i];
            startapp(0, 0, i, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // defpackage.AbstractC6732e
    public final int size() {
        return this.f3732e;
    }

    @Override // defpackage.AbstractC6732e
    public final boolean smaato() {
        int admob = this.f3731e.admob(0, 0, this.f3730e);
        AbstractC6732e abstractC6732e = this.f3733e;
        return abstractC6732e.admob(admob, 0, abstractC6732e.size()) == 0;
    }

    @Override // defpackage.AbstractC6732e
    public final void startapp(int i, int i2, int i3, byte[] bArr) {
        int i4 = i + i3;
        AbstractC6732e abstractC6732e = this.f3731e;
        int i5 = this.f3730e;
        if (i4 <= i5) {
            abstractC6732e.startapp(i, i2, i3, bArr);
            return;
        }
        AbstractC6732e abstractC6732e2 = this.f3733e;
        if (i >= i5) {
            abstractC6732e2.startapp(i - i5, i2, i3, bArr);
            return;
        }
        int i6 = i5 - i;
        abstractC6732e.startapp(i, i2, i6, bArr);
        abstractC6732e2.startapp(0, i2 + i6, i3 - i6, bArr);
    }

    @Override // defpackage.AbstractC6732e
    public final int subscription() {
        return this.f3734e;
    }
}
