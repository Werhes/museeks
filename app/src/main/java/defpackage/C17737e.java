package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ٘ٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17737e {
    public final int ad;
    public final int license;
    public final int metrica;
    public final byte[] vip;

    public C17737e(int i, int i2, int i3, byte[] bArr) {
        this.ad = i;
        this.vip = bArr;
        this.metrica = i2;
        this.license = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17737e.class == obj.getClass()) {
            C17737e c17737e = (C17737e) obj;
            if (this.ad == c17737e.ad && this.metrica == c17737e.metrica && this.license == c17737e.license && Arrays.equals(this.vip, c17737e.vip)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.vip) + (this.ad * 31)) * 31) + this.metrica) * 31) + this.license;
    }
}
