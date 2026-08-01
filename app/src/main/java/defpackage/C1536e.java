package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؒٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1536e implements InterfaceC1230e {
    public final float ad;

    public C1536e(float f) {
        this.ad = f;
    }

    @Override // defpackage.InterfaceC1230e
    public final float ad(long j, InterfaceC14388e interfaceC14388e) {
        return interfaceC14388e.mo497instanceof(this.ad);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1536e) && C15765e.vip(this.ad, ((C1536e) obj).ad);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.ad);
    }

    public final String toString() {
        return "CornerSize(size = " + this.ad + ".dp)";
    }
}
