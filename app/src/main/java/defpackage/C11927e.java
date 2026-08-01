package defpackage;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٟۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11927e implements Iterator, InterfaceC16555e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f23909e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23910e = 1;

    public C11927e(C6556e c6556e) {
        AbstractC13502e[] abstractC13502eArr = new AbstractC13502e[8];
        for (int i = 0; i < 8; i++) {
            abstractC13502eArr[i] = new C14862e(this);
        }
        this.f23909e = new C3792e(c6556e, abstractC13502eArr);
    }

    public C11927e(C15515e c15515e) {
        this.f23909e = c15515e.f30650e.iterator();
    }

    public C11927e(Enumeration enumeration) {
        this.f23909e = enumeration;
    }

    public C11927e(Object[] objArr) {
        this.f23909e = new C1630e(1, objArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f23910e) {
            case 0:
                return ((Enumeration) this.f23909e).hasMoreElements();
            case 1:
                return ((C3792e) this.f23909e).f27965e;
            case 2:
                return ((C1630e) this.f23909e).hasNext();
            default:
                return ((Iterator) this.f23909e).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f23910e) {
            case 0:
                return ((Enumeration) this.f23909e).nextElement();
            case 1:
                return (Map.Entry) ((C3792e) this.f23909e).next();
            case 2:
                return ((C1630e) this.f23909e).next();
            default:
                return (AbstractC4517e) ((Iterator) this.f23909e).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f23910e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ((C3792e) this.f23909e).remove();
                return;
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
