package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؑ۠ؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0600e implements InterfaceC16793e, InterfaceC17992e, InterfaceC1940e {
    public static final C7611e Companion = new Object();
    public final String ad;
    public final String vip;

    public C0600e() {
        C14027e.ad.getClass();
        this.ad = C14027e.license();
        this.vip = "cps_library";
    }

    public /* synthetic */ C0600e(String str, int i, String str2) {
        if ((i & 1) == 0) {
            C14027e.ad.getClass();
            str = C14027e.license();
        }
        this.ad = str;
        if ((i & 2) == 0) {
            this.vip = "cps_library";
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
        return (obj instanceof C0600e) && AbstractC7890e.billing(this.ad, ((C0600e) obj).ad);
    }

    @Override // defpackage.InterfaceC1686e
    public final String getId() {
        return this.vip;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f A[LOOP:0: B:11:0x0059->B:13:0x005f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // defpackage.InterfaceC17992e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object license(defpackage.AbstractC10731e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C8564e
            if (r0 == 0) goto L13
            r0 = r6
            eًٌٞ r0 = (defpackage.C8564e) r0
            int r1 = r0.f17386e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17386e = r1
            goto L18
        L13:
            eًٌٞ r0 = new eًٌٞ
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f17385e
            int r1 = r0.f17386e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r6)
            goto L48
        L25:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2d:
            defpackage.AbstractC2003e.purchase(r6)
            eٕۢٝ r6 = defpackage.C15802e.f31123e
            eٖٓٗ r1 = defpackage.C14027e.ad
            r1.getClass()
            long r3 = defpackage.C14027e.metrica()
            r0.f17386e = r2
            r1 = -1337(0xfffffffffffffac7, float:NaN)
            java.io.Serializable r6 = r6.remoteconfig(r1, r3, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r6 != r0) goto L48
            return r0
        L48:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.AbstractC0746e.subscription(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L59:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r6.next()
            ua.itaysonlab.vkapi2.objects.music.AudioTrack r1 = (ua.itaysonlab.vkapi2.objects.music.AudioTrack) r1
            java.lang.String r1 = defpackage.AbstractC6914e.billing(r1)
            r0.add(r1)
            goto L59
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0600e.license(eُؑ۠):java.lang.Object");
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
        return AbstractC4653e.applovin(new StringBuilder("Library(displayName="), this.ad, ')');
    }

    @Override // defpackage.InterfaceC17992e
    public final Object vip(List list, AbstractC10731e abstractC10731e) {
        return AbstractC10257e.ad(list, abstractC10731e);
    }
}
