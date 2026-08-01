package defpackage;

import androidx.car.app.model.Alert;
import java.util.HashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٛؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11100e {
    public final HashSet ad;
    public boolean adcel;
    public int appmetrica;
    public boolean billing;
    public int license;
    public final HashSet metrica;
    public C8770e mopub;
    public int purchase;
    public boolean startapp;
    public final HashSet vip;
    public boolean yandex;

    public C11100e() {
        this.ad = new HashSet();
        this.vip = new HashSet();
        this.metrica = new HashSet();
        this.license = Alert.DURATION_SHOW_INDEFINITELY;
        this.appmetrica = 0;
        this.adcel = false;
        this.mopub = C8770e.metrica;
    }

    public C11100e(C8778e c8778e) {
        HashSet hashSet = new HashSet();
        this.ad = hashSet;
        HashSet hashSet2 = new HashSet();
        this.vip = hashSet2;
        HashSet hashSet3 = new HashSet();
        this.metrica = hashSet3;
        this.license = Alert.DURATION_SHOW_INDEFINITELY;
        this.appmetrica = 0;
        this.adcel = false;
        C8770e c8770e = C8770e.vip;
        this.license = c8778e.ad;
        this.appmetrica = c8778e.vip;
        this.purchase = c8778e.metrica;
        this.mopub = c8778e.yandex;
        hashSet.addAll(c8778e.startapp);
        hashSet2.addAll(c8778e.adcel);
        hashSet3.addAll(c8778e.mopub);
        this.billing = c8778e.license;
        this.yandex = c8778e.appmetrica;
        this.startapp = c8778e.purchase;
        this.adcel = c8778e.billing;
    }

    public final void ad(int i) {
        this.metrica.add(Integer.valueOf(i));
    }

    public final void vip() {
        new C8778e(this);
    }
}
