package defpackage;

import java.io.File;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16281e {
    public final C0823e ad;
    public final File metrica;
    public final String vip;

    public C16281e(C0823e c0823e, String str, File file) {
        this.ad = c0823e;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.vip = str;
        this.metrica = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16281e)) {
            return false;
        }
        C16281e c16281e = (C16281e) obj;
        return this.ad.equals(c16281e.ad) && this.vip.equals(c16281e.vip) && this.metrica.equals(c16281e.metrica);
    }

    public final int hashCode() {
        return ((((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003) ^ this.metrica.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.ad + ", sessionId=" + this.vip + ", reportFile=" + this.metrica + "}";
    }
}
