package defpackage;

import java.io.OutputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۦّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16644e extends OutputStream {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long f32665e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32666e;

    @Override // java.io.OutputStream
    public final void write(int i) {
        switch (this.f32666e) {
            case 0:
                this.f32665e++;
                return;
            case 1:
                this.f32665e++;
                return;
            default:
                this.f32665e++;
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.f32666e) {
            case 0:
                this.f32665e += bArr.length;
                return;
            case 1:
                this.f32665e += bArr.length;
                return;
            default:
                this.f32665e += bArr.length;
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        int length;
        int i4;
        int length2;
        int i5;
        switch (this.f32666e) {
            case 0:
                if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                this.f32665e += i2;
                return;
            case 1:
                if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i4 = i + i2) > length || i4 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                this.f32665e += i2;
                return;
            default:
                if (i < 0 || i > (length2 = bArr.length) || i2 < 0 || (i5 = i + i2) > length2 || i5 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                this.f32665e += i2;
                return;
        }
    }
}
