package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4050e {
    public final String ad;
    public final int metrica;
    public final String vip;

    public C4050e(String str, int i, String str2) {
        this.ad = str;
        this.vip = str2;
        this.metrica = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4050e)) {
            return false;
        }
        C4050e c4050e = (C4050e) obj;
        return this.ad.equals(c4050e.ad) && this.vip.equals(c4050e.vip) && this.metrica == c4050e.metrica;
    }

    public final int hashCode() {
        return AbstractC8703e.m2467class(this.metrica) + AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PluginTraceElement(pluginName=");
        sb.append(this.ad);
        sb.append(", handler=");
        sb.append(this.vip);
        sb.append(", event=");
        int i = this.metrica;
        sb.append(i != 1 ? i != 2 ? "null" : "FINISHED" : "STARTED");
        sb.append(')');
        return sb.toString();
    }
}
