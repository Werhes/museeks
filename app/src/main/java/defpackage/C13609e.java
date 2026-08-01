package defpackage;

import java.util.LinkedList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۤٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13609e implements InterfaceC14230e {
    public final C13583e ad;
    public InterfaceC7865e license;
    public final C8591e vip;
    public final C17651e metrica = AbstractC12751e.ad();
    public final LinkedList appmetrica = new LinkedList();

    public C13609e(C13583e c13583e, C8591e c8591e) {
        this.ad = c13583e;
        this.vip = c8591e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.C13609e r4, defpackage.AbstractC14938e r5, defpackage.InterfaceC7865e r6, defpackage.AbstractC10731e r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof defpackage.C15635e
            if (r0 == 0) goto L16
            r0 = r7
            eٕٟؗ r0 = (defpackage.C15635e) r0
            int r1 = r0.f30832e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f30832e = r1
            goto L1b
        L16:
            eٕٟؗ r0 = new eٕٟؗ
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.f30831e
            int r1 = r0.f30832e
            r2 = 1
            java.lang.String r3 = "CXCP"
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r7)
            goto L61
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            defpackage.AbstractC2003e.purchase(r7)
            boolean r7 = defpackage.AbstractC9464e.smaato(r3)
            if (r7 == 0) goto L54
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "StillCaptureRequestControl: submitting "
            r7.<init>(r1)
            r7.append(r5)
            java.lang.String r5 = " at "
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
            android.util.Log.d(r3, r5)
        L54:
            eْۢۙ r4 = r4.ad
            r0.f30832e = r2
            java.lang.Object r7 = r4.ad(r0)
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r7 != r4) goto L61
            return r4
        L61:
            java.lang.Number r7 = (java.lang.Number) r7
            r7.intValue()
            boolean r4 = defpackage.AbstractC9464e.smaato(r3)
            if (r4 == 0) goto L71
            java.lang.String r4 = "StillCaptureRequestControl: Issuing single capture"
            android.util.Log.d(r3, r4)
        L71:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13609e.ad(eْۤٗ, eٔۙٗ, eًُۖ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC14230e
    public final void reset() {
        AbstractC5336e.purchase(this.vip.appmetrica, null, 0, new C2122e(this, (InterfaceC5083e) null, 24), 3);
    }

    @Override // defpackage.InterfaceC14230e
    public final void vip(InterfaceC7865e interfaceC7865e) {
        this.license = interfaceC7865e;
        AbstractC5336e.purchase(this.vip.appmetrica, null, 0, new C3472e(this, null), 3);
    }
}
