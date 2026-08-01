package defpackage;

import defpackage.AbstractC11409e;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Leٕٓؓ;", "Leُۧ۠;", "N", "Leِٝؓ;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٕٓؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC13992e<N extends AbstractC11409e> extends AbstractC11865e {
    public abstract float Signature();

    public abstract long adcel();

    public final void admob(AbstractC11409e abstractC11409e) {
        long adcel = adcel();
        if (!C3618e.metrica(abstractC11409e.f22945e, adcel)) {
            abstractC11409e.f22945e = adcel;
            abstractC11409e.mo1475e();
        }
        long smaato = smaato();
        if (!C3618e.metrica(abstractC11409e.f22944e, smaato)) {
            abstractC11409e.f22944e = smaato;
            abstractC11409e.mo1475e();
        }
        C13121e advert = advert();
        if (!AbstractC7890e.billing(abstractC11409e.f22951e, advert)) {
            abstractC11409e.f22951e = advert;
            abstractC11409e.mo1473e();
        }
        C13121e amazon = amazon();
        if (!AbstractC7890e.billing(abstractC11409e.f22954e, amazon)) {
            abstractC11409e.f22954e = amazon;
            abstractC11409e.mo1473e();
        }
        float mopub = mopub();
        if (!C15765e.vip(abstractC11409e.f22943e, mopub)) {
            abstractC11409e.f22943e = mopub;
            abstractC11409e.mo1473e();
        }
        float Signature = Signature();
        if (!C15765e.vip(abstractC11409e.f22949e, Signature)) {
            abstractC11409e.f22949e = Signature;
            abstractC11409e.m3205e();
            abstractC11409e.mo1473e();
        }
        float loadAd = loadAd();
        if (C15765e.vip(abstractC11409e.f22952e, loadAd)) {
            return;
        }
        abstractC11409e.f22952e = loadAd;
        abstractC11409e.m3205e();
        abstractC11409e.mo1473e();
    }

    public abstract C13121e advert();

    public abstract C13121e amazon();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC13992e)) {
            return false;
        }
        AbstractC13992e abstractC13992e = (AbstractC13992e) obj;
        return C3618e.metrica(adcel(), abstractC13992e.adcel()) && C3618e.metrica(smaato(), abstractC13992e.smaato()) && AbstractC7890e.billing(advert(), abstractC13992e.advert()) && AbstractC7890e.billing(amazon(), abstractC13992e.amazon()) && C15765e.vip(mopub(), abstractC13992e.mopub()) && C15765e.vip(Signature(), abstractC13992e.Signature()) && C15765e.vip(loadAd(), abstractC13992e.loadAd());
    }

    public int hashCode() {
        long adcel = adcel();
        int i = C3618e.mopub;
        return Float.floatToIntBits(loadAd()) + AbstractC1414e.license(AbstractC1414e.license((amazon().hashCode() + ((advert().hashCode() + AbstractC5087e.m1744class(C10994e.ad(adcel) * 31, smaato(), 31)) * 31)) * 31, mopub(), 31), Signature(), 31);
    }

    public abstract float loadAd();

    public abstract float mopub();

    public abstract long smaato();
}
