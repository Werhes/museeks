package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِّٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11697e extends AbstractC3757e implements Iterator, InterfaceC16555e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f23525e;

    public C11697e(C1239e c1239e, int i) {
        this.f23525e = i;
        this.f8352e = c1239e;
        this.f8351e = -1;
        this.f8350e = c1239e.f3914e;
        purchase();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f23525e) {
            case 0:
                vip();
                int i = this.f8353e;
                C1239e c1239e = (C1239e) this.f8352e;
                if (i >= c1239e.f3920e) {
                    throw new NoSuchElementException();
                }
                this.f8353e = i + 1;
                this.f8351e = i;
                C2300e c2300e = new C2300e(c1239e, i);
                purchase();
                return c2300e;
            case 1:
                vip();
                int i2 = this.f8353e;
                C1239e c1239e2 = (C1239e) this.f8352e;
                if (i2 >= c1239e2.f3920e) {
                    throw new NoSuchElementException();
                }
                this.f8353e = i2 + 1;
                this.f8351e = i2;
                Object obj = c1239e2.f3918e[i2];
                purchase();
                return obj;
            default:
                vip();
                int i3 = this.f8353e;
                C1239e c1239e3 = (C1239e) this.f8352e;
                if (i3 >= c1239e3.f3920e) {
                    throw new NoSuchElementException();
                }
                this.f8353e = i3 + 1;
                this.f8351e = i3;
                Object obj2 = c1239e3.f3913e[i3];
                purchase();
                return obj2;
        }
    }
}
