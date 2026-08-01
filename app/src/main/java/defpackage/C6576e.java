package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6576e {
    public final long ad;
    public final long metrica;
    public final float vip;

    public C6576e(C4042e c4042e) {
        this.ad = c4042e.ad;
        this.vip = c4042e.vip;
        this.metrica = c4042e.metrica;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6576e)) {
            return false;
        }
        C6576e c6576e = (C6576e) obj;
        return this.ad == c6576e.ad && this.vip == c6576e.vip && this.metrica == c6576e.metrica;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.ad), Float.valueOf(this.vip), Long.valueOf(this.metrica));
    }
}
