package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3449e extends AbstractC1687e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final transient C10502e f7705e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient C14079e f7706e;

    public C3449e(C10502e c10502e, C14079e c14079e) {
        this.f7705e = c10502e;
        this.f7706e = c14079e;
    }

    @Override // defpackage.AbstractC10967e
    public final int appmetrica(Object[] objArr) {
        return this.f7706e.appmetrica(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f7705e.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f7706e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.f7705e.getClass();
        return 1;
    }
}
