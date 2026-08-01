package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٞۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1988e extends AbstractC11130e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f5199e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C0320e f5200e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1988e(C18524e c18524e, ByteBuffer byteBuffer, C0320e c0320e, int i) {
        super(byteBuffer, c18524e, 7);
        this.f5199e = i;
        this.f5200e = c0320e;
    }

    @Override // defpackage.AbstractC11130e
    /* renamed from: eٓٔؔ, reason: contains not printable characters */
    public final boolean mo741e() {
        switch (this.f5199e) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) this.f22046e;
                this.f5200e.tapsense.add(AbstractC1983e.billing(byteBuffer, 0, byteBuffer.remaining(), AbstractC4639e.vip));
                return true;
            case 1:
                ByteBuffer byteBuffer2 = (ByteBuffer) this.f22046e;
                this.f5200e.subscription = AbstractC1983e.billing(byteBuffer2, 0, byteBuffer2.remaining(), AbstractC4639e.vip);
                return true;
            case 2:
                ByteBuffer byteBuffer3 = (ByteBuffer) this.f22046e;
                this.f5200e.remoteconfig = AbstractC1983e.billing(byteBuffer3, 0, byteBuffer3.remaining(), AbstractC4639e.vip);
                return true;
            default:
                ByteBuffer byteBuffer4 = (ByteBuffer) this.f22046e;
                this.f5200e.admob = AbstractC1983e.billing(byteBuffer4, 0, byteBuffer4.remaining(), AbstractC4639e.vip);
                return true;
        }
    }
}
