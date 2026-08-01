package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۛٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2096e extends AbstractC10498e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f5426e;

    public C2096e(byte[] bArr) {
        this.f20718e = 0;
        bArr.getClass();
        this.f5426e = bArr;
    }

    public int advert() {
        return 0;
    }

    @Override // defpackage.AbstractC10498e
    public byte appmetrica(int i) {
        return this.f5426e[i];
    }

    @Override // defpackage.AbstractC10498e
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10498e) || size() != ((AbstractC10498e) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C2096e)) {
            return obj.equals(this);
        }
        C2096e c2096e = (C2096e) obj;
        int i = this.f20718e;
        int i2 = c2096e.f20718e;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > c2096e.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c2096e.size()) {
            StringBuilder premium = AbstractC4653e.premium("Ran off end of other: 0, ", size, ", ");
            premium.append(c2096e.size());
            throw new IllegalArgumentException(premium.toString());
        }
        byte[] bArr = c2096e.f5426e;
        int advert = advert() + size;
        int advert2 = advert();
        int advert3 = c2096e.advert();
        while (advert2 < advert) {
            if (this.f5426e[advert2] != bArr[advert3]) {
                return false;
            }
            advert2++;
            advert3++;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1952e(this);
    }

    @Override // defpackage.AbstractC10498e
    public int size() {
        return this.f5426e.length;
    }

    public byte smaato(int i) {
        return this.f5426e[i];
    }

    @Override // defpackage.AbstractC10498e
    public void startapp(int i, byte[] bArr) {
        System.arraycopy(this.f5426e, 0, bArr, 0, i);
    }
}
