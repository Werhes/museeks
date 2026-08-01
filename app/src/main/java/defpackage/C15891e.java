package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؐؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15891e extends AbstractC7014e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f31327e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f31328e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC13532e f31329e;

    public C15891e(AbstractC13532e abstractC13532e) {
        super(4);
        this.f31329e = abstractC13532e;
        this.f31328e = 0;
        this.f31327e = abstractC13532e.startapp();
    }

    @Override // defpackage.AbstractC7014e
    public final byte ad() {
        int i = this.f31328e;
        if (i >= this.f31327e) {
            throw new NoSuchElementException();
        }
        this.f31328e = i + 1;
        return this.f31329e.billing(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31328e < this.f31327e;
    }
}
