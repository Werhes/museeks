package defpackage;

import android.opengl.EGLSurface;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؖؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3852e {
    public final EGLSurface ad;
    public final int metrica;
    public final int vip;

    public C3852e(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.ad = eGLSurface;
        this.vip = i;
        this.metrica = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3852e) {
            C3852e c3852e = (C3852e) obj;
            if (this.ad.equals(c3852e.ad) && this.vip == c3852e.vip && this.metrica == c3852e.metrica) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip) * 1000003) ^ this.metrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.ad);
        sb.append(", width=");
        sb.append(this.vip);
        sb.append(", height=");
        return AbstractC17861e.smaato(this.metrica, "}", sb);
    }
}
