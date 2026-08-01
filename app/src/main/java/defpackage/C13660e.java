package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۨٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13660e extends AbstractC1816e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f27081e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC15935e[] f27082e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f27083e;

    public C13660e(InterfaceC12385e interfaceC12385e, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2) {
        super(interfaceC12385e);
        this.f27082e = new InterfaceC15935e[]{new C14072e(i, byteBuffer), new C14072e(byteBuffer2, i), new C14072e(byteBuffer3, i)};
        this.f27081e = i;
        this.f27083e = i2;
    }

    @Override // defpackage.AbstractC1816e, defpackage.InterfaceC12385e
    public final int getWidth() {
        return this.f27081e;
    }

    @Override // defpackage.AbstractC1816e, defpackage.InterfaceC12385e
    public final InterfaceC15935e[] remoteconfig() {
        return this.f27082e;
    }

    @Override // defpackage.AbstractC1816e, defpackage.InterfaceC12385e
    public final int vip() {
        return this.f27083e;
    }
}
