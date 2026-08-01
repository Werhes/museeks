package defpackage;

import android.os.Bundle;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗ٘ٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4958e implements InterfaceC10645e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f10520e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC4342e f10521e;

    public C4958e(InterfaceC4342e interfaceC4342e, int i) {
        this.f10521e = interfaceC4342e;
        this.f10520e = i;
    }

    @Override // defpackage.InterfaceC10645e
    public final void ad() {
        AbstractC0223e.metrica(this.f10521e);
    }

    @Override // defpackage.InterfaceC10645e
    public final void adcel(int i, C9759e c9759e) {
        this.f10521e.mo1624e(i, c9759e.vip());
    }

    @Override // defpackage.InterfaceC10645e
    public final void advert(int i, int i2, int i3) {
        this.f10521e.advert(i, i2, i3);
    }

    @Override // defpackage.InterfaceC10645e
    public final void amazon(int i, C12693e c12693e, boolean z, boolean z2, int i2) {
        this.f10521e.mo1615e(i, c12693e.ad(z, z2).metrica(i2));
    }

    @Override // defpackage.InterfaceC10645e
    public final void appmetrica(int i, C11753e c11753e, String str) {
        this.f10521e.mo1622e(i, 10, c11753e == null ? null : c11753e.vip(), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r2 != 4) goto L26;
     */
    @Override // defpackage.InterfaceC10645e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void billing(int r9, defpackage.C8802e r10) {
        /*
            r8 = this;
            java.lang.String r0 = defpackage.C8802e.adcel
            java.lang.Object r1 = r10.metrica
            int r2 = r10.license
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = defpackage.C8802e.billing
            int r5 = r10.ad
            r3.putInt(r4, r5)
            java.lang.String r4 = defpackage.C8802e.yandex
            long r5 = r10.vip
            r3.putLong(r4, r5)
            eِۣٔ r4 = r10.appmetrica
            if (r4 == 0) goto L26
            java.lang.String r5 = defpackage.C8802e.startapp
            android.os.Bundle r4 = r4.vip()
            r3.putBundle(r5, r4)
        L26:
            eؗ٘ۘ r10 = r10.purchase
            if (r10 == 0) goto L33
            java.lang.String r4 = defpackage.C8802e.advert
            android.os.Bundle r10 = r10.vip()
            r3.putBundle(r4, r10)
        L33:
            java.lang.String r10 = defpackage.C8802e.mopub
            r3.putInt(r10, r2)
            if (r1 != 0) goto L3b
            goto L7e
        L3b:
            r10 = 1
            if (r2 == r10) goto L84
            r10 = 2
            r4 = 0
            int r5 = r8.f10520e
            if (r2 == r10) goto L75
            r10 = 3
            if (r2 == r10) goto L4b
            r10 = 4
            if (r2 == r10) goto L84
            goto L7e
        L4b:
            eؚٖۙ r10 = new eؚٖۙ
            e٘ؑٔ r1 = (defpackage.AbstractC17475e) r1
            eْٗۤ r2 = defpackage.AbstractC17475e.Signature()
            r6 = r4
        L54:
            int r7 = r1.size()
            if (r6 >= r7) goto L6a
            java.lang.Object r7 = r1.get(r6)
            eِؓٝ r7 = (defpackage.C1962e) r7
            android.os.Bundle r7 = r7.metrica(r5, r4)
            r2.metrica(r7)
            int r6 = r6 + 1
            goto L54
        L6a:
            eؒۢۗ r1 = r2.billing()
            r10.<init>(r1)
            r3.putBinder(r0, r10)
            goto L7e
        L75:
            eِؓٝ r1 = (defpackage.C1962e) r1
            android.os.Bundle r10 = r1.metrica(r5, r4)
            r3.putBundle(r0, r10)
        L7e:
            eؖۙؗ r10 = r8.f10521e
            r10.mo1621e(r9, r3)
            return
        L84:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4958e.billing(int, eٌٛ٘):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != C4958e.class) {
            return false;
        }
        return Objects.equals(this.f10521e.asBinder(), ((C4958e) obj).f10521e.asBinder());
    }

    public final int hashCode() {
        return Objects.hash(this.f10521e.asBinder());
    }

    @Override // defpackage.InterfaceC10645e
    public final void metrica(int i) {
        this.f10521e.metrica(i);
    }

    @Override // defpackage.InterfaceC10645e
    public final void mopub(int i, C11753e c11753e, String str) {
        this.f10521e.mo1623e(i, 0, c11753e == null ? null : c11753e.vip(), str);
    }

    @Override // defpackage.InterfaceC10645e
    public final void purchase(int i, List list) {
        C13304e Signature = AbstractC17475e.Signature();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Signature.metrica(((C11161e) list.get(i2)).loadAd(this.f10520e));
        }
        this.f10521e.premium(i, Signature.billing());
    }

    @Override // defpackage.InterfaceC10645e
    public final void smaato(int i, C2411e c2411e, C5298e c5298e, boolean z, boolean z2) {
        Bundle pro;
        int i2 = this.f10520e;
        AbstractC2301e.subscription(i2 != 0);
        boolean z3 = z || !c5298e.ad(17);
        boolean z4 = z2 || !c5298e.ad(30);
        InterfaceC4342e interfaceC4342e = this.f10521e;
        if (i2 < 2) {
            interfaceC4342e.mo1617e(i, c2411e.admob(c5298e, z, true).pro(i2), z3);
            return;
        }
        C2411e admob = c2411e.admob(c5298e, z, z2);
        if (interfaceC4342e instanceof BinderC4329e) {
            pro = new Bundle();
            pro.putBinder(C2411e.f6155continue, new BinderC11434e(admob));
        } else {
            pro = admob.pro(i2);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(C1120e.license, z3);
        bundle.putBoolean(C1120e.appmetrica, z4);
        interfaceC4342e.mo1618e(i, pro, bundle);
    }

    @Override // defpackage.InterfaceC10645e
    public final void startapp(int i, C5298e c5298e) {
        this.f10521e.mo1619e(i, c5298e.metrica());
    }

    @Override // defpackage.InterfaceC10645e
    public final void vip(int i, C11858e c11858e) {
        this.f10521e.mo1620e(i, c11858e.vip(), Bundle.EMPTY);
    }
}
