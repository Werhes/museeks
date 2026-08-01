package defpackage;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۣۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6011e {
    public int appmetrica;
    public long billing;
    public C5389e license;
    public int purchase;
    public final byte[] ad = new byte[8];
    public final ArrayDeque vip = new ArrayDeque();
    public final C10629e metrica = new C10629e(1);

    public final long ad(InterfaceC2283e interfaceC2283e, int i) {
        interfaceC2283e.readFully(this.ad, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r0[i2] & 255);
        }
        return j;
    }
}
