package defpackage;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَّۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12403e extends AbstractSet {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C12169e f24835e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f24836e;

    public C12403e(C12169e c12169e, int i) {
        this.f24835e = c12169e;
        this.f24836e = i;
    }

    public final int appmetrica() {
        int i = this.f24836e;
        if (i == -1) {
            return 0;
        }
        return this.f24835e.f24465e[i];
    }

    public final int billing() {
        return this.f24835e.f24465e[this.f24836e + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.f24835e.f24467e, appmetrica(), billing(), obj, this.f24836e == -1 ? C12169e.f24462e : C14787e.vip) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C10661e(2, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return billing() - appmetrica();
    }
}
