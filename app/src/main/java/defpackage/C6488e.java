package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٚٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6488e extends C8336e {
    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    @Override // defpackage.C8336e
    public final C4641e Signature() {
        ?? obj = new Object();
        obj.f17669e = "primary_fixed";
        obj.f17667e = new C3800e(7);
        obj.f17671e = new C17318e(this, 23);
        obj.f17673e = true;
        obj.f17675e = new C17318e(this, 24);
        obj.f17670e = new C3800e(8);
        return super.Signature().vip().vip(obj.ad()).ad();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    @Override // defpackage.C8336e
    public final C4641e ad() {
        ?? obj = new Object();
        obj.f17669e = "error";
        obj.f17667e = new C3800e(0);
        obj.f17671e = new C3800e(1);
        obj.f17673e = true;
        obj.f17675e = new C17318e(this, 20);
        obj.f17670e = new C3800e(2);
        obj.f17672e = new C17318e(this, 21);
        return super.ad().vip().vip(obj.ad()).ad();
    }

    @Override // defpackage.C8336e
    public final double adcel(C4641e c4641e, C16439e c16439e) {
        C4641e c4641e2;
        C7109e c7109e;
        C4641e c4641e3;
        double ad;
        boolean z = c16439e.metrica;
        double d = c16439e.license;
        boolean z2 = c4641e.license;
        Function1 function1 = c4641e.purchase;
        Function1 function12 = c4641e.yandex;
        String str = c4641e.ad;
        Function1 function13 = c4641e.startapp;
        Double d2 = null;
        C13699e c13699e = function13 != null ? (C13699e) function13.invoke(c16439e) : null;
        if (c13699e == null) {
            double doubleValue = ((Number) c4641e.metrica.invoke(c16439e)).doubleValue();
            Double valueOf = (function1 == null || (c4641e3 = (C4641e) function1.invoke(c16439e)) == null) ? null : Double.valueOf(c4641e3.ad(c16439e));
            if (function12 != null && (c7109e = (C7109e) function12.invoke(c16439e)) != null) {
                d2 = Double.valueOf(c7109e.ad(d));
            }
            if (valueOf == null || d2 == null) {
                return doubleValue;
            }
            if (AbstractC11866e.purchase(valueOf.doubleValue(), doubleValue) < d2.doubleValue() || d < 0.0d) {
                doubleValue = AbstractC1749e.purchase(valueOf.doubleValue(), d2.doubleValue());
            }
            double d3 = doubleValue;
            if (z2 && !AbstractC6507e.amazon(str, "_fixed_dim", false)) {
                d3 = d3 >= 57.0d ? AbstractC3062e.ad(d3, 65.0d, 100.0d) : AbstractC3062e.ad(d3, 0.0d, 49.0d);
            }
            double d4 = d3;
            Function1 function14 = c4641e.billing;
            if (function14 != null && (c4641e2 = (C4641e) function14.invoke(c16439e)) != null) {
                double ad2 = c4641e2.ad(c16439e);
                double max = Math.max(valueOf.doubleValue(), ad2);
                double min = Math.min(valueOf.doubleValue(), ad2);
                if (AbstractC11866e.purchase(max, d4) < d2.doubleValue() || AbstractC11866e.purchase(min, d4) < d2.doubleValue()) {
                    double license = AbstractC11866e.license(max, d2.doubleValue());
                    double metrica = AbstractC11866e.metrica(min, d2.doubleValue());
                    ArrayList arrayList = new ArrayList();
                    if (license != -1.0d) {
                        arrayList.add(Double.valueOf(license));
                    }
                    if (metrica != -1.0d) {
                        arrayList.add(Double.valueOf(metrica));
                    }
                    if (Math.rint(valueOf.doubleValue()) < 60.0d || Math.rint(ad2) < 60.0d) {
                        if (license < 0.0d) {
                            return 100.0d;
                        }
                        return license;
                    }
                    if (arrayList.size() == 1) {
                        return ((Number) AbstractC13480e.m3591interface(arrayList)).doubleValue();
                    }
                    if (metrica < 0.0d) {
                        return 0.0d;
                    }
                    return metrica;
                }
            }
            return d4;
        }
        double d5 = c13699e.metrica;
        C4641e c4641e4 = c13699e.ad;
        C4641e c4641e5 = c13699e.vip;
        int i = c13699e.license;
        int i2 = c13699e.purchase;
        if (i == 1 || ((i == 4 && z) || (i == 3 && !z))) {
            d5 = -d5;
        }
        boolean billing = AbstractC7890e.billing(str, c4641e4.ad);
        C4641e c4641e6 = billing ? c4641e4 : c4641e5;
        if (billing) {
            c4641e4 = c4641e5;
        }
        double doubleValue2 = ((Number) c4641e6.metrica.invoke(c16439e)).doubleValue();
        double ad3 = c4641e4.ad(c16439e);
        double d6 = d5 * (billing ? 1 : -1);
        int m2467class = AbstractC8703e.m2467class(i2);
        if (m2467class == 0) {
            ad = AbstractC3062e.ad(ad3 + d6, 0.0d, 100.0d);
        } else if (m2467class == 1) {
            ad = d6 > 0.0d ? AbstractC3062e.ad(AbstractC3062e.ad(doubleValue2, ad3, ad3 + d6), 0.0d, 100.0d) : AbstractC3062e.ad(AbstractC3062e.ad(doubleValue2, ad3 + d6, ad3), 0.0d, 100.0d);
        } else {
            if (m2467class != 2) {
                throw new C14803e(10);
            }
            ad = d6 > 0.0d ? AbstractC3062e.ad(doubleValue2, ad3 + d6, 100.0d) : AbstractC3062e.ad(doubleValue2, 0.0d, ad3 + d6);
        }
        if (function1 != null && function12 != null) {
            C4641e c4641e7 = (C4641e) function1.invoke(c16439e);
            C7109e c7109e2 = (C7109e) function12.invoke(c16439e);
            if (c4641e7 != null && c7109e2 != null) {
                double ad4 = c4641e7.ad(c16439e);
                double ad5 = c7109e2.ad(d);
                double adcel = AbstractC8210e.adcel(ad4);
                double d7 = ad;
                double adcel2 = AbstractC8210e.adcel(d7);
                double max2 = Math.max(adcel, adcel2);
                if (max2 != adcel2) {
                    adcel = adcel2;
                }
                ad = ((max2 + 5.0d) / (adcel + 5.0d) < ad5 || d < 0.0d) ? AbstractC1749e.purchase(ad4, ad5) : d7;
            }
        }
        double d8 = ad;
        return (!z2 || AbstractC6507e.amazon(str, "_fixed_dim", false)) ? d8 : d8 >= 57.0d ? AbstractC3062e.ad(d8, 65.0d, 100.0d) : AbstractC3062e.ad(d8, 0.0d, 49.0d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    @Override // defpackage.C8336e
    public final C4641e admob() {
        ?? obj = new Object();
        obj.f17669e = "primary_fixed_dim";
        obj.f17667e = new C3949e(21);
        obj.f17671e = new C17318e(this, 6);
        obj.f17673e = true;
        obj.f17672e = new C17318e(this, 7);
        return super.admob().vip().vip(obj.ad()).ad();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    @Override // defpackage.C8336e
    public final C4641e ads() {
        ?? obj = new Object();
        obj.f17669e = "tertiary_fixed_dim";
        obj.f17667e = new C3949e(11);
        obj.f17671e = new C17318e(this, 0);
        obj.f17673e = true;
        obj.f17672e = new C17318e(this, 1);
        return super.ads().vip().vip(obj.ad()).ad();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    @Override // defpackage.C8336e
    public final C4641e advert() {
        ?? obj = new Object();
        obj.f17669e = "inverse_surface";
        obj.f17667e = new C0677e(12);
        obj.f17671e = new C0677e(14);
        obj.f17673e = true;
        return super.advert().vip().vip(obj.ad()).ad();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    @Override // defpackage.C8336e
    public final C4641e amazon() {
        ?? obj = new Object();
        obj.f17669e = "primary";
        obj.f17667e = new C15812e(26);
        obj.f17671e = new C15812e(27);
        obj.f17673e = true;
        obj.f17675e = new C17318e(this, 18);
        obj.f17670e = new C15812e(28);
        obj.f17672e = new C17318e(this, 19);
        return super.amazon().vip().vip(obj.ad()).ad();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    @Override // defpackage.C8336e
    public final C4641e applovin() {
        ?? obj = new Object();
        obj.f17669e = "tertiary_fixed";
        obj.f17667e = new C3800e(17);
        obj.f17671e = new C17318e(this, 26);
        obj.f17673e = true;
        obj.f17675e = new C17318e(this, 27);
        obj.f17670e = new C3800e(18);
        return super.applovin().vip().vip(obj.ad()).ad();
    }

    @Override // defpackage.C8336e
    public final C15073e appmetrica(int i, C13797e c13797e, boolean z, int i2, double d) {
        double d2 = c13797e.vip;
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 1) {
            return AbstractC16425e.metrica(d2, i2 == 1 ? 1.4d : 6.0d);
        }
        if (m2467class != 2) {
            return m2467class != 3 ? m2467class != 4 ? super.appmetrica(i, c13797e, z, i2, d) : AbstractC16425e.metrica(C12575e.tapsense(c13797e), C12575e.adcel(c13797e, z, i2)) : AbstractC16425e.metrica(C12575e.inmobi(c13797e), C12575e.smaato(c13797e, i2));
        }
        return AbstractC16425e.metrica(d2, i2 == 1 ? 5.0d : 10.0d);
    }

    @Override // defpackage.C8336e
    public final C15073e billing(int i, C13797e c13797e, boolean z, int i2, double d) {
        double d2 = c13797e.vip;
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class != 1) {
            if (m2467class == 2) {
                return AbstractC16425e.metrica(d2, (i2 == 1 && z) ? 26.0d : 32.0d);
            }
            if (m2467class == 3) {
                return AbstractC16425e.metrica(d2, i2 == 1 ? 74.0d : 56.0d);
            }
            if (m2467class != 4) {
                return super.billing(i, c13797e, z, i2, d);
            }
            return AbstractC16425e.metrica(d2, i2 == 1 ? z ? 36.0d : 48.0d : 40.0d);
        }
        double d3 = 12.0d;
        if (i2 == 1) {
            if (d2 < 250.0d || d2 >= 270.0d) {
                d3 = 8.0d;
            }
        } else if (d2 >= 250.0d && d2 < 270.0d) {
            d3 = 16.0d;
        }
        return AbstractC16425e.metrica(d2, d3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [eٌٟ٘, java.lang.Object] */
    /* renamed from: class, reason: not valid java name */
    public final C4641e m2190class() {
        ?? obj = new Object();
        obj.f17669e = "surface_container_highest";
        obj.f17667e = new C0677e(3);
        obj.f17671e = new C0677e(4);
        obj.f17673e = true;
        obj.f17666e = new C0677e(5);
        C4641e ad = obj.ad();
        ?? obj2 = new Object();
        obj2.f17669e = "surface_container_highest";
        obj2.f17667e = new C6078e(20);
        obj2.f17671e = new C6078e(21);
        obj2.f17673e = true;
        return obj2.ad().vip().vip(ad).ad();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    public final C4641e crashlytics() {
        ?? obj = new Object();
        obj.f17669e = "secondary_dim";
        obj.f17667e = new C15812e(12);
        obj.f17671e = new C15812e(13);
        obj.f17673e = true;
        obj.f17675e = new C17318e(this, 10);
        obj.f17670e = new C15812e(14);
        obj.f17672e = new C17318e(this, 11);
        return obj.ad();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [eٌٟ٘, java.lang.Object] */
    public final C4641e firebase() {
        ?? obj = new Object();
        obj.f17669e = "surface_container_high";
        obj.f17667e = new C0677e(15);
        obj.f17671e = new C0677e(16);
        obj.f17673e = true;
        obj.f17666e = new C0677e(17);
        C4641e ad = obj.ad();
        ?? obj2 = new Object();
        obj2.f17669e = "surface_container_high";
        obj2.f17667e = new C13810e(10);
        obj2.f17671e = new C13810e(11);
        obj2.f17673e = true;
        return obj2.ad().vip().vip(ad).ad();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    @Override // defpackage.C8336e
    public final C4641e inmobi() {
        ?? obj = new Object();
        obj.f17669e = "tertiary";
        obj.f17667e = new C3949e(16);
        obj.f17671e = new C3949e(17);
        obj.f17673e = true;
        obj.f17675e = new C17318e(this, 2);
        obj.f17670e = new C3949e(18);
        obj.f17672e = new C17318e(this, 3);
        return super.inmobi().vip().vip(obj.ad()).ad();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    /* renamed from: interface, reason: not valid java name */
    public final C4641e m2191interface() {
        ?? obj = new Object();
        obj.f17669e = "tertiary_dim";
        obj.f17667e = new C15812e(15);
        obj.f17671e = new C15812e(17);
        obj.f17673e = true;
        obj.f17675e = new C17318e(this, 12);
        obj.f17670e = new C15812e(18);
        obj.f17672e = new C17318e(this, 13);
        return obj.ad();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    @Override // defpackage.C8336e
    public final C4641e isPro() {
        ?? obj = new Object();
        obj.f17669e = "tertiary_container";
        obj.f17667e = new C2894e(1);
        int i = 3;
        obj.f17671e = new C2894e(i);
        obj.f17673e = true;
        obj.f17675e = new C2465e(this, i);
        int i2 = 4;
        obj.f17672e = new C2465e(this, i2);
        obj.f17670e = new C2894e(i2);
        return super.isPro().vip().vip(obj.ad()).ad();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    @Override // defpackage.C8336e
    public final C4641e isVip() {
        ?? obj = new Object();
        obj.f17669e = "surface_dim";
        obj.f17667e = new C3800e(26);
        obj.f17671e = new C3800e(27);
        obj.f17673e = true;
        obj.f17666e = new C3800e(28);
        return super.isVip().vip().vip(obj.ad()).ad();
    }

    @Override // defpackage.C8336e
    public final C13797e license(C4641e c4641e, C16439e c16439e) {
        Number number;
        C15073e c15073e = (C15073e) c4641e.vip.invoke(c16439e);
        double adcel = adcel(c4641e, c16439e);
        double d = c15073e.ad;
        Function1 function1 = c4641e.appmetrica;
        if (function1 == null || (number = (Double) function1.invoke(c16439e)) == null) {
            number = 1;
        }
        return new C13797e(AbstractC5190e.adcel(d, c15073e.vip * number.doubleValue(), adcel));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    @Override // defpackage.C8336e
    public final C4641e loadAd() {
        ?? obj = new Object();
        obj.f17669e = "primary_container";
        obj.f17667e = new C3800e(22);
        obj.f17671e = new C3800e(24);
        obj.f17673e = true;
        obj.f17675e = new C17318e(this, 28);
        obj.f17672e = new C17318e(this, 29);
        obj.f17670e = new C3800e(25);
        return super.loadAd().vip().vip(obj.ad()).ad();
    }

    @Override // defpackage.C8336e
    public final C15073e metrica(int i, C13797e c13797e, boolean z, int i2, double d) {
        double[] dArr = {0.0d, 3.0d, 13.0d, 23.0d, 33.0d, 43.0d, 153.0d, 273.0d, 360.0d};
        double[] dArr2 = {12.0d, 22.0d, 32.0d, 12.0d, 22.0d, 32.0d, 22.0d, 12.0d};
        int min = Math.min(8, 8);
        double d2 = c13797e.vip;
        int i3 = 0;
        while (true) {
            if (i3 >= min) {
                break;
            }
            if (d2 < dArr[i3] || d2 >= dArr[i3 + 1]) {
                i3++;
            } else {
                double d3 = dArr2[i3] % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                d2 = d3;
            }
        }
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 1) {
            return AbstractC16425e.metrica(d2, i2 == 1 ? 50.0d : 40.0d);
        }
        if (m2467class == 2) {
            return AbstractC16425e.metrica(d2, i2 == 1 ? 60.0d : 48.0d);
        }
        if (m2467class == 3) {
            return AbstractC16425e.metrica(d2, i2 == 1 ? 80.0d : 60.0d);
        }
        if (m2467class == 4) {
            return AbstractC16425e.metrica(d2, i2 == 1 ? 64.0d : 48.0d);
        }
        super.metrica(i, c13797e, z, i2, d);
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    public final C4641e premium() {
        ?? obj = new Object();
        obj.f17669e = "error_dim";
        obj.f17667e = new C15812e(22);
        obj.f17671e = new C15812e(24);
        obj.f17673e = true;
        obj.f17675e = new C17318e(this, 16);
        obj.f17670e = new C15812e(25);
        obj.f17672e = new C17318e(this, 17);
        return obj.ad();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    @Override // defpackage.C8336e
    public final C4641e pro() {
        ?? obj = new Object();
        obj.f17669e = "secondary_fixed";
        obj.f17667e = new C3949e(22);
        obj.f17671e = new C17318e(this, 8);
        obj.f17673e = true;
        obj.f17675e = new C17318e(this, 9);
        obj.f17670e = new C3949e(23);
        return super.pro().vip().vip(obj.ad()).ad();
    }

    @Override // defpackage.C8336e
    public final C15073e purchase(int i, C13797e c13797e, boolean z, int i2, double d) {
        double d2 = c13797e.vip;
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 1) {
            return AbstractC16425e.metrica(d2, (i2 == 1 ? 1.4d : 6.0d) * 2.2d);
        }
        if (m2467class == 2) {
            return AbstractC16425e.metrica(d2, (i2 == 1 ? 5.0d : 10.0d) * 1.7d);
        }
        if (m2467class == 3) {
            return AbstractC16425e.metrica(C12575e.inmobi(c13797e), C12575e.smaato(c13797e, i2) * 1.29d);
        }
        if (m2467class != 4) {
            return super.purchase(i, c13797e, z, i2, d);
        }
        double tapsense = C12575e.tapsense(c13797e);
        return AbstractC16425e.metrica(tapsense, C12575e.adcel(c13797e, z, i2) * ((tapsense < 105.0d || tapsense >= 125.0d) ? 2.3d : 1.6d));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    @Override // defpackage.C8336e
    public final C4641e remoteconfig() {
        ?? obj = new Object();
        obj.f17669e = "secondary_container";
        obj.f17667e = new C0677e(24);
        obj.f17671e = new C0677e(25);
        obj.f17673e = true;
        obj.f17675e = new C2465e(this, 1);
        obj.f17672e = new C2465e(this, 2);
        obj.f17670e = new C0677e(26);
        return super.remoteconfig().vip().vip(obj.ad()).ad();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    @Override // defpackage.C8336e
    public final C4641e signatures() {
        ?? obj = new Object();
        obj.f17669e = "secondary_fixed_dim";
        obj.f17667e = new C3949e(19);
        obj.f17671e = new C17318e(this, 4);
        obj.f17673e = true;
        obj.f17672e = new C17318e(this, 5);
        return super.signatures().vip().vip(obj.ad()).ad();
    }

    @Override // defpackage.C8336e
    public final C15073e startapp(int i, C13797e c13797e, boolean z, int i2, double d) {
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 1) {
            return AbstractC16425e.metrica(AbstractC11008e.ad(c13797e, new double[]{0.0d, 38.0d, 105.0d, 161.0d, 204.0d, 278.0d, 333.0d, 360.0d}, new double[]{-32.0d, 26.0d, 10.0d, -39.0d, 24.0d, -15.0d, -32.0d}), i2 == 1 ? 20.0d : 36.0d);
        }
        if (m2467class != 2) {
            return m2467class != 3 ? m2467class != 4 ? super.startapp(i, c13797e, z, i2, d) : AbstractC16425e.metrica(AbstractC11008e.ad(c13797e, new double[]{0.0d, 105.0d, 140.0d, 204.0d, 253.0d, 278.0d, 300.0d, 333.0d, 360.0d}, new double[]{-165.0d, 160.0d, -105.0d, 101.0d, -101.0d, -160.0d, -170.0d, -165.0d}), 48.0d) : AbstractC16425e.metrica(AbstractC11008e.ad(c13797e, new double[]{0.0d, 38.0d, 71.0d, 105.0d, 140.0d, 161.0d, 253.0d, 333.0d, 360.0d}, new double[]{-72.0d, 35.0d, 24.0d, -24.0d, 62.0d, 50.0d, 62.0d, -72.0d}), 56.0d);
        }
        return AbstractC16425e.metrica(AbstractC11008e.ad(c13797e, new double[]{0.0d, 20.0d, 71.0d, 161.0d, 333.0d, 360.0d}, new double[]{-40.0d, 48.0d, -32.0d, 40.0d, -32.0d}), i2 == 1 ? 28.0d : 32.0d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    public final C4641e subs() {
        ?? obj = new Object();
        obj.f17669e = "primary_dim";
        obj.f17667e = new C15812e(19);
        obj.f17671e = new C15812e(20);
        obj.f17673e = true;
        obj.f17675e = new C17318e(this, 14);
        obj.f17670e = new C15812e(21);
        obj.f17672e = new C17318e(this, 15);
        return obj.ad();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    @Override // defpackage.C8336e
    public final C4641e subscription() {
        ?? obj = new Object();
        obj.f17669e = "secondary";
        obj.f17667e = new C0677e(2);
        obj.f17671e = new C0677e(13);
        obj.f17673e = true;
        obj.f17675e = new C2465e(this, 0);
        obj.f17670e = new C2894e(2);
        obj.f17672e = new C2465e(this, 5);
        return super.subscription().vip().vip(obj.ad()).ad();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    @Override // defpackage.C8336e
    public final C4641e tapsense() {
        ?? obj = new Object();
        obj.f17669e = "surface_bright";
        obj.f17667e = new C15812e(2);
        obj.f17671e = new C15812e(3);
        obj.f17673e = true;
        obj.f17666e = new C15812e(4);
        return super.tapsense().vip().vip(obj.ad()).ad();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    @Override // defpackage.C8336e
    public final C4641e vip() {
        ?? obj = new Object();
        obj.f17669e = "error_container";
        obj.f17667e = new C3949e(3);
        obj.f17671e = new C15812e(29);
        obj.f17673e = true;
        obj.f17675e = new C17318e(this, 22);
        obj.f17672e = new C17318e(this, 25);
        obj.f17670e = new C3800e(23);
        return super.vip().vip().vip(obj.ad()).ad();
    }

    @Override // defpackage.C8336e
    public final C15073e yandex(int i, C13797e c13797e, boolean z, int i2, double d) {
        double d2 = c13797e.vip;
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class != 1) {
            if (m2467class == 2) {
                return AbstractC16425e.metrica(d2, 16.0d);
            }
            if (m2467class == 3) {
                return AbstractC16425e.metrica(AbstractC11008e.ad(c13797e, new double[]{0.0d, 38.0d, 105.0d, 140.0d, 333.0d, 360.0d}, new double[]{-14.0d, 10.0d, -14.0d, 10.0d, -14.0d}), i2 == 1 ? 56.0d : 36.0d);
            }
            if (m2467class != 4) {
                return super.yandex(i, c13797e, z, i2, d);
            }
            return AbstractC16425e.metrica(AbstractC11008e.ad(c13797e, new double[]{0.0d, 105.0d, 140.0d, 204.0d, 253.0d, 278.0d, 300.0d, 333.0d, 360.0d}, new double[]{-160.0d, 155.0d, -100.0d, 96.0d, -96.0d, -156.0d, -165.0d, -160.0d}), (i2 == 1 && z) ? 16.0d : 24.0d);
        }
        double d3 = 6.0d;
        if (i2 == 1) {
            if (d2 < 250.0d || d2 >= 270.0d) {
                d3 = 4.0d;
            }
        } else if (d2 >= 250.0d && d2 < 270.0d) {
            d3 = 10.0d;
        }
        return AbstractC16425e.metrica(d2, d3);
    }
}
