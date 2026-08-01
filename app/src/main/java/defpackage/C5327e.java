package defpackage;

import android.util.Log;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۨۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5327e implements InterfaceC0707e {
    public final C17280e ad;
    public final C9770e appmetrica;
    public final C15682e license;
    public final C7520e metrica;
    public final C11546e vip;
    public final Object purchase = new Object();
    public final LinkedHashSet billing = new LinkedHashSet();

    public C5327e(C17280e c17280e, C11546e c11546e, C7520e c7520e, C15682e c15682e, C9770e c9770e) {
        this.ad = c17280e;
        this.vip = c11546e;
        this.metrica = c7520e;
        this.license = c15682e;
        this.appmetrica = c9770e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0063, code lost:
    
        if (r2 == r10) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.C9485e r29, defpackage.AbstractC10731e r30) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5327e.ad(eٍٕٛ, eُؑ۠):java.lang.Object");
    }

    public final void vip(C4760e c4760e) {
        Log.d("CXCP", c4760e + " finalized");
        synchronized (this.purchase) {
            this.billing.remove(c4760e);
        }
    }
}
