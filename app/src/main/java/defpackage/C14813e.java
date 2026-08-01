package defpackage;

import android.media.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٚۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14813e {
    public final C11642e ad;
    public long appmetrica;
    public long billing;
    public int license;
    public final C2362e metrica;
    public long purchase;
    public long startapp;
    public final int vip;
    public long yandex;

    public C14813e(AudioTrack audioTrack, C2362e c2362e) {
        this.ad = new C11642e(audioTrack);
        this.vip = audioTrack.getSampleRate();
        this.metrica = c2362e;
        ad(0);
    }

    public final void ad(int i) {
        this.license = i;
        if (i == 0) {
            this.billing = 0L;
            this.yandex = -1L;
            this.startapp = -9223372036854775807L;
            this.appmetrica = System.nanoTime() / 1000;
            this.purchase = 10000L;
            return;
        }
        if (i == 1) {
            this.purchase = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.purchase = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.purchase = 500000L;
        }
    }
}
