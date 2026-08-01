package defpackage;

import androidx.recyclerview.widget.startapp;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۚؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7431e {
    public final InterfaceC7429e ad;
    public int appmetrica;
    public final C14052e license;
    public final startapp metrica;
    public final C2291e purchase;
    public final C7249e vip;

    public C7431e(startapp startappVar, C14052e c14052e, InterfaceC17064e interfaceC17064e, C7249e c7249e) {
        C2291e c2291e = new C2291e(this);
        this.purchase = c2291e;
        this.metrica = startappVar;
        this.license = c14052e;
        this.ad = interfaceC17064e.purchase(this);
        this.vip = c7249e;
        this.appmetrica = startappVar.billing();
        startappVar.f590e.registerObserver(c2291e);
    }
}
