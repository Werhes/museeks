package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؑۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0641e extends AbstractC2649e implements InterfaceC8149e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C5152e f2878e;

    public AbstractC0641e() {
        this.f2878e = new C5152e();
    }

    public AbstractC0641e(AbstractC12173e abstractC12173e) {
        abstractC12173e.f24472e.purchase();
        abstractC12173e.f24471e = false;
        this.f2878e = abstractC12173e.f24472e;
    }

    public final int adcel() {
        C15497e c15497e = this.f2878e.ad;
        int i = 0;
        for (int i2 = 0; i2 < c15497e.f30613e.size(); i2++) {
            Map.Entry entry = (Map.Entry) c15497e.f30613e.get(i2);
            i += C5152e.license((C1808e) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : c15497e.metrica()) {
            i += C5152e.license((C1808e) entry2.getKey(), entry2.getValue());
        }
        return i;
    }

    public final boolean advert(C4790e c4790e) {
        loadAd(c4790e);
        C1808e c1808e = c4790e.license;
        C5152e c5152e = this.f2878e;
        c5152e.getClass();
        if (c1808e.f4881e) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return c5152e.ad.get(c1808e) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean amazon(defpackage.C4285e r9, defpackage.C9831e r10, defpackage.C18521e r11, int r12) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0641e.amazon(eؖۖؓ, eٍۢؔ, eۧ۠, int):boolean");
    }

    public final void loadAd(C4790e c4790e) {
        if (c4790e.ad != vip()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public final Object mopub(C4790e c4790e) {
        loadAd(c4790e);
        C1808e c1808e = c4790e.license;
        Object obj = this.f2878e.ad.get(c1808e);
        if (obj == null) {
            return c4790e.vip;
        }
        if (!c1808e.f4881e) {
            return c4790e.ad(obj);
        }
        if (c1808e.f4882e.f2368e != EnumC7310e.f14967e) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(c4790e.ad(it.next()));
        }
        return arrayList;
    }

    public final void smaato() {
        this.f2878e.purchase();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean startapp() {
        /*
            r4 = this;
            eؗۛؔ r0 = r4.f2878e
            eٍٕٖ r0 = r0.ad
            r1 = 0
            r2 = r1
        L6:
            java.util.List r3 = r0.f30613e
            int r3 = r3.size()
            if (r2 >= r3) goto L20
            java.util.List r3 = r0.f30613e
            java.lang.Object r3 = r3.get(r2)
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            boolean r3 = defpackage.C5152e.appmetrica(r3)
            if (r3 != 0) goto L1d
            goto L3a
        L1d:
            int r2 = r2 + 1
            goto L6
        L20:
            java.lang.Iterable r0 = r0.metrica()
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r2 = defpackage.C5152e.appmetrica(r2)
            if (r2 != 0) goto L28
        L3a:
            return r1
        L3b:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0641e.startapp():boolean");
    }
}
