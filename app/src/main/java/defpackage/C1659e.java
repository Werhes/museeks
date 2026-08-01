package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؓۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1659e implements Map.Entry, InterfaceC16555e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C6427e f4587e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f4588e;

    public C1659e(C6427e c6427e, int i) {
        this.f4587e = c6427e;
        this.f4588e = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4587e.metrica.metrica(this.f4588e).toString();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return Collections.singletonList(this.f4587e.metrica.purchase(this.f4588e).toString());
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
