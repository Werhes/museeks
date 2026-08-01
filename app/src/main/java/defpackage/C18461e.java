package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18461e extends C6573e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C7936e f36177e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f36178e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public EnumC8701e f36179e;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f36177e = new C7936e(2);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [eۨؕ, java.lang.Object] */
    @Override // defpackage.C6573e, defpackage.AbstractC8492e
    public final void ad(ByteBuffer byteBuffer) {
        C18529e c18529e = new C18529e(byteBuffer);
        this.f13555e = c18529e.ad();
        this.f36178e = c18529e.vip;
        byteBuffer.position(byteBuffer.position() + 8);
        byte[] bArr = new byte[this.f13555e - 8];
        this.f13554e = bArr;
        byteBuffer.get(bArr, 0, bArr.length);
        int position = byteBuffer.position();
        if (byteBuffer.position() + 8 <= byteBuffer.limit()) {
            ?? obj = new Object();
            obj.purchase(byteBuffer);
            if (!obj.ad.equals("name")) {
                byteBuffer.position(position);
                return;
            }
            this.f13555e = obj.ad() + this.f13555e;
            this.f36178e += obj.vip;
        }
    }

    @Override // defpackage.C6573e, defpackage.AbstractC8492e
    public final EnumC8701e metrica() {
        return this.f36179e;
    }

    @Override // defpackage.InterfaceC3589e
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f36179e);
        sb.append(":");
        return AbstractC17861e.smaato(this.f13554e.length, "bytes", sb);
    }
}
