package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۣٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12070e {
    public final String ad;
    public final C14796e vip;

    public C12070e(String str, C14796e c14796e) {
        this.ad = str;
        this.vip = c14796e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12070e)) {
            return false;
        }
        C12070e c12070e = (C12070e) obj;
        return Objects.equals(this.ad, c12070e.ad) && Objects.equals(this.vip, c12070e.vip);
    }

    public final int hashCode() {
        return Objects.hash(this.ad, this.vip);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistData [mStreamInfo=");
        sb.append(this.vip);
        sb.append(", mUri=");
        return AbstractC1786e.signatures(sb, this.ad, "]");
    }
}
