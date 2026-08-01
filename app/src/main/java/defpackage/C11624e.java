package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11624e extends AbstractC7014e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public AbstractC7014e f23328e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C5414e f23329e;

    public C11624e(C3431e c3431e) {
        super(4);
        this.f23329e = new C5414e(c3431e);
        this.f23328e = vip();
    }

    @Override // defpackage.AbstractC7014e
    public final byte ad() {
        AbstractC7014e abstractC7014e = this.f23328e;
        if (abstractC7014e == null) {
            throw new NoSuchElementException();
        }
        byte ad = abstractC7014e.ad();
        if (!this.f23328e.hasNext()) {
            this.f23328e = vip();
        }
        return ad;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23328e != null;
    }

    public final C15891e vip() {
        C5414e c5414e = this.f23329e;
        if (c5414e.hasNext()) {
            return new C15891e(c5414e.vip());
        }
        return null;
    }
}
