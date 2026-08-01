package defpackage;

import java.util.ArrayList;
import java.util.Date;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0320e extends C0521e {
    public String admob;
    public EnumC12884e amazon;
    public Date loadAd;
    public String remoteconfig;
    public String subscription;
    public final ArrayList pro = new ArrayList();
    public final ArrayList signatures = new ArrayList();
    public final ArrayList tapsense = new ArrayList();
    public EnumC8849e Signature = EnumC8849e.f17774e;

    @Override // defpackage.C0521e
    public final C12894e ad() {
        C12894e billing = AbstractC1749e.billing(this);
        billing.metrica(this.amazon, "fileType");
        billing.metrica(this.loadAd, "timestamp");
        billing.metrica(this.Signature, "endian");
        billing.metrica(null, "audioEncoding");
        billing.metrica(this.admob, "name");
        billing.metrica(this.subscription, "author");
        billing.metrica(this.remoteconfig, "copyright");
        billing.metrica(this.pro, "applicationIdentifiers");
        billing.metrica(this.signatures, "comments");
        billing.metrica(this.tapsense, "annotations");
        return billing;
    }
}
