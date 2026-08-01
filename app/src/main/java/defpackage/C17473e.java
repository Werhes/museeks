package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَ٘ؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17473e extends AbstractC13695e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ int f34221e = 0;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ArrayList f34222e;

    public C17473e(InputStream inputStream, ArrayList arrayList) {
        super(inputStream);
        this.f34222e = arrayList;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f34222e.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            try {
                throw null;
                break;
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            Iterator it = this.f34222e.iterator();
            if (it.hasNext()) {
                throw AbstractC5087e.m1747goto(it);
            }
        }
        return read;
    }

    @Override // defpackage.AbstractC13695e, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        int read = ((FilterInputStream) this).in.read(bArr);
        if (read != -1) {
            Iterator it = this.f34222e.iterator();
            if (it.hasNext()) {
                throw AbstractC5087e.m1747goto(it);
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read != -1) {
            Iterator it = this.f34222e.iterator();
            if (it.hasNext()) {
                throw AbstractC5087e.m1747goto(it);
            }
        }
        return read;
    }
}
