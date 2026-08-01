package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٜؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7714e extends AbstractC17557e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f15651e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f15652e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC8218e f15653e;

    public C7714e(AbstractC8218e abstractC8218e, int i, int i2) {
        this.f15653e = abstractC8218e;
        this.f15652e = i;
        C7582e.purchase(i, i2, abstractC8218e.subs());
        this.f15651e = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C7582e.license(i, this.f15651e);
        return this.f15653e.get(this.f15652e + i);
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final List subList(int i, int i2) {
        C7582e.purchase(i, i2, this.f15651e);
        int i3 = this.f15652e;
        return new C7714e(this.f15653e, i + i3, i3 + i2);
    }

    @Override // defpackage.AbstractC7674e
    public final int subs() {
        return this.f15651e;
    }
}
