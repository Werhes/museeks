package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8077e implements Iterator, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C1356e f16381e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f16382e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public String f16383e;

    public C8077e(C1356e c1356e) {
        this.f16381e = c1356e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f16383e == null && !this.f16382e) {
            String readLine = ((BufferedReader) this.f16381e.vip).readLine();
            this.f16383e = readLine;
            if (readLine == null) {
                this.f16382e = true;
            }
        }
        return this.f16383e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f16383e;
        this.f16383e = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
