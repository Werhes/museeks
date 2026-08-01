package defpackage;

import android.os.Trace;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6284e extends AbstractC13616e implements InterfaceC17303e, InterfaceC8501e, InterfaceC17453e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public int f13096e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public Function1 f13097e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public C13706e f13098e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public InterfaceC2141e f13099e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public C10566e f13100e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public C1839e f13101e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public C14216e f13102e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public Function1 f13103e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public Map f13104e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public C2752e f13105e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public int f13106e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public C2005e f13107e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public int f13108e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public List f13109e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public Function1 f13110e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public boolean f13111e;

    public C6284e(C10566e c10566e, C1839e c1839e, InterfaceC2141e interfaceC2141e, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, C2752e c2752e, Function1 function13) {
        this.f13100e = c10566e;
        this.f13101e = c1839e;
        this.f13099e = interfaceC2141e;
        this.f13097e = function1;
        this.f13108e = i;
        this.f13111e = z;
        this.f13096e = i2;
        this.f13106e = i3;
        this.f13109e = list;
        this.f13110e = function12;
        this.f13105e = c2752e;
        this.f13103e = function13;
    }

    @Override // defpackage.InterfaceC17303e
    public final int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC7861e.billing(m2147e(abstractC9292e).appmetrica(abstractC9292e.getLayoutDirection()).mo2750extends());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eٓۚؔ] */
    @Override // defpackage.InterfaceC17453e
    public final void adcel(InterfaceC15671e interfaceC15671e) {
        C14216e c14216e = this.f13102e;
        C14216e c14216e2 = c14216e;
        if (c14216e == null) {
            final int i = 0;
            ?? r0 = new Function1(this) { // from class: eٓۚؔ

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ C6284e f28082e;

                {
                    this.f28082e = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    C12476e c12476e;
                    boolean z;
                    switch (i) {
                        case 0:
                            List list = (List) obj;
                            C6284e c6284e = this.f28082e;
                            C12476e c12476e2 = c6284e.m2145e().amazon;
                            if (c12476e2 != null) {
                                C0676e c0676e = c12476e2.ad;
                                c12476e = new C12476e(new C0676e(c0676e.ad, C1839e.purchase(c6284e.f13101e, C3618e.adcel, 0L, null, null, null, 0L, 0, 0L, 16777214), c0676e.metrica, c0676e.license, c0676e.appmetrica, c0676e.purchase, c0676e.billing, c0676e.yandex, c0676e.startapp, c0676e.adcel), c12476e2.vip, c12476e2.metrica);
                                list.add(c12476e);
                            } else {
                                c12476e = null;
                            }
                            return Boolean.valueOf(c12476e != null);
                        case 1:
                            C10566e c10566e = (C10566e) obj;
                            C6284e c6284e2 = this.f28082e;
                            C13706e c13706e = c6284e2.f13098e;
                            C13664e c13664e = C13664e.f27089e;
                            if (c13706e == null) {
                                C13706e c13706e2 = new C13706e(c6284e2.f13100e, c10566e);
                                C2005e c2005e = new C2005e(c10566e, c6284e2.f13101e, c6284e2.f13099e, c6284e2.f13108e, c6284e2.f13111e, c6284e2.f13096e, c6284e2.f13106e, c13664e);
                                c2005e.license(c6284e2.m2145e().adcel);
                                c13706e2.license = c2005e;
                                c6284e2.f13098e = c13706e2;
                            } else if (!AbstractC7890e.billing(c10566e, c13706e.vip)) {
                                c13706e.vip = c10566e;
                                C2005e c2005e2 = c13706e.license;
                                if (c2005e2 != null) {
                                    C1839e c1839e = c6284e2.f13101e;
                                    InterfaceC2141e interfaceC2141e = c6284e2.f13099e;
                                    int i2 = c6284e2.f13108e;
                                    boolean z2 = c6284e2.f13111e;
                                    int i3 = c6284e2.f13096e;
                                    int i4 = c6284e2.f13106e;
                                    c2005e2.ad = c10566e;
                                    boolean license = c1839e.license(c2005e2.mopub);
                                    c2005e2.mopub = c1839e;
                                    if (!license) {
                                        c2005e2.admob <<= 2;
                                        c2005e2.advert = null;
                                        c2005e2.amazon = null;
                                        c2005e2.Signature = -1;
                                        c2005e2.loadAd = -1;
                                    }
                                    c2005e2.vip = interfaceC2141e;
                                    c2005e2.metrica = i2;
                                    c2005e2.license = z2;
                                    c2005e2.appmetrica = i3;
                                    c2005e2.purchase = i4;
                                    c2005e2.billing = c13664e;
                                    c2005e2.admob = (c2005e2.admob << 2) | 2;
                                    c2005e2.advert = null;
                                    c2005e2.amazon = null;
                                    c2005e2.Signature = -1;
                                    c2005e2.loadAd = -1;
                                }
                            }
                            AbstractC15118e.appmetrica(c6284e2);
                            AbstractC1599e.purchase(c6284e2);
                            AbstractC12640e.advert(c6284e2);
                            return Boolean.TRUE;
                        default:
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            C6284e c6284e3 = this.f28082e;
                            C13706e c13706e3 = c6284e3.f13098e;
                            if (c13706e3 == null) {
                                z = false;
                            } else {
                                Function1 function1 = c6284e3.f13103e;
                                if (function1 != null) {
                                    function1.invoke(c13706e3);
                                }
                                C13706e c13706e4 = c6284e3.f13098e;
                                if (c13706e4 != null) {
                                    c13706e4.metrica = booleanValue;
                                }
                                AbstractC15118e.appmetrica(c6284e3);
                                AbstractC1599e.purchase(c6284e3);
                                AbstractC12640e.advert(c6284e3);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.f13102e = r0;
            c14216e2 = r0;
        }
        C10566e c10566e = this.f13100e;
        InterfaceC8614e[] interfaceC8614eArr = AbstractC14594e.ad;
        interfaceC15671e.appmetrica(AbstractC9058e.subs, Collections.singletonList(c10566e));
        C13706e c13706e = this.f13098e;
        if (c13706e != null) {
            C10566e c10566e2 = c13706e.vip;
            C16591e c16591e = AbstractC9058e.crashlytics;
            InterfaceC8614e[] interfaceC8614eArr2 = AbstractC14594e.ad;
            InterfaceC8614e interfaceC8614e = interfaceC8614eArr2[16];
            interfaceC15671e.appmetrica(c16591e, c10566e2);
            boolean z = c13706e.metrica;
            C16591e c16591e2 = AbstractC9058e.firebase;
            InterfaceC8614e interfaceC8614e2 = interfaceC8614eArr2[17];
            interfaceC15671e.appmetrica(c16591e2, Boolean.valueOf(z));
        }
        final int i2 = 1;
        interfaceC15671e.appmetrica(AbstractC10789e.advert, new C10591e(null, new Function1(this) { // from class: eٓۚؔ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C6284e f28082e;

            {
                this.f28082e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C12476e c12476e;
                boolean z2;
                switch (i2) {
                    case 0:
                        List list = (List) obj;
                        C6284e c6284e = this.f28082e;
                        C12476e c12476e2 = c6284e.m2145e().amazon;
                        if (c12476e2 != null) {
                            C0676e c0676e = c12476e2.ad;
                            c12476e = new C12476e(new C0676e(c0676e.ad, C1839e.purchase(c6284e.f13101e, C3618e.adcel, 0L, null, null, null, 0L, 0, 0L, 16777214), c0676e.metrica, c0676e.license, c0676e.appmetrica, c0676e.purchase, c0676e.billing, c0676e.yandex, c0676e.startapp, c0676e.adcel), c12476e2.vip, c12476e2.metrica);
                            list.add(c12476e);
                        } else {
                            c12476e = null;
                        }
                        return Boolean.valueOf(c12476e != null);
                    case 1:
                        C10566e c10566e3 = (C10566e) obj;
                        C6284e c6284e2 = this.f28082e;
                        C13706e c13706e2 = c6284e2.f13098e;
                        C13664e c13664e = C13664e.f27089e;
                        if (c13706e2 == null) {
                            C13706e c13706e22 = new C13706e(c6284e2.f13100e, c10566e3);
                            C2005e c2005e = new C2005e(c10566e3, c6284e2.f13101e, c6284e2.f13099e, c6284e2.f13108e, c6284e2.f13111e, c6284e2.f13096e, c6284e2.f13106e, c13664e);
                            c2005e.license(c6284e2.m2145e().adcel);
                            c13706e22.license = c2005e;
                            c6284e2.f13098e = c13706e22;
                        } else if (!AbstractC7890e.billing(c10566e3, c13706e2.vip)) {
                            c13706e2.vip = c10566e3;
                            C2005e c2005e2 = c13706e2.license;
                            if (c2005e2 != null) {
                                C1839e c1839e = c6284e2.f13101e;
                                InterfaceC2141e interfaceC2141e = c6284e2.f13099e;
                                int i22 = c6284e2.f13108e;
                                boolean z22 = c6284e2.f13111e;
                                int i3 = c6284e2.f13096e;
                                int i4 = c6284e2.f13106e;
                                c2005e2.ad = c10566e3;
                                boolean license = c1839e.license(c2005e2.mopub);
                                c2005e2.mopub = c1839e;
                                if (!license) {
                                    c2005e2.admob <<= 2;
                                    c2005e2.advert = null;
                                    c2005e2.amazon = null;
                                    c2005e2.Signature = -1;
                                    c2005e2.loadAd = -1;
                                }
                                c2005e2.vip = interfaceC2141e;
                                c2005e2.metrica = i22;
                                c2005e2.license = z22;
                                c2005e2.appmetrica = i3;
                                c2005e2.purchase = i4;
                                c2005e2.billing = c13664e;
                                c2005e2.admob = (c2005e2.admob << 2) | 2;
                                c2005e2.advert = null;
                                c2005e2.amazon = null;
                                c2005e2.Signature = -1;
                                c2005e2.loadAd = -1;
                            }
                        }
                        AbstractC15118e.appmetrica(c6284e2);
                        AbstractC1599e.purchase(c6284e2);
                        AbstractC12640e.advert(c6284e2);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        C6284e c6284e3 = this.f28082e;
                        C13706e c13706e3 = c6284e3.f13098e;
                        if (c13706e3 == null) {
                            z2 = false;
                        } else {
                            Function1 function1 = c6284e3.f13103e;
                            if (function1 != null) {
                                function1.invoke(c13706e3);
                            }
                            C13706e c13706e4 = c6284e3.f13098e;
                            if (c13706e4 != null) {
                                c13706e4.metrica = booleanValue;
                            }
                            AbstractC15118e.appmetrica(c6284e3);
                            AbstractC1599e.purchase(c6284e3);
                            AbstractC12640e.advert(c6284e3);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final int i3 = 2;
        interfaceC15671e.appmetrica(AbstractC10789e.smaato, new C10591e(null, new Function1(this) { // from class: eٓۚؔ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C6284e f28082e;

            {
                this.f28082e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C12476e c12476e;
                boolean z2;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        C6284e c6284e = this.f28082e;
                        C12476e c12476e2 = c6284e.m2145e().amazon;
                        if (c12476e2 != null) {
                            C0676e c0676e = c12476e2.ad;
                            c12476e = new C12476e(new C0676e(c0676e.ad, C1839e.purchase(c6284e.f13101e, C3618e.adcel, 0L, null, null, null, 0L, 0, 0L, 16777214), c0676e.metrica, c0676e.license, c0676e.appmetrica, c0676e.purchase, c0676e.billing, c0676e.yandex, c0676e.startapp, c0676e.adcel), c12476e2.vip, c12476e2.metrica);
                            list.add(c12476e);
                        } else {
                            c12476e = null;
                        }
                        return Boolean.valueOf(c12476e != null);
                    case 1:
                        C10566e c10566e3 = (C10566e) obj;
                        C6284e c6284e2 = this.f28082e;
                        C13706e c13706e2 = c6284e2.f13098e;
                        C13664e c13664e = C13664e.f27089e;
                        if (c13706e2 == null) {
                            C13706e c13706e22 = new C13706e(c6284e2.f13100e, c10566e3);
                            C2005e c2005e = new C2005e(c10566e3, c6284e2.f13101e, c6284e2.f13099e, c6284e2.f13108e, c6284e2.f13111e, c6284e2.f13096e, c6284e2.f13106e, c13664e);
                            c2005e.license(c6284e2.m2145e().adcel);
                            c13706e22.license = c2005e;
                            c6284e2.f13098e = c13706e22;
                        } else if (!AbstractC7890e.billing(c10566e3, c13706e2.vip)) {
                            c13706e2.vip = c10566e3;
                            C2005e c2005e2 = c13706e2.license;
                            if (c2005e2 != null) {
                                C1839e c1839e = c6284e2.f13101e;
                                InterfaceC2141e interfaceC2141e = c6284e2.f13099e;
                                int i22 = c6284e2.f13108e;
                                boolean z22 = c6284e2.f13111e;
                                int i32 = c6284e2.f13096e;
                                int i4 = c6284e2.f13106e;
                                c2005e2.ad = c10566e3;
                                boolean license = c1839e.license(c2005e2.mopub);
                                c2005e2.mopub = c1839e;
                                if (!license) {
                                    c2005e2.admob <<= 2;
                                    c2005e2.advert = null;
                                    c2005e2.amazon = null;
                                    c2005e2.Signature = -1;
                                    c2005e2.loadAd = -1;
                                }
                                c2005e2.vip = interfaceC2141e;
                                c2005e2.metrica = i22;
                                c2005e2.license = z22;
                                c2005e2.appmetrica = i32;
                                c2005e2.purchase = i4;
                                c2005e2.billing = c13664e;
                                c2005e2.admob = (c2005e2.admob << 2) | 2;
                                c2005e2.advert = null;
                                c2005e2.amazon = null;
                                c2005e2.Signature = -1;
                                c2005e2.loadAd = -1;
                            }
                        }
                        AbstractC15118e.appmetrica(c6284e2);
                        AbstractC1599e.purchase(c6284e2);
                        AbstractC12640e.advert(c6284e2);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        C6284e c6284e3 = this.f28082e;
                        C13706e c13706e3 = c6284e3.f13098e;
                        if (c13706e3 == null) {
                            z2 = false;
                        } else {
                            Function1 function1 = c6284e3.f13103e;
                            if (function1 != null) {
                                function1.invoke(c13706e3);
                            }
                            C13706e c13706e4 = c6284e3.f13098e;
                            if (c13706e4 != null) {
                                c13706e4.metrica = booleanValue;
                            }
                            AbstractC15118e.appmetrica(c6284e3);
                            AbstractC1599e.purchase(c6284e3);
                            AbstractC12640e.advert(c6284e3);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        interfaceC15671e.appmetrica(AbstractC10789e.amazon, new C10591e(null, new C5671e(14, this)));
        AbstractC14594e.vip(interfaceC15671e, c14216e2);
    }

    @Override // defpackage.InterfaceC17303e
    public final int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return m2147e(abstractC9292e).ad(i, abstractC9292e.getLayoutDirection());
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: break */
    public final /* synthetic */ boolean mo358break() {
        return false;
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: case */
    public final /* synthetic */ void mo292case() {
    }

    /* renamed from: eؒٚۨ, reason: contains not printable characters */
    public final C2005e m2145e() {
        if (this.f13107e == null) {
            this.f13107e = new C2005e(this.f13100e, this.f13101e, this.f13099e, this.f13108e, this.f13111e, this.f13096e, this.f13106e, this.f13109e);
        }
        return this.f13107e;
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: eؒۖۗ */
    public final /* synthetic */ boolean mo359e() {
        return false;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؚؚؓ */
    public final boolean mo293e() {
        return false;
    }

    /* renamed from: eؚٜ۠, reason: contains not printable characters */
    public final boolean m2146e(C1839e c1839e, List list, int i, int i2, boolean z, InterfaceC2141e interfaceC2141e, int i3) {
        boolean z2 = !this.f13101e.license(c1839e);
        this.f13101e = c1839e;
        if (!AbstractC7890e.billing(this.f13109e, list)) {
            this.f13109e = list;
            z2 = true;
        }
        if (this.f13106e != i) {
            this.f13106e = i;
            z2 = true;
        }
        if (this.f13096e != i2) {
            this.f13096e = i2;
            z2 = true;
        }
        if (this.f13111e != z) {
            this.f13111e = z;
            z2 = true;
        }
        if (!AbstractC7890e.billing(this.f13099e, interfaceC2141e)) {
            this.f13099e = interfaceC2141e;
            z2 = true;
        }
        if (this.f13108e == i3) {
            return z2;
        }
        this.f13108e = i3;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    @Override // defpackage.InterfaceC8501e
    /* renamed from: eُؚٕ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo294e(defpackage.C4017e r27) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6284e.mo294e(eَؖؓ):void");
    }

    /* renamed from: eّّۚ, reason: contains not printable characters */
    public final C2005e m2147e(InterfaceC14388e interfaceC14388e) {
        C2005e c2005e;
        C13706e c13706e = this.f13098e;
        if (c13706e != null && c13706e.metrica && (c2005e = c13706e.license) != null) {
            c2005e.license(interfaceC14388e);
            return c2005e;
        }
        C2005e m2145e = m2145e();
        m2145e.license(interfaceC14388e);
        return m2145e;
    }

    /* renamed from: eًْٕ, reason: contains not printable characters */
    public final boolean m2148e(C10566e c10566e) {
        boolean billing = AbstractC7890e.billing(this.f13100e.f20850e, c10566e.f20850e);
        boolean z = (billing && AbstractC7890e.billing(this.f13100e.f20852e, c10566e.f20852e)) ? false : true;
        if (z) {
            this.f13100e = c10566e;
        }
        if (!billing) {
            this.f13098e = null;
        }
        return z;
    }

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final void m2149e(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            C2005e m2145e = m2145e();
            C10566e c10566e = this.f13100e;
            C1839e c1839e = this.f13101e;
            InterfaceC2141e interfaceC2141e = this.f13099e;
            int i = this.f13108e;
            boolean z5 = this.f13111e;
            int i2 = this.f13096e;
            int i3 = this.f13106e;
            List list = this.f13109e;
            m2145e.ad = c10566e;
            boolean license = c1839e.license(m2145e.mopub);
            m2145e.mopub = c1839e;
            if (!license) {
                m2145e.admob <<= 2;
                m2145e.advert = null;
                m2145e.amazon = null;
                m2145e.Signature = -1;
                m2145e.loadAd = -1;
            }
            m2145e.vip = interfaceC2141e;
            m2145e.metrica = i;
            m2145e.license = z5;
            m2145e.appmetrica = i2;
            m2145e.purchase = i3;
            m2145e.billing = list;
            m2145e.admob = (m2145e.admob << 2) | 2;
            m2145e.advert = null;
            m2145e.amazon = null;
            m2145e.Signature = -1;
            m2145e.loadAd = -1;
        }
        if (this.f27016e) {
            if (z2 || (z && this.f13102e != null)) {
                AbstractC15118e.appmetrica(this);
            }
            if (z2 || z3 || z4) {
                AbstractC1599e.purchase(this);
                AbstractC12640e.advert(this);
            }
            if (z) {
                AbstractC12640e.advert(this);
            }
        }
    }

    /* renamed from: eٖٔۧ, reason: contains not printable characters */
    public final boolean m2150e(Function1 function1, Function1 function12, C2752e c2752e, Function1 function13) {
        boolean z;
        if (this.f13097e != function1) {
            this.f13097e = function1;
            z = true;
        } else {
            z = false;
        }
        if (this.f13110e != function12) {
            this.f13110e = function12;
            z = true;
        }
        if (!AbstractC7890e.billing(this.f13105e, c2752e)) {
            this.f13105e = c2752e;
            z = true;
        }
        if (this.f13103e == function13) {
            return z;
        }
        this.f13103e = function13;
        return true;
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            C2005e m2147e = m2147e(interfaceC13158e);
            boolean metrica = m2147e.metrica(j, interfaceC13158e.getLayoutDirection());
            C12476e c12476e = m2147e.amazon;
            if (c12476e == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + m2147e);
            }
            long j2 = c12476e.metrica;
            c12476e.vip.ad.vip();
            if (metrica) {
                AbstractC1599e.appmetrica(this);
                Function1 function1 = this.f13097e;
                if (function1 != null) {
                    function1.invoke(c12476e);
                }
                C2752e c2752e = this.f13105e;
                if (c2752e != null) {
                    c2752e.license(c12476e);
                }
                Map map = this.f13104e;
                if (map == null) {
                    map = new LinkedHashMap(2);
                }
                map.put(AbstractC14806e.ad, Integer.valueOf(Math.round(c12476e.license)));
                map.put(AbstractC14806e.vip, Integer.valueOf(Math.round(c12476e.appmetrica)));
                this.f13104e = map;
            }
            Function1 function12 = this.f13110e;
            if (function12 != null) {
                function12.invoke(c12476e.purchase);
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            InterfaceC17242e ads = interfaceC13158e.ads(i, i2, this.f13104e, new C4889e(interfaceC16719e.admob(AbstractC15118e.license(i, i, i2, i2)), 13));
            Trace.endSection();
            return ads;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC17303e
    public final int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return m2147e(abstractC9292e).ad(i, abstractC9292e.getLayoutDirection());
    }

    @Override // defpackage.InterfaceC17453e
    public final /* synthetic */ boolean smaato() {
        return true;
    }

    @Override // defpackage.InterfaceC17303e
    public final int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC7861e.billing(m2147e(abstractC9292e).appmetrica(abstractC9292e.getLayoutDirection()).yandex());
    }
}
