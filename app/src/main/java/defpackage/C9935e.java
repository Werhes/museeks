package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؚۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9935e extends AbstractC17475e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C5239e f19635e;

    public C9935e(C5239e c5239e) {
        this.f19635e = c5239e;
    }

    @Override // defpackage.AbstractC0281e
    public final boolean advert() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C5239e c5239e = this.f19635e;
        AbstractC2301e.mopub(i, c5239e.f11147e);
        Object[] objArr = c5239e.f11145e;
        int i2 = i * 2;
        int i3 = c5239e.f11148e;
        Object obj = objArr[i2 + i3];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19635e.f11147e;
    }
}
