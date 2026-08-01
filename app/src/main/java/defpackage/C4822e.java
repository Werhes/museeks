package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؗٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4822e extends AbstractC10596e {
    public final long billing;
    public final long purchase;
    public final boolean startapp;
    public final long yandex;

    public C4822e(AbstractC6690e abstractC6690e, long j, long j2, boolean z) {
        super(abstractC6690e);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new C10889e(2, j, j2);
        }
        boolean z2 = false;
        if (abstractC6690e.yandex() != 1) {
            throw new C10889e(0);
        }
        C11501e smaato = abstractC6690e.smaato(0, new C11501e(), 0L);
        long max = Math.max(0L, j);
        if (!z && !smaato.mopub && max != 0 && !smaato.yandex) {
            throw new C10889e(1);
        }
        long max2 = j2 == Long.MIN_VALUE ? smaato.smaato : Math.max(0L, j2);
        long j3 = smaato.smaato;
        if (j3 != -9223372036854775807L) {
            max2 = max2 > j3 ? j3 : max2;
            if (max > max2) {
                max = max2;
            }
        }
        this.purchase = max;
        this.billing = max2;
        this.yandex = max2 != -9223372036854775807L ? max2 - max : -9223372036854775807L;
        if (smaato.startapp && (max2 == -9223372036854775807L || (j3 != -9223372036854775807L && max2 == j3))) {
            z2 = true;
        }
        this.startapp = z2;
    }

    @Override // defpackage.AbstractC10596e, defpackage.AbstractC6690e
    public final C6158e purchase(int i, C6158e c6158e, boolean z) {
        this.appmetrica.purchase(0, c6158e, z);
        long j = c6158e.appmetrica - this.purchase;
        long j2 = this.yandex;
        c6158e.startapp(c6158e.ad, c6158e.vip, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, C11541e.purchase, false);
        return c6158e;
    }

    @Override // defpackage.AbstractC10596e, defpackage.AbstractC6690e
    public final C11501e smaato(int i, C11501e c11501e, long j) {
        this.appmetrica.smaato(0, c11501e, 0L);
        long j2 = c11501e.Signature;
        long j3 = this.purchase;
        c11501e.Signature = j2 + j3;
        c11501e.smaato = this.yandex;
        c11501e.startapp = this.startapp;
        long j4 = c11501e.advert;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            c11501e.advert = max;
            long j5 = this.billing;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            c11501e.advert = max - j3;
        }
        long m2567switch = AbstractC9413e.m2567switch(j3);
        long j6 = c11501e.appmetrica;
        if (j6 != -9223372036854775807L) {
            c11501e.appmetrica = j6 + m2567switch;
        }
        long j7 = c11501e.purchase;
        if (j7 != -9223372036854775807L) {
            c11501e.purchase = j7 + m2567switch;
        }
        return c11501e;
    }
}
