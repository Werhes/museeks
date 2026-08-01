package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0974e {
    public final C12007e ad;
    public final byte[] vip;

    public C0974e(C12007e c12007e, byte[] bArr) {
        if (c12007e == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.ad = c12007e;
        this.vip = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0974e)) {
            return false;
        }
        C0974e c0974e = (C0974e) obj;
        if (this.ad.equals(c0974e.ad)) {
            return Arrays.equals(this.vip, c0974e.vip);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.ad.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.vip);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.ad + ", bytes=[...]}";
    }
}
