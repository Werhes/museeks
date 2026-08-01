package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٜؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5016e extends AbstractC10347e implements InterfaceC18435e, InterfaceC13086e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C0576e f10697e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f10698e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C0576e f10699e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C0576e f10700e;

    public C5016e() {
        super(0);
        this.f10698e = AbstractC9743e.vip();
        this.f10697e = AbstractC14533e.startapp(C16476e.ad);
        this.f10699e = AbstractC14533e.startapp(AbstractC13480e.m3575continue(AbstractC9001e.vip.keySet()));
        C7947e.ad.getClass();
        this.f10700e = AbstractC14533e.startapp(C7947e.metrica.ad());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: private, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable m1716private(defpackage.C5016e r5, defpackage.AbstractC10731e r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C3201e
            if (r0 == 0) goto L13
            r0 = r6
            eؚؕؔ r0 = (defpackage.C3201e) r0
            int r1 = r0.f7319e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7319e = r1
            goto L18
        L13:
            eؚؕؔ r0 = new eؚؕؔ
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r5 = r0.f7318e
            int r6 = r0.f7319e
            r1 = 1
            if (r6 == 0) goto L2d
            if (r6 != r1) goto L25
            defpackage.AbstractC2003e.purchase(r5)
            goto L4e
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r5)
            eٜؖؕ r5 = new eٜؖؕ
            r5.<init>()
            eؘؒؐ r6 = defpackage.C0308e.appmetrica
            eؑٔٝ r6 = defpackage.AbstractC18271e.metrica()
            eْۢؑ r6 = r6.vip
            java.lang.String r6 = r6.pro()
            r5.vip = r6
            r0.f7319e = r1
            java.lang.Object r5 = defpackage.AbstractC18406e.yandex(r5, r0)
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r5 != r6) goto L4e
            return r6
        L4e:
            ua.itaysonlab.catalogkit.objects.Catalog2Response r5 = (ua.itaysonlab.catalogkit.objects.Catalog2Response) r5
            eؕ۠ۖ r6 = new eؕ۠ۖ
            r6.<init>(r5)
            ua.itaysonlab.catalogkit.objects.Catalog2Root r0 = r5.ad
            ua.itaysonlab.catalogkit.objects.Catalog2Section r5 = r5.vip
            java.lang.String r1 = "Collection contains no element matching the predicate."
            if (r5 == 0) goto L61
            java.util.List r5 = r5.license
            if (r5 != 0) goto L8b
        L61:
            if (r0 == 0) goto L8a
            java.util.List r5 = r0.vip
            if (r5 == 0) goto L8a
            java.util.Iterator r5 = r5.iterator()
        L6b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r5.next()
            ua.itaysonlab.catalogkit.objects.Catalog2Section r2 = (ua.itaysonlab.catalogkit.objects.Catalog2Section) r2
            java.lang.String r3 = r2.ad
            java.lang.String r4 = r0.ad
            boolean r3 = defpackage.AbstractC7890e.billing(r3, r4)
            if (r3 == 0) goto L6b
            java.util.List r5 = r2.license
            goto L8b
        L84:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            r5.<init>(r1)
            throw r5
        L8a:
            r5 = 0
        L8b:
            if (r5 != 0) goto L8f
            eْۨٝ r5 = defpackage.C13664e.f27089e
        L8f:
            java.util.Iterator r5 = r5.iterator()
        L93:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Ld5
            java.lang.Object r0 = r5.next()
            ua.itaysonlab.catalogkit.objects.seals.Catalog2Block r0 = (ua.itaysonlab.catalogkit.objects.seals.Catalog2Block) r0
            ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout r2 = r0.getVip()
            boolean r2 = r2 instanceof defpackage.C12971e
            if (r2 == 0) goto L93
            java.util.Map r5 = r0.metrica(r6)
            java.util.Map r5 = defpackage.AbstractC9476e.metrica(r5)
            java.util.List r6 = r0.appmetrica()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        Lbc:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Ld4
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r5.get(r1)
            ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem r1 = (ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem) r1
            if (r1 == 0) goto Lbc
            r0.add(r1)
            goto Lbc
        Ld4:
            return r0
        Ld5:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            r5.<init>(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5016e.m1716private(eٌٜؗ, eُؑ۠):java.io.Serializable");
    }

    @Override // defpackage.InterfaceC13086e
    public final void adcel() {
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC6232e.billing(C11776e.ad, vKXApplication);
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f10698e.f29359e;
    }

    @Override // defpackage.AbstractC10347e, defpackage.AbstractC10716e, defpackage.AbstractC13859e
    public final void applovin() {
        super.applovin();
        adcel();
        AbstractC9743e.license(this, null);
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        c13770e.m3671package(-68135493);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            C5958e ad = AbstractC9083e.ad(c13770e);
            AbstractC13348e.ad(null, AbstractC16653e.license(-502228617, new C1743e(ad, this, 6), c13770e), null, null, null, 0, 0L, 0L, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).license(c13770e), AbstractC16653e.license(1860277260, new C8937e(this, ad, 4), c13770e), c13770e, 805306416, 253);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C16133e(this, i);
        }
    }

    @Override // defpackage.AbstractC13859e
    public final void isVip() {
        this.f10697e.setValue(C16476e.ad);
        AbstractC5336e.purchase(this, null, 0, new C1853e(this, (InterfaceC5083e) null, 19), 3);
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m1717strictfp(CustomCatalogBlockItem customCatalogBlockItem, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        c13770e.m3671package(874377520);
        int i2 = i | (c13770e.yandex(customCatalogBlockItem) ? 4 : 2) | (c13770e.purchase(interfaceC12864e) ? 32 : 16) | (c13770e.yandex(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            C0576e c0576e = this.f10699e;
            boolean purchase = c13770e.purchase((List) c0576e.getValue()) | c13770e.purchase(customCatalogBlockItem.license);
            Object m3681throw = c13770e.m3681throw();
            if (purchase || m3681throw == C2987e.ad) {
                m3681throw = Boolean.valueOf(((List) c0576e.getValue()).contains(customCatalogBlockItem.license));
                c13770e.m3682throws(m3681throw);
            }
            AbstractC16429e.ad(AbstractC16653e.license(1779492370, new C1309e(customCatalogBlockItem, 1), c13770e), AbstractC1376e.ad(interfaceC12864e, ((Boolean) m3681throw).booleanValue() ? 0.5f : 1.0f), null, null, AbstractC16653e.license(1283555982, new C1309e(customCatalogBlockItem, 0), c13770e), null, null, 0.0f, 0.0f, c13770e, 24582, 492);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4197e(this, customCatalogBlockItem, interfaceC12864e, i, 3);
        }
    }
}
