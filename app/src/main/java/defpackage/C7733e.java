package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7733e extends AbstractC8718e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C11551e f15703e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7733e(C11551e c11551e) {
        super(2);
        this.f15703e = c11551e;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        C11551e c11551e = this.f15703e;
        AbstractC0259e.billing(i, c11551e.f23193e);
        Object[] objArr = c11551e.f23192e;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15703e.f23193e;
    }
}
