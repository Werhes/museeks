package defpackage;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٓۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13947e extends Writer {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final StringBuilder f27657e = new StringBuilder(128);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f27658e = "FragmentManager";

    public final void ad() {
        StringBuilder sb = this.f27657e;
        if (sb.length() > 0) {
            Log.d(this.f27658e, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ad();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        ad();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                ad();
            } else {
                this.f27657e.append(c);
            }
        }
    }
}
