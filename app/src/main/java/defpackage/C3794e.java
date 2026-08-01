package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3794e extends AbstractC5877e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f8403e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C11720e f8404e;

    public C3794e(int i, C11720e c11720e) {
        this.f8404e = c11720e;
        this.f8403e = i;
    }

    @Override // defpackage.AbstractC5877e
    public final int appmetrica() {
        return 1;
    }

    @Override // defpackage.AbstractC5877e
    public final void billing(int i, C11720e c11720e) {
        throw new IllegalStateException();
    }

    @Override // defpackage.AbstractC5877e
    public final Object get(int i) {
        if (i == this.f8403e) {
            return this.f8404e;
        }
        return null;
    }

    @Override // defpackage.AbstractC5877e, java.lang.Iterable
    public final Iterator iterator() {
        return new C4109e(2, this);
    }
}
