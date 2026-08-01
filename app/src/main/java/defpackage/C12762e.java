package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12762e extends C14950e implements ListIterator {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C2748e f25536e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12762e(C2748e c2748e) {
        super(c2748e);
        this.f25536e = c2748e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12762e(C2748e c2748e, int i) {
        super(c2748e, ((List) c2748e.f17413e).listIterator(i));
        this.f25536e = c2748e;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C2748e c2748e = this.f25536e;
        boolean isEmpty = c2748e.isEmpty();
        license().add(obj);
        c2748e.f6652e.f4931e++;
        if (isEmpty) {
            c2748e.appmetrica();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return license().hasPrevious();
    }

    public final ListIterator license() {
        vip();
        return (ListIterator) this.f29642e;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return license().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return license().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return license().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        license().set(obj);
    }
}
