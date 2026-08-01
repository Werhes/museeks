package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٙۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12562e extends AbstractC15349e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C6272e f25154e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C7176e f25155e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f25156e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final List f25157e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C3669e f25158e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final AbstractC13445e f25159e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final InterfaceC9646e f25160e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C11709e f25153e = new C11709e(AbstractC4972e.mopub, C0520e.appmetrica("Function"));

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C11709e f25152e = new C11709e(AbstractC4972e.startapp, C0520e.appmetrica("KFunction"));

    /* JADX WARN: Type inference failed for: r5v2, types: [eۣ٘ۥ, eؚٕٚ] */
    public C12562e(C6272e c6272e, C4718e c4718e, AbstractC13445e abstractC13445e, int i) {
        super(c6272e, abstractC13445e.ad(i));
        this.f25154e = c6272e;
        this.f25160e = c4718e;
        this.f25159e = abstractC13445e;
        this.f25156e = i;
        this.f25158e = new C3669e(this);
        this.f25155e = new AbstractC18103e(c6272e, this);
        ArrayList arrayList = new ArrayList();
        C11241e c11241e = new C11241e(1, i, 1);
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(c11241e, 10));
        Iterator it = c11241e.iterator();
        while (true) {
            C3296e c3296e = (C3296e) it;
            if (!c3296e.f7452e) {
                break;
            }
            arrayList.add(C1428e.m606e(this, 2, C0520e.appmetrica("P" + c3296e.nextInt()), arrayList.size(), this.f25154e));
            arrayList2.add(Unit.INSTANCE);
        }
        arrayList.add(C1428e.m606e(this, 3, C0520e.appmetrica("R"), arrayList.size(), this.f25154e));
        this.f25157e = AbstractC13480e.m3575continue(arrayList);
        AbstractC13445e abstractC13445e2 = this.f25159e;
        if (abstractC13445e2.equals(C7692e.metrica) || abstractC13445e2.equals(C2597e.metrica) || abstractC13445e2.equals(C0930e.metrica)) {
            return;
        }
        abstractC13445e2.equals(C2770e.metrica);
    }

    @Override // defpackage.InterfaceC7573e
    public final InterfaceC3054e adcel() {
        return InterfaceC3054e.f7112e;
    }

    @Override // defpackage.InterfaceC5052e, defpackage.InterfaceC17577e, defpackage.InterfaceC0091e
    public final C8268e advert() {
        return AbstractC6050e.appmetrica;
    }

    @Override // defpackage.InterfaceC5052e, defpackage.InterfaceC17577e
    /* renamed from: extends */
    public final int mo1718extends() {
        return 4;
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
    public final /* bridge */ /* synthetic */ C7283e mo1722e() {
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
        return 2;
    }

    @Override // defpackage.InterfaceC17577e
    /* renamed from: eٌٕۗ */
    public final boolean mo1941e() {
        return false;
    }

    @Override // defpackage.InterfaceC17577e
    /* renamed from: eُِؕ */
    public final boolean mo1942e() {
        return false;
    }

    @Override // defpackage.InterfaceC17577e
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
        return this.f25157e;
    }

    @Override // defpackage.InterfaceC15633e
    public final InterfaceC2460e getAnnotations() {
        return C4590e.f9885e;
    }

    @Override // defpackage.InterfaceC4077e
    /* renamed from: goto */
    public final InterfaceC5021e mo1459goto() {
        return this.f25158e;
    }

    @Override // defpackage.InterfaceC2978e
    /* renamed from: instanceof */
    public final boolean mo1222instanceof() {
        return false;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: private */
    public final boolean mo1731private() {
        return false;
    }

    @Override // defpackage.AbstractC17645e
    public final InterfaceC8528e purchase(C13520e c13520e) {
        return this.f25155e;
    }

    @Override // defpackage.InterfaceC15498e
    /* renamed from: switch */
    public final InterfaceC15498e mo1351switch() {
        return this.f25160e;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: throw */
    public final /* bridge */ /* synthetic */ Collection mo1732throw() {
        return C13664e.f27089e;
    }

    public final String toString() {
        return getName().vip();
    }

    @Override // defpackage.InterfaceC5052e
    public final boolean yandex() {
        return false;
    }
}
