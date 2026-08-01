package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٝۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18247e {
    public final C10354e ad;
    public final int vip;

    public C18247e(C10354e c10354e, int i) {
        this.ad = c10354e;
        this.vip = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18247e)) {
            return false;
        }
        C18247e c18247e = (C18247e) obj;
        if (!AbstractC7890e.billing(this.ad, c18247e.ad)) {
            return false;
        }
        C12352e c12352e = C12352e.ad;
        return c12352e.equals(c12352e) && this.vip == c18247e.vip;
    }

    public final int hashCode() {
        return Objects.hash(this.ad, C12352e.ad, Integer.valueOf(this.vip));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSpec{videoSpec=");
        sb.append(this.ad);
        sb.append(", audioSpec=");
        sb.append(C12352e.ad);
        sb.append(", outputFormat=");
        return AbstractC1786e.pro(sb, this.vip, '}');
    }
}
