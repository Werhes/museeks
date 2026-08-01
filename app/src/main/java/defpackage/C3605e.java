package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۙۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3605e implements InterfaceC5948e {
    public final int ad;
    public final int appmetrica;
    public final int license;
    public final int metrica;
    public final int purchase;
    public final int vip;

    public C3605e(int i, int i2, int i3, int i4, int i5, int i6) {
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
        this.license = i4;
        this.appmetrica = i5;
        this.purchase = i6;
    }

    @Override // defpackage.InterfaceC5948e
    public final int ad() {
        return 1752331379;
    }

    public final int vip() {
        int i = this.ad;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        AbstractC2803e.smaato("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i));
        return -1;
    }
}
