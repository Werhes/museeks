package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eَؕۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3683e implements InterfaceC16793e, InterfaceC17992e, InterfaceC1940e {
    public static final C8654e Companion = new Object();
    public final String ad;
    public final String metrica;
    public final String vip;

    public /* synthetic */ C3683e(int i, String str, String str2, String str3) {
        if (1 != (i & 1)) {
            AbstractC5756e.billing(i, 1, C4032e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = (i & 2) == 0 ? BuildConfig.FLAVOR : str2;
        if ((i & 4) == 0) {
            this.metrica = AbstractC17861e.Signature("cps_pl_", str);
        } else {
            this.metrica = str3;
        }
    }

    public C3683e(String str, String str2) {
        this.ad = str;
        this.vip = str2;
        this.metrica = AbstractC17861e.Signature("cps_pl_", str);
    }

    @Override // defpackage.InterfaceC1686e
    public final String billing() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3683e)) {
            return false;
        }
        C3683e c3683e = (C3683e) obj;
        return AbstractC7890e.billing(this.ad, c3683e.ad) && AbstractC7890e.billing(this.vip, c3683e.vip);
    }

    @Override // defpackage.InterfaceC1686e
    public final String getId() {
        return this.metrica;
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[LOOP:0: B:11:0x0050->B:13:0x0056, LOOP_END] */
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
            boolean r0 = r5 instanceof defpackage.C9547e
            if (r0 == 0) goto L13
            r0 = r5
            eٍٙۙ r0 = (defpackage.C9547e) r0
            int r1 = r0.f18919e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18919e = r1
            goto L18
        L13:
            eٍٙۙ r0 = new eٍٙۙ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f18918e
            int r1 = r0.f18919e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r5)
            goto L3f
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r5)
            eٕۢٝ r5 = defpackage.C15802e.f31123e
            r0.f18919e = r2
            java.lang.String r1 = r4.ad
            java.io.Serializable r5 = r5.pro(r1, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r5 != r0) goto L3f
            return r0
        L3f:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.AbstractC0746e.subscription(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L50:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r5.next()
            ua.itaysonlab.vkapi2.objects.music.AudioTrack r1 = (ua.itaysonlab.vkapi2.objects.music.AudioTrack) r1
            java.lang.String r1 = defpackage.AbstractC6914e.billing(r1)
            r0.add(r1)
            goto L50
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3683e.license(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1686e
    public final String metrica() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC1686e
    public final boolean purchase() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Playlist(uid=");
        sb.append(this.ad);
        sb.append(", displayName=");
        return AbstractC4653e.applovin(sb, this.vip, ')');
    }

    @Override // defpackage.InterfaceC17992e
    public final Object vip(List list, AbstractC10731e abstractC10731e) {
        return AbstractC10257e.ad(list, abstractC10731e);
    }
}
