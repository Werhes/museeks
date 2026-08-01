package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٚؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14072e implements InterfaceC15935e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f27819e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public ByteBuffer f27820e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27821e = 2;

    public /* synthetic */ C14072e() {
    }

    public C14072e(int i, ByteBuffer byteBuffer) {
        this.f27819e = i;
        this.f27820e = byteBuffer;
    }

    public C14072e(ByteBuffer byteBuffer, int i) {
        this.f27820e = byteBuffer;
        this.f27819e = i;
    }

    @Override // defpackage.InterfaceC15935e
    public int adcel() {
        switch (this.f27821e) {
            case 0:
                return this.f27819e;
            default:
                return this.f27819e;
        }
    }

    @Override // defpackage.InterfaceC15935e
    public ByteBuffer metrica() {
        switch (this.f27821e) {
            case 0:
                return this.f27820e;
            default:
                return this.f27820e;
        }
    }

    @Override // defpackage.InterfaceC15935e
    public int subscription() {
        switch (this.f27821e) {
            case 0:
                return 1;
            default:
                return 2;
        }
    }
}
