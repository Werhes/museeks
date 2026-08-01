package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15513e implements InterfaceC1179e {
    public static final C15513e ad = new Object();

    @Override // defpackage.InterfaceC1179e
    public final Object ad(List list, C14771e c14771e) {
        C8221e vip = AbstractC1831e.vip();
        C5577e c5577e = new C5577e("execute", C6114e.f12858e);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3637e c3637e = (C3637e) it.next();
            C8167e c8167e = new C8167e(0);
            c8167e.ad(c3637e.ad, "audio_id");
            c8167e.vip(c3637e.vip);
            Unit unit = Unit.INSTANCE;
            arrayList.add(new C12309e("audio.delete", c8167e, 8));
        }
        arrayList.add(new C12916e(28, new C5401e(1, 18, (byte) 0)));
        Unit unit2 = Unit.INSTANCE;
        c5577e.ad("code", AbstractC13480e.m3608try(arrayList, "\n\n", null, null, null, 62));
        Object license = vip.license(c5577e, c14771e);
        return license == EnumC2821e.f6782e ? license : Unit.INSTANCE;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C15513e);
    }

    public final int hashCode() {
        return -1570225454;
    }

    public final String toString() {
        return "Library";
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
            boolean r8 = r10 instanceof defpackage.C17869e
            if (r8 == 0) goto L14
            r8 = r10
            eٜ٘ r8 = (defpackage.C17869e) r8
            int r0 = r8.f35052e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L14
            int r0 = r0 - r1
            r8.f35052e = r0
        L12:
            r5 = r8
            goto L1a
        L14:
            eٜ٘ r8 = new eٜ٘
            r8.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r8 = r5.f35051e
            int r10 = r5.f35052e
            r0 = 1
            if (r10 == 0) goto L2f
            if (r10 != r0) goto L27
            defpackage.AbstractC2003e.purchase(r8)
            goto L57
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.AbstractC2003e.purchase(r8)
            r8 = r0
            eًۛ۠ r0 = defpackage.AbstractC1831e.vip()
            eًۛ۠ r10 = defpackage.AbstractC1831e.vip()
            java.lang.Object r10 = r10.billing
            eۤۤ r10 = (defpackage.C18479e) r10
            long r1 = r10.ad
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r1)
            r5.f35052e = r8
            r2 = 1000(0x3e8, float:1.401E-42)
            r4 = 0
            r6 = 16376(0x3ff8, float:2.2948E-41)
            r1 = r9
            java.lang.Object r8 = defpackage.AbstractC1085e.ad(r0, r1, r2, r3, r4, r5, r6)
            eٟؔۙ r9 = defpackage.EnumC2821e.f6782e
            if (r8 != r9) goto L57
            return r9
        L57:
            eٍؒۢ r8 = (defpackage.AbstractC9200e) r8
            java.lang.Object r8 = defpackage.AbstractC3425e.startapp(r8)
            eٗؑ۟ r8 = (defpackage.C16703e) r8
            java.util.List r8 = r8.vip
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15513e.vip(int, int, eُؑ۠):java.lang.Object");
    }
}
