package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٗۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10319e extends AbstractC11290e {
    public float Signature;
    public final C17097e adcel;
    public float admob;
    public float advert;
    public float amazon;
    public boolean billing;
    public float loadAd;
    public String mopub;
    public List purchase;
    public boolean remoteconfig;
    public float smaato;
    public Function1 startapp;
    public float subscription;
    public float[] vip;
    public C17985e yandex;
    public final ArrayList metrica = new ArrayList();
    public boolean license = true;
    public long appmetrica = C3618e.adcel;

    public C10319e() {
        int i = AbstractC13069e.ad;
        this.purchase = C13664e.f27089e;
        this.billing = true;
        this.adcel = new C17097e(20, this);
        this.mopub = BuildConfig.FLAVOR;
        this.loadAd = 1.0f;
        this.Signature = 1.0f;
        this.remoteconfig = true;
    }

    @Override // defpackage.AbstractC11290e
    public final void ad(InterfaceC2235e interfaceC2235e) {
        if (this.remoteconfig) {
            float[] fArr = this.vip;
            if (fArr == null) {
                fArr = C6739e.ad();
                this.vip = fArr;
            } else {
                C6739e.license(fArr);
            }
            C6739e.adcel(fArr, this.admob + this.smaato, this.subscription + this.amazon);
            C6739e.purchase(fArr, this.advert);
            C6739e.billing(fArr, this.loadAd, this.Signature);
            C6739e.adcel(fArr, -this.smaato, -this.amazon);
            this.remoteconfig = false;
        }
        if (this.billing) {
            if (!this.purchase.isEmpty()) {
                C17985e c17985e = this.yandex;
                if (c17985e == null) {
                    c17985e = AbstractC11972e.ad();
                    this.yandex = c17985e;
                }
                AbstractC17976e.purchase(this.purchase, c17985e);
            }
            this.billing = false;
        }
        C18478e mo782finally = interfaceC2235e.mo782finally();
        long m4560try = mo782finally.m4560try();
        mo782finally.m4557this().billing();
        try {
            C18478e c18478e = (C18478e) ((C5389e) mo782finally.f36228e).f11540e;
            float[] fArr2 = this.vip;
            if (fArr2 != null) {
                c18478e.m4557this().advert(fArr2);
            }
            C17985e c17985e2 = this.yandex;
            if (!this.purchase.isEmpty() && c17985e2 != null) {
                c18478e.m4557this().smaato(c17985e2);
            }
            ArrayList arrayList = this.metrica;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC11290e) arrayList.get(i)).ad(interfaceC2235e);
            }
        } finally {
            AbstractC0054e.m224this(mo782finally, m4560try);
        }
    }

    public final void appmetrica(int i, AbstractC11290e abstractC11290e) {
        ArrayList arrayList = this.metrica;
        if (i < arrayList.size()) {
            arrayList.set(i, abstractC11290e);
        } else {
            arrayList.add(abstractC11290e);
        }
        billing(abstractC11290e);
        abstractC11290e.license(this.adcel);
        metrica();
    }

    public final void billing(AbstractC11290e abstractC11290e) {
        if (!(abstractC11290e instanceof C16246e)) {
            if (abstractC11290e instanceof C10319e) {
                C10319e c10319e = (C10319e) abstractC11290e;
                if (c10319e.license && this.license) {
                    purchase(c10319e.appmetrica);
                    return;
                } else {
                    this.license = false;
                    this.appmetrica = C3618e.adcel;
                    return;
                }
            }
            return;
        }
        C16246e c16246e = (C16246e) abstractC11290e;
        AbstractC4457e abstractC4457e = c16246e.vip;
        if (this.license && abstractC4457e != null) {
            if (abstractC4457e instanceof C18466e) {
                purchase(((C18466e) abstractC4457e).ad);
            } else {
                this.license = false;
                this.appmetrica = C3618e.adcel;
            }
        }
        AbstractC4457e abstractC4457e2 = c16246e.billing;
        if (this.license && abstractC4457e2 != null) {
            if (abstractC4457e2 instanceof C18466e) {
                purchase(((C18466e) abstractC4457e2).ad);
            } else {
                this.license = false;
                this.appmetrica = C3618e.adcel;
            }
        }
    }

    @Override // defpackage.AbstractC11290e
    public final void license(C17097e c17097e) {
        this.startapp = c17097e;
    }

    public final void purchase(long j) {
        if (this.license && j != 16) {
            long j2 = this.appmetrica;
            if (j2 == 16) {
                this.appmetrica = j;
                return;
            }
            int i = AbstractC13069e.ad;
            if (C3618e.yandex(j2) == C3618e.yandex(j) && C3618e.billing(j2) == C3618e.billing(j) && C3618e.appmetrica(j2) == C3618e.appmetrica(j)) {
                return;
            }
            this.license = false;
            this.appmetrica = C3618e.adcel;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.mopub);
        ArrayList arrayList = this.metrica;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC11290e abstractC11290e = (AbstractC11290e) arrayList.get(i);
            sb.append("\t");
            sb.append(abstractC11290e.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override // defpackage.AbstractC11290e
    public final Function1 vip() {
        return this.startapp;
    }
}
