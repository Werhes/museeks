package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6573e extends AbstractC8492e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public byte[] f13554e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f13555e;

    @Override // defpackage.AbstractC8492e
    public void ad(ByteBuffer byteBuffer) {
        this.f13555e = new C18529e(byteBuffer).ad();
        byteBuffer.position(byteBuffer.position() + 8);
        this.f13554e = new byte[this.f13555e - 8];
        int i = 0;
        while (true) {
            byte[] bArr = this.f13554e;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = byteBuffer.get();
            i++;
        }
    }

    @Override // defpackage.InterfaceC3589e
    public final boolean isEmpty() {
        return this.f13554e.length == 0;
    }

    @Override // defpackage.AbstractC8492e
    public EnumC8701e metrica() {
        return EnumC8701e.IMPLICIT;
    }

    @Override // defpackage.AbstractC8492e
    public final byte[] vip() {
        return this.f13554e;
    }
}
