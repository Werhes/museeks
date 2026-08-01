package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10171e {
    public final C0272e ad;
    public final C1096e vip;

    public C10171e(C0272e c0272e, C1096e c1096e, int i) {
        c0272e = (i & 1) != 0 ? null : c0272e;
        c1096e = (i & 2) != 0 ? null : c1096e;
        this.ad = c0272e;
        this.vip = c1096e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10171e)) {
            return false;
        }
        C10171e c10171e = (C10171e) obj;
        return AbstractC7890e.billing(this.ad, c10171e.ad) && AbstractC7890e.billing(this.vip, c10171e.vip);
    }

    public final int hashCode() {
        C0272e c0272e = this.ad;
        int hashCode = (c0272e == null ? 0 : c0272e.hashCode()) * 31;
        C1096e c1096e = this.vip;
        return hashCode + (c1096e != null ? c1096e.ad : 0);
    }

    public final String toString() {
        return "OpenCameraResult(cameraState=" + this.ad + ", errorCode=" + this.vip + ')';
    }
}
