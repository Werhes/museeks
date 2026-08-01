package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٟۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6637e extends AbstractC4592e {
    public final List ad;
    public final String vip;

    public C6637e(List list, String str) {
        this.ad = list;
        this.vip = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4592e) {
            C6637e c6637e = (C6637e) ((AbstractC4592e) obj);
            String str2 = c6637e.vip;
            if (this.ad.equals(c6637e.ad) && ((str = this.vip) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.ad.hashCode() ^ 1000003) * 1000003;
        String str = this.vip;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.ad);
        sb.append(", orgId=");
        return AbstractC1786e.signatures(sb, this.vip, "}");
    }
}
