package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٗۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13304e extends AbstractC12670e {
    @Override // defpackage.AbstractC13584e
    public final AbstractC13584e ad(Object obj) {
        metrica(obj);
        return this;
    }

    public final C1410e billing() {
        this.metrica = true;
        return AbstractC17475e.loadAd(this.vip, this.ad);
    }

    public final void purchase(Object... objArr) {
        int length = objArr.length;
        AbstractC8306e.ad(length, objArr);
        appmetrica(length);
        System.arraycopy(objArr, 0, this.ad, this.vip, length);
        this.vip += length;
    }
}
