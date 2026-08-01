package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13882e {
    public final Bundle ad;
    public C0056e vip;

    public C13882e(C0056e c0056e, boolean z) {
        if (c0056e == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.ad = bundle;
        this.vip = c0056e;
        bundle.putBundle("selector", c0056e.ad);
        bundle.putBoolean("activeScan", z);
    }

    public final void ad() {
        if (this.vip == null) {
            C0056e vip = C0056e.vip(this.ad.getBundle("selector"));
            this.vip = vip;
            if (vip == null) {
                this.vip = C0056e.metrica;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13882e) {
            C13882e c13882e = (C13882e) obj;
            ad();
            C0056e c0056e = this.vip;
            c13882e.ad();
            if (c0056e.equals(c13882e.vip) && vip() == c13882e.vip()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ad();
        return this.vip.hashCode() ^ (vip() ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        ad();
        sb.append(this.vip);
        sb.append(", activeScan=");
        sb.append(vip());
        sb.append(", isValid=");
        ad();
        this.vip.ad();
        return AbstractC8703e.signatures(sb, !r1.vip.contains(null), " }");
    }

    public final boolean vip() {
        return this.ad.getBoolean("activeScan");
    }
}
