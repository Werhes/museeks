package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؚْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13085e extends AbstractC17557e implements RandomAccess {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f26020e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f26021e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC17557e f26022e;

    public C13085e(AbstractC17557e abstractC17557e, int i, int i2) {
        this.f26022e = abstractC17557e;
        this.f26021e = i;
        AbstractC17140e.license(i, i2, abstractC17557e.subs());
        this.f26020e = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f26020e;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "index: ", ", size: "));
        }
        return this.f26022e.get(this.f26021e + i);
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final List subList(int i, int i2) {
        AbstractC17140e.license(i, i2, this.f26020e);
        int i3 = this.f26021e;
        return new C13085e(this.f26022e, i + i3, i3 + i2);
    }

    @Override // defpackage.AbstractC7674e
    public final int subs() {
        return this.f26020e;
    }
}
