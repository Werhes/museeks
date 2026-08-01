package defpackage;

import java.net.Proxy;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15601e {
    public final C10651e ad;
    public final C13079e appmetrica;
    public final C2691e billing;
    public boolean license;
    public C6571e metrica;
    public final C6741e purchase;
    public Proxy vip;

    public C15601e() {
        C10651e c10651e = new C10651e();
        this.ad = c10651e;
        this.appmetrica = new C13079e(new C17642e(0, 0, C15601e.class, this, "vkProxyEnabled", "getVkProxyEnabled$core_release()Z"), c10651e);
        this.purchase = new C6741e(this);
        this.billing = new C2691e(15, this);
    }
}
