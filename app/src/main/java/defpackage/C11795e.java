package defpackage;

import android.os.Trace;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11795e extends AbstractC13616e implements InterfaceC1683e, InterfaceC18105e, InterfaceC0479e, InterfaceC4238e, InterfaceC5077e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f23669e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean f23670e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final boolean f23671e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final Function2 f23672e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final int f23673e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public Integer f23674e;

    public C11795e(int i, int i2, Function2 function2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        function2 = (i2 & 4) != 0 ? null : function2;
        this.f23671e = z;
        this.f23672e = function2;
        this.f23673e = i;
    }

    @Override // defpackage.InterfaceC18105e
    public final void Signature(InterfaceC0043e interfaceC0043e) {
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eَؑۨ */
    public final void mo338e() {
        if (m3239e().vip()) {
            ((C8212e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(this)).getFocusOwner()).vip(8, true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [eّّؔ] */
    /* renamed from: eؒٚۨ, reason: contains not printable characters */
    public final void m3235e(EnumC16488e enumC16488e, EnumC16488e enumC16488e2) {
        C14742e c14742e;
        Function2 function2;
        C8212e c8212e = (C8212e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(this)).getFocusOwner();
        C11795e purchase = c8212e.purchase();
        if (!enumC16488e.equals(enumC16488e2) && (function2 = this.f23672e) != null) {
            function2.invoke(enumC16488e, enumC16488e2);
        }
        AbstractC13616e abstractC13616e = this.f27022e;
        if (!abstractC13616e.f27016e) {
            AbstractC14070e.metrica("visitAncestors called on an unattached node");
        }
        AbstractC13616e abstractC13616e2 = this.f27022e;
        C13915e mopub = AbstractC5851e.mopub(this);
        while (mopub != null) {
            if ((((AbstractC13616e) mopub.f27592e.billing).f27020e & 5120) != 0) {
                while (abstractC13616e2 != null) {
                    int i = abstractC13616e2.f27014e;
                    if ((i & 5120) != 0) {
                        if (abstractC13616e2 != abstractC13616e && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            AbstractC6126e abstractC6126e = abstractC13616e2;
                            ?? r6 = 0;
                            while (abstractC6126e != 0) {
                                if (abstractC6126e instanceof InterfaceC13046e) {
                                    InterfaceC13046e interfaceC13046e = (InterfaceC13046e) abstractC6126e;
                                    if (purchase == c8212e.purchase()) {
                                        interfaceC13046e.mo1035throw(enumC16488e2);
                                    }
                                } else if ((abstractC6126e.f27014e & 4096) != 0 && (abstractC6126e instanceof AbstractC6126e)) {
                                    AbstractC13616e abstractC13616e3 = abstractC6126e.f12873e;
                                    int i2 = 0;
                                    abstractC6126e = abstractC6126e;
                                    r6 = r6;
                                    while (abstractC13616e3 != null) {
                                        if ((abstractC13616e3.f27014e & 4096) != 0) {
                                            i2++;
                                            r6 = r6;
                                            if (i2 == 1) {
                                                abstractC6126e = abstractC13616e3;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new C12431e(0, new AbstractC13616e[16]);
                                                }
                                                if (abstractC6126e != 0) {
                                                    r6.license(abstractC6126e);
                                                    abstractC6126e = 0;
                                                }
                                                r6.license(abstractC13616e3);
                                            }
                                        }
                                        abstractC13616e3 = abstractC13616e3.f27024e;
                                        abstractC6126e = abstractC6126e;
                                        r6 = r6;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                abstractC6126e = AbstractC5851e.vip(r6);
                            }
                        }
                    }
                    abstractC13616e2 = abstractC13616e2.f27011e;
                }
            }
            mopub = mopub.tapsense();
            abstractC13616e2 = (mopub == null || (c14742e = mopub.f27592e) == null) ? null : (C9011e) c14742e.purchase;
        }
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؚؚؓ */
    public final boolean mo293e() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a1, code lost:
    
        return null;
     */
    /* renamed from: eؚٜ۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C2993e m3236e() {
        /*
            r7 = this;
            eْۤۡ r0 = r7.f27022e
            boolean r0 = r0.f27016e
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitAncestors called on an unattached node"
            defpackage.AbstractC14070e.metrica(r0)
        Lb:
            eْۤۡ r0 = r7.f27022e
            eْۤۡ r0 = r0.f27011e
            eِٓؔ r1 = defpackage.AbstractC5851e.mopub(r7)
        L13:
            r2 = 0
            if (r1 == 0) goto La1
            eٖٔ r3 = r1.f27592e
            java.lang.Object r3 = r3.billing
            eْۤۡ r3 = (defpackage.AbstractC13616e) r3
            int r3 = r3.f27020e
            r4 = 8388640(0x800020, float:1.1754988E-38)
            r3 = r3 & r4
            if (r3 == 0) goto L8e
        L24:
            if (r0 == 0) goto L8e
            int r3 = r0.f27014e
            r5 = r3 & r4
            if (r5 == 0) goto L8b
            r5 = 8388608(0x800000, float:1.17549435E-38)
            r5 = r5 & r3
            if (r5 == 0) goto L51
            boolean r1 = r0 instanceof defpackage.C2993e
            if (r1 == 0) goto L36
            goto L4c
        L36:
            boolean r1 = r0 instanceof defpackage.AbstractC6126e
            if (r1 == 0) goto L4b
            eؙؒؐ r0 = (defpackage.AbstractC6126e) r0
            eْۤۡ r0 = r0.f12873e
            r1 = r2
        L3f:
            if (r0 == 0) goto L49
            boolean r3 = r0 instanceof defpackage.C2993e
            if (r3 == 0) goto L46
            r1 = r0
        L46:
            eْۤۡ r0 = r0.f27024e
            goto L3f
        L49:
            r0 = r1
            goto L4c
        L4b:
            r0 = r2
        L4c:
            eؔۦً r0 = (defpackage.C2993e) r0
            if (r0 == 0) goto La1
            return r0
        L51:
            r3 = r3 & 32
            if (r3 == 0) goto L8b
            boolean r3 = r0 instanceof defpackage.InterfaceC4238e
            if (r3 == 0) goto L5b
            r5 = r0
            goto L70
        L5b:
            boolean r3 = r0 instanceof defpackage.AbstractC6126e
            if (r3 == 0) goto L6f
            r3 = r0
            eؙؒؐ r3 = (defpackage.AbstractC6126e) r3
            eْۤۡ r3 = r3.f12873e
            r5 = r2
        L65:
            if (r3 == 0) goto L70
            boolean r6 = r3 instanceof defpackage.InterfaceC4238e
            if (r6 == 0) goto L6c
            r5 = r3
        L6c:
            eْۤۡ r3 = r3.f27024e
            goto L65
        L6f:
            r5 = r2
        L70:
            eٜؖۡ r5 = (defpackage.InterfaceC4238e) r5
            if (r5 == 0) goto L8b
            eْٗۛ r3 = r5.mo344private()
            eٕۣۣ r6 = defpackage.AbstractC3332e.ad
            boolean r3 = r3.ad(r6)
            if (r3 == 0) goto L8b
            eْٗۛ r0 = r5.mo344private()
            java.lang.Object r0 = r0.vip(r6)
            eؔۦً r0 = (defpackage.C2993e) r0
            return r0
        L8b:
            eْۤۡ r0 = r0.f27011e
            goto L24
        L8e:
            eِٓؔ r1 = r1.tapsense()
            if (r1 == 0) goto L9e
            eٖٔ r0 = r1.f27592e
            if (r0 == 0) goto L9e
            java.lang.Object r0 = r0.purchase
            eٌ۟ٝ r0 = (defpackage.C9011e) r0
            goto L13
        L9e:
            r0 = r2
            goto L13
        La1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11795e.m3236e():eؔۦً");
    }

    /* renamed from: eٌۘۤ, reason: contains not printable characters */
    public final boolean m3237e(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return m3238e().ad ? m3240e(i) : AbstractC12442e.pro(this, i, new C14202e(i, 4));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eؚٖۚ, eؘؚّ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r6v9, types: [eؙٛۙ] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [eّّؔ] */
    /* renamed from: eّّۚ, reason: contains not printable characters */
    public final C16061e m3238e() {
        boolean z;
        C14742e c14742e;
        ?? obj = new Object();
        obj.ad = true;
        C6260e c6260e = C6260e.vip;
        obj.vip = c6260e;
        obj.metrica = c6260e;
        obj.license = c6260e;
        obj.appmetrica = c6260e;
        obj.purchase = c6260e;
        obj.billing = c6260e;
        obj.yandex = c6260e;
        obj.startapp = c6260e;
        obj.adcel = C8082e.f16426e;
        obj.mopub = C8082e.f16425e;
        obj.advert = C4524e.f9813e;
        int i = this.f23673e;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((C12713e) ((C18188e) ((InterfaceC13130e) AbstractC10432e.vip(this, AbstractC11473e.smaato))).ad.getValue()).ad == 1);
        } else {
            if (i != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z = false;
        }
        obj.ad = z;
        AbstractC13616e abstractC13616e = this.f27022e;
        if (!abstractC13616e.f27016e) {
            AbstractC14070e.metrica("visitAncestors called on an unattached node");
        }
        AbstractC13616e abstractC13616e2 = this.f27022e;
        C13915e mopub = AbstractC5851e.mopub(this);
        loop0: while (mopub != null) {
            if ((((AbstractC13616e) mopub.f27592e.billing).f27020e & 3072) != 0) {
                while (abstractC13616e2 != null) {
                    int i2 = abstractC13616e2.f27014e;
                    if ((i2 & 3072) != 0) {
                        if (abstractC13616e2 != abstractC13616e && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            AbstractC6126e abstractC6126e = abstractC13616e2;
                            ?? r8 = 0;
                            while (abstractC6126e != 0) {
                                if (abstractC6126e instanceof InterfaceC6505e) {
                                    ((InterfaceC6505e) abstractC6126e).mo578this(obj);
                                } else if ((abstractC6126e.f27014e & 2048) != 0 && (abstractC6126e instanceof AbstractC6126e)) {
                                    AbstractC13616e abstractC13616e3 = abstractC6126e.f12873e;
                                    int i3 = 0;
                                    abstractC6126e = abstractC6126e;
                                    r8 = r8;
                                    while (abstractC13616e3 != null) {
                                        if ((abstractC13616e3.f27014e & 2048) != 0) {
                                            i3++;
                                            r8 = r8;
                                            if (i3 == 1) {
                                                abstractC6126e = abstractC13616e3;
                                            } else {
                                                if (r8 == 0) {
                                                    r8 = new C12431e(0, new AbstractC13616e[16]);
                                                }
                                                if (abstractC6126e != 0) {
                                                    r8.license(abstractC6126e);
                                                    abstractC6126e = 0;
                                                }
                                                r8.license(abstractC13616e3);
                                            }
                                        }
                                        abstractC13616e3 = abstractC13616e3.f27024e;
                                        abstractC6126e = abstractC6126e;
                                        r8 = r8;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                abstractC6126e = AbstractC5851e.vip(r8);
                            }
                        }
                    }
                    abstractC13616e2 = abstractC13616e2.f27011e;
                }
            }
            mopub = mopub.tapsense();
            abstractC13616e2 = (mopub == null || (c14742e = mopub.f27592e) == null) ? null : (C9011e) c14742e.purchase;
        }
        return obj;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        int ordinal = m3239e().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                InterfaceC16054e focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(this)).getFocusOwner();
                C11795e metrica = AbstractC11267e.metrica(this);
                if (metrica != null && metrica.f23671e) {
                    C8212e c8212e = (C8212e) focusOwner;
                    c8212e.ad.m1702interface();
                    c8212e.license.ad();
                }
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new C14803e(10);
                }
            }
            this.f23674e = null;
        }
        C8212e c8212e2 = (C8212e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(this)).getFocusOwner();
        c8212e2.vip(8, true, false);
        if (this.f23671e) {
            c8212e2.ad.m1702interface();
        }
        c8212e2.license.ad();
        this.f23674e = null;
    }

    /* renamed from: eًْٕ, reason: contains not printable characters */
    public final EnumC16488e m3239e() {
        C11795e purchase;
        C14742e c14742e;
        if (this.f27016e && (purchase = ((C8212e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(this)).getFocusOwner()).purchase()) != null) {
            if (this == purchase) {
                return EnumC16488e.f32316e;
            }
            if (purchase.f27016e) {
                if (!purchase.f27022e.f27016e) {
                    AbstractC14070e.metrica("visitAncestors called on an unattached node");
                }
                AbstractC13616e abstractC13616e = purchase.f27022e.f27011e;
                C13915e mopub = AbstractC5851e.mopub(purchase);
                while (mopub != null) {
                    if ((((AbstractC13616e) mopub.f27592e.billing).f27020e & 1024) != 0) {
                        while (abstractC13616e != null) {
                            if ((abstractC13616e.f27014e & 1024) != 0) {
                                AbstractC13616e abstractC13616e2 = abstractC13616e;
                                C12431e c12431e = null;
                                while (abstractC13616e2 != null) {
                                    if (abstractC13616e2 instanceof C11795e) {
                                        if (this == ((C11795e) abstractC13616e2)) {
                                            return EnumC16488e.f32314e;
                                        }
                                    } else if ((abstractC13616e2.f27014e & 1024) != 0 && (abstractC13616e2 instanceof AbstractC6126e)) {
                                        int i = 0;
                                        for (AbstractC13616e abstractC13616e3 = ((AbstractC6126e) abstractC13616e2).f12873e; abstractC13616e3 != null; abstractC13616e3 = abstractC13616e3.f27024e) {
                                            if ((abstractC13616e3.f27014e & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    abstractC13616e2 = abstractC13616e3;
                                                } else {
                                                    if (c12431e == null) {
                                                        c12431e = new C12431e(0, new AbstractC13616e[16]);
                                                    }
                                                    if (abstractC13616e2 != null) {
                                                        c12431e.license(abstractC13616e2);
                                                        abstractC13616e2 = null;
                                                    }
                                                    c12431e.license(abstractC13616e3);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    abstractC13616e2 = AbstractC5851e.vip(c12431e);
                                }
                            }
                            abstractC13616e = abstractC13616e.f27011e;
                        }
                    }
                    mopub = mopub.tapsense();
                    abstractC13616e = (mopub == null || (c14742e = mopub.f27592e) == null) ? null : (C9011e) c14742e.purchase;
                }
            }
        }
        return EnumC16488e.f32315e;
    }

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final boolean m3240e(int i) {
        int m2467class = AbstractC8703e.m2467class(AbstractC8439e.mopub(this, i));
        if (m2467class == 0) {
            return AbstractC8439e.advert(this);
        }
        if (m2467class == 1) {
            return false;
        }
        if (m2467class == 2) {
            return true;
        }
        if (m2467class == 3) {
            return false;
        }
        throw new C14803e(10);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eّؖٝ, java.lang.Object] */
    /* renamed from: eٕٙؗ, reason: contains not printable characters */
    public final void m3241e() {
        int ordinal = m3239e().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new C14803e(10);
                }
                return;
            }
        }
        ?? obj = new Object();
        AbstractC16425e.purchase(this, new C14194e(obj, this, 5));
        Object obj2 = obj.f9318e;
        if ((obj2 == null ? null : (InterfaceC12296e) obj2).vip()) {
            return;
        }
        ((C8212e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(this)).getFocusOwner()).vip(8, true, true);
    }

    /* renamed from: eٖٔۧ, reason: contains not printable characters */
    public final C0763e m3242e(InterfaceC0043e interfaceC0043e) {
        long mo210native;
        C0763e c0763e = m3238e().advert;
        if (c0763e == C4524e.f9813e) {
            return interfaceC0043e != null ? interfaceC0043e.mo208goto(AbstractC5851e.adcel(this), false) : AbstractC18489e.billing(0L, AbstractC8116e.startapp(AbstractC5851e.adcel(this).f6803e));
        }
        if (interfaceC0043e == null) {
            return c0763e;
        }
        mo210native = interfaceC0043e.mo210native(AbstractC5851e.adcel(this), 0L, (r4 & 4) != 0);
        return c0763e.amazon(mo210native);
    }

    @Override // defpackage.InterfaceC0479e
    /* renamed from: for */
    public final void mo343for() {
        m3241e();
    }

    @Override // defpackage.InterfaceC4238e
    /* renamed from: private */
    public final /* synthetic */ AbstractC16982e mo344private() {
        return C5454e.metrica;
    }

    @Override // defpackage.InterfaceC4238e
    /* renamed from: return */
    public final /* synthetic */ Object mo345return(C15816e c15816e) {
        return AbstractC5087e.license(this, c15816e);
    }

    @Override // defpackage.InterfaceC12415e
    public final /* synthetic */ void signatures(long j) {
    }
}
