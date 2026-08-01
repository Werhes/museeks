package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9848e implements Iterable, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f19442e = 1;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final char f19443e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final char f19444e;

    public AbstractC9848e(char c, char c2) {
        this.f19444e = c;
        this.f19443e = (char) AbstractC4340e.license(c, c2, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C16290e(this.f19444e, this.f19443e, this.f19442e);
    }
}
