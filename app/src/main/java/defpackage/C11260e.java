package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11260e extends AbstractC4362e {
    public final C12816e adcel;
    public final InterfaceC9646e billing;
    public final String startapp;
    public final C14882e yandex;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C11260e(defpackage.InterfaceC9646e r11, defpackage.C14882e r12, defpackage.InterfaceC11824e r13, defpackage.AbstractC8470e r14, defpackage.C11761e r15, defpackage.C18277e r16, java.lang.String r17, kotlin.jvm.functions.Function0 r18) {
        /*
            r10 = this;
            eٗۘۘ r4 = new eٗۘۘ
            eؕٞۙ r0 = r12.f29484e
            r4.<init>(r0)
            eؗۨؖ r0 = defpackage.C5311e.vip
            eْٟؔ r0 = r12.f29481e
            eؗۨؖ r5 = defpackage.AbstractC2206e.vip(r0)
            r16.getClass()
            eؗ٘ٔ r0 = new eؗ٘ٔ
            r8 = 0
            eْۨٝ r9 = defpackage.C13664e.f27089e
            r3 = r11
            r2 = r13
            r6 = r14
            r7 = r15
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.List r2 = r12.f29482e
            java.util.List r3 = r12.f29477e
            java.util.List r4 = r12.f29485e
            r5 = r18
            r1 = r0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r10.billing = r11
            r10.yandex = r12
            r1 = r17
            r10.startapp = r1
            r1 = r11
            eۣٔۙ r1 = (defpackage.AbstractC14941e) r1
            eّۡۜ r1 = r1.f29618e
            r10.adcel = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11260e.<init>(eٍؚٟ, eٟٔٛ, eِٚ, eٌٜؔ, eِٕٔ, eٟٓ, java.lang.String, kotlin.jvm.functions.Function0):void");
    }

    @Override // defpackage.AbstractC4362e
    public final Set Signature() {
        return C3295e.f7451e;
    }

    @Override // defpackage.AbstractC4362e
    public final boolean admob(C0520e c0520e) {
        if (super.admob(c0520e)) {
            return true;
        }
        Iterable iterable = (Iterable) ((C18277e) this.vip.f10517e).adcel;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((InterfaceC11605e) it.next()).metrica(this.adcel, c0520e)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC4362e
    public final C11709e advert(C0520e c0520e) {
        return new C11709e(this.adcel, c0520e);
    }

    @Override // defpackage.AbstractC4362e
    public final Set amazon() {
        return C3295e.f7451e;
    }

    @Override // defpackage.AbstractC4362e, defpackage.AbstractC8530e, defpackage.InterfaceC7192e
    public final InterfaceC4077e appmetrica(C0520e c0520e, EnumC2192e enumC2192e) {
        Object obj = this.vip.f10517e;
        String str = ((AbstractC14941e) this.billing).f29618e.ad.ad;
        c0520e.vip();
        return super.appmetrica(c0520e, enumC2192e);
    }

    @Override // defpackage.AbstractC4362e
    public final Set loadAd() {
        return C3295e.f7451e;
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC7192e
    public final Collection metrica(C4942e c4942e, Function1 function1) {
        List startapp = startapp(c4942e, function1);
        Iterable iterable = (Iterable) ((C18277e) this.vip.f10517e).adcel;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC13480e.inmobi(arrayList, ((InterfaceC11605e) it.next()).vip(this.adcel));
        }
        return AbstractC13480e.m3584final(startapp, arrayList);
    }

    public final String toString() {
        return this.startapp;
    }

    @Override // defpackage.AbstractC4362e
    public final void yandex(ArrayList arrayList) {
    }
}
