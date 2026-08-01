package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۜؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7467e extends AbstractC4686e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final transient Object f15240e;

    public C7467e(Object obj) {
        super(2);
        this.f15240e = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f15240e.equals(obj);
    }

    @Override // defpackage.AbstractC4686e, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f15240e.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C3246e(this.f15240e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // defpackage.AbstractC10054e
    public final int smaato(Object[] objArr) {
        objArr[0] = this.f15240e;
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.f15240e.toString();
        return AbstractC8647e.ads(new StringBuilder(String.valueOf(obj).length() + 2), "[", obj, "]");
    }
}
