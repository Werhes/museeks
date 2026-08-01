package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۨ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5324e {
    public String ad;
    public List metrica;
    public String vip;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5324e)) {
            return false;
        }
        C5324e c5324e = (C5324e) obj;
        return Objects.equals(this.ad, c5324e.ad) && Objects.equals(this.vip, c5324e.vip) && Objects.equals(this.metrica, c5324e.metrica);
    }

    public final int hashCode() {
        return Objects.hash(this.ad, this.vip, this.metrica);
    }
}
