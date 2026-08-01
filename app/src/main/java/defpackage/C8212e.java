package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8212e implements InterfaceC16054e {
    public final ViewTreeObserverOnGlobalLayoutListenerC5014e ad;
    public final C10992e license;
    public C13457e purchase;
    public final ViewTreeObserverOnGlobalLayoutListenerC5014e vip;
    public C11795e yandex;
    public final C11795e metrica = new C11795e(2, 14, null);
    public final C18493e appmetrica = new C18493e(this);
    public final C12328e billing = new C12328e(1);

    public C8212e(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e, ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e2) {
        this.ad = viewTreeObserverOnGlobalLayoutListenerC5014e;
        this.vip = viewTreeObserverOnGlobalLayoutListenerC5014e2;
        this.license = new C10992e(this, viewTreeObserverOnGlobalLayoutListenerC5014e2);
    }

    public final boolean ad(boolean z) {
        C14742e c14742e;
        if (purchase() != null) {
            C11795e purchase = purchase();
            startapp(null);
            if (purchase != null) {
                EnumC16488e enumC16488e = EnumC16488e.f32316e;
                EnumC16488e enumC16488e2 = EnumC16488e.f32315e;
                purchase.m3235e(enumC16488e, enumC16488e2);
                if (!purchase.f27022e.f27016e) {
                    AbstractC14070e.metrica("visitAncestors called on an unattached node");
                }
                AbstractC13616e abstractC13616e = purchase.f27022e.f27011e;
                C13915e mopub = AbstractC5851e.mopub(purchase);
                while (mopub != null) {
                    if ((((AbstractC13616e) mopub.f27592e.billing).f27020e & 1024) != 0) {
                        while (abstractC13616e != null) {
                            if ((abstractC13616e.f27014e & 1024) != 0) {
                                C12431e c12431e = null;
                                AbstractC13616e abstractC13616e2 = abstractC13616e;
                                while (abstractC13616e2 != null) {
                                    if (abstractC13616e2 instanceof C11795e) {
                                        ((C11795e) abstractC13616e2).m3235e(EnumC16488e.f32314e, enumC16488e2);
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
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0123, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r6v14, types: [eؚٗٗ, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v20, types: [eؚٗٗ, kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean appmetrica(int r19, defpackage.C0763e r20, kotlin.jvm.functions.Function1 r21) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8212e.appmetrica(int, eؒؐۥ, kotlin.jvm.functions.Function1):java.lang.Boolean");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eّؖٝ, java.lang.Object] */
    public final boolean billing(int i, boolean z) {
        C11795e purchase = purchase();
        ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = this.ad;
        if (purchase == null || !purchase.f23671e || !viewTreeObserverOnGlobalLayoutListenerC5014e.inmobi(i)) {
            ?? obj = new Object();
            obj.f9318e = Boolean.FALSE;
            C11795e purchase2 = purchase();
            Boolean appmetrica = appmetrica(i, viewTreeObserverOnGlobalLayoutListenerC5014e.getEmbeddedViewFocusRect(), new C17826e(obj, i));
            if (!AbstractC7890e.billing(appmetrica, Boolean.TRUE) || purchase2 == purchase()) {
                if (appmetrica != null && obj.f9318e != null) {
                    if (!appmetrica.booleanValue() || !((Boolean) obj.f9318e).booleanValue()) {
                        if ((i == 1 || i == 2) && z && vip(i, false, false)) {
                            Boolean appmetrica2 = appmetrica(i, null, new C14202e(i, 3));
                            if (appmetrica2 != null ? appmetrica2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        if (r8 == null) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019f A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x001c, B:11:0x0028, B:13:0x002c, B:14:0x0034, B:15:0x0050, B:18:0x005b, B:20:0x0061, B:21:0x0066, B:23:0x006e, B:25:0x0073, B:27:0x0079, B:31:0x007f, B:36:0x019f, B:38:0x01a5, B:39:0x01a8, B:41:0x01b3, B:44:0x01c1, B:48:0x01cb, B:51:0x01d1, B:52:0x01d6, B:54:0x01de, B:56:0x01e4, B:58:0x01e8, B:60:0x01f0, B:62:0x01f6, B:64:0x01fa, B:68:0x0200, B:70:0x0209, B:71:0x020d, B:66:0x0210, B:77:0x0216, B:88:0x021b, B:91:0x021e, B:93:0x0224, B:100:0x0228, B:105:0x0231, B:107:0x0239, B:115:0x0250, B:116:0x0252, B:118:0x0257, B:152:0x025b, B:147:0x029f, B:120:0x0267, B:122:0x026d, B:124:0x0271, B:126:0x0279, B:128:0x027f, B:130:0x0283, B:134:0x0289, B:136:0x0292, B:137:0x0296, B:132:0x0299, B:158:0x02a4, B:162:0x02b4, B:164:0x02b9, B:198:0x02bd, B:193:0x0301, B:166:0x02c9, B:168:0x02cf, B:170:0x02d3, B:172:0x02db, B:174:0x02e1, B:176:0x02e5, B:180:0x02eb, B:182:0x02f4, B:183:0x02f8, B:178:0x02fb, B:205:0x0308, B:207:0x030f, B:214:0x0322, B:215:0x0324, B:222:0x0087, B:224:0x008d, B:225:0x0090, B:227:0x0098, B:230:0x00a6, B:234:0x00b0, B:269:0x0107, B:271:0x010b, B:236:0x00b5, B:238:0x00bb, B:240:0x00bf, B:242:0x00c7, B:244:0x00cd, B:246:0x00d1, B:250:0x00d7, B:252:0x00e0, B:253:0x00e4, B:248:0x00e7, B:259:0x00ed, B:273:0x00f2, B:276:0x00f5, B:278:0x00fb, B:285:0x00ff, B:290:0x0111, B:292:0x0117, B:293:0x011a, B:295:0x0124, B:298:0x0132, B:302:0x013c, B:337:0x0193, B:339:0x0197, B:304:0x0141, B:306:0x0147, B:308:0x014b, B:310:0x0153, B:312:0x0159, B:314:0x015d, B:318:0x0163, B:320:0x016c, B:321:0x0170, B:316:0x0173, B:327:0x0179, B:342:0x017e, B:345:0x0181, B:347:0x0187, B:354:0x018b, B:360:0x003a, B:362:0x003e, B:364:0x0044, B:366:0x0048), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r0v24, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v9, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v4, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r15v5, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r15v9, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v39, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean license(android.view.KeyEvent r14, kotlin.jvm.functions.Function0 r15) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8212e.license(android.view.KeyEvent, kotlin.jvm.functions.Function0):boolean");
    }

    public final void metrica() {
        ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = this.ad;
        if (viewTreeObserverOnGlobalLayoutListenerC5014e.isFocused() || viewTreeObserverOnGlobalLayoutListenerC5014e.hasFocus()) {
            viewTreeObserverOnGlobalLayoutListenerC5014e.clearFocus();
        } else if (viewTreeObserverOnGlobalLayoutListenerC5014e.hasFocus()) {
            View findFocus = viewTreeObserverOnGlobalLayoutListenerC5014e.findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            viewTreeObserverOnGlobalLayoutListenerC5014e.clearFocus();
        }
    }

    public final C11795e purchase() {
        C11795e c11795e = this.yandex;
        if (c11795e == null || !c11795e.f27016e) {
            return null;
        }
        return c11795e;
    }

    public final void startapp(C11795e c11795e) {
        C11795e c11795e2 = this.yandex;
        this.yandex = c11795e;
        C12328e c12328e = this.billing;
        Object[] objArr = c12328e.ad;
        int i = c12328e.vip;
        for (int i2 = 0; i2 < i; i2++) {
            ((InterfaceC18318e) objArr[i2]).ad(c11795e2, c11795e);
        }
    }

    public final boolean vip(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (z) {
            ad(z);
        } else {
            int m2467class = AbstractC8703e.m2467class(AbstractC8439e.startapp(this.metrica, i));
            if (m2467class == 0) {
                ad(z);
            } else {
                if (m2467class != 1 && m2467class != 2 && m2467class != 3) {
                    throw new C14803e(10);
                }
                z3 = false;
            }
        }
        if (z3 && z2) {
            metrica();
        }
        return z3;
    }

    public final boolean yandex(int i) {
        if (!vip(i, false, false)) {
            return false;
        }
        Boolean appmetrica = appmetrica(i, null, new C14202e(i, 2));
        boolean booleanValue = appmetrica != null ? appmetrica.booleanValue() : false;
        if (!booleanValue) {
            metrica();
        }
        return booleanValue;
    }
}
