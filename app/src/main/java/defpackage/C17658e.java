package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ٘۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17658e implements Iterator {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Iterator f34610e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34611e = 0;

    public /* synthetic */ C17658e() {
    }

    public C17658e(C3276e c3276e) {
        this.f34610e = c3276e.f7428e.keySet().iterator();
    }

    public C17658e(Iterator it) {
        it.getClass();
        this.f34610e = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f34611e) {
            case 0:
                return this.f34610e.hasNext();
            case 1:
                return this.f34610e.hasNext();
            default:
                return this.f34610e.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f34611e) {
            case 0:
                return (String) this.f34610e.next();
            case 1:
                return (String) this.f34610e.next();
            default:
                return ((Map.Entry) this.f34610e.next()).getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f34611e) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException("Remove not supported");
            default:
                this.f34610e.remove();
                return;
        }
    }
}
