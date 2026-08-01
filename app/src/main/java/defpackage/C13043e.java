package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C13043e extends AbstractC0338e implements InterfaceC12132e, InterfaceC8185e {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C13043e f25968e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final boolean f25969e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final boolean f25970e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final AbstractC1186e f25971e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final boolean f25972e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f25973e;

    public C13043e(InterfaceC6647e interfaceC6647e, C13043e c13043e, int i, InterfaceC2460e interfaceC2460e, C0520e c0520e, AbstractC1186e abstractC1186e, boolean z, boolean z2, boolean z3, AbstractC1186e abstractC1186e2, InterfaceC3054e interfaceC3054e) {
        super(interfaceC6647e, interfaceC2460e, c0520e, abstractC1186e, interfaceC3054e);
        this.f25973e = i;
        this.f25970e = z;
        this.f25972e = z2;
        this.f25969e = z3;
        this.f25971e = abstractC1186e2;
        this.f25968e = c13043e == null ? this : c13043e;
    }

    @Override // defpackage.InterfaceC0091e
    public final C8268e advert() {
        return AbstractC6050e.purchase;
    }

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final InterfaceC6647e m3523e() {
        return (InterfaceC6647e) super.mo1351switch();
    }

    @Override // defpackage.AbstractC16946e, defpackage.AbstractC2214e, defpackage.InterfaceC15498e
    /* renamed from: eٖؗۘ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C13043e vip() {
        C13043e c13043e = this.f25968e;
        return c13043e == this ? this : c13043e.vip();
    }

    @Override // defpackage.InterfaceC8185e
    /* renamed from: eۣۣٔ */
    public final boolean mo2386e() {
        return false;
    }

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final boolean m3525e() {
        return this.f25970e && ((InterfaceC0390e) ((InterfaceC6647e) super.mo1351switch())).mo334e() != 2;
    }

    /* renamed from: eّٖٗ */
    public C13043e mo2439e(C10133e c10133e, C0520e c0520e, int i) {
        return new C13043e(c10133e, null, i, getAnnotations(), c0520e, ad(), m3525e(), this.f25972e, this.f25969e, this.f25971e, InterfaceC3054e.f7112e);
    }

    @Override // defpackage.InterfaceC8185e
    /* renamed from: eِٗۛ */
    public final /* bridge */ /* synthetic */ AbstractC13656e mo2387e() {
        return null;
    }

    @Override // defpackage.InterfaceC15498e
    /* renamed from: eؘٟ٘ */
    public final Object mo758e(InterfaceC5369e interfaceC5369e, Object obj) {
        return interfaceC5369e.metrica(this, obj);
    }

    @Override // defpackage.InterfaceC6647e
    /* renamed from: finally */
    public final Collection mo337finally() {
        Collection mo337finally = ((InterfaceC6647e) super.mo1351switch()).mo337finally();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(mo337finally, 10));
        Iterator it = mo337finally.iterator();
        while (it.hasNext()) {
            arrayList.add((C13043e) ((InterfaceC6647e) it.next()).mo330e().get(this.f25973e));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC7681e
    public final InterfaceC7573e remoteconfig(C4542e c4542e) {
        if (c4542e.ad.appmetrica()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.AbstractC16946e, defpackage.InterfaceC15498e
    /* renamed from: switch */
    public final InterfaceC15498e mo1351switch() {
        return (InterfaceC6647e) super.mo1351switch();
    }
}
