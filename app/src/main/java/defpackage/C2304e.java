package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؔؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2304e extends AbstractC2358e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C13211e f5824e;

    public C2304e(C13211e c13211e) {
        this.f5824e = c13211e;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        C13211e c13211e = this.f5824e;
        AbstractC1596e.yandex(i, c13211e.f26215e);
        Object[] objArr = c13211e.f26217e;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5824e.f26215e;
    }
}
