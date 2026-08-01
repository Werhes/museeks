package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؕۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3294e implements InterfaceC1179e {
    public final int ad;
    public final String metrica;
    public final long vip;

    public C3294e(long j, int i, String str) {
        this.ad = i;
        this.vip = j;
        this.metrica = str;
    }

    @Override // defpackage.InterfaceC1179e
    public final Object ad(List list, C14771e c14771e) {
        C8221e vip = AbstractC1831e.vip();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3637e c3637e = (C3637e) it.next();
            arrayList.add(new C1591e(c3637e.ad, c3637e.vip));
        }
        C5577e c5577e = new C5577e("audio.reorderInPlaylist", C14914e.f29575e);
        c5577e.vip(this.ad, "playlist_id");
        c5577e.metrica(this.vip, "owner_id");
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C1591e c1591e = (C1591e) it2.next();
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(AbstractC12517e.ad(Long.valueOf(c1591e.vip)));
            arrayList3.add(AbstractC12517e.ad(Integer.valueOf(c1591e.ad)));
            arrayList3.add(AbstractC12517e.ad(Integer.valueOf(c1591e.metrica)));
            Unit unit = Unit.INSTANCE;
            arrayList2.add(new C7960e(arrayList3));
        }
        C7960e c7960e = new C7960e(arrayList2);
        C8028e c8028e = AbstractC0232e.license;
        c8028e.getClass();
        c5577e.ad("actions", c8028e.purchase(C7960e.Companion.serializer(), c7960e));
        Object license = vip.license(c5577e, c14771e);
        return license == EnumC2821e.f6782e ? license : Unit.INSTANCE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3294e)) {
            return false;
        }
        C3294e c3294e = (C3294e) obj;
        return this.ad == c3294e.ad && this.vip == c3294e.vip && AbstractC7890e.billing(this.metrica, c3294e.metrica);
    }

    public final int hashCode() {
        int i = this.ad * 31;
        long j = this.vip;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.metrica;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Playlist(id=");
        sb.append(this.ad);
        sb.append(", ownerId=");
        sb.append(this.vip);
        sb.append(", accessKey=");
        return AbstractC4653e.applovin(sb, this.metrica, ')');
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // defpackage.InterfaceC1179e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vip(int r8, int r9, defpackage.AbstractC10731e r10) {
        /*
            r7 = this;
            boolean r8 = r10 instanceof defpackage.C5584e
            if (r8 == 0) goto L14
            r8 = r10
            eؘِؖ r8 = (defpackage.C5584e) r8
            int r0 = r8.f11935e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L14
            int r0 = r0 - r1
            r8.f11935e = r0
        L12:
            r5 = r8
            goto L1a
        L14:
            eؘِؖ r8 = new eؘِؖ
            r8.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r8 = r5.f11934e
            int r10 = r5.f11935e
            r0 = 1
            if (r10 == 0) goto L2f
            if (r10 != r0) goto L27
            defpackage.AbstractC2003e.purchase(r8)
            goto L55
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.AbstractC2003e.purchase(r8)
            r8 = r0
            eًۛ۠ r0 = defpackage.AbstractC1831e.vip()
            java.lang.Long r3 = new java.lang.Long
            long r1 = r7.vip
            r3.<init>(r1)
            java.lang.Integer r4 = new java.lang.Integer
            int r10 = r7.ad
            r4.<init>(r10)
            r5.f11935e = r8
            r2 = 200(0xc8, float:2.8E-43)
            r6 = 16360(0x3fe8, float:2.2925E-41)
            r1 = r9
            java.lang.Object r8 = defpackage.AbstractC1085e.ad(r0, r1, r2, r3, r4, r5, r6)
            eٟؔۙ r9 = defpackage.EnumC2821e.f6782e
            if (r8 != r9) goto L55
            return r9
        L55:
            eٍؒۢ r8 = (defpackage.AbstractC9200e) r8
            java.lang.Object r8 = defpackage.AbstractC3425e.startapp(r8)
            eٗؑ۟ r8 = (defpackage.C16703e) r8
            java.util.List r8 = r8.vip
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3294e.vip(int, int, eُؑ۠):java.lang.Object");
    }
}
