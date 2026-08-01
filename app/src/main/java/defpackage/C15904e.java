package defpackage;

import android.text.Layout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؐۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15904e {
    public Layout.Alignment Signature;
    public String ad;
    public String advert;
    public boolean appmetrica;
    public int license;
    public Layout.Alignment loadAd;
    public boolean metrica;
    public float mopub;
    public String pro;
    public String signatures;
    public C14668e subscription;
    public int vip;
    public int purchase = -1;
    public int billing = -1;
    public int yandex = -1;
    public int startapp = -1;
    public int adcel = -1;
    public int smaato = -1;
    public int amazon = -1;
    public int admob = -1;
    public float remoteconfig = Float.MAX_VALUE;

    public final void ad(C15904e c15904e) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c15904e != null) {
            if (!this.metrica && c15904e.metrica) {
                this.vip = c15904e.vip;
                this.metrica = true;
            }
            if (this.yandex == -1) {
                this.yandex = c15904e.yandex;
            }
            if (this.startapp == -1) {
                this.startapp = c15904e.startapp;
            }
            if (this.ad == null && (str = c15904e.ad) != null) {
                this.ad = str;
            }
            if (this.purchase == -1) {
                this.purchase = c15904e.purchase;
            }
            if (this.billing == -1) {
                this.billing = c15904e.billing;
            }
            if (this.amazon == -1) {
                this.amazon = c15904e.amazon;
            }
            if (this.loadAd == null && (alignment2 = c15904e.loadAd) != null) {
                this.loadAd = alignment2;
            }
            if (this.Signature == null && (alignment = c15904e.Signature) != null) {
                this.Signature = alignment;
            }
            if (this.admob == -1) {
                this.admob = c15904e.admob;
            }
            if (this.adcel == -1) {
                this.adcel = c15904e.adcel;
                this.mopub = c15904e.mopub;
            }
            if (this.subscription == null) {
                this.subscription = c15904e.subscription;
            }
            if (this.remoteconfig == Float.MAX_VALUE) {
                this.remoteconfig = c15904e.remoteconfig;
            }
            if (this.pro == null) {
                this.pro = c15904e.pro;
            }
            if (this.signatures == null) {
                this.signatures = c15904e.signatures;
            }
            if (!this.appmetrica && c15904e.appmetrica) {
                this.license = c15904e.license;
                this.appmetrica = true;
            }
            if (this.smaato != -1 || (i = c15904e.smaato) == -1) {
                return;
            }
            this.smaato = i;
        }
    }
}
