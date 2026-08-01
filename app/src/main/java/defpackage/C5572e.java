package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5572e extends AbstractC3392e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final ArrayList f11917e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C2886e f11918e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f11919e;

    public C5572e(C6272e c6272e, InterfaceC17815e interfaceC17815e, C0520e c0520e, boolean z, int i) {
        super(c6272e, interfaceC17815e, c0520e, InterfaceC3054e.f7112e);
        this.f11919e = z;
        C15926e admob = AbstractC3062e.admob(0, i);
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(admob, 10));
        Iterator it = admob.iterator();
        while (true) {
            C3296e c3296e = (C3296e) it;
            if (!c3296e.f7452e) {
                this.f11917e = arrayList;
                List purchase = AbstractC8439e.purchase(this);
                int i2 = AbstractC2876e.ad;
                this.f11918e = new C2886e(this, purchase, Collections.singleton(AbstractC14300e.metrica(this).amazon().appmetrica()), c6272e);
                return;
            }
            int nextInt = c3296e.nextInt();
            arrayList.add(C1428e.m606e(this, 1, C0520e.appmetrica("T" + nextInt), nextInt, c6272e));
        }
    }

    @Override // defpackage.InterfaceC5052e, defpackage.InterfaceC17577e, defpackage.InterfaceC0091e
    public final C8268e advert() {
        return AbstractC6050e.appmetrica;
    }

    @Override // defpackage.InterfaceC5052e, defpackage.InterfaceC17577e
    /* renamed from: extends */
    public final int mo1718extends() {
        return 1;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: eؑ۠ۖ */
    public final /* bridge */ /* synthetic */ InterfaceC8528e mo1719e() {
        return C9494e.vip;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: eؘؓؖ */
    public final boolean mo1720e() {
        return false;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: eؙؐ٘ */
    public final C7283e mo1722e() {
        return null;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: eؙۛ۠ */
    public final boolean mo1723e() {
        return false;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: eًؚؔ */
    public final int mo1724e() {
        return 1;
    }

    @Override // defpackage.InterfaceC17577e
    /* renamed from: eٌٕۗ, reason: contains not printable characters */
    public final boolean mo1941e() {
        return false;
    }

    @Override // defpackage.InterfaceC17577e
    /* renamed from: eُِؕ, reason: contains not printable characters */
    public final boolean mo1942e() {
        return false;
    }

    @Override // defpackage.AbstractC3392e, defpackage.InterfaceC17577e
    /* renamed from: eْٗۚ */
    public final boolean mo466e() {
        return false;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: eًٖٕ */
    public final AbstractC12421e mo1728e() {
        return null;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: eِٜ٘ */
    public final boolean mo1729e() {
        return false;
    }

    @Override // defpackage.InterfaceC5052e, defpackage.InterfaceC2978e
    /* renamed from: e۠۟ */
    public final List mo1221e() {
        return this.f11917e;
    }

    @Override // defpackage.InterfaceC15633e
    public final InterfaceC2460e getAnnotations() {
        return C4590e.f9885e;
    }

    @Override // defpackage.InterfaceC4077e
    /* renamed from: goto */
    public final InterfaceC5021e mo1459goto() {
        return this.f11918e;
    }

    @Override // defpackage.InterfaceC2978e
    /* renamed from: instanceof */
    public final boolean mo1222instanceof() {
        return this.f11919e;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: private */
    public final boolean mo1731private() {
        return false;
    }

    @Override // defpackage.AbstractC17645e
    public final /* bridge */ /* synthetic */ InterfaceC8528e purchase(C13520e c13520e) {
        return C9494e.vip;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: throw */
    public final Collection mo1732throw() {
        return C3295e.f7451e;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // defpackage.InterfaceC5052e
    public final boolean yandex() {
        return false;
    }
}
