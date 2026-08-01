package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؚؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11584e {
    public boolean ad;
    public boolean license;
    public boolean metrica;
    public boolean vip;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11584e)) {
            return false;
        }
        C11584e c11584e = (C11584e) obj;
        return this.ad == c11584e.ad && this.vip == c11584e.vip && this.metrica == c11584e.metrica && this.license == c11584e.license;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final int hashCode() {
        ?? r0 = this.ad;
        int i = r0;
        if (this.vip) {
            i = r0 + 16;
        }
        int i2 = i;
        if (this.metrica) {
            i2 = i + PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        return this.license ? i2 + 4096 : i2;
    }

    public final String toString() {
        return "[ Connected=" + this.ad + " Validated=" + this.vip + " Metered=" + this.metrica + " NotRoaming=" + this.license + " ]";
    }
}
