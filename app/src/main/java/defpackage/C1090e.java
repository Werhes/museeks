package defpackage;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؒۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1090e implements Iterator {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1837e f3623e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Iterator f3627e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ int f3628e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f3625e = null;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Collection f3624e = null;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Iterator f3626e = EnumC2198e.f5589e;

    public C1090e(AbstractC1837e abstractC1837e, int i) {
        this.f3628e = i;
        this.f3623e = abstractC1837e;
        this.f3627e = abstractC1837e.f4930e.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3627e.hasNext() || this.f3626e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f3626e.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f3627e.next();
            this.f3625e = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f3624e = collection;
            this.f3626e = collection.iterator();
        }
        Object obj = this.f3625e;
        Object next = this.f3626e.next();
        switch (this.f3628e) {
            case 0:
                return next;
            default:
                return new C7750e(obj, next);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f3626e.remove();
        Collection collection = this.f3624e;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f3627e.remove();
        }
        AbstractC1837e abstractC1837e = this.f3623e;
        abstractC1837e.f4931e--;
    }
}
