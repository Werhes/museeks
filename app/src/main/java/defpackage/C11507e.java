package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِِؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C11507e extends AbstractC4002e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f23125e;

    public C11507e(byte[] bArr) {
        this.f8909e = 0;
        bArr.getClass();
        this.f23125e = bArr;
    }

    public int adcel() {
        return 0;
    }

    public byte advert(int i) {
        return this.f23125e[i];
    }

    @Override // defpackage.AbstractC4002e
    public byte appmetrica(int i) {
        return this.f23125e[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4002e) || size() != ((AbstractC4002e) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C11507e)) {
            return obj.equals(this);
        }
        C11507e c11507e = (C11507e) obj;
        int i = this.f8909e;
        int i2 = c11507e.f8909e;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > c11507e.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c11507e.size()) {
            StringBuilder premium = AbstractC4653e.premium("Ran off end of other: 0, ", size, ", ");
            premium.append(c11507e.size());
            throw new IllegalArgumentException(premium.toString());
        }
        byte[] bArr = c11507e.f23125e;
        int adcel = adcel() + size;
        int adcel2 = adcel();
        int adcel3 = c11507e.adcel();
        while (adcel2 < adcel) {
            if (this.f23125e[adcel2] != bArr[adcel3]) {
                return false;
            }
            adcel2++;
            adcel3++;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1952e(this);
    }

    @Override // defpackage.AbstractC4002e
    public int size() {
        return this.f23125e.length;
    }

    @Override // defpackage.AbstractC4002e
    public void startapp(int i, byte[] bArr) {
        System.arraycopy(this.f23125e, 0, bArr, 0, i);
    }
}
