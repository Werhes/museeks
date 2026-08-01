package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؗٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7746e implements InterfaceC14306e {
    public final /* synthetic */ C13713e ad;
    public final /* synthetic */ float appmetrica;
    public final /* synthetic */ InterfaceC2661e billing;
    public final /* synthetic */ C16005e license;
    public final /* synthetic */ Function0 metrica;
    public final /* synthetic */ InterfaceC18435e purchase;
    public final /* synthetic */ C9040e vip;

    public C7746e(C13713e c13713e, C9040e c9040e, InterfaceC9959e interfaceC9959e, C16005e c16005e, float f, InterfaceC18435e interfaceC18435e, InterfaceC2661e interfaceC2661e) {
        this.ad = c13713e;
        this.vip = c9040e;
        this.metrica = interfaceC9959e;
        this.license = c16005e;
        this.appmetrica = f;
        this.purchase = interfaceC18435e;
        this.billing = interfaceC2661e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.List] */
    @Override // defpackage.InterfaceC14306e
    public final InterfaceC17242e ad(C14856e c14856e, long j) {
        C0085e c0085e;
        int purchase;
        InterfaceC7183e interfaceC7183e = c14856e.f29400e;
        C16005e c16005e = this.license;
        float f = c16005e.license;
        float f2 = c16005e.vip;
        C13713e c13713e = this.ad;
        c13713e.tapsense.getValue();
        boolean z = c13713e.ad || interfaceC7183e.mo398transient();
        AbstractC11203e.vip(j, EnumC17426e.f34146e);
        C9040e c9040e = this.vip;
        if (c9040e.license != null && C5602e.vip(c9040e.vip, j) && c9040e.metrica == interfaceC7183e.vip()) {
            c0085e = c9040e.license;
        } else {
            c9040e.vip = j;
            c9040e.metrica = interfaceC7183e.vip();
            C0085e c0085e2 = (C0085e) c9040e.ad.invoke(c14856e, new C5602e(j));
            c9040e.license = c0085e2;
            c0085e = c0085e2;
        }
        C11842e c11842e = (C11842e) this.metrica.invoke();
        interfaceC7183e.getLayoutDirection();
        int mo493e = interfaceC7183e.mo493e(f2);
        interfaceC7183e.getLayoutDirection();
        int mo493e2 = interfaceC7183e.mo493e(f);
        int mo493e3 = interfaceC7183e.mo493e(AbstractC12220e.billing(c16005e, interfaceC7183e.getLayoutDirection()));
        int billing = (C5602e.billing(j) - mo493e) - mo493e2;
        long j2 = (mo493e & 4294967295L) | (mo493e3 << 32);
        int mo493e4 = interfaceC7183e.mo493e(AbstractC12220e.purchase(c16005e, interfaceC7183e.getLayoutDirection()) + AbstractC12220e.billing(c16005e, interfaceC7183e.getLayoutDirection()));
        int mo493e5 = interfaceC7183e.mo493e(f + f2);
        List metrica = AbstractC8677e.metrica(c11842e, c13713e.remoteconfig, c13713e.mopub);
        long ad = C5602e.ad(AbstractC2278e.billing(mo493e4, j), 0, AbstractC2278e.purchase(mo493e5, j), 0, 10, j);
        int mo493e6 = interfaceC7183e.mo493e(this.appmetrica);
        boolean mo398transient = interfaceC7183e.mo398transient();
        C8076e c8076e = c13713e.vip;
        C4036e c4036e = new C4036e(c13713e, metrica, c11842e, c0085e, ad, true, c14856e, billing, j2, mo493e, mo493e2, mo493e6, this.purchase, z, c8076e != null ? c8076e.smaato : null, this.billing);
        C2254e c2254e = c13713e.metrica;
        int[] iArr = (int[]) c2254e.f5732e;
        Object obj = c2254e.f5738e;
        Integer subs = AbstractC1660e.subs(iArr, 0);
        int license = AbstractC0259e.license(c11842e, obj, subs != null ? subs.intValue() : 0);
        if (!AbstractC1660e.startapp(iArr, license)) {
            ((C0705e) c2254e.f5735e).metrica(license);
            AbstractC13717e adcel = AbstractC12640e.adcel();
            Function1 appmetrica = adcel != null ? adcel.appmetrica() : null;
            AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
            try {
                iArr = (int[]) ((C14874e) c2254e.f5736e).invoke(Integer.valueOf(license), Integer.valueOf(iArr.length));
                AbstractC12640e.Signature(adcel, smaato, appmetrica);
                c2254e.f5732e = iArr;
                ((C16330e) c2254e.f5739e).startapp(C2254e.ad(iArr));
            } catch (Throwable th) {
                AbstractC12640e.Signature(adcel, smaato, appmetrica);
                throw th;
            }
        }
        int[] iArr2 = (int[]) c2254e.f5737e;
        int length = iArr.length;
        int i = c4036e.remoteconfig;
        if (length != i) {
            Csuper csuper = c4036e.subscription;
            csuper.m4648new();
            int[] iArr3 = new int[i];
            int i2 = 0;
            while (i2 < i) {
                if (i2 >= iArr.length || (purchase = iArr[i2]) == -1) {
                    purchase = i2 == 0 ? 0 : AbstractC1216e.purchase((0 << 32) | (i2 & 4294967295L), iArr3) + 1;
                }
                iArr3[i2] = purchase;
                csuper.m4649package(purchase, i2);
                i2++;
            }
            iArr = iArr3;
        }
        if (iArr2.length != i) {
            int[] iArr4 = new int[i];
            int i3 = 0;
            while (i3 < i) {
                iArr4[i3] = i3 < iArr2.length ? iArr2[i3] : i3 == 0 ? 0 : iArr4[i3 - 1];
                i3++;
            }
            iArr2 = iArr4;
        }
        C8076e billing2 = AbstractC1216e.billing(c4036e, Math.round((mo398transient || !c13713e.ad) ? c13713e.loadAd : ((Number) ((C16747e) c13713e.isVip.f20360e).f32835e.getValue()).floatValue()), iArr, iArr2, true);
        c13713e.purchase(billing2, interfaceC7183e.mo398transient(), false);
        return billing2;
    }
}
