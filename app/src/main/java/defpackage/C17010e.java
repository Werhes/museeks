package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٔۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17010e extends AbstractC4354e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C2859e f33319e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17010e(C2859e c2859e) {
        super(0);
        this.f33319e = c2859e;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        C2859e c2859e = this.f33319e;
        AbstractC4608e.appmetrica(i, c2859e.f6823e);
        Object[] objArr = c2859e.f6824e;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33319e.f6823e;
    }
}
