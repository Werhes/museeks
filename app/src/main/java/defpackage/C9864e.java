package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۣۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9864e {
    public final C4956e ad;
    public final C16911e vip;

    public C9864e(C4956e c4956e) {
        this.ad = c4956e;
        C18277e c18277e = (C18277e) c4956e.f10517e;
        this.vip = new C16911e((InterfaceC5334e) c18277e.vip, (C11980e) c18277e.mopub, 5);
    }

    public final AbstractC7919e ad(InterfaceC15498e interfaceC15498e) {
        if (interfaceC15498e instanceof InterfaceC9646e) {
            C12816e c12816e = ((AbstractC14941e) ((InterfaceC9646e) interfaceC15498e)).f29618e;
            C4956e c4956e = this.ad;
            return new C15385e(c12816e, (InterfaceC11824e) c4956e.f10513e, (C17221e) c4956e.f10515e, (InterfaceC7794e) c4956e.f10518e);
        }
        if (interfaceC15498e instanceof C7025e) {
            return ((C7025e) interfaceC15498e).f14373e;
        }
        return null;
    }

    public final C1069e appmetrica(C11505e c11505e, boolean z) {
        C4956e metrica;
        C8268e c8268e;
        C4956e c4956e = this.ad;
        InterfaceC5052e interfaceC5052e = (InterfaceC5052e) ((InterfaceC15498e) c4956e.f10512e);
        C1069e c1069e = new C1069e(interfaceC5052e, null, metrica(c11505e, c11505e.f23121e, 1), z, 1, c11505e, (InterfaceC11824e) c4956e.f10513e, (C17221e) c4956e.f10515e, (C5311e) c4956e.f10511e, (InterfaceC7794e) c4956e.f10518e, null);
        metrica = c4956e.metrica(c1069e, C13664e.f27089e, (InterfaceC11824e) c4956e.f10513e, (C17221e) c4956e.f10515e, (C5311e) c4956e.f10511e, (AbstractC8470e) c4956e.f10519e);
        List yandex = ((C9864e) metrica.f10516e).yandex(c11505e.f23116e, c11505e, 1);
        EnumC6217e enumC6217e = (EnumC6217e) AbstractC1787e.license.appmetrica(c11505e.f23121e);
        switch (enumC6217e == null ? -1 : AbstractC12419e.vip[enumC6217e.ordinal()]) {
            case 1:
                c8268e = AbstractC6050e.license;
                break;
            case 2:
                c8268e = AbstractC6050e.ad;
                break;
            case 3:
                c8268e = AbstractC6050e.vip;
                break;
            case 4:
                c8268e = AbstractC6050e.metrica;
                break;
            case 5:
                c8268e = AbstractC6050e.appmetrica;
                break;
            case 6:
                c8268e = AbstractC6050e.purchase;
                break;
            default:
                c8268e = AbstractC6050e.ad;
                break;
        }
        c1069e.m2287e(yandex, c8268e);
        c1069e.m3894e(interfaceC5052e.mo1458e());
        c1069e.f29672e = interfaceC5052e.mo1942e();
        c1069e.f29673e = !AbstractC1787e.loadAd.appmetrica(c11505e.f23121e).booleanValue();
        return c1069e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0169  */
    /* JADX WARN: Type inference failed for: r0v10, types: [eَؙٖ, package] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [eؗٞؓ] */
    /* JADX WARN: Type inference failed for: r1v5, types: [eَؙٖ, package] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [eؙِ۟, eٌَۢ] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C11580e billing(defpackage.C17485e r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9864e.billing(e٘ؒ, boolean):eؙِ۟");
    }

    public final InterfaceC2460e license(C17485e c17485e, boolean z) {
        return !AbstractC1787e.metrica.appmetrica(c17485e.f34273e).booleanValue() ? C4590e.f9885e : new C2953e((C6272e) ((C18277e) this.ad.f10517e).ad, new C11329e(this, z, c17485e));
    }

    public final InterfaceC2460e metrica(AbstractC0641e abstractC0641e, int i, int i2) {
        return !AbstractC1787e.metrica.appmetrica(i).booleanValue() ? C4590e.f9885e : new C2953e((C6272e) ((C18277e) this.ad.f10517e).ad, new C16188e(this, abstractC0641e, i2, 0));
    }

    public final C0530e purchase(C9920e c9920e) {
        int i;
        C4956e metrica;
        AbstractC1186e firebase;
        C4956e c4956e = this.ad;
        InterfaceC11824e interfaceC11824e = (InterfaceC11824e) c4956e.f10513e;
        C17221e c17221e = (C17221e) c4956e.f10515e;
        int i2 = 1;
        if ((c9920e.f19585e & 1) == 1) {
            i = c9920e.f19598e;
        } else {
            int i3 = c9920e.f19582e;
            i = ((i3 >> 8) << 6) + (i3 & 63);
        }
        int i4 = i;
        InterfaceC2460e metrica2 = metrica(c9920e, i4, 1);
        int i5 = c9920e.f19585e;
        InterfaceC2460e c2953e = ((i5 & 32) == 32 || (i5 & 64) == 64) ? new C2953e((C6272e) ((C18277e) c4956e.f10517e).ad, new C16188e(this, c9920e, i2, 1)) : C4590e.f9885e;
        C5311e c5311e = AbstractC2876e.billing((InterfaceC15498e) c4956e.f10512e).ad(AbstractC17487e.metrica(interfaceC11824e, c9920e.f19603e)).equals(AbstractC2087e.ad) ? C5311e.vip : (C5311e) c4956e.f10511e;
        InterfaceC2460e interfaceC2460e = c2953e;
        C0530e c0530e = new C0530e((InterfaceC15498e) c4956e.f10512e, null, metrica2, AbstractC17487e.metrica(interfaceC11824e, c9920e.f19603e), AbstractC7214e.billing((EnumC10237e) AbstractC1787e.Signature.appmetrica(i4)), c9920e, (InterfaceC11824e) c4956e.f10513e, c17221e, c5311e, (InterfaceC7794e) c4956e.f10518e, null);
        metrica = c4956e.metrica(c0530e, c9920e.f19600e, (InterfaceC11824e) c4956e.f10513e, (C17221e) c4956e.f10515e, (C5311e) c4956e.f10511e, (AbstractC8470e) c4956e.f10519e);
        C9864e c9864e = (C9864e) metrica.f10516e;
        C5306e c5306e = (C5306e) metrica.f10514e;
        C13212e loadAd = AbstractC17110e.loadAd(c9920e, c17221e);
        C16169e yandex = (loadAd == null || (firebase = c5306e.firebase(loadAd)) == null) ? null : AbstractC7518e.yandex(c0530e, firebase, interfaceC2460e);
        InterfaceC15498e interfaceC15498e = (InterfaceC15498e) c4956e.f10512e;
        InterfaceC5052e interfaceC5052e = interfaceC15498e instanceof InterfaceC5052e ? (InterfaceC5052e) interfaceC15498e : null;
        c0530e.mo405e(yandex, interfaceC5052e != null ? interfaceC5052e.mo1727e() : null, c9864e.vip(AbstractC17110e.metrica(c9920e, c17221e), c9920e.f19592e, c9920e, 1), c5306e.admob(), c9864e.yandex(c9920e.f19593e, c9920e, 1), c5306e.firebase(AbstractC17110e.admob(c9920e, c17221e)), C4524e.isPro((EnumC1034e) AbstractC1787e.appmetrica.appmetrica(i4)), AbstractC7214e.license((EnumC6217e) AbstractC1787e.license.appmetrica(i4)), C9139e.f18290e);
        c0530e.f29658e = AbstractC1787e.admob.appmetrica(i4).booleanValue();
        c0530e.f29662e = AbstractC1787e.subscription.appmetrica(i4).booleanValue();
        c0530e.f29663e = AbstractC1787e.signatures.appmetrica(i4).booleanValue();
        c0530e.f29661e = AbstractC1787e.remoteconfig.appmetrica(i4).booleanValue();
        c0530e.f29659e = AbstractC1787e.pro.appmetrica(i4).booleanValue();
        c0530e.f29670e = AbstractC1787e.tapsense.appmetrica(i4).booleanValue();
        c0530e.f29672e = AbstractC1787e.isVip.appmetrica(i4).booleanValue();
        c0530e.f29673e = !AbstractC1787e.inmobi.appmetrica(i4).booleanValue();
        ((C17354e) ((C18277e) c4956e.f10517e).advert).getClass();
        return c0530e;
    }

    public final ArrayList vip(List list, List list2, AbstractC0641e abstractC0641e, int i) {
        C9864e c9864e = this;
        C4956e c4956e = c9864e.ad;
        InterfaceC6647e interfaceC6647e = (InterfaceC6647e) ((InterfaceC15498e) c4956e.f10512e);
        AbstractC7919e ad = c9864e.ad(interfaceC6647e.mo1351switch());
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC6874e.Signature();
                throw null;
            }
            C13212e c13212e = (C13212e) obj;
            C10067e c10067e = (C10067e) AbstractC13480e.m3592native(i2, list2);
            C16169e vip = AbstractC7518e.vip(interfaceC6647e, ((C5306e) c4956e.f10514e).firebase(c13212e), null, (ad == null || !AbstractC1787e.metrica.appmetrica((c10067e == null || (c10067e.f19883e & 1) != 1) ? 0 : c10067e.f19888e).booleanValue()) ? C4590e.f9885e : new C2953e((C6272e) ((C18277e) c4956e.f10517e).ad, new C1027e(c9864e, ad, abstractC0641e, i, i2, c10067e, 1)), i2);
            if (vip != null) {
                arrayList.add(vip);
            }
            c9864e = this;
            i2 = i3;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [eٜؒؒ] */
    /* JADX WARN: Type inference failed for: r21v2 */
    public final List yandex(List list, AbstractC0641e abstractC0641e, int i) {
        int i2;
        C13212e c13212e;
        InterfaceC2460e interfaceC2460e;
        C9864e c9864e = this;
        C4956e c4956e = c9864e.ad;
        C17221e c17221e = (C17221e) c4956e.f10515e;
        C5306e c5306e = (C5306e) c4956e.f10514e;
        InterfaceC6647e interfaceC6647e = (InterfaceC6647e) ((InterfaceC15498e) c4956e.f10512e);
        AbstractC7919e ad = c9864e.ad(interfaceC6647e.mo1351switch());
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC6874e.Signature();
                throw null;
            }
            C10067e c10067e = (C10067e) obj;
            int i5 = (c10067e.f19883e & 1) == 1 ? c10067e.f19888e : 0;
            if (ad == null || !AbstractC1787e.metrica.appmetrica(i5).booleanValue()) {
                i2 = i3;
                c13212e = null;
                interfaceC2460e = C4590e.f9885e;
            } else {
                i2 = i3;
                c13212e = null;
                interfaceC2460e = new C2953e((C6272e) ((C18277e) c4956e.f10517e).ad, new C1027e(c9864e, ad, abstractC0641e, i, i2, c10067e, 0));
            }
            C0520e metrica = AbstractC17487e.metrica((InterfaceC11824e) c4956e.f10513e, c10067e.f19880e);
            AbstractC1186e firebase = c5306e.firebase(AbstractC17110e.pro(c10067e, c17221e));
            boolean booleanValue = AbstractC1787e.f4834goto.appmetrica(i5).booleanValue();
            boolean booleanValue2 = AbstractC1787e.f4838this.appmetrica(i5).booleanValue();
            boolean booleanValue3 = AbstractC1787e.f4836native.appmetrica(i5).booleanValue();
            int i6 = c10067e.f19883e;
            C13212e ad2 = (i6 & 16) == 16 ? c10067e.f19886e : (i6 & 32) == 32 ? c17221e.ad(c10067e.f19889e) : c13212e;
            ?? firebase2 = ad2 != null ? c5306e.firebase(ad2) : c13212e;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new C13043e(interfaceC6647e, null, i2, interfaceC2460e, metrica, firebase, booleanValue, booleanValue2, booleanValue3, firebase2, InterfaceC3054e.f7112e));
            arrayList = arrayList2;
            i3 = i4;
            c9864e = this;
        }
        return AbstractC13480e.m3575continue(arrayList);
    }
}
