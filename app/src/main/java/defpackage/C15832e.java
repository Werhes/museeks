package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۤۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15832e implements InterfaceC12836e {
    public final C3672e ad;
    public final C8988e vip;

    public C15832e(C3672e c3672e, C8988e c8988e) {
        this.ad = c3672e;
        this.vip = c8988e;
    }

    @Override // defpackage.InterfaceC12836e
    public final boolean ad(Exception exc) {
        this.vip.metrica(exc);
        return true;
    }

    @Override // defpackage.InterfaceC12836e
    public final boolean vip(C0100e c0100e) {
        if (c0100e.vip != 4 || this.ad.ad(c0100e)) {
            return false;
        }
        String str = c0100e.metrica;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        long j = c0100e.appmetrica;
        long j2 = c0100e.purchase;
        byte b = (byte) (((byte) 1) | 2);
        if (b == 3) {
            this.vip.vip(new C14606e(str, j, j2));
            return true;
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" tokenExpirationTimestamp");
        }
        if ((b & 2) == 0) {
            sb.append(" tokenCreationTimestamp");
        }
        throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb));
    }
}
