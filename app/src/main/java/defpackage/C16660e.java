package defpackage;

import androidx.car.app.model.Alert;
import java.io.InputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16660e extends C4815e {
    public C16660e(InputStream inputStream) {
        super(inputStream);
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        this.f10263e.mark(Alert.DURATION_SHOW_INDEFINITELY);
    }

    public C16660e(byte[] bArr) {
        super(bArr);
        this.f10263e.mark(Alert.DURATION_SHOW_INDEFINITELY);
    }

    public final void license(long j) {
        int i = this.f10261e;
        if (i > j) {
            this.f10261e = 0;
            this.f10263e.reset();
        } else {
            j -= i;
        }
        ad((int) j);
    }
}
