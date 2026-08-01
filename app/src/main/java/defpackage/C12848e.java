package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۣ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12848e extends AbstractC12314e {
    public final C1096e ad;

    public C12848e(C1096e c1096e) {
        this.ad = c1096e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12848e) && AbstractC7890e.billing(this.ad, ((C12848e) obj).ad);
    }

    public final int hashCode() {
        C1096e c1096e = this.ad;
        if (c1096e == null) {
            return 0;
        }
        return c1096e.ad;
    }

    public final String toString() {
        return "CameraStateClosing(cameraErrorCode=" + this.ad + ')';
    }
}
