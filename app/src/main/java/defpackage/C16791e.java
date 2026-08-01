package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٗؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16791e extends AbstractC0281e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C9706e f32900e;

    public C16791e(C9706e c9706e) {
        this.f32900e = c9706e;
    }

    @Override // defpackage.AbstractC0281e, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f32900e.ad(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f32900e.f19208e;
    }

    @Override // defpackage.AbstractC0281e
    /* renamed from: smaato */
    public final AbstractC7014e iterator() {
        C9706e c9706e = this.f32900e;
        c9706e.getClass();
        return new C3746e(c9706e);
    }
}
