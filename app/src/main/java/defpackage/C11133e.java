package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٝٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C11133e implements Iterable, Serializable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C11133e f22049e = new C11133e(AbstractC9561e.vip);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f22050e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f22051e = 0;

    static {
        int i = AbstractC14050e.ad;
    }

    public C11133e(byte[] bArr) {
        bArr.getClass();
        this.f22050e = bArr;
    }

    public static void startapp(int i) {
        if (((i - 47) | 47) >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC8647e.isPro(i, "End index: 47 >= ", new StringBuilder(String.valueOf(47).length() + 15 + String.valueOf(i).length())));
    }

    public byte appmetrica(int i) {
        return this.f22050e[i];
    }

    public byte billing(int i) {
        return this.f22050e[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C11133e) && yandex() == ((C11133e) obj).yandex()) {
            if (yandex() == 0) {
                return true;
            }
            if (!(obj instanceof C11133e)) {
                return obj.equals(this);
            }
            C11133e c11133e = (C11133e) obj;
            int i = this.f22051e;
            int i2 = c11133e.f22051e;
            if (i == 0 || i2 == 0 || i == i2) {
                int yandex = yandex();
                if (yandex > c11133e.yandex()) {
                    int yandex2 = yandex();
                    StringBuilder sb = new StringBuilder(String.valueOf(yandex).length() + 18 + String.valueOf(yandex2).length());
                    sb.append("Length too large: ");
                    sb.append(yandex);
                    sb.append(yandex2);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (yandex <= c11133e.yandex()) {
                    byte[] bArr = c11133e.f22050e;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < yandex) {
                        if (this.f22050e[i3] == bArr[i4]) {
                            i3++;
                            i4++;
                        }
                    }
                    return true;
                }
                int yandex3 = c11133e.yandex();
                StringBuilder sb2 = new StringBuilder(String.valueOf(yandex).length() + 27 + String.valueOf(yandex3).length());
                sb2.append("Ran off end of other: 0, ");
                sb2.append(yandex);
                sb2.append(", ");
                sb2.append(yandex3);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f22051e;
        if (i != 0) {
            return i;
        }
        int yandex = yandex();
        Charset charset = AbstractC9561e.ad;
        int i2 = yandex;
        for (int i3 = 0; i3 < yandex; i3++) {
            i2 = (i2 * 31) + this.f22050e[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f22051e = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C1952e(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int yandex = yandex();
        if (yandex() <= 50) {
            concat = AbstractC17595e.remoteconfig(this);
        } else {
            startapp(yandex());
            concat = AbstractC17595e.remoteconfig(new C13305e(this.f22050e)).concat("...");
        }
        return AbstractC1786e.signatures(AbstractC10257e.smaato("<ByteString@", hexString, " size=", yandex, " contents=\""), concat, "\">");
    }

    public int yandex() {
        return this.f22050e.length;
    }
}
