package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَ۠ۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10579e {
    public final C7804e ad;
    public final C16995e metrica;
    public final C17350e vip;

    public C10579e(C7804e c7804e, C17350e c17350e, C16995e c16995e) {
        this.ad = c7804e;
        this.vip = c17350e;
        this.metrica = c16995e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10579e) {
            C10579e c10579e = (C10579e) obj;
            if (this.ad.equals(c10579e.ad) && this.vip.equals(c10579e.vip) && this.metrica.equals(c10579e.metrica)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003) ^ this.metrica.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.ad + ", osData=" + this.vip + ", deviceData=" + this.metrica + "}";
    }
}
