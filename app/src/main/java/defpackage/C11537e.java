package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؖۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11537e {
    public Uri ad;
    public Object adcel;
    public Map appmetrica;
    public long billing;
    public byte[] license;
    public int metrica;
    public long purchase;
    public int startapp;
    public long vip;
    public String yandex;

    public final C2435e ad() {
        AbstractC2301e.amazon(this.ad, "The uri must be set.");
        return new C2435e(this.ad, this.vip, this.metrica, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.adcel);
    }
}
