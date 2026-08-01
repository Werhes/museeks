package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٞؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13395e {
    public static final C13395e license = new C10233e(0).ad();
    public final boolean ad;
    public final boolean metrica;
    public final boolean vip;

    public C13395e(C10233e c10233e) {
        this.ad = c10233e.vip;
        this.vip = c10233e.metrica;
        this.metrica = c10233e.license;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13395e.class != obj.getClass()) {
            return false;
        }
        C13395e c13395e = (C13395e) obj;
        return this.ad == c13395e.ad && this.vip == c13395e.vip && this.metrica == c13395e.metrica;
    }

    public final int hashCode() {
        return ((this.ad ? 1 : 0) << 2) + ((this.vip ? 1 : 0) << 1) + (this.metrica ? 1 : 0);
    }
}
