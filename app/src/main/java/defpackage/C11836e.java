package defpackage;

import java.io.ByteArrayOutputStream;

/* renamed from: eِٚۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11836e implements InterfaceC0293e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C6854e f23743e = new ByteArrayOutputStream();

    @Override // defpackage.InterfaceC0293e
    public final int doFinal(byte[] bArr, int i) {
        C6854e c6854e = this.f23743e;
        int size = c6854e.size();
        c6854e.ad(bArr, i);
        reset();
        return size;
    }

    @Override // defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return "NULL";
    }

    @Override // defpackage.InterfaceC0293e
    public final int getDigestSize() {
        return this.f23743e.size();
    }

    @Override // defpackage.InterfaceC0293e
    public final void reset() {
        this.f23743e.reset();
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte b) {
        this.f23743e.write(b);
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte[] bArr, int i, int i2) {
        this.f23743e.write(bArr, i, i2);
    }
}
