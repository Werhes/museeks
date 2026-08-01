package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13137e {
    public long ad;
    public long appmetrica;
    public final boolean[] billing = new boolean[15];
    public long license;
    public long metrica;
    public long purchase;
    public long vip;
    public int yandex;

    public final boolean ad() {
        return this.license > 15 && this.yandex == 0;
    }

    public final void metrica() {
        this.license = 0L;
        this.appmetrica = 0L;
        this.purchase = 0L;
        this.yandex = 0;
        Arrays.fill(this.billing, false);
    }

    public final void vip(long j) {
        long j2 = this.license;
        if (j2 == 0) {
            this.ad = j;
        } else if (j2 == 1) {
            long j3 = j - this.ad;
            this.vip = j3;
            this.purchase = j3;
            this.appmetrica = 1L;
        } else {
            long j4 = j - this.metrica;
            int i = (int) (j2 % 15);
            long abs = Math.abs(j4 - this.vip);
            boolean[] zArr = this.billing;
            if (abs <= 1000000) {
                this.appmetrica++;
                this.purchase += j4;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.yandex--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.yandex++;
            }
        }
        this.license++;
        this.metrica = j;
    }
}
