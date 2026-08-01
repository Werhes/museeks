package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12143e implements InterfaceC1719e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ InterfaceC10481e metrica;
    public final /* synthetic */ InterfaceC1719e vip;

    public /* synthetic */ C12143e(InterfaceC1719e interfaceC1719e, InterfaceC10481e interfaceC10481e, int i) {
        this.ad = i;
        this.metrica = interfaceC10481e;
        this.vip = interfaceC1719e;
    }

    @Override // defpackage.InterfaceC1719e
    public final float ad(float f) {
        switch (this.ad) {
            case 0:
                return this.vip.ad(f);
            default:
                return this.vip.ad(f);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    public final int appmetrica() {
        switch (this.ad) {
            case 0:
                C3225e c3225e = (C3225e) AbstractC13480e.m3569abstract(((C4993e) this.metrica).yandex().mopub);
                if (c3225e != null) {
                    return c3225e.ad;
                }
                return 0;
            default:
                return ((C8518e) AbstractC13480e.m3570break(((AbstractC16904e) this.metrica).mopub().ad)).ad;
        }
    }

    public final int license() {
        switch (this.ad) {
            case 0:
                return ((C4993e) this.metrica).appmetrica.metrica.purchase();
            default:
                return ((AbstractC16904e) this.metrica).purchase;
        }
    }

    public final int metrica() {
        switch (this.ad) {
            case 0:
                return ((C4993e) this.metrica).appmetrica.vip.purchase();
            default:
                return ((AbstractC16904e) this.metrica).appmetrica;
        }
    }

    public final void purchase(int i) {
        switch (this.ad) {
            case 0:
                ((C4993e) this.metrica).mopub(i, 0, true);
                return;
            default:
                AbstractC16904e abstractC16904e = (AbstractC16904e) this.metrica;
                float amazon = abstractC16904e.amazon();
                abstractC16904e.remoteconfig(amazon != 0.0f ? 0 / amazon : 0.0f, i, true);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    public final int vip(int i) {
        Object obj;
        switch (this.ad) {
            case 0:
                C13648e yandex = ((C4993e) this.metrica).yandex();
                if (yandex.mopub.isEmpty()) {
                    return 0;
                }
                int metrica = metrica();
                if (i > appmetrica() || metrica > i) {
                    return ((i - metrica()) * AbstractC10003e.smaato(yandex)) - license();
                }
                ?? r0 = yandex.mopub;
                int size = r0.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        obj = r0.get(i2);
                        if (((C3225e) obj).ad != i) {
                            i2++;
                        }
                    } else {
                        obj = null;
                    }
                }
                C3225e c3225e = (C3225e) obj;
                if (c3225e != null) {
                    return c3225e.loadAd;
                }
                return 0;
            default:
                AbstractC16904e abstractC16904e = (AbstractC16904e) this.metrica;
                return (int) (AbstractC3062e.appmetrica(AbstractC15203e.billing(abstractC16904e) + AbstractC1561e.appmetrica(((abstractC16904e.amazon() * (i - ((C16330e) abstractC16904e.license.f17056e).purchase())) - (((C2616e) abstractC16904e.license.f17053e).purchase() * abstractC16904e.amazon())) + 0), abstractC16904e.yandex, abstractC16904e.billing) - AbstractC15203e.billing(abstractC16904e));
        }
    }
}
