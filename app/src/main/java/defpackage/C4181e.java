package defpackage;

import android.media.AudioDeviceInfo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٙؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4181e {
    public final C16975e ad;
    public boolean appmetrica;
    public int billing;
    public boolean license;
    public AudioDeviceInfo metrica;
    public int purchase;
    public int startapp;
    public C3335e vip;
    public boolean yandex;

    public C4181e(C4181e c4181e) {
        this.ad = c4181e.ad;
        this.vip = c4181e.vip;
        this.metrica = c4181e.metrica;
        this.license = c4181e.license;
        this.appmetrica = c4181e.appmetrica;
        this.purchase = c4181e.purchase;
        this.billing = c4181e.billing;
        this.yandex = c4181e.yandex;
        this.startapp = c4181e.startapp;
    }

    public C4181e(C16975e c16975e) {
        this.ad = c16975e;
        this.vip = C3335e.startapp;
        this.purchase = 0;
        this.billing = -1;
        this.startapp = -1;
    }
}
