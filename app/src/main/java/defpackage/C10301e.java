package defpackage;

import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.playback.util.QueueSaveHolder$VkxMetadataState;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10301e implements InterfaceC17914e, InterfaceC18435e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C10675e f20323e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C10675e f20327e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f20328e = AbstractC9743e.vip();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C10301e f20325e = new C10301e();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C17651e f20324e = AbstractC12751e.ad();

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final AbstractC13345e f20326e = AbstractC16704e.ad(VKXApplication.f36533e, AbstractC3820e.ad(QueueSaveHolder$VkxMetadataState.class));

    static {
        String str = C10675e.f21023e;
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        C10675e purchase = C10215e.purchase(vKXApplication.getFilesDir());
        f20323e = purchase.appmetrica("vkx_last_state2.json");
        f20327e = purchase.appmetrica("vkx_metadata2.json");
    }

    public static C6571e metrica() {
        Object c12763e;
        Object c12763e2;
        Throwable th;
        Throwable th2;
        try {
            C13197e c13197e = new C13197e(AbstractC11062e.f21949e.mo1918implements(f20323e));
            try {
                C8028e c8028e = AbstractC0232e.license;
                c8028e.getClass();
                c12763e = (C8264e) AbstractC4508e.metrica(c8028e, C8264e.Companion.serializer(), new C9428e(c13197e, 1));
                try {
                    c13197e.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    c13197e.close();
                } catch (Throwable th5) {
                    AbstractC13362e.license(th4, th5);
                }
                th2 = th4;
                c12763e = null;
            }
        } catch (Throwable th6) {
            c12763e = new C12763e(th6);
        }
        if (th2 != null) {
            throw th2;
        }
        Throwable ad = C13523e.ad(c12763e);
        C10675e c10675e = f20327e;
        if (ad != null) {
            AbstractC11062e.f21949e.loadAd(c10675e, false);
        }
        if (c12763e instanceof C12763e) {
            c12763e = null;
        }
        C8264e c8264e = (C8264e) c12763e;
        if (c8264e == null) {
            return null;
        }
        try {
            C18511e c18511e = AbstractC11062e.f21949e;
            C10675e c10675e2 = c18511e.isVip(c10675e) ? c10675e : null;
            if (c10675e2 != null) {
                C13197e c13197e2 = new C13197e(c18511e.mo1918implements(c10675e2));
                try {
                    c12763e2 = (QueueSaveHolder$VkxMetadataState) f20326e.ad(c13197e2);
                    try {
                        c13197e2.close();
                        th = null;
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Throwable th8) {
                    try {
                        c13197e2.close();
                    } catch (Throwable th9) {
                        AbstractC13362e.license(th8, th9);
                    }
                    th = th8;
                    c12763e2 = null;
                }
                if (th != null) {
                    throw th;
                }
            } else {
                c12763e2 = null;
            }
        } catch (Throwable th10) {
            c12763e2 = new C12763e(th10);
        }
        if (C13523e.ad(c12763e2) != null) {
            AbstractC11062e.f21949e.loadAd(c10675e, false);
        }
        return new C6571e(c8264e, (QueueSaveHolder$VkxMetadataState) (c12763e2 instanceof C12763e ? null : c12763e2));
    }

    public static boolean vip() {
        C15409e.ad.getClass();
        return ((Boolean) C15409e.metrica.ad()).booleanValue() && AbstractC11062e.f21949e.isVip(f20323e);
    }

    public final void ad() {
        C18511e c18511e = AbstractC11062e.f21949e;
        c18511e.loadAd(f20323e, false);
        c18511e.loadAd(f20327e, false);
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f20328e.f29359e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
    
        if (r3.mopub(r5, r0, r6, r9, r8) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b0, code lost:
    
        if (r0 == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object appmetrica(defpackage.AbstractC10731e r19) {
        /*
            r18 = this;
            r0 = r19
            boolean r1 = r0 instanceof defpackage.C13498e
            if (r1 == 0) goto L18
            r1 = r0
            eْۚ۠ r1 = (defpackage.C13498e) r1
            int r2 = r1.f26777e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f26777e = r2
            r2 = r18
        L16:
            r8 = r1
            goto L20
        L18:
            eْۚ۠ r1 = new eْۚ۠
            r2 = r18
            r1.<init>(r2, r0)
            goto L16
        L20:
            java.lang.Object r0 = r8.f26776e
            int r1 = r8.f26777e
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3a
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2d
            goto L35
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            defpackage.AbstractC2003e.purchase(r0)
            goto Lb3
        L3a:
            defpackage.AbstractC2003e.purchase(r0)
            boolean r0 = vip()
            if (r0 != 0) goto L46
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L46:
            eؙۖؕ r0 = metrica()
            if (r0 != 0) goto L4f
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L4f:
            java.lang.Object r1 = r0.f13544e
            eً۠ۥ r1 = (defpackage.C8264e) r1
            eٟؓٛ r5 = r1.ad
            boolean r6 = r5 instanceof defpackage.InterfaceC1686e
            r7 = 0
            if (r6 == 0) goto L5e
            eًؓ۠ r5 = (defpackage.InterfaceC1686e) r5
            r6 = r5
            goto L5f
        L5e:
            r6 = r7
        L5f:
            java.lang.Object r0 = r0.f13543e
            ua.itaysonlab.vkxreborn.playback.util.QueueSaveHolder$VkxMetadataState r0 = (ua.itaysonlab.vkxreborn.playback.util.QueueSaveHolder$VkxMetadataState) r0
            if (r6 == 0) goto Lb3
            eؑؕٗ r9 = new eؑؕٗ
            eٕؖۡ r1 = r1.vip
            java.lang.String r5 = r1.ad
            if (r5 == 0) goto L73
            eٍؓ r10 = new eٍؓ
            r10.<init>(r5)
            goto L75
        L73:
            eؘؔۡ r10 = defpackage.C2406e.ad
        L75:
            long r11 = r1.license
            r16 = 0
            r17 = 124(0x7c, float:1.74E-43)
            r13 = 0
            r14 = 0
            r15 = 0
            r9.<init>(r10, r11, r13, r14, r15, r16, r17)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r0 == 0) goto L9d
            eًٍۘ r3 = ua.itaysonlab.vkx.VKXApplication.f36530e
            if (r3 == 0) goto L8a
            goto L8b
        L8a:
            r3 = r7
        L8b:
            java.util.LinkedHashMap r5 = r0.ad()
            java.util.List r0 = r0.ad
            r8.f26777e = r4
            r4 = r5
            r7 = r9
            r5 = r0
            java.lang.Object r0 = r3.mopub(r4, r5, r6, r7, r8)
            if (r0 != r1) goto Lb3
            goto Lb2
        L9d:
            r8.f26777e = r3
            eّٕٓ r0 = defpackage.AbstractC6731e.ad
            eؘۥۤ r3 = new eؘۥۤ
            r4 = 1
            r3.<init>(r9, r6, r7, r4)
            java.lang.Object r0 = defpackage.AbstractC5336e.advert(r0, r3, r8)
            if (r0 != r1) goto Lae
            goto Lb0
        Lae:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        Lb0:
            if (r0 != r1) goto Lb3
        Lb2:
            return r1
        Lb3:
            r2.ad()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10301e.appmetrica(eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r4v3, types: [eؚؗؔ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object purchase(defpackage.C14609e r19, long r20, defpackage.InterfaceC1686e r22, defpackage.AbstractC10731e r23) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10301e.purchase(eٌٔۤ, long, eًؓ۠, eُؑ۠):java.lang.Object");
    }
}
