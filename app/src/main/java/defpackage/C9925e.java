package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۧٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9925e {
    public final boolean ad;
    public final long appmetrica;
    public final C2673e billing = AbstractC14430e.metrica(false);
    public final long license;
    public final long metrica;
    public final InterfaceC0420e purchase;
    public final long vip;

    public C9925e(boolean z, long j, long j2, long j3, long j4, InterfaceC0420e interfaceC0420e) {
        this.ad = z;
        this.vip = j;
        this.metrica = j2;
        this.license = j3;
        this.appmetrica = j4;
        this.purchase = interfaceC0420e;
    }

    public final void ad(long j, Object obj) {
        if (this.billing.ad()) {
            this.purchase.vip(obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Output ");
        sb.append(this.license);
        sb.append(" at ");
        sb.append((Object) C5125e.ad(this.vip));
        sb.append(" for ");
        throw new IllegalStateException(AbstractC5087e.m1750native(j, " was completed multiple times!", sb).toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9925e) {
            C9925e c9925e = (C9925e) obj;
            if (this.ad == c9925e.ad && this.vip == c9925e.vip && this.metrica == c9925e.metrica && this.license == c9925e.license && this.appmetrica == c9925e.appmetrica && AbstractC7890e.billing(this.purchase, c9925e.purchase)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.ad ? 1231 : 1237;
        long j = this.vip;
        long j2 = this.metrica;
        int i2 = (((((int) (j ^ (j >>> 32))) + (i * 31)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.license;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.appmetrica;
        return this.purchase.hashCode() + ((i3 + ((int) ((j4 >>> 32) ^ j4))) * 31);
    }

    public final String toString() {
        return "StartedOutput(isOutOfOrder=" + this.ad + ", cameraFrameNumber=" + ((Object) C5125e.ad(this.vip)) + ", cameraTimestamp=" + ((Object) ("CameraTimestamp(value=" + this.metrica + ')')) + ", cameraOutputSequence=" + this.license + ", cameraOutputNumber=" + this.appmetrica + ", outputListener=" + this.purchase + ')';
    }
}
