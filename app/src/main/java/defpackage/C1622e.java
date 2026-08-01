package defpackage;

import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؓؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1622e extends AbstractC11130e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C1622e f4539e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f4540e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f4541e;

    static {
        String str = "*";
        f4539e = new C1622e(str, str);
    }

    public /* synthetic */ C1622e(String str, String str2) {
        this(str, str2, C13664e.f27089e);
    }

    public C1622e(String str, String str2, String str3, List list) {
        super(str3, list, false, 10);
        this.f4541e = str;
        this.f4540e = str2;
    }

    public C1622e(String str, String str2, List list) {
        this(str, str2, AbstractC0869e.tapsense('/', str, str2), list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1622e)) {
            return false;
        }
        C1622e c1622e = (C1622e) obj;
        return AbstractC6507e.loadAd(this.f4541e, c1622e.f4541e, true) && AbstractC6507e.loadAd(this.f4540e, c1622e.f4540e, true) && AbstractC7890e.billing((List) this.f22046e, (List) c1622e.f22046e);
    }

    /* renamed from: eؚٕؗ, reason: contains not printable characters */
    public final C1622e m656e() {
        return ((List) this.f22046e).isEmpty() ? this : new C1622e(this.f4541e, this.f4540e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (defpackage.AbstractC6507e.loadAd(r1.vip, r7, true) != false) goto L21;
     */
    /* renamed from: eؘِۢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C1622e m657e(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f22046e
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            java.lang.String r2 = "charset"
            if (r1 == 0) goto L4f
            r3 = 1
            if (r1 == r3) goto L37
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L16
            goto L4f
        L16:
            java.util.Iterator r1 = r0.iterator()
        L1a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L4f
            java.lang.Object r4 = r1.next()
            eّْؗ r4 = (defpackage.C4839e) r4
            java.lang.String r5 = r4.ad
            boolean r5 = defpackage.AbstractC6507e.loadAd(r5, r2, r3)
            if (r5 == 0) goto L1a
            java.lang.String r4 = r4.vip
            boolean r4 = defpackage.AbstractC6507e.loadAd(r4, r7, r3)
            if (r4 == 0) goto L1a
            goto L4e
        L37:
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            eّْؗ r1 = (defpackage.C4839e) r1
            java.lang.String r4 = r1.ad
            boolean r4 = defpackage.AbstractC6507e.loadAd(r4, r2, r3)
            if (r4 == 0) goto L4f
            java.lang.String r1 = r1.vip
            boolean r1 = defpackage.AbstractC6507e.loadAd(r1, r7, r3)
            if (r1 == 0) goto L4f
        L4e:
            return r6
        L4f:
            eٜؓؗ r1 = new eٜؓؗ
            java.lang.Object r3 = r6.f22047e
            java.lang.String r3 = (java.lang.String) r3
            eّْؗ r4 = new eّْؗ
            r4.<init>(r2, r7)
            java.util.ArrayList r7 = defpackage.AbstractC13480e.m3572catch(r4, r0)
            java.lang.String r0 = r6.f4541e
            java.lang.String r2 = r6.f4540e
            r1.<init>(r0, r2, r3, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1622e.m657e(java.lang.String):eٜؓؗ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
    
        if (r1 != null) goto L19;
     */
    /* renamed from: eِٜ٘, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m658e(defpackage.C1622e r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.f4540e
            java.lang.String r1 = r7.f4541e
            java.lang.String r2 = "*"
            boolean r3 = defpackage.AbstractC7890e.billing(r1, r2)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L18
            java.lang.String r3 = r6.f4541e
            boolean r1 = defpackage.AbstractC6507e.loadAd(r1, r3, r5)
            if (r1 != 0) goto L18
            goto L87
        L18:
            boolean r1 = defpackage.AbstractC7890e.billing(r0, r2)
            if (r1 != 0) goto L27
            java.lang.String r1 = r6.f4540e
            boolean r0 = defpackage.AbstractC6507e.loadAd(r0, r1, r5)
            if (r0 != 0) goto L27
            goto L87
        L27:
            java.lang.Object r7 = r7.f22046e
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
        L2f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r0 = r7.next()
            eّْؗ r0 = (defpackage.C4839e) r0
            java.lang.String r1 = r0.ad
            java.lang.String r0 = r0.vip
            boolean r3 = defpackage.AbstractC7890e.billing(r1, r2)
            if (r3 == 0) goto L74
            boolean r1 = defpackage.AbstractC7890e.billing(r0, r2)
            if (r1 == 0) goto L4d
        L4b:
            r0 = r5
            goto L85
        L4d:
            java.lang.Object r1 = r6.f22046e
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L5b
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L5b
        L59:
            r0 = r4
            goto L85
        L5b:
            java.util.Iterator r1 = r1.iterator()
        L5f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r1.next()
            eّْؗ r3 = (defpackage.C4839e) r3
            java.lang.String r3 = r3.vip
            boolean r3 = defpackage.AbstractC6507e.loadAd(r3, r0, r5)
            if (r3 == 0) goto L5f
            goto L4b
        L74:
            java.lang.String r1 = r6.m3036e(r1)
            boolean r3 = defpackage.AbstractC7890e.billing(r0, r2)
            if (r3 == 0) goto L81
            if (r1 == 0) goto L59
            goto L4b
        L81:
            boolean r0 = defpackage.AbstractC6507e.loadAd(r1, r0, r5)
        L85:
            if (r0 != 0) goto L2f
        L87:
            return r4
        L88:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1622e.m658e(eٜؓؗ):boolean");
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        int hashCode = this.f4541e.toLowerCase(locale).hashCode();
        return (((List) this.f22046e).hashCode() * 31) + this.f4540e.toLowerCase(locale).hashCode() + (hashCode * 31) + hashCode;
    }
}
