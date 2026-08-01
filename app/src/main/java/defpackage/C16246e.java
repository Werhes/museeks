package defpackage;

import android.graphics.Path;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٖٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16246e extends AbstractC11290e {
    public boolean Signature;
    public float adcel;
    public C13121e admob;
    public float advert;
    public boolean amazon;
    public float appmetrica;
    public AbstractC4457e billing;
    public List license;
    public boolean loadAd;
    public float metrica = 1.0f;
    public float mopub;
    public C17985e pro;
    public float purchase;
    public C17985e remoteconfig;
    public final Object signatures;
    public float smaato;
    public int startapp;
    public final C17985e subscription;
    public AbstractC4457e vip;
    public int yandex;

    public C16246e() {
        int i = AbstractC13069e.ad;
        this.license = C13664e.f27089e;
        this.appmetrica = 1.0f;
        this.yandex = 0;
        this.startapp = 0;
        this.adcel = 4.0f;
        this.advert = 1.0f;
        this.amazon = true;
        this.loadAd = true;
        C17985e ad = AbstractC11972e.ad();
        this.subscription = ad;
        this.remoteconfig = ad;
        this.signatures = AbstractC18039e.appmetrica(3, C7309e.f14940e);
    }

    @Override // defpackage.AbstractC11290e
    public final void ad(InterfaceC2235e interfaceC2235e) {
        C13121e c13121e;
        if (this.amazon) {
            AbstractC17976e.purchase(this.license, this.subscription);
            appmetrica();
        } else if (this.Signature) {
            appmetrica();
        }
        this.amazon = false;
        this.Signature = false;
        AbstractC4457e abstractC4457e = this.vip;
        if (abstractC4457e != null) {
            AbstractC4653e.loadAd(interfaceC2235e, this.remoteconfig, abstractC4457e, this.metrica, null, null, 0, 56);
        }
        AbstractC4457e abstractC4457e2 = this.billing;
        if (abstractC4457e2 != null) {
            C13121e c13121e2 = this.admob;
            if (this.loadAd || c13121e2 == null) {
                C13121e c13121e3 = new C13121e(this.purchase, this.adcel, this.yandex, this.startapp, null, 16);
                this.admob = c13121e3;
                this.loadAd = false;
                c13121e = c13121e3;
            } else {
                c13121e = c13121e2;
            }
            AbstractC4653e.loadAd(interfaceC2235e, this.remoteconfig, abstractC4457e2, this.appmetrica, c13121e, null, 0, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, eؕٛؓ] */
    public final void appmetrica() {
        float f = this.mopub;
        C17985e c17985e = this.subscription;
        if (f == 0.0f && this.advert == 1.0f) {
            this.remoteconfig = c17985e;
            return;
        }
        if (AbstractC7890e.billing(this.remoteconfig, c17985e)) {
            this.remoteconfig = AbstractC11972e.ad();
        } else {
            int i = this.remoteconfig.ad.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.remoteconfig.startapp();
            this.remoteconfig.adcel(i);
        }
        ?? r0 = this.signatures;
        ((C7357e) r0.getValue()).vip(c17985e);
        float length = ((C7357e) r0.getValue()).ad.getLength();
        float f2 = this.mopub;
        float f3 = this.smaato;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.advert + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((C7357e) r0.getValue()).ad(f4, f5, this.remoteconfig);
            return;
        }
        C17985e c17985e2 = this.pro;
        if (c17985e2 == null) {
            c17985e2 = AbstractC11972e.ad();
            this.pro = c17985e2;
        }
        c17985e2.yandex();
        ((C7357e) r0.getValue()).ad(f4, length, c17985e2);
        this.remoteconfig.ad(c17985e2, 0L);
        c17985e2.yandex();
        ((C7357e) r0.getValue()).ad(0.0f, f5, c17985e2);
        this.remoteconfig.ad(c17985e2, 0L);
    }

    public final String toString() {
        return this.subscription.toString();
    }
}
