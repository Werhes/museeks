package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۡؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11322e implements Iterator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Iterator f22723e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Iterator f22724e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f22725e = 1;

    public C11322e(C5273e c5273e, Iterator it, Iterator it2) {
        this.f22724e = it;
        this.f22723e = it2;
    }

    public C11322e(Iterator it, Iterator it2) {
        this.f22724e = it;
        this.f22723e = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f22725e) {
            case 0:
                return this.f22724e.hasNext() || this.f22723e.hasNext();
            default:
                if (this.f22724e.hasNext()) {
                    return true;
                }
                return this.f22723e.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f22725e) {
            case 0:
                Iterator it = this.f22724e;
                return it.hasNext() ? it.next() : this.f22723e.next();
            default:
                Iterator it2 = this.f22724e;
                if (it2.hasNext()) {
                    return new C15547e(((Integer) it2.next()).toString());
                }
                Iterator it3 = this.f22723e;
                if (it3.hasNext()) {
                    return new C15547e((String) it3.next());
                }
                throw new NoSuchElementException();
        }
    }
}
