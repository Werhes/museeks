package defpackage;

import java.io.InputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؔۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16756e extends InputStream {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C13431e f32844e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f32845e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f32846e;

    public C16756e(C13431e c13431e, C12434e c12434e) {
        this.f32844e = c13431e;
        this.f32846e = c13431e.m3560goto(c12434e.f24874e + 4);
        this.f32845e = c12434e.f24873e;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f32845e == 0) {
            return -1;
        }
        C13431e c13431e = this.f32844e;
        c13431e.f26700e.seek(this.f32846e);
        int read = c13431e.f26700e.read();
        this.f32846e = c13431e.m3560goto(this.f32846e + 1);
        this.f32845e--;
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.f32845e;
        if (i3 <= 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int i4 = this.f32846e;
        C13431e c13431e = this.f32844e;
        c13431e.ads(i4, i, i2, bArr);
        this.f32846e = c13431e.m3560goto(this.f32846e + i2);
        this.f32845e -= i2;
        return i2;
    }
}
