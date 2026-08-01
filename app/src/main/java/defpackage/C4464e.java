package defpackage;

import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eُۣؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4464e implements InterfaceC4079e {
    public static final C5391e Companion = new Object();
    public final int ad;
    public final String license;
    public final String metrica;
    public final long vip;

    public /* synthetic */ C4464e(int i, int i2, long j, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC5756e.billing(i, 7, C9084e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        this.vip = j;
        this.metrica = str;
        if ((i & 8) != 0) {
            this.license = str2;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append('_');
        sb.append(i2);
        this.license = sb.toString();
    }

    public C4464e(long j, int i, String str) {
        this.ad = i;
        this.vip = j;
        this.metrica = str;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append('_');
        sb.append(i);
        this.license = sb.toString();
    }

    public C4464e(AudioTrack audioTrack) {
        this(audioTrack.metrica, audioTrack.vip, audioTrack.ad);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.InterfaceC4079e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.InterfaceC5083e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C18012e
            if (r0 == 0) goto L13
            r0 = r6
            e٘ۜؒ r0 = (defpackage.C18012e) r0
            int r1 = r0.f35329e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35329e = r1
            goto L1a
        L13:
            e٘ۜؒ r0 = new e٘ۜؒ
            eُؑ۠ r6 = (defpackage.AbstractC10731e) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.f35328e
            int r1 = r0.f35329e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            defpackage.AbstractC2003e.purchase(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.AbstractC2003e.purchase(r6)
            eؗؓؖ r6 = new eؗؓؖ
            long r3 = r5.vip
            int r1 = r5.ad
            r6.<init>(r3, r1)
            r0.f35329e = r2
            java.lang.Object r6 = defpackage.AbstractC18406e.yandex(r6, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r6 != r0) goto L46
            return r0
        L46:
            java.util.List r6 = java.util.Collections.singletonList(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4464e.ad(eًؗۖ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1686e
    public final String billing() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4464e)) {
            return false;
        }
        C4464e c4464e = (C4464e) obj;
        return this.ad == c4464e.ad && this.vip == c4464e.vip && AbstractC7890e.billing(this.metrica, c4464e.metrica);
    }

    @Override // defpackage.InterfaceC1686e
    public final String getId() {
        return this.license;
    }

    public final int hashCode() {
        int i = this.ad * 31;
        long j = this.vip;
        return this.metrica.hashCode() + ((i + ((int) (j ^ (j >>> 32)))) * 31);
    }

    @Override // defpackage.InterfaceC1686e
    public final String metrica() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC1686e
    public final boolean purchase() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Episode(trackId=");
        sb.append(this.ad);
        sb.append(", ownerId=");
        sb.append(this.vip);
        sb.append(", displayName=");
        return AbstractC4653e.applovin(sb, this.metrica, ')');
    }
}
