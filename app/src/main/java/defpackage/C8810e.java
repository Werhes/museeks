package defpackage;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8810e extends AbstractC9053e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ int f17721e = 0;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ArrayList f17722e;

    public C8810e(OutputStream outputStream, ArrayList arrayList) {
        super(outputStream);
        this.f17722e = arrayList;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f17722e.iterator();
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

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        ((FilterOutputStream) this).out.write(i);
        Iterator it = this.f17722e.iterator();
        if (it.hasNext()) {
            throw AbstractC5087e.m1747goto(it);
        }
    }

    @Override // defpackage.AbstractC9053e, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        ((FilterOutputStream) this).out.write(bArr);
        Iterator it = this.f17722e.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            int length = bArr.length;
            throw null;
        }
    }

    @Override // defpackage.AbstractC9053e, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        Iterator it = this.f17722e.iterator();
        if (it.hasNext()) {
            throw AbstractC5087e.m1747goto(it);
        }
    }
}
