package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٟۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5859e extends AbstractC1075e implements Serializable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C8680e f12399e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f12400e;

    public C5859e(Object obj, C8680e c8680e) {
        super(false, 1);
        this.f12400e = obj;
        this.f12399e = c8680e;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12400e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12399e;
    }

    @Override // defpackage.AbstractC1075e, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
