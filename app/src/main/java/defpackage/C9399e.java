package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9399e {
    public final int appmetrica;
    public final C11325e license;
    public boolean metrica;
    public C9399e purchase;
    public C0511e startapp;
    public int vip;
    public HashSet ad = null;
    public int billing = 0;
    public int yandex = RecyclerView.UNDEFINED_DURATION;

    public C9399e(C11325e c11325e, int i) {
        this.license = c11325e;
        this.appmetrica = i;
    }

    public final void ad(C9399e c9399e, int i) {
        vip(c9399e, i, RecyclerView.UNDEFINED_DURATION, false);
    }

    public final void adcel() {
        HashSet hashSet;
        C9399e c9399e = this.purchase;
        if (c9399e != null && (hashSet = c9399e.ad) != null) {
            hashSet.remove(this);
            if (this.purchase.ad.size() == 0) {
                this.purchase.ad = null;
            }
        }
        this.ad = null;
        this.purchase = null;
        this.billing = 0;
        this.yandex = RecyclerView.UNDEFINED_DURATION;
        this.metrica = false;
        this.vip = 0;
    }

    public final void advert(int i) {
        this.vip = i;
        this.metrica = true;
    }

    public final int appmetrica() {
        C9399e c9399e;
        if (this.license.f22752return == 8) {
            return 0;
        }
        int i = this.yandex;
        return (i == Integer.MIN_VALUE || (c9399e = this.purchase) == null || c9399e.license.f22752return != 8) ? this.billing : i;
    }

    public final boolean billing() {
        HashSet hashSet = this.ad;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C9399e) it.next()).purchase().yandex()) {
                return true;
            }
        }
        return false;
    }

    public final int license() {
        if (this.metrica) {
            return this.vip;
        }
        return 0;
    }

    public final void metrica(int i, C18310e c18310e, ArrayList arrayList) {
        HashSet hashSet = this.ad;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC6537e.metrica(((C9399e) it.next()).license, i, arrayList, c18310e);
            }
        }
    }

    public final void mopub() {
        C0511e c0511e = this.startapp;
        if (c0511e == null) {
            this.startapp = new C0511e(1);
        } else {
            c0511e.metrica();
        }
    }

    public final C9399e purchase() {
        int i = this.appmetrica;
        int m2467class = AbstractC8703e.m2467class(i);
        C11325e c11325e = this.license;
        switch (m2467class) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c11325e.f22737extends;
            case 2:
                return c11325e.f22759throw;
            case 3:
                return c11325e.f22758this;
            case 4:
                return c11325e.f22746native;
            default:
                throw new AssertionError(AbstractC13501e.signatures(i));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0026. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean startapp(defpackage.C9399e r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L5
            goto L65
        L5:
            eَُۡ r1 = r11.license
            int r11 = r11.appmetrica
            r2 = 6
            int r3 = r10.appmetrica
            r4 = 1
            if (r11 != r3) goto L1c
            if (r3 != r2) goto L63
            boolean r11 = r1.firebase
            if (r11 == 0) goto L65
            eَُۡ r11 = r10.license
            boolean r11 = r11.firebase
            if (r11 != 0) goto L63
            goto L65
        L1c:
            int r5 = defpackage.AbstractC8703e.m2467class(r3)
            r6 = 4
            r7 = 2
            r8 = 9
            r9 = 8
            switch(r5) {
                case 0: goto L65;
                case 1: goto L53;
                case 2: goto L3f;
                case 3: goto L53;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L33;
                case 7: goto L65;
                case 8: goto L65;
                default: goto L29;
            }
        L29:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r0 = defpackage.AbstractC13501e.signatures(r3)
            r11.<init>(r0)
            throw r11
        L33:
            if (r11 == r2) goto L65
            if (r11 == r9) goto L65
            if (r11 == r8) goto L65
            goto L63
        L3a:
            if (r11 == r7) goto L65
            if (r11 != r6) goto L63
            goto L65
        L3f:
            r2 = 3
            if (r11 == r2) goto L48
            r2 = 5
            if (r11 != r2) goto L46
            goto L48
        L46:
            r2 = r0
            goto L49
        L48:
            r2 = r4
        L49:
            boolean r1 = r1 instanceof defpackage.C0913e
            if (r1 == 0) goto L52
            if (r2 != 0) goto L63
            if (r11 != r8) goto L65
            goto L63
        L52:
            return r2
        L53:
            if (r11 == r7) goto L5a
            if (r11 != r6) goto L58
            goto L5a
        L58:
            r2 = r0
            goto L5b
        L5a:
            r2 = r4
        L5b:
            boolean r1 = r1 instanceof defpackage.C0913e
            if (r1 == 0) goto L64
            if (r2 != 0) goto L63
            if (r11 != r9) goto L65
        L63:
            return r4
        L64:
            return r2
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9399e.startapp(eٍُۙ):boolean");
    }

    public final String toString() {
        return this.license.f22736else + ":" + AbstractC13501e.signatures(this.appmetrica);
    }

    public final boolean vip(C9399e c9399e, int i, int i2, boolean z) {
        if (c9399e == null) {
            adcel();
            return true;
        }
        if (!z && !startapp(c9399e)) {
            return false;
        }
        this.purchase = c9399e;
        if (c9399e.ad == null) {
            c9399e.ad = new HashSet();
        }
        HashSet hashSet = this.purchase.ad;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.billing = i;
        this.yandex = i2;
        return true;
    }

    public final boolean yandex() {
        return this.purchase != null;
    }
}
