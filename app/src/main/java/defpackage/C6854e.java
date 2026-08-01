package defpackage;

import java.io.ByteArrayOutputStream;

/* renamed from: eؚؑۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6854e extends ByteArrayOutputStream {
    public final void ad(byte[] bArr, int i) {
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArr, i, size());
    }

    @Override // java.io.ByteArrayOutputStream
    public final void reset() {
        super.reset();
        AbstractC12442e.metrica(((ByteArrayOutputStream) this).buf);
    }
}
