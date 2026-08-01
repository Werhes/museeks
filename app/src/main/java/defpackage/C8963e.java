package defpackage;

import android.content.res.Resources;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۚ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8963e {
    public final Resources.Theme ad;
    public final int vip;

    public C8963e(int i, Resources.Theme theme) {
        this.ad = theme;
        this.vip = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8963e)) {
            return false;
        }
        C8963e c8963e = (C8963e) obj;
        return AbstractC7890e.billing(this.ad, c8963e.ad) && this.vip == c8963e.vip;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.ad);
        sb.append(", id=");
        return AbstractC1786e.pro(sb, this.vip, ')');
    }
}
