package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۖۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7370e {
    public static final C7370e license = new C7370e(PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    public final int ad;
    public final int metrica;
    public final int vip;

    public C7370e(int i, int i2, int i3) {
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7370e)) {
            return false;
        }
        C7370e c7370e = (C7370e) obj;
        return this.ad == c7370e.ad && this.vip == c7370e.vip && this.metrica == c7370e.metrica;
    }

    public final int hashCode() {
        return (((this.ad * 31) + this.vip) * 31) + this.metrica;
    }

    public final String toString() {
        int i = this.vip;
        int i2 = this.ad;
        int i3 = this.metrica;
        if (i3 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append('.');
            sb.append(i);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i2);
        sb2.append('.');
        sb2.append(i);
        sb2.append('.');
        sb2.append(i3);
        return sb2.toString();
    }
}
