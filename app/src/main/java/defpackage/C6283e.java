package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C6283e implements Iterable, Serializable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C6283e f13092e = new C6283e(AbstractC2930e.vip);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final InterfaceC11871e f13093e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f13094e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f13095e = 0;

    static {
        f13093e = AbstractC2037e.ad() ? new C12575e(24) : new C9616e(24);
    }

    public C6283e(byte[] bArr) {
        bArr.getClass();
        this.f13094e = bArr;
    }

    public static int billing(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC1634e.smaato("Beginning index: ", i, " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i2, i3, "End index: ", " >= "));
    }

    public static C6283e yandex(int i, int i2, byte[] bArr) {
        billing(i, i + i2, bArr.length);
        return new C6283e(f13093e.ad(i, i2, bArr));
    }

    public int adcel() {
        return 0;
    }

    public byte advert(int i) {
        return this.f13094e[i];
    }

    public byte appmetrica(int i) {
        return this.f13094e[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6283e) || size() != ((C6283e) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C6283e)) {
            return obj.equals(this);
        }
        C6283e c6283e = (C6283e) obj;
        int i = this.f13095e;
        int i2 = c6283e.f13095e;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > c6283e.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c6283e.size()) {
            StringBuilder premium = AbstractC4653e.premium("Ran off end of other: 0, ", size, ", ");
            premium.append(c6283e.size());
            throw new IllegalArgumentException(premium.toString());
        }
        byte[] bArr = c6283e.f13094e;
        int adcel = adcel() + size;
        int adcel2 = adcel();
        int adcel3 = c6283e.adcel();
        while (adcel2 < adcel) {
            if (this.f13094e[adcel2] != bArr[adcel3]) {
                return false;
            }
            adcel2++;
            adcel3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f13095e;
        if (i != 0) {
            return i;
        }
        int size = size();
        int adcel = adcel();
        int i2 = size;
        for (int i3 = adcel; i3 < adcel + size; i3++) {
            i2 = (i2 * 31) + this.f13094e[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f13095e = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1952e(this);
    }

    public int size() {
        return this.f13094e.length;
    }

    public void startapp(int i, byte[] bArr) {
        System.arraycopy(this.f13094e, 0, bArr, 0, i);
    }

    public final String toString() {
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = AbstractC13438e.vip(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int billing = billing(0, 47, size());
            sb2.append(AbstractC13438e.vip(billing == 0 ? f13092e : new C10669e(this.f13094e, adcel(), billing)));
            sb2.append("...");
            sb = sb2.toString();
        }
        return AbstractC1786e.signatures(AbstractC10257e.smaato("<ByteString@", hexString, " size=", size, " contents=\""), sb, "\">");
    }
}
