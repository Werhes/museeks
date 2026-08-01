package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۛٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18370e implements InterfaceC14710e {
    public final InterfaceC14710e ad;
    public final byte[] vip;

    public C18370e(InterfaceC14710e interfaceC14710e, byte[] bArr) {
        this.ad = interfaceC14710e;
        this.vip = bArr;
    }

    @Override // defpackage.InterfaceC14710e
    public final byte[] ad(byte[] bArr) {
        byte[] bArr2 = this.vip;
        int length = bArr2.length;
        InterfaceC14710e interfaceC14710e = this.ad;
        return length == 0 ? interfaceC14710e.ad(bArr) : AbstractC7640e.ad(bArr2, interfaceC14710e.ad(bArr));
    }
}
