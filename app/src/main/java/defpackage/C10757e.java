package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eُؓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10757e implements InterfaceC16793e, InterfaceC17992e, InterfaceC1940e {
    public static final C0599e Companion = new Object();
    public final String ad;
    public final String vip;

    public C10757e() {
        C14027e.ad.getClass();
        this.ad = C14027e.license();
        this.vip = "cps_manual_library";
    }

    public /* synthetic */ C10757e(String str, int i, String str2) {
        if ((i & 1) == 0) {
            C14027e.ad.getClass();
            str = C14027e.license();
        }
        this.ad = str;
        if ((i & 2) == 0) {
            this.vip = "cps_manual_library";
        } else {
            this.vip = str2;
        }
    }

    @Override // defpackage.InterfaceC1686e
    public final String billing() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10757e) && AbstractC7890e.billing(this.ad, ((C10757e) obj).ad);
    }

    @Override // defpackage.InterfaceC1686e
    public final String getId() {
        return this.vip;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[LOOP:0: B:11:0x004f->B:13:0x0055, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // defpackage.InterfaceC17992e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object license(defpackage.AbstractC10731e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C14116e
            if (r0 == 0) goto L13
            r0 = r5
            eّٓٝ r0 = (defpackage.C14116e) r0
            int r1 = r0.f27937e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27937e = r1
            goto L18
        L13:
            eّٓٝ r0 = new eّٓٝ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f27936e
            int r1 = r0.f27937e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r5)
            goto L3e
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r5)
            eٜٔۗ r5 = defpackage.C14914e.f29582e
            r0.f27937e = r2
            r1 = 3
            java.io.Serializable r5 = defpackage.C14914e.amazon(r5, r0, r1)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r5 != r0) goto L3e
            return r0
        L3e:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.AbstractC0746e.subscription(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L4f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r5.next()
            ua.itaysonlab.vkapi2.objects.music.AudioTrack r1 = (ua.itaysonlab.vkapi2.objects.music.AudioTrack) r1
            java.lang.String r1 = defpackage.AbstractC6914e.billing(r1)
            r0.add(r1)
            goto L4f
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10757e.license(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1686e
    public final String metrica() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC1686e
    public final boolean purchase() {
        return false;
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("ManualLibrary(displayName="), this.ad, ')');
    }

    @Override // defpackage.InterfaceC17992e
    public final Object vip(List list, AbstractC10731e abstractC10731e) {
        return AbstractC10257e.ad(list, abstractC10731e);
    }
}
