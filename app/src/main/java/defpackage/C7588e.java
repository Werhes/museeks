package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۥٍ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7588e implements InterfaceC17159e {
    public final byte[] ad;

    public C7588e(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("Invalid 'bytes' size ", bArr.length, ", byte array size must be 16"));
        }
        this.ad = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof InterfaceC17159e)) {
            return Arrays.equals(((C7588e) ((InterfaceC17159e) obj)).ad, this.ad);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.ad);
    }

    public final String toString() {
        byte[] bArr = this.ad;
        String ad = AbstractC10779e.ad(0, 4, bArr);
        String ad2 = AbstractC10779e.ad(4, 6, bArr);
        String ad3 = AbstractC10779e.ad(6, 8, bArr);
        String ad4 = AbstractC10779e.ad(8, 10, bArr);
        String ad5 = AbstractC10779e.ad(10, 16, bArr);
        StringBuilder sb = new StringBuilder();
        sb.append(ad);
        sb.append("-");
        sb.append(ad2);
        sb.append("-");
        sb.append(ad3);
        return AbstractC4653e.ads(sb, "-", ad4, "-", ad5);
    }
}
