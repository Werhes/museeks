package defpackage;

import java.io.FilterInputStream;

/* renamed from: eؚٓ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14280e extends FilterInputStream {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f28248e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28249e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14280e(FilterInputStream filterInputStream, Object obj, int i) {
        super(filterInputStream);
        this.f28249e = i;
        this.f28248e = obj;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        switch (this.f28249e) {
            case 0:
                int read = ((FilterInputStream) this).in.read();
                if (read >= 0) {
                    ((C12013e) this.f28248e).update((byte) read);
                }
                return read;
            default:
                int read2 = ((FilterInputStream) this).in.read();
                if (read2 >= 0) {
                    ((C10398e) this.f28248e).update((byte) read2);
                }
                return read2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        switch (this.f28249e) {
            case 0:
                int read = ((FilterInputStream) this).in.read(bArr, i, i2);
                if (read > 0) {
                    ((C12013e) this.f28248e).update(bArr, i, read);
                }
                return read;
            default:
                int read2 = ((FilterInputStream) this).in.read(bArr, i, i2);
                if (read2 >= 0) {
                    ((C10398e) this.f28248e).update(bArr, i, read2);
                }
                return read2;
        }
    }
}
