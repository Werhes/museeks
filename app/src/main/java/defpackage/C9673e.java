package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9673e implements Iterator, InterfaceC16555e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Map.Entry f19165e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f19166e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Iterator f19167e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Map.Entry f19168e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C11952e f19169e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ int f19170e;

    public C9673e(C11952e c11952e, Iterator it, int i) {
        this.f19170e = i;
        this.f19169e = c11952e;
        this.f19167e = it;
        this.f19166e = c11952e.metrica().license;
        ad();
    }

    public final void ad() {
        this.f19168e = this.f19165e;
        Iterator it = this.f19167e;
        this.f19165e = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19165e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f19170e) {
            case 0:
                ad();
                if (this.f19168e != null) {
                    return new C14330e(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.f19165e;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                ad();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.f19165e;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                ad();
                return entry2.getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C11952e c11952e = this.f19169e;
        if (c11952e.metrica().license != this.f19166e) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.f19168e;
        if (entry == null) {
            throw new IllegalStateException();
        }
        c11952e.remove(entry.getKey());
        this.f19168e = null;
        Unit unit = Unit.INSTANCE;
        this.f19166e = c11952e.metrica().license;
    }
}
