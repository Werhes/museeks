package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۣؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5229e extends AbstractC17557e implements InterfaceC8346e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f11124e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f11125e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC11110e f11126e;

    public C5229e(AbstractC11110e abstractC11110e, int i, int i2) {
        this.f11126e = abstractC11110e;
        this.f11125e = i;
        AbstractC6494e.purchase(i, i2, abstractC11110e.subs());
        this.f11124e = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC6494e.license(i, this.f11124e);
        return this.f11126e.get(this.f11125e + i);
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final List subList(int i, int i2) {
        AbstractC6494e.purchase(i, i2, this.f11124e);
        int i3 = this.f11125e;
        return new C5229e(this.f11126e, i + i3, i3 + i2);
    }

    @Override // defpackage.AbstractC7674e
    public final int subs() {
        return this.f11124e;
    }
}
