package defpackage;

import java.util.AbstractMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12420e extends AbstractC6080e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C7618e f24838e;

    public C12420e(C7618e c7618e) {
        this.f24838e = c7618e;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        C7618e c7618e = this.f24838e;
        AbstractC7023e.smaato(i, c7618e.f15489e);
        Object[] objArr = c7618e.f15491e;
        int i2 = i + i;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24838e.f15489e;
    }
}
