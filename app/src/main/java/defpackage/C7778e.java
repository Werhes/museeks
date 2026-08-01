package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7778e implements InterfaceC16460e, Iterable, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f15764e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f15765e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C18516e f15766e;

    public C7778e(C18516e c18516e, int i, int i2) {
        this.f15766e = c18516e;
        this.f15765e = i;
        this.f15764e = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7778e)) {
            return false;
        }
        C7778e c7778e = (C7778e) obj;
        return c7778e.f15765e == this.f15765e && c7778e.f15764e == this.f15764e && AbstractC7890e.billing(c7778e.f15766e, this.f15766e);
    }

    public final int hashCode() {
        return (this.f15766e.hashCode() * 31) + this.f15765e;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C18516e c18516e = this.f15766e;
        if (c18516e.f36305e != this.f15764e) {
            AbstractC2855e.billing();
        }
        int i = this.f15765e;
        c18516e.smaato(i);
        return new C16343e(c18516e, i + 1, c18516e.f36309e[(i * 5) + 3] + i);
    }
}
