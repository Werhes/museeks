package defpackage;

import java.util.Iterator;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٓٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13804e extends AbstractC16049e implements InterfaceC14776e {
    public final C6943e ad;
    public final boolean metrica;
    public final C2567e vip;

    public C13804e(C6943e c6943e, C2567e c2567e) {
        this.ad = c6943e;
        this.vip = c2567e;
        this.metrica = c2567e.ad.metrica.length() == 0;
    }

    @Override // defpackage.InterfaceC14776e
    public final boolean ad() {
        return this.metrica;
    }

    @Override // defpackage.AbstractC16049e
    public final C4721e admob() {
        return new C4721e("vk_audiobook", getAd(), this.vip.ad.metrica);
    }

    @Override // defpackage.AbstractC16049e
    /* renamed from: advert */
    public final String getAd() {
        C2662e c2662e = (C2662e) AbstractC13480e.m3604this(this.ad.metrica);
        String str = c2662e != null ? c2662e.license : null;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    @Override // defpackage.AbstractC16049e
    public final int amazon() {
        return this.vip.ad.ad;
    }

    @Override // defpackage.AbstractC16049e
    /* renamed from: loadAd */
    public final String getAd() {
        return this.ad.mopub + '_' + this.vip.vip;
    }

    @Override // defpackage.AbstractC16049e
    public final String mopub() {
        String str = this.ad.pro;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    @Override // defpackage.AbstractC16049e
    public final String pro() {
        return "application/x-mpegURL";
    }

    @Override // defpackage.AbstractC16049e
    public final String remoteconfig() {
        return "vk_audiobook";
    }

    @Override // defpackage.AbstractC16049e
    /* renamed from: smaato */
    public final String getLicense() {
        Object next;
        Iterator it = this.ad.billing.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i = ((C4059e) next).ad;
                do {
                    Object next2 = it.next();
                    int i2 = ((C4059e) next2).ad;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        C4059e c4059e = (C4059e) next;
        String str = c4059e != null ? c4059e.vip : null;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    @Override // defpackage.AbstractC16049e
    /* renamed from: subscription */
    public final String getVip() {
        return this.vip.purchase;
    }
}
