package defpackage;

import java.io.EOFException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؔؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6891e implements InterfaceC18147e {
    public final byte[] ad = new byte[4096];

    @Override // defpackage.InterfaceC18147e
    public final void ad(long j, int i, int i2, int i3, C17737e c17737e) {
    }

    @Override // defpackage.InterfaceC18147e
    public final void appmetrica(int i, C1292e c1292e) {
        c1292e.m568protected(i);
    }

    @Override // defpackage.InterfaceC18147e
    public final void billing(C16975e c16975e) {
    }

    @Override // defpackage.InterfaceC18147e
    public final /* synthetic */ void license(long j) {
    }

    @Override // defpackage.InterfaceC18147e
    public final int metrica(InterfaceC15672e interfaceC15672e, int i, boolean z) {
        byte[] bArr = this.ad;
        int read = interfaceC15672e.read(bArr, 0, Math.min(bArr.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.InterfaceC18147e
    public final int purchase(InterfaceC15672e interfaceC15672e, int i, boolean z) {
        return metrica(interfaceC15672e, i, z);
    }

    @Override // defpackage.InterfaceC18147e
    public final void vip(C1292e c1292e, int i, int i2) {
        c1292e.m568protected(i);
    }
}
