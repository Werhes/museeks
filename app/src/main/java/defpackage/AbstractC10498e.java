package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۙٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10498e implements Iterable, Serializable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final InterfaceC7342e f20716e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C2096e f20717e = new C2096e(AbstractC10546e.vip);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f20718e;

    static {
        f20716e = AbstractC16549e.ad() ? new C15802e(24) : new C17354e(24);
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

    public static C2096e yandex(int i, int i2, byte[] bArr) {
        billing(i, i + i2, bArr.length);
        return new C2096e(f20716e.ad(i, i2, bArr));
    }

    public final byte[] adcel() {
        int size = size();
        if (size == 0) {
            return AbstractC10546e.vip;
        }
        byte[] bArr = new byte[size];
        startapp(size, bArr);
        return bArr;
    }

    public abstract byte appmetrica(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f20718e;
        if (i != 0) {
            return i;
        }
        int size = size();
        C2096e c2096e = (C2096e) this;
        int advert = c2096e.advert();
        int i2 = size;
        for (int i3 = advert; i3 < advert + size; i3++) {
            i2 = (i2 * 31) + c2096e.f5426e[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f20718e = i2;
        return i2;
    }

    public abstract int size();

    public abstract void startapp(int i, byte[] bArr);

    public final String toString() {
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = C4094e.yandex(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            C2096e c2096e = (C2096e) this;
            int billing = billing(0, 47, c2096e.size());
            sb2.append(C4094e.yandex(billing == 0 ? f20717e : new C17799e(c2096e.f5426e, c2096e.advert(), billing)));
            sb2.append("...");
            sb = sb2.toString();
        }
        return AbstractC1786e.signatures(AbstractC10257e.smaato("<ByteString@", hexString, " size=", size, " contents=\""), sb, "\">");
    }
}
