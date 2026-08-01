package defpackage;

import java.util.List;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eۣؗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4561e implements InterfaceC16793e, InterfaceC17992e, InterfaceC1940e {
    public static final C4561e INSTANCE = new Object();
    public static final String ad;
    public static final /* synthetic */ Object vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eۣؗؐ, java.lang.Object] */
    static {
        VKXApplication.Companion companion = VKXApplication.f36531e;
        ad = VKXApplication.Companion.vip(R.string.cache_track_selector_all);
        vip = AbstractC18039e.appmetrica(2, new C14582e(23));
    }

    @Override // defpackage.InterfaceC1686e
    public final String billing() {
        return null;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C4561e);
    }

    @Override // defpackage.InterfaceC1686e
    public final String getId() {
        return "cache_all";
    }

    public final int hashCode() {
        return 1153179443;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[LOOP:0: B:11:0x0055->B:13:0x005b, LOOP_END] */
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
            boolean r0 = r5 instanceof defpackage.C8980e
            if (r0 == 0) goto L13
            r0 = r5
            eٌۛۛ r0 = (defpackage.C8980e) r0
            int r1 = r0.f18031e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18031e = r1
            goto L18
        L13:
            eٌۛۛ r0 = new eٌۛۛ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f18030e
            int r1 = r0.f18031e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r5)
            goto L44
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r5)
            r0.f18031e = r2
            eًۚ r5 = defpackage.C18353e.ad
            eؓۛٔ r5 = new eؓۛٔ
            r1 = 12
            r5.<init>(r1)
            java.lang.Object r5 = defpackage.C18353e.purchase(r5, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r5 != r0) goto L44
            return r0
        L44:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.AbstractC0746e.subscription(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L55:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r5.next()
            ua.itaysonlab.vkapi2.objects.music.AudioTrack r1 = (ua.itaysonlab.vkapi2.objects.music.AudioTrack) r1
            java.lang.String r1 = defpackage.AbstractC6914e.billing(r1)
            r0.add(r1)
            goto L55
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4561e.license(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1686e
    public final String metrica() {
        return ad;
    }

    @Override // defpackage.InterfaceC1686e
    public final boolean purchase() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    public final InterfaceC5372e serializer() {
        return (InterfaceC5372e) vip.getValue();
    }

    public final String toString() {
        return "AllTracks";
    }

    @Override // defpackage.InterfaceC17992e
    public final Object vip(List list, AbstractC10731e abstractC10731e) {
        return AbstractC10257e.ad(list, abstractC10731e);
    }
}
