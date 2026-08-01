package defpackage;

import android.view.Surface;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17756e {
    public final int ad;
    public final Surface vip;

    public C17756e(int i, Surface surface) {
        this.ad = i;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.vip = surface;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17756e)) {
            return false;
        }
        C17756e c17756e = (C17756e) obj;
        return this.ad == c17756e.ad && this.vip.equals(c17756e.vip);
    }

    public final int hashCode() {
        return ((this.ad ^ 1000003) * 1000003) ^ this.vip.hashCode();
    }

    public final String toString() {
        return "Result{resultCode=" + this.ad + ", surface=" + this.vip + "}";
    }
}
