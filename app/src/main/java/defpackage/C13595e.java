package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۣۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13595e extends AbstractC14681e {
    public final byte[] vip;

    public C13595e(String str, byte[] bArr) {
        super(str);
        this.vip = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C13595e.class == obj.getClass()) {
            C13595e c13595e = (C13595e) obj;
            if (this.ad.equals(c13595e.ad) && Arrays.equals(this.vip, c13595e.vip)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.vip) + AbstractC1786e.advert(527, 31, this.ad);
    }
}
