package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؑۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624e implements InterfaceC12732e {
    public static final /* synthetic */ int purchase = 0;
    public final C11307e ad;
    public volatile /* synthetic */ int appmetrica;
    public final C17306e license;
    public final C16911e metrica;
    public final C14826e vip;

    static {
        AtomicIntegerFieldUpdater.newUpdater(C0624e.class, "appmetrica");
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [eَ٘ؔ, eّۘۥ] */
    public C0624e(C11307e c11307e) {
        this.ad = c11307e;
        int i = 3;
        this.vip = AbstractC9743e.ad(AbstractC5797e.vip(AbstractC5097e.ad(), new C12416e(C5170e.f11077e, i)));
        C12344e c12344e = new C12344e(this);
        C16911e c16911e = new C16911e(this);
        this.metrica = c16911e;
        C18464e c18464e = new C18464e(c11307e.purchase);
        ArrayList arrayList = (ArrayList) c18464e.f36194e;
        C13661e c13661e = c11307e.vip;
        Object obj = c13661e.amazon.ad.get(AbstractC4306e.ad);
        if (((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue()) {
            ((ArrayList) c18464e.f36189e).add(new C11689e(18));
            arrayList.add(new C11689e(19));
        }
        C13611e c13611e = new C13611e(8);
        C12232e c12232e = AbstractC3820e.ad;
        c18464e.m4522switch(c13611e, c12232e.vip(Uri.class));
        c18464e.m4522switch(new C13611e(11), c12232e.vip(Integer.class));
        c18464e.m4521return(new C8357e(i), c12232e.vip(C0388e.class));
        c18464e.m4520instanceof(new C9544e(1), c12232e.vip(C0388e.class));
        int i2 = 5;
        c18464e.m4520instanceof(new C9544e(i2), c12232e.vip(C0388e.class));
        int i3 = 10;
        c18464e.m4520instanceof(new C9544e(i3), c12232e.vip(C0388e.class));
        c18464e.m4520instanceof(new C9544e(7), c12232e.vip(Drawable.class));
        C12916e c12916e = AbstractC15124e.ad;
        Object obj2 = c13661e.amazon.ad.get(AbstractC15124e.ad);
        int i4 = 4;
        int intValue = ((Number) (obj2 == null ? 4 : obj2)).intValue();
        int i5 = AbstractC10363e.ad;
        ?? c17663e = new C17663e(intValue, 0);
        int i6 = Build.VERSION.SDK_INT;
        Object obj3 = C5183e.ad;
        if (i6 >= 29) {
            Object obj4 = c13661e.amazon.ad.get(AbstractC15124e.metrica);
            if (((Boolean) (obj4 == null ? Boolean.TRUE : obj4)).booleanValue()) {
                Object obj5 = c13661e.amazon.ad.get(AbstractC15124e.vip);
                if (((C5183e) (obj5 == null ? obj3 : obj5)).equals(obj3)) {
                    arrayList.add(new C14536e(new C3565e(c17663e), 0));
                }
            }
        }
        Object obj6 = c13661e.amazon.ad.get(AbstractC15124e.vip);
        arrayList.add(new C14536e(new C14387e(c17663e, (C5183e) (obj6 != null ? obj6 : obj3)), 0));
        int i7 = 9;
        c18464e.m4522switch(new C13611e(i7), c12232e.vip(File.class));
        c18464e.m4520instanceof(new C9544e(i7), c12232e.vip(C0388e.class));
        c18464e.m4520instanceof(new C9544e(i4), c12232e.vip(ByteBuffer.class));
        c18464e.m4522switch(new C13611e(12), c12232e.vip(String.class));
        c18464e.m4522switch(new C13611e(i3), c12232e.vip(C10675e.class));
        c18464e.m4521return(new C8357e(i4), c12232e.vip(C0388e.class));
        c18464e.m4521return(new C8357e(i2), c12232e.vip(C0388e.class));
        c18464e.m4520instanceof(new C9544e(8), c12232e.vip(C0388e.class));
        c18464e.m4520instanceof(new C9544e(3), c12232e.vip(byte[].class));
        c18464e.m4520instanceof(new C9544e(6), c12232e.vip(C0388e.class));
        c18464e.m4520instanceof(new C9544e(2), c12232e.vip(Bitmap.class));
        ((ArrayList) c18464e.f36192e).add(new C8952e(this, c12344e, c16911e));
        this.license = c18464e.m4515e();
    }

    public final InterfaceC7696e ad(C14542e c14542e) {
        return AbstractC12662e.appmetrica(c14542e, AbstractC5336e.vip(2, (InterfaceC8850e) this.ad.metrica.getValue(), this.vip, new C0944e(this, c14542e, null, 0)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        if (r6 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void appmetrica(defpackage.C10574e r5, defpackage.InterfaceC1363e r6, defpackage.C4335e r7) {
        /*
            r4 = this;
            eؘٔؕ r0 = r5.vip
            eْؖ۟ r1 = r5.ad
            boolean r2 = r6 instanceof defpackage.InterfaceC4719e
            if (r2 != 0) goto Lb
            if (r6 == 0) goto L28
            goto L1e
        Lb:
            eّۨؒ r2 = defpackage.AbstractC15659e.ad
            java.lang.Object r2 = defpackage.AbstractC8306e.metrica(r0, r2)
            eؘَٜ r2 = (defpackage.InterfaceC5562e) r2
            r3 = r6
            eَؚؗ r3 = (defpackage.InterfaceC4719e) r3
            eُؗۜ r5 = r2.ad(r3, r5)
            boolean r2 = r5 instanceof defpackage.C13282e
            if (r2 == 0) goto L22
        L1e:
            r6.metrica(r1)
            goto L28
        L22:
            r7.getClass()
            r5.ad()
        L28:
            r7.getClass()
            r0.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0624e.appmetrica(eَٕ۠, eؒ۟ۛ, eؖۘ۠):void");
    }

    public final C4421e license() {
        return (C4421e) this.ad.license.getValue();
    }

    public final Object metrica(C14542e c14542e, AbstractC10731e abstractC10731e) {
        return ((c14542e.metrica instanceof C17702e) || (c14542e.subscription instanceof C1964e) || ((AbstractC0003e) AbstractC8306e.metrica(c14542e, AbstractC15659e.appmetrica)) != null) ? AbstractC9743e.appmetrica(new C2122e(this, c14542e, (InterfaceC5083e) null, 11), abstractC10731e) : vip(c14542e, 1, abstractC10731e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        if (r6 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void purchase(defpackage.C16455e r5, defpackage.InterfaceC1363e r6, defpackage.C4335e r7) {
        /*
            r4 = this;
            eؘٔؕ r0 = r5.vip
            eْؖ۟ r1 = r5.ad
            boolean r2 = r6 instanceof defpackage.InterfaceC4719e
            if (r2 != 0) goto Lb
            if (r6 == 0) goto L28
            goto L1e
        Lb:
            eّۨؒ r2 = defpackage.AbstractC15659e.ad
            java.lang.Object r2 = defpackage.AbstractC8306e.metrica(r0, r2)
            eؘَٜ r2 = (defpackage.InterfaceC5562e) r2
            r3 = r6
            eَؚؗ r3 = (defpackage.InterfaceC4719e) r3
            eُؗۜ r5 = r2.ad(r3, r5)
            boolean r2 = r5 instanceof defpackage.C13282e
            if (r2 == 0) goto L22
        L1e:
            r6.ad(r1)
            goto L28
        L22:
            r7.getClass()
            r5.ad()
        L28:
            r7.getClass()
            r0.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0624e.purchase(eٖۘ۟, eؒ۟ۛ, eؖۘ۠):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0207 A[Catch: all -> 0x003d, TryCatch #3 {all -> 0x003d, blocks: (B:14:0x0038, B:15:0x0201, B:17:0x0207, B:21:0x0210, B:23:0x0214, B:24:0x0220, B:25:0x0227, B:55:0x0065, B:56:0x018e, B:58:0x0192, B:60:0x0198, B:62:0x019e, B:63:0x01a2, B:66:0x01a8, B:68:0x01b2, B:69:0x01be, B:71:0x01c1, B:138:0x016f, B:140:0x0179, B:142:0x017e, B:145:0x022d, B:146:0x0234), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0210 A[Catch: all -> 0x003d, TryCatch #3 {all -> 0x003d, blocks: (B:14:0x0038, B:15:0x0201, B:17:0x0207, B:21:0x0210, B:23:0x0214, B:24:0x0220, B:25:0x0227, B:55:0x0065, B:56:0x018e, B:58:0x0192, B:60:0x0198, B:62:0x019e, B:63:0x01a2, B:66:0x01a8, B:68:0x01b2, B:69:0x01be, B:71:0x01c1, B:138:0x016f, B:140:0x0179, B:142:0x017e, B:145:0x022d, B:146:0x0234), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0239 A[Catch: all -> 0x0246, TRY_LEAVE, TryCatch #0 {all -> 0x0246, blocks: (B:41:0x0235, B:43:0x0239, B:46:0x0248, B:47:0x024e), top: B:40:0x0235 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0248 A[Catch: all -> 0x0246, TRY_ENTER, TryCatch #0 {all -> 0x0246, blocks: (B:41:0x0235, B:43:0x0239, B:46:0x0248, B:47:0x024e), top: B:40:0x0235 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006a  */
    /* JADX WARN: Type inference failed for: r16v0, types: [eؘؑۡ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, eؖۘ۠] */
    /* JADX WARN: Type inference failed for: r3v26, types: [int] */
    /* JADX WARN: Type inference failed for: r3v27, types: [int] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2, types: [eٍُؓ] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vip(defpackage.C14542e r17, int r18, defpackage.AbstractC10731e r19) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0624e.vip(eؘٔؕ, int, eُؑ۠):java.lang.Object");
    }
}
