package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۚؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5137e extends AbstractC7014e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Iterator f11012e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f11013e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f11014e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f11015e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f11016e;

    public C5137e() {
        super(0);
        this.f11014e = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5137e(C16697e c16697e) {
        this();
        this.f11015e = 1;
        this.f11016e = c16697e;
        this.f11012e = c16697e.f32761e.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5137e(Iterator it, InterfaceC11801e interfaceC11801e) {
        this();
        this.f11015e = 0;
        this.f11012e = it;
        this.f11016e = interfaceC11801e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        AbstractC2301e.subscription(this.f11014e != 4);
        int m2467class = AbstractC8703e.m2467class(this.f11014e);
        if (m2467class == 0) {
            return true;
        }
        if (m2467class != 2) {
            this.f11014e = 4;
            switch (this.f11015e) {
                case 0:
                    do {
                        Iterator it = this.f11012e;
                        if (!it.hasNext()) {
                            this.f11014e = 3;
                            next = null;
                            break;
                        } else {
                            next = it.next();
                        }
                    } while (!((InterfaceC11801e) this.f11016e).apply(next));
                default:
                    do {
                        Iterator it2 = this.f11012e;
                        if (!it2.hasNext()) {
                            this.f11014e = 3;
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                        }
                    } while (!((C16697e) this.f11016e).f32760e.contains(next));
            }
            this.f11013e = next;
            if (this.f11014e != 3) {
                this.f11014e = 1;
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC7014e, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f11014e = 2;
        Object obj = this.f11013e;
        this.f11013e = null;
        return obj;
    }
}
