package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؖۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4002e implements Iterable, Serializable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final InterfaceC18204e f8907e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C11507e f8908e = new C11507e(AbstractC0352e.vip);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f8909e;

    static {
        f8907e = AbstractC10493e.ad() ? new C14914e(24) : new C4524e(24);
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

    public static C11507e yandex(int i, int i2, byte[] bArr) {
        billing(i, i + i2, bArr.length);
        return new C11507e(f8907e.ad(i, i2, bArr));
    }

    public abstract byte appmetrica(int i);

    public final int hashCode() {
        int i = this.f8909e;
        if (i != 0) {
            return i;
        }
        int size = size();
        C11507e c11507e = (C11507e) this;
        int adcel = c11507e.adcel();
        int i2 = size;
        for (int i3 = adcel; i3 < adcel + size; i3++) {
            i2 = (i2 * 31) + c11507e.f23125e[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f8909e = i2;
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
            sb = AbstractC15946e.license(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            C11507e c11507e = (C11507e) this;
            int billing = billing(0, 47, c11507e.size());
            sb2.append(AbstractC15946e.license(billing == 0 ? f8908e : new C7628e(c11507e.f23125e, c11507e.adcel(), billing)));
            sb2.append("...");
            sb = sb2.toString();
        }
        return AbstractC1786e.signatures(AbstractC10257e.smaato("<ByteString@", hexString, " size=", size, " contents=\""), sb, "\">");
    }
}
