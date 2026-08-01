package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَ۠٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10575e {
    public final List ad;
    public final boolean vip;

    public C10575e(C13486e c13486e) {
        this.ad = c13486e.vip;
        this.vip = c13486e.metrica;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10575e)) {
            return false;
        }
        C10575e c10575e = (C10575e) obj;
        return this.ad.equals(c10575e.ad) && this.vip == c10575e.vip;
    }

    public final int hashCode() {
        return Objects.hash(this.ad, Boolean.valueOf(this.vip), null);
    }
}
