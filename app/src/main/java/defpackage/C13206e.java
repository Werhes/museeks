package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13206e extends AbstractC8492e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C7936e f26208e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public byte[] f26209e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f26210e;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f26208e = new C7936e(2);
    }

    public C13206e(C18529e c18529e, ByteBuffer byteBuffer) {
        super(c18529e.ad);
        this.f26210e = c18529e.ad();
        ad(byteBuffer);
    }

    @Override // defpackage.AbstractC8492e
    public final void ad(ByteBuffer byteBuffer) {
        this.f26209e = new byte[this.f26210e];
        int i = 0;
        while (true) {
            byte[] bArr = this.f26209e;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = byteBuffer.get();
            i++;
        }
    }

    @Override // defpackage.InterfaceC3589e
    public final boolean isEmpty() {
        return this.f26209e.length == 0;
    }

    @Override // defpackage.AbstractC8492e
    public final EnumC8701e metrica() {
        return EnumC8701e.IMPLICIT;
    }

    @Override // defpackage.AbstractC8492e, defpackage.InterfaceC3589e
    public final byte[] purchase() {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        f26208e.getClass();
        int i = C1724e.ad;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(AbstractC1983e.appmetrica(this.f26210e + 8));
            byteArrayOutputStream.write(this.f17293e.getBytes(AbstractC4639e.vip));
            byteArrayOutputStream.write(this.f26209e);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.AbstractC8492e
    public final byte[] vip() {
        return this.f26209e;
    }
}
