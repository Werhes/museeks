package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۖؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2772e {
    public final C9716e ad;
    public final C10426e vip;

    public C2772e(C9716e c9716e, C10426e c10426e) {
        this.ad = c9716e;
        this.vip = c10426e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2772e)) {
            return false;
        }
        C2772e c2772e = (C2772e) obj;
        return this.ad.equals(c2772e.ad) && this.vip.equals(c2772e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + ((this.ad.hashCode() + (EnumC5088e.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + EnumC5088e.SESSION_START + ", sessionData=" + this.ad + ", applicationInfo=" + this.vip + ')';
    }
}
