package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؙِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10945e {
    public static final AbstractC12614e ad = AbstractC12614e.remoteconfig("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    public static final C1410e license;
    public static final C1410e metrica;
    public static final C1410e vip;

    /* JADX WARN: Type inference failed for: r0v8, types: [eّۗؐ, eْٗۤ] */
    static {
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        AbstractC8306e.ad(7, objArr);
        vip = AbstractC17475e.loadAd(7, objArr);
        Object[] objArr2 = {"auto", "app", "am"};
        AbstractC8306e.ad(3, objArr2);
        metrica = AbstractC17475e.loadAd(3, objArr2);
        license = AbstractC17475e.premium("_r", "_dbg");
        ?? abstractC12670e = new AbstractC12670e(4);
        abstractC12670e.purchase(AbstractC9408e.advert);
        abstractC12670e.purchase(AbstractC9408e.smaato);
        abstractC12670e.billing();
        AbstractC17475e.premium("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }
}
