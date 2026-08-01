package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9431e extends C9405e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f18769e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public byte[] f18770e;

    public C9431e(EnumC14687e enumC14687e, String str, int i) {
        super(enumC14687e.f29091e, str);
        this.f18769e = i;
        try {
            Long.parseLong(str);
        } catch (NumberFormatException unused) {
            throw new Exception("Value of:" + str + " is invalid for field:" + enumC14687e);
        }
    }

    @Override // defpackage.C9405e, defpackage.AbstractC8492e
    public final void ad(ByteBuffer byteBuffer) {
        C9890e c9890e = new C9890e(new C18529e(byteBuffer), byteBuffer);
        this.f18769e = r0.ad() - 8;
        this.f18770e = c9890e.f19505e;
        this.f18719e = c9890e.f19504e;
    }

    @Override // defpackage.C9405e, defpackage.AbstractC8492e
    public final EnumC8701e metrica() {
        return EnumC8701e.INTEGER;
    }

    @Override // defpackage.C9405e, defpackage.AbstractC8492e
    public final byte[] vip() {
        byte[] bArr = this.f18770e;
        if (bArr != null) {
            return bArr;
        }
        int i = this.f18769e;
        if (i == 1) {
            return new byte[]{new Short(this.f18719e).byteValue()};
        }
        if (i == 2) {
            short shortValue = new Short(this.f18719e).shortValue();
            C7936e c7936e = AbstractC1983e.ad;
            return new byte[]{(byte) ((shortValue >> 8) & 255), (byte) (shortValue & 255)};
        }
        if (i == 4) {
            return AbstractC1983e.appmetrica(new Integer(this.f18719e).intValue());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17293e);
        sb.append(":");
        throw new RuntimeException(AbstractC17861e.smaato(this.f18769e, ":Dont know how to write byte fields of this length", sb));
    }
}
