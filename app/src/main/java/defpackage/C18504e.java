package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۦۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18504e implements Iterator, InterfaceC16555e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f36274e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f36275e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f36276e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f36277e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final CharSequence f36278e;

    public C18504e(CharSequence charSequence) {
        this.f36278e = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f36276e;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f36274e < 0) {
            this.f36276e = 2;
            return false;
        }
        CharSequence charSequence = this.f36278e;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.f36275e; i4 < length2; i4++) {
            char charAt = charSequence.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f36276e = 1;
                this.f36274e = i;
                this.f36277e = length;
                return true;
            }
        }
        i = -1;
        this.f36276e = 1;
        this.f36274e = i;
        this.f36277e = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f36276e = 0;
        int i = this.f36277e;
        int i2 = this.f36275e;
        this.f36275e = this.f36274e + i;
        return this.f36278e.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
