package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٓٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14132e {
    public final boolean Signature;
    public final InterfaceC2531e ad;
    public final ArrayList adcel;
    public final boolean admob;
    public final C6607e ads;
    public final LinkedHashMap advert;
    public final ArrayList amazon;
    public final C9770e applovin;
    public final int appmetrica;
    public final ArrayList billing;
    public final C15436e inmobi;
    public final C0477e isPro;
    public final ArrayList isVip;
    public final String license;
    public final boolean loadAd;
    public final InterfaceC4716e metrica;
    public final ArrayList mopub;
    public final C12309e premium;
    public final boolean pro;
    public final ArrayList purchase;
    public final boolean remoteconfig;
    public final boolean signatures;
    public final ArrayList smaato;
    public final ArrayList startapp;
    public final C17846e subs;
    public final boolean subscription;
    public C6331e tapsense;
    public final InterfaceC6744e vip;
    public final ArrayList yandex;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x02c6, code lost:
    
        if (defpackage.AbstractC13510e.appmetrica() != false) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C14132e(android.content.Context r31, defpackage.InterfaceC2531e r32, defpackage.InterfaceC6744e r33, defpackage.InterfaceC4716e r34) {
        /*
            Method dump skipped, instructions count: 1574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14132e.<init>(android.content.Context, eُّؔ, eؙۣؓ, eؚؗؑ):void");
    }

    public static Range amazon(Range range, Range range2, boolean z) {
        Range range3 = C6884e.yandex;
        if (AbstractC7890e.billing(range2, range3) && AbstractC7890e.billing(range, range3)) {
            return range3;
        }
        if (AbstractC7890e.billing(range2, range3)) {
            return range;
        }
        if (AbstractC7890e.billing(range, range3)) {
            return range2;
        }
        if (z) {
            AbstractC4265e.yandex("All targetFrameRate should be the same if strict fps is required", AbstractC7890e.billing(range, range2));
            return range;
        }
        try {
            return range2.intersect(range);
        } catch (IllegalArgumentException unused) {
            return range2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Size appmetrica(android.hardware.camera2.params.StreamConfigurationMap r8, int r9, boolean r10, android.util.Rational r11) {
        /*
            r0 = 34
            r1 = 0
            if (r9 != r0) goto L12
            if (r8 == 0) goto L10
            java.lang.Class<android.graphics.SurfaceTexture> r0 = android.graphics.SurfaceTexture.class
            android.util.Size[] r0 = r8.getOutputSizes(r0)     // Catch: java.lang.Throwable -> Le
            goto L1f
        Le:
            r0 = move-exception
            goto L19
        L10:
            r0 = r1
            goto L1f
        L12:
            if (r8 == 0) goto L10
            android.util.Size[] r0 = r8.getOutputSizes(r9)     // Catch: java.lang.Throwable -> Le
            goto L1f
        L19:
            eّۜۖ r2 = new eّۜۖ
            r2.<init>(r0)
            goto L20
        L1f:
            r2 = r0
        L20:
            boolean r0 = r2 instanceof defpackage.C12763e
            if (r0 == 0) goto L26
            r2 = r1
        L26:
            android.util.Size[] r2 = (android.util.Size[]) r2
            r0 = 0
            if (r2 == 0) goto L52
            if (r11 == 0) goto L53
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r2.length
            r5 = r0
        L34:
            if (r5 >= r4) goto L48
            r6 = r2[r5]
            android.util.Rational r7 = defpackage.AbstractC1146e.ad
            android.util.Size r7 = defpackage.AbstractC2084e.metrica
            boolean r7 = defpackage.AbstractC1146e.ad(r6, r11, r7)
            if (r7 == 0) goto L45
            r3.add(r6)
        L45:
            int r5 = r5 + 1
            goto L34
        L48:
            android.util.Size[] r11 = new android.util.Size[r0]
            java.lang.Object[] r11 = r3.toArray(r11)
            r2 = r11
            android.util.Size[] r2 = (android.util.Size[]) r2
            goto L53
        L52:
            r2 = r1
        L53:
            if (r2 == 0) goto L96
            int r11 = r2.length
            if (r11 != 0) goto L59
            goto L96
        L59:
            eٔۗٙ r11 = new eٔۗٙ
            r11.<init>(r0)
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.Object r2 = java.util.Collections.max(r2, r11)
            android.util.Size r2 = (android.util.Size) r2
            android.util.Size r3 = defpackage.AbstractC2084e.ad
            if (r10 == 0) goto L83
            if (r8 == 0) goto L72
            android.util.Size[] r1 = r8.getHighResolutionOutputSizes(r9)
        L72:
            if (r1 == 0) goto L83
            int r8 = r1.length
            if (r8 != 0) goto L78
            goto L83
        L78:
            java.util.List r8 = java.util.Arrays.asList(r1)
            java.lang.Object r8 = java.util.Collections.max(r8, r11)
            r3 = r8
            android.util.Size r3 = (android.util.Size) r3
        L83:
            r8 = 2
            android.util.Size[] r8 = new android.util.Size[r8]
            r8[r0] = r2
            r9 = 1
            r8[r9] = r3
            java.util.List r8 = defpackage.AbstractC6874e.startapp(r8)
            java.lang.Object r8 = java.util.Collections.max(r8, r11)
            android.util.Size r8 = (android.util.Size) r8
            return r8
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14132e.appmetrica(android.hardware.camera2.params.StreamConfigurationMap, int, boolean, android.util.Rational):android.util.Size");
    }

    public static int billing(Range range, Range range2) {
        if (range.contains((Range) range2.getUpper()) || range.contains((Range) range2.getLower())) {
            throw new IllegalArgumentException("Ranges must not intersect");
        }
        return ((Number) range.getLower()).intValue() > ((Number) range2.getUpper()).intValue() ? ((Number) range.getLower()).intValue() - ((Number) range2.getUpper()).intValue() : ((Number) range2.getLower()).intValue() - ((Number) range.getUpper()).intValue();
    }

    public static Range metrica(Range range, int i, Range[] rangeArr) {
        Range range2 = C6884e.yandex;
        if (AbstractC7890e.billing(range, range2) || rangeArr == null) {
            return range2;
        }
        Range range3 = new Range(Integer.valueOf(Math.min(((Number) range.getLower()).intValue(), i)), Integer.valueOf(Math.min(((Number) range.getUpper()).intValue(), i)));
        int length = rangeArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            Range range4 = rangeArr[i3];
            if (i >= ((Number) range4.getLower()).intValue()) {
                if (AbstractC7890e.billing(range2, C6884e.yandex)) {
                    range2 = range4;
                }
                if (range4.equals(range3)) {
                    return range4;
                }
                try {
                    int yandex = yandex(range4.intersect(range3));
                    if (i2 == 0) {
                        range2 = range4;
                        i2 = yandex;
                    } else if (yandex >= i2) {
                        double yandex2 = yandex(range2.intersect(range3));
                        double yandex3 = yandex(range4.intersect(range3));
                        double yandex4 = yandex3 / yandex(range4);
                        double yandex5 = yandex2 / yandex(range2);
                        if (yandex3 <= yandex2) {
                        }
                        i2 = yandex(range3.intersect(range2));
                    }
                } catch (IllegalArgumentException unused) {
                    if (i2 == 0 && (billing(range4, range3) < billing(range2, range3) || (billing(range4, range3) == billing(range2, range3) && (((Number) range4.getLower()).intValue() > ((Number) range2.getUpper()).intValue() || yandex(range4) < yandex(range2))))) {
                        range2 = range4;
                    }
                }
            }
        }
        return range2;
    }

    public static int yandex(Range range) {
        return (((Number) range.getUpper()).intValue() - ((Number) range.getLower()).intValue()) + 1;
    }

    public final void Signature(LinkedHashMap linkedHashMap, int i, Rational rational) {
        Size appmetrica = appmetrica((StreamConfigurationMap) this.inmobi.metrica.f35233e, i, true, rational);
        if (appmetrica != null) {
            linkedHashMap.put(Integer.valueOf(i), appmetrica);
        }
    }

    public final boolean ad(C18327e c18327e, ArrayList arrayList, Map map, List list, List list2) {
        boolean z;
        ArrayList arrayList2;
        List list3;
        boolean z2;
        Size size;
        int i = c18327e.license;
        boolean z3 = c18327e.yandex;
        LinkedHashMap linkedHashMap = this.advert;
        if (linkedHashMap.containsKey(c18327e)) {
            list3 = (List) linkedHashMap.get(c18327e);
            z = z3;
        } else {
            ArrayList arrayList3 = new ArrayList();
            int i2 = c18327e.ad;
            if (z3) {
                C5363e c5363e = AbstractC0108e.ad;
                arrayList3.addAll(AbstractC0108e.vip(this.ad, i));
                z = z3;
            } else if (c18327e.appmetrica) {
                ArrayList arrayList4 = this.amazon;
                if (arrayList4.isEmpty()) {
                    C5363e c5363e2 = AbstractC0108e.ad;
                    ArrayList arrayList5 = new ArrayList();
                    C6404e c6404e = new C6404e();
                    EnumC2392e enumC2392e = C4637e.appmetrica;
                    EnumC15386e enumC15386e = EnumC15386e.MAXIMUM;
                    EnumC14212e enumC14212e = EnumC14212e.f28077e;
                    C6404e remoteconfig = AbstractC0869e.remoteconfig(enumC14212e, enumC15386e, c6404e, arrayList5, c6404e);
                    z = z3;
                    AbstractC0869e.ads(EnumC14212e.f28078e, EnumC15386e.PREVIEW, remoteconfig, enumC14212e, enumC15386e);
                    arrayList5.add(remoteconfig);
                    arrayList4.addAll(arrayList5);
                } else {
                    z = z3;
                }
                if (i2 == 0) {
                    arrayList3.addAll(arrayList4);
                }
            } else {
                z = z3;
                if (c18327e.purchase) {
                    ArrayList arrayList6 = this.mopub;
                    if (arrayList6.isEmpty()) {
                        C17846e c17846e = this.subs;
                        if (((Boolean) c17846e.vip.getValue()).booleanValue()) {
                            arrayList6.clear();
                            Size size2 = (Size) c17846e.metrica.getValue();
                            if (size2 != null) {
                                C6331e smaato = smaato(34);
                                C5363e c5363e3 = AbstractC0108e.ad;
                                ArrayList arrayList7 = new ArrayList();
                                EnumC2392e enumC2392e2 = C4637e.appmetrica;
                                C4637e pro = C16728e.pro(34, size2, smaato, 0, 2, C4637e.appmetrica);
                                C6404e c6404e2 = new C6404e();
                                c6404e2.ad(pro);
                                arrayList7.add(c6404e2);
                                C6404e c6404e3 = new C6404e();
                                c6404e3.ad(pro);
                                c6404e3.ad(pro);
                                arrayList7.add(c6404e3);
                                arrayList6.addAll(arrayList7);
                            }
                        }
                    }
                    arrayList3.addAll(arrayList6);
                } else {
                    int i3 = c18327e.vip;
                    if (i3 == 8) {
                        if (i2 != 1) {
                            ArrayList arrayList8 = this.billing;
                            if (i2 != 2) {
                                if (i == 4) {
                                    arrayList8 = this.adcel;
                                }
                                arrayList3.addAll(arrayList8);
                            } else {
                                arrayList3.addAll(this.startapp);
                                arrayList3.addAll(arrayList8);
                            }
                        } else {
                            arrayList2 = this.purchase;
                            linkedHashMap.put(c18327e, arrayList2);
                            list3 = arrayList2;
                        }
                    } else if (i3 == 10 && i2 == 0) {
                        arrayList3.addAll(this.smaato);
                    }
                }
            }
            arrayList2 = arrayList3;
            linkedHashMap.put(c18327e, arrayList2);
            list3 = arrayList2;
        }
        int i4 = 0;
        if (list3 == null || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((C6404e) it.next()).metrica(arrayList) != null) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (!z2 || !z) {
            return z2;
        }
        C17018e c17018e = new C17018e();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                AbstractC6874e.Signature();
                throw null;
            }
            C4637e c4637e = (C4637e) next;
            C6331e smaato2 = smaato(c4637e.license);
            int i6 = c4637e.license;
            LinkedHashMap linkedHashMap2 = smaato2.purchase;
            EnumC15386e enumC15386e2 = c4637e.vip;
            int ordinal = enumC15386e2.ordinal();
            Iterator it3 = it2;
            if (ordinal != 3) {
                switch (ordinal) {
                    case 9:
                        size = smaato2.appmetrica;
                        break;
                    case 10:
                        size = (Size) smaato2.purchase.get(Integer.valueOf(i6));
                        break;
                    case 11:
                        size = (Size) linkedHashMap2.get(Integer.valueOf(i6));
                        break;
                    case 12:
                        size = (Size) linkedHashMap2.get(Integer.valueOf(i6));
                        break;
                    case 13:
                        size = (Size) smaato2.startapp.get(Integer.valueOf(i6));
                        break;
                    case 14:
                        throw new IllegalStateException("Not supported config size");
                    default:
                        size = enumC15386e2.f30338e;
                        break;
                }
            } else {
                size = smaato2.metrica;
            }
            InterfaceC12438e interfaceC12438e = (InterfaceC12438e) list.get(((Number) list2.get(i4)).intValue());
            Object obj = map.get(c4637e);
            if (obj == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C14677e c14677e = (C14677e) obj;
            AbstractC5113e abstractC5113e = new AbstractC5113e(interfaceC12438e.advert(), size);
            int ordinal2 = interfaceC12438e.mo844while().ordinal();
            Class cls = (ordinal2 != 0 ? ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? ordinal2 != 4 ? EnumC8815e.f17730e : EnumC8815e.f17731e : EnumC8815e.f17725e : EnumC8815e.f17729e : EnumC8815e.f17727e : EnumC8815e.f17726e).f17732e;
            if (cls != null) {
                abstractC5113e.adcel = cls;
            }
            C16990e license = C16990e.license(interfaceC12438e, size);
            C10379e c10379e = license.vip;
            license.vip(abstractC5113e, c14677e, -1);
            Range range = c18327e.startapp;
            Range range2 = AbstractC7890e.billing(range, C6884e.yandex) ? null : range;
            if (range2 == null) {
                range2 = C4226e.ad;
            }
            c10379e.getClass();
            ((C4069e) c10379e.f20510e).yandex(C9937e.purchase, range2);
            if (i == 4) {
                c10379e.getClass();
                ((C4069e) c10379e.f20510e).yandex(InterfaceC12438e.f24900e, 2);
            } else if (i == 3) {
                c10379e.getClass();
                ((C4069e) c10379e.f20510e).yandex(InterfaceC12438e.f24896e, 2);
            }
            c17018e.ad(license.metrica());
            boolean metrica = c17018e.metrica();
            StringBuilder sb = new StringBuilder("Cannot create a combined SessionConfig for feature combo after adding ");
            sb.append(interfaceC12438e);
            sb.append(" with ");
            sb.append(c4637e);
            sb.append(" due to [");
            sb.append(!c17018e.smaato ? "Template is not set" : c17018e.advert.toString());
            sb.append("]; surfaceConfigList = ");
            sb.append(arrayList);
            sb.append(", featureSettings = ");
            sb.append(c18327e);
            sb.append(", newUseCaseConfigs = ");
            sb.append(list);
            AbstractC4265e.yandex(sb.toString(), metrica);
            it2 = it3;
            i4 = i5;
        }
        C11469e vip = c17018e.vip();
        boolean signatures = this.metrica.signatures(vip);
        Iterator it4 = vip.vip().iterator();
        while (it4.hasNext()) {
            ((AbstractC5113e) it4.next()).ad();
        }
        return signatures;
    }

    public final C15436e adcel() {
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        InterfaceC2531e interfaceC2531e = this.ad;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((C9000e) interfaceC2531e).metrica(key);
        if (streamConfigurationMap != null) {
            return new C15436e(streamConfigurationMap, new C3031e(interfaceC2531e));
        }
        throw new IllegalArgumentException("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    public final void admob(LinkedHashMap linkedHashMap, Size size, int i) {
        if (this.admob) {
            Size appmetrica = appmetrica((StreamConfigurationMap) this.inmobi.metrica.f35233e, i, false, null);
            Integer valueOf = Integer.valueOf(i);
            if (appmetrica != null) {
                size = (Size) Collections.min(AbstractC6874e.startapp(size, appmetrica), new C14912e(false));
            }
            linkedHashMap.put(valueOf, size);
        }
    }

    public final ArrayList advert(int i, ArrayList arrayList, List list, List list2, ArrayList arrayList2, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, boolean z) {
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6355e c6355e = (C6355e) it.next();
            arrayList3.add(c6355e.ad);
            linkedHashMap.put(Integer.valueOf(arrayList3.size() - 1), c6355e);
        }
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            int i3 = i2 + 1;
            Size size = (Size) it2.next();
            InterfaceC12438e interfaceC12438e = (InterfaceC12438e) list2.get(((Number) arrayList2.get(i2)).intValue());
            int advert = interfaceC12438e.advert();
            EnumC2392e mo837native = interfaceC12438e.mo837native();
            EnumC2392e enumC2392e = C4637e.appmetrica;
            arrayList3.add(C16728e.pro(advert, size, smaato(advert), i, z ? 1 : 2, mo837native));
            linkedHashMap2.put(Integer.valueOf(arrayList3.size() - 1), interfaceC12438e);
            i2 = i3;
        }
        return arrayList3;
    }

    public final int license(int i, Size size, boolean z, int i2) {
        long j;
        int i3 = 0;
        if (!z) {
            try {
                j = adcel().metrica.remoteconfig(i, size);
            } catch (RuntimeException e) {
                if (AbstractC9464e.admob()) {
                    Log.w("CXCP", "Unable to get min frame duration for format = " + i + " and size = " + size, e);
                }
                j = 0;
            }
            if (j > 0) {
                i3 = (int) (1.0E9d / j);
            } else if (!this.signatures) {
                i3 = Alert.DURATION_SHOW_INDEFINITELY;
            } else if (AbstractC9464e.admob()) {
                Log.w("CXCP", "minFrameDuration: " + j + " is invalid for imageFormat = " + i + ", size = " + size);
            }
        } else {
            if (i != 34) {
                throw new IllegalStateException("Check failed.");
            }
            List metrica = this.subs.metrica(size);
            if (metrica.isEmpty()) {
                metrica = null;
            }
            if (metrica == null) {
                AbstractC9464e.remoteconfig("HighSpeedResolver", "No supported high speed  fps for " + size);
            } else {
                Iterator it = metrica.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                Integer num = (Integer) ((Range) it.next()).getUpper();
                while (it.hasNext()) {
                    Integer num2 = (Integer) ((Range) it.next()).getUpper();
                    if (num.compareTo(num2) < 0) {
                        num = num2;
                    }
                }
                i3 = num.intValue();
            }
        }
        return Math.min(i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference failed for: r36v1, types: [int] */
    /* JADX WARN: Type inference failed for: r36v6 */
    /* JADX WARN: Type inference failed for: r36v7 */
    /* JADX WARN: Type inference failed for: r47v1 */
    /* JADX WARN: Type inference failed for: r47v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r47v5 */
    /* JADX WARN: Type inference failed for: r4v61, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    public final C9984e loadAd(C18327e c18327e, ArrayList arrayList, Map map, List list, ArrayList arrayList2, LinkedHashMap linkedHashMap) {
        C13664e c13664e;
        boolean z;
        String str;
        InterfaceC2531e interfaceC2531e;
        LinkedHashMap linkedHashMap2;
        ?? r47;
        ArrayList arrayList3;
        boolean z2;
        C18327e c18327e2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        List list2;
        int i;
        C18327e c18327e3;
        ArrayList arrayList4;
        List list3;
        LinkedHashMap linkedHashMap5;
        LinkedHashMap linkedHashMap6;
        String str2;
        InterfaceC2531e interfaceC2531e2;
        ?? r36;
        C17846e c17846e;
        String str3;
        List list4;
        LinkedHashMap linkedHashMap7;
        int i2;
        List list5;
        List list6;
        LinkedHashMap linkedHashMap8;
        C14677e c14677e;
        ?? arrayList5;
        Size size;
        LinkedHashMap linkedHashMap9;
        ArrayList<Size> arrayList6;
        Size license;
        C14132e c14132e = this;
        C18327e c18327e4 = c18327e;
        Map map2 = map;
        boolean z3 = c18327e4.purchase;
        if (AbstractC9464e.smaato("CXCP")) {
            Log.d("CXCP", "resolveSpecsBySettings: featureSettings = " + c18327e4);
        }
        boolean z4 = c18327e4.billing;
        Range range = c18327e4.startapp;
        C13664e c13664e2 = C13664e.f27089e;
        String str4 = ". New configs: ";
        String str5 = c14132e.license;
        if (z4) {
            c13664e = c13664e2;
            z = z4;
            str = "No supported surface combination is found for camera device - Id : ";
        } else {
            ArrayList arrayList7 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList7.add(((C6355e) it.next()).ad);
            }
            C14912e c14912e = new C14912e(false);
            for (InterfaceC12438e interfaceC12438e : map2.keySet()) {
                C13664e c13664e3 = c13664e2;
                List list7 = (List) map2.get(interfaceC12438e);
                if (list7 == null || list7.isEmpty()) {
                    throw new IllegalArgumentException(("No available output size is found for " + interfaceC12438e + '.').toString());
                }
                Size size2 = (Size) Collections.min(list7, c14912e);
                int advert = interfaceC12438e.advert();
                EnumC2392e mo837native = interfaceC12438e.mo837native();
                EnumC2392e enumC2392e = C4637e.appmetrica;
                arrayList7.add(C16728e.pro(advert, size2, c14132e.smaato(advert), c18327e4.ad, 2, mo837native));
                c13664e2 = c13664e3;
            }
            c13664e = c13664e2;
            z = z4;
            str = "No supported surface combination is found for camera device - Id : ";
            if (!c14132e.ad(c18327e4, arrayList7, C9139e.f18290e, c13664e2, c13664e)) {
                throw new IllegalArgumentException((str + str5 + ". May be attempting to bind too many use cases. Existing surfaces: " + arrayList + ". New configs: " + list + ". GroupableFeature settings: " + c18327e4 + '.').toString());
            }
        }
        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
        Iterator it2 = map2.keySet().iterator();
        Map map3 = map2;
        while (it2.hasNext()) {
            InterfaceC12438e interfaceC12438e2 = (InterfaceC12438e) it2.next();
            ArrayList arrayList8 = new ArrayList();
            LinkedHashMap linkedHashMap11 = new LinkedHashMap();
            for (Size size3 : (List) map3.get(interfaceC12438e2)) {
                Iterator it3 = it2;
                int advert2 = interfaceC12438e2.advert();
                int mo839protected = interfaceC12438e2.mo839protected(size3);
                EnumC2392e mo837native2 = interfaceC12438e2.mo837native();
                EnumC2392e enumC2392e2 = C4637e.appmetrica;
                String str6 = str4;
                EnumC15386e enumC15386e = C16728e.pro(advert2, size3, c14132e.smaato(advert2), c18327e4.ad, c18327e4.yandex ? 1 : 2, mo837native2).vip;
                String str7 = str;
                Range range2 = C6884e.yandex;
                int license2 = AbstractC7890e.billing(range, range2) ? Alert.DURATION_SHOW_INDEFINITELY : c14132e.license(advert2, size3, z3, mo839protected);
                if (!z || (enumC15386e != EnumC15386e.NOT_SUPPORT && (AbstractC7890e.billing(range, range2) || license2 >= ((Number) range.getUpper()).intValue()))) {
                    Set set = (Set) linkedHashMap11.get(enumC15386e);
                    if (set == null) {
                        set = new LinkedHashSet();
                        linkedHashMap11.put(enumC15386e, set);
                    }
                    if (!set.contains(Integer.valueOf(license2))) {
                        arrayList8.add(size3);
                        set.add(Integer.valueOf(license2));
                    }
                }
                str4 = str6;
                it2 = it3;
                str = str7;
            }
            linkedHashMap10.put(interfaceC12438e2, arrayList8);
            map3 = map;
        }
        String str8 = str;
        String str9 = str4;
        ArrayList arrayList9 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (true) {
            boolean hasNext = it4.hasNext();
            interfaceC2531e = c14132e.ad;
            if (!hasNext) {
                break;
            }
            int intValue = ((Number) it4.next()).intValue();
            List<Size> list8 = (List) linkedHashMap10.get(list.get(intValue));
            int advert3 = ((InterfaceC12438e) list.get(intValue)).advert();
            c14132e.ads.getClass();
            Rational rational = ((((Nexus4AndroidLTargetAspectRatioQuirk) AbstractC16338e.ad(Nexus4AndroidLTargetAspectRatioQuirk.class)) == null && ((AspectRatioLegacyApi21Quirk) new C1209e(interfaceC2531e, c14132e.inmobi).ad().vip(AspectRatioLegacyApi21Quirk.class)) == null) || (size = (Size) c14132e.smaato(PSKKeyManager.MAX_KEY_LENGTH_BYTES).purchase.get(Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES))) == null) ? null : new Rational(size.getWidth(), size.getHeight());
            if (rational == null) {
                arrayList6 = new ArrayList(list8);
                linkedHashMap9 = linkedHashMap10;
            } else {
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                for (Size size4 : list8) {
                    Rational rational2 = AbstractC1146e.ad;
                    LinkedHashMap linkedHashMap12 = linkedHashMap10;
                    if (AbstractC1146e.ad(size4, rational, AbstractC2084e.metrica)) {
                        arrayList10.add(size4);
                    } else {
                        arrayList11.add(size4);
                    }
                    linkedHashMap10 = linkedHashMap12;
                }
                linkedHashMap9 = linkedHashMap10;
                arrayList11.addAll(0, arrayList10);
                arrayList6 = arrayList11;
            }
            EnumC2392e enumC2392e3 = C4637e.appmetrica;
            EnumC14212e enumC14212e = (EnumC14212e) C4637e.yandex.get(Integer.valueOf(advert3));
            if (enumC14212e == null) {
                enumC14212e = EnumC14212e.f28078e;
            }
            if (((ExtraCroppingQuirk) c14132e.applovin.f19315e) != null && (license = ExtraCroppingQuirk.license(enumC14212e)) != null) {
                ArrayList arrayList12 = new ArrayList();
                arrayList12.add(license);
                for (Size size5 : arrayList6) {
                    if (!AbstractC7890e.billing(size5, license)) {
                        arrayList12.add(size5);
                    }
                }
                arrayList6 = arrayList12;
            }
            arrayList9.add(arrayList6);
            linkedHashMap10 = linkedHashMap9;
        }
        LinkedHashMap linkedHashMap13 = new LinkedHashMap();
        LinkedHashMap linkedHashMap14 = new LinkedHashMap();
        C17846e c17846e2 = c14132e.subs;
        if (z3) {
            c17846e2.getClass();
            if (arrayList9.isEmpty()) {
                arrayList5 = c13664e;
            } else {
                List ad = C17846e.ad(arrayList9);
                arrayList5 = new ArrayList(AbstractC0746e.subscription(ad, 10));
                Iterator it5 = ad.iterator();
                while (it5.hasNext()) {
                    Size size6 = (Size) it5.next();
                    int size7 = arrayList9.size();
                    Iterator it6 = it5;
                    ArrayList arrayList13 = new ArrayList(size7);
                    LinkedHashMap linkedHashMap15 = linkedHashMap13;
                    for (int i3 = 0; i3 < size7; i3++) {
                        arrayList13.add(size6);
                    }
                    arrayList5.add(arrayList13);
                    it5 = it6;
                    linkedHashMap13 = linkedHashMap15;
                }
            }
            linkedHashMap2 = linkedHashMap13;
            r47 = 0;
            arrayList3 = arrayList5;
        } else {
            linkedHashMap2 = linkedHashMap13;
            r47 = 0;
            Iterator it7 = arrayList9.iterator();
            int i4 = 1;
            while (it7.hasNext()) {
                i4 *= ((List) it7.next()).size();
            }
            if (i4 == 0) {
                throw new IllegalArgumentException("Failed to find supported resolutions.");
            }
            ArrayList arrayList14 = new ArrayList();
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList14.add(new ArrayList());
            }
            int size8 = i4 / ((List) arrayList9.get(0)).size();
            int size9 = arrayList9.size();
            int i6 = i4;
            int i7 = size8;
            int i8 = 0;
            while (i8 < size9) {
                int i9 = size9;
                List list9 = (List) arrayList9.get(i8);
                LinkedHashMap linkedHashMap16 = linkedHashMap14;
                int i10 = 0;
                while (i10 < i4) {
                    ((List) arrayList14.get(i10)).add(list9.get((i10 % i6) / i7));
                    i10++;
                    arrayList14 = arrayList14;
                    i4 = i4;
                }
                ArrayList arrayList15 = arrayList14;
                int i11 = i4;
                if (i8 < arrayList9.size() - 1) {
                    i6 = i7;
                    i7 /= ((List) arrayList9.get(i8 + 1)).size();
                }
                i8++;
                linkedHashMap14 = linkedHashMap16;
                size9 = i9;
                arrayList14 = arrayList15;
                i4 = i11;
            }
            arrayList3 = arrayList14;
        }
        LinkedHashMap linkedHashMap17 = linkedHashMap14;
        C14326e c14326e = AbstractC4475e.ad;
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (it8.hasNext()) {
                C6355e c6355e = (C6355e) it8.next();
                if (AbstractC4475e.appmetrica(c6355e.purchase, (EnumC12633e) c6355e.appmetrica.get(0))) {
                    break;
                }
            } else {
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    InterfaceC12438e interfaceC12438e3 = (InterfaceC12438e) it9.next();
                    if (AbstractC4475e.appmetrica(interfaceC12438e3, interfaceC12438e3.mo844while())) {
                    }
                }
                z2 = false;
            }
        }
        z2 = true;
        if (!c14132e.subscription || z2) {
            c18327e2 = c18327e4;
            linkedHashMap3 = linkedHashMap2;
            linkedHashMap4 = linkedHashMap17;
            list2 = r47;
        } else {
            Iterator it10 = arrayList3.iterator();
            list2 = r47;
            while (true) {
                if (!it10.hasNext()) {
                    c18327e2 = c18327e4;
                    linkedHashMap3 = linkedHashMap2;
                    linkedHashMap4 = linkedHashMap17;
                    break;
                }
                C18327e c18327e5 = c18327e4;
                c18327e2 = c18327e5;
                LinkedHashMap linkedHashMap18 = linkedHashMap2;
                LinkedHashMap linkedHashMap19 = linkedHashMap17;
                linkedHashMap3 = linkedHashMap18;
                linkedHashMap4 = linkedHashMap19;
                list2 = c14132e.purchase(c18327e2, c14132e.advert(c18327e5.ad, arrayList, (List) it10.next(), list, arrayList2, linkedHashMap18, linkedHashMap19, false), linkedHashMap3, linkedHashMap4);
                if (list2 != null) {
                    break;
                }
                linkedHashMap3.clear();
                linkedHashMap4.clear();
                linkedHashMap2 = linkedHashMap3;
                linkedHashMap17 = linkedHashMap4;
                c18327e4 = c18327e2;
            }
            if (AbstractC9464e.smaato("CXCP")) {
                Log.d("CXCP", "orderedSurfaceConfigListForStreamUseCase = " + list2);
            }
        }
        Iterator it11 = arrayList.iterator();
        int i12 = Alert.DURATION_SHOW_INDEFINITELY;
        while (it11.hasNext()) {
            C6355e c6355e2 = (C6355e) it11.next();
            i12 = Math.min(i12, c14132e.license(c6355e2.vip, c6355e2.metrica, z3, c6355e2.adcel));
        }
        Iterator it12 = arrayList3.iterator();
        List list10 = r47;
        List list11 = list10;
        int i13 = Alert.DURATION_SHOW_INDEFINITELY;
        int i14 = Alert.DURATION_SHOW_INDEFINITELY;
        boolean z5 = false;
        boolean z6 = false;
        while (true) {
            if (!it12.hasNext()) {
                C18327e c18327e6 = c18327e2;
                i = i13;
                c18327e3 = c18327e6;
                arrayList4 = arrayList2;
                list3 = list2;
                linkedHashMap5 = linkedHashMap3;
                linkedHashMap6 = linkedHashMap4;
                str2 = "Required value was null.";
                interfaceC2531e2 = interfaceC2531e;
                r36 = z3;
                c17846e = c17846e2;
                str3 = str5;
                list4 = list;
                linkedHashMap7 = linkedHashMap;
                i2 = i14;
                list5 = list10;
                list6 = list11;
                break;
            }
            List<Size> list12 = (List) it12.next();
            int i15 = i14;
            LinkedHashMap linkedHashMap20 = new LinkedHashMap();
            LinkedHashMap linkedHashMap21 = new LinkedHashMap();
            int i16 = i13;
            int i17 = c18327e2.ad;
            boolean z7 = c18327e2.yandex;
            c17846e = c17846e2;
            str3 = str5;
            linkedHashMap6 = linkedHashMap4;
            linkedHashMap5 = linkedHashMap3;
            i = i16;
            List list13 = list;
            list3 = list2;
            interfaceC2531e2 = interfaceC2531e;
            int i18 = i12;
            ArrayList advert4 = c14132e.advert(i17, arrayList, list12, list13, arrayList2, linkedHashMap20, linkedHashMap21, z7);
            int i19 = i18;
            int i20 = 0;
            for (Size size10 : list12) {
                int i21 = i20 + 1;
                ArrayList arrayList16 = advert4;
                InterfaceC12438e interfaceC12438e4 = (InterfaceC12438e) list13.get(((Number) arrayList2.get(i20)).intValue());
                i19 = Math.min(i19, c14132e.license(interfaceC12438e4.advert(), size10, z3, interfaceC12438e4.mo839protected(size10)));
                list13 = list;
                i20 = i21;
                advert4 = arrayList16;
            }
            ArrayList arrayList17 = advert4;
            boolean z8 = AbstractC7890e.billing(range, C6884e.yandex) || i19 >= i18 || i19 >= ((Number) range.getUpper()).intValue();
            LinkedHashMap linkedHashMap22 = new LinkedHashMap();
            Iterator it13 = arrayList17.iterator();
            int i22 = 0;
            while (it13.hasNext()) {
                Object next = it13.next();
                int i23 = i22 + 1;
                if (i22 < 0) {
                    AbstractC6874e.Signature();
                    throw r47;
                }
                C4637e c4637e = (C4637e) next;
                C6355e c6355e3 = (C6355e) linkedHashMap20.get(Integer.valueOf(i22));
                if (c6355e3 == null || (c14677e = c6355e3.license) == null) {
                    Object obj = linkedHashMap.get(linkedHashMap21.get(Integer.valueOf(i22)));
                    if (obj == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    c14677e = (C14677e) obj;
                }
                linkedHashMap22.put(c4637e, c14677e);
                i22 = i23;
            }
            str2 = "Required value was null.";
            boolean z9 = z3;
            linkedHashMap7 = linkedHashMap;
            C8841e c8841e = new C8841e(this, c18327e, arrayList17, linkedHashMap22, list, arrayList2, 1);
            c14132e = this;
            c18327e3 = c18327e;
            list4 = list;
            arrayList4 = arrayList2;
            InterfaceC3477e appmetrica = AbstractC18039e.appmetrica(3, c8841e);
            if (!z5 && ((Boolean) appmetrica.getValue()).booleanValue()) {
                if (i == Integer.MAX_VALUE || i < i19) {
                    i = i19;
                    list10 = list12;
                }
                if (z8) {
                    if (z6) {
                        i = i19;
                        i2 = i15;
                        list6 = list11;
                        list5 = list12;
                        r36 = z9;
                        break;
                    }
                    i = i19;
                    z5 = true;
                    list10 = list12;
                }
            }
            if (list3 == null || z6 || c14132e.purchase(c18327e3, arrayList17, linkedHashMap20, linkedHashMap21) == null) {
                int i24 = i;
                c18327e2 = c18327e3;
                i13 = i24;
                i14 = i15;
            } else {
                if (i15 != Integer.MAX_VALUE && i15 >= i19) {
                    i14 = i15;
                } else {
                    i14 = i19;
                    list11 = list12;
                }
                if (!z8) {
                    int i25 = i;
                    c18327e2 = c18327e3;
                    i13 = i25;
                } else {
                    if (z5) {
                        i2 = i19;
                        list5 = list10;
                        list6 = list12;
                        r36 = z9;
                        break;
                    }
                    int i26 = i;
                    c18327e2 = c18327e3;
                    i13 = i26;
                    i14 = i19;
                    z6 = true;
                    str5 = str3;
                    interfaceC2531e = interfaceC2531e2;
                    list2 = list3;
                    c17846e2 = c17846e;
                    list11 = list12;
                    linkedHashMap3 = linkedHashMap5;
                    linkedHashMap4 = linkedHashMap6;
                    i12 = i18;
                    z3 = z9 ? 1 : 0;
                }
            }
            str5 = str3;
            interfaceC2531e = interfaceC2531e2;
            list2 = list3;
            c17846e2 = c17846e;
            linkedHashMap3 = linkedHashMap5;
            linkedHashMap4 = linkedHashMap6;
            i12 = i18;
            z3 = z9 ? 1 : 0;
        }
        C9007e c9007e = (list5 != null && (!z || AbstractC7890e.billing(range, C6884e.yandex) || (i != Integer.MAX_VALUE && i >= ((Number) range.getUpper()).intValue()))) ? new C9007e(i, i2, Alert.DURATION_SHOW_INDEFINITELY, list5, list6) : r47;
        if (c9007e == null) {
            StringBuilder applovin = AbstractC8703e.applovin(str8, str3, " and Hardware level: ");
            applovin.append(c14132e.appmetrica);
            applovin.append(". May be the specified resolution is too large and not supported. Existing surfaces: ");
            applovin.append(arrayList);
            applovin.append(str9);
            throw new IllegalArgumentException(AbstractC1786e.tapsense(applovin, list4, '.').toString());
        }
        int i27 = c9007e.metrica;
        List list14 = c9007e.ad;
        if (AbstractC9464e.smaato("CXCP")) {
            Log.d("CXCP", "resolveSpecsBySettings: bestSizesAndFps = " + c9007e);
        }
        LinkedHashMap linkedHashMap23 = new LinkedHashMap();
        Range range3 = C6884e.yandex;
        if (AbstractC7890e.billing(range, range3)) {
            C17846e c17846e3 = c17846e;
            if (r36 != 0) {
                range3 = metrica(C17846e.purchase, i27, c17846e3.vip(list14));
            }
        } else {
            Range[] vip = r36 != 0 ? c17846e.vip(list14) : (Range[]) ((C9000e) interfaceC2531e2).metrica(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            Range metrica = metrica(range, i27, vip);
            if ((z || c18327e3.adcel) && !AbstractC7890e.billing(metrica, range)) {
                throw new IllegalArgumentException(("Target FPS range " + range + " is not supported. Max FPS supported by the calculated best combination: " + i27 + ". Calculated best FPS range for device: " + metrica + ". Device supported FPS ranges: " + Arrays.toString(vip) + '.').toString());
            }
            range3 = metrica;
        }
        Iterator it14 = list4.iterator();
        int i28 = 0;
        while (it14.hasNext()) {
            int i29 = i28 + 1;
            InterfaceC12438e interfaceC12438e5 = (InterfaceC12438e) it14.next();
            C10017e ad2 = C6884e.ad((Size) list14.get(arrayList4.indexOf(Integer.valueOf(i28))));
            ad2.f19784e = Integer.valueOf((int) r36);
            Object obj2 = linkedHashMap7.get(interfaceC12438e5);
            if (obj2 == null) {
                throw new IllegalStateException(str2);
            }
            ad2.f19788e = (C14677e) obj2;
            C14326e c14326e2 = AbstractC4475e.ad;
            C4069e license3 = C4069e.license();
            C14326e c14326e3 = C11456e.f23059e;
            Iterator it15 = it14;
            if (interfaceC12438e5.mo812extends(c14326e3)) {
                license3.yandex(c14326e3, interfaceC12438e5.subscription(c14326e3));
            }
            C14326e c14326e4 = InterfaceC12438e.f24894e;
            if (interfaceC12438e5.mo812extends(c14326e4)) {
                license3.yandex(c14326e4, interfaceC12438e5.subscription(c14326e4));
            }
            C14326e c14326e5 = C5753e.f12173e;
            if (interfaceC12438e5.mo812extends(c14326e5)) {
                license3.yandex(c14326e5, interfaceC12438e5.subscription(c14326e5));
            }
            C14326e c14326e6 = InterfaceC14405e.isPro;
            if (interfaceC12438e5.mo812extends(c14326e6)) {
                license3.yandex(c14326e6, interfaceC12438e5.subscription(c14326e6));
            }
            ad2.f19790e = new C2362e(7, license3);
            ad2.f19787e = Boolean.valueOf(c18327e3.metrica);
            if (!AbstractC7890e.billing(range3, C6884e.yandex)) {
                if (range3 == null) {
                    throw new NullPointerException("Null expectedFrameRateRange");
                }
                ad2.f19791e = range3;
            }
            linkedHashMap23.put(interfaceC12438e5, ad2.ad());
            it14 = it15;
            i28 = i29;
        }
        LinkedHashMap linkedHashMap24 = new LinkedHashMap();
        if (list3 != null) {
            List list15 = c9007e.vip;
            if (i27 == c9007e.license && list14.size() == list15.size()) {
                ArrayList m3579e = AbstractC13480e.m3579e(list15, list14);
                if (!m3579e.isEmpty()) {
                    Iterator it16 = m3579e.iterator();
                    while (it16.hasNext()) {
                        C6571e c6571e = (C6571e) it16.next();
                        if (!AbstractC7890e.billing(c6571e.f13544e, c6571e.f13543e)) {
                            break;
                        }
                    }
                }
                if (!AbstractC4475e.purchase(interfaceC2531e2, arrayList, linkedHashMap23, linkedHashMap24)) {
                    int size11 = list3.size();
                    int i30 = 0;
                    while (i30 < size11) {
                        List list16 = list3;
                        long j = ((C4637e) list16.get(i30)).metrica.f6112e;
                        LinkedHashMap linkedHashMap25 = linkedHashMap5;
                        if (linkedHashMap25.containsKey(Integer.valueOf(i30))) {
                            C6355e c6355e4 = (C6355e) linkedHashMap25.get(Integer.valueOf(i30));
                            C11456e vip2 = AbstractC4475e.vip(c6355e4.purchase, Long.valueOf(j));
                            if (vip2 != null) {
                                C10017e ad3 = C6884e.ad(c6355e4.metrica);
                                ad3.f19784e = Integer.valueOf(c6355e4.billing);
                                Range range4 = c6355e4.yandex;
                                if (range4 == null) {
                                    throw new NullPointerException("Null expectedFrameRateRange");
                                }
                                ad3.f19791e = range4;
                                C14677e c14677e2 = c6355e4.license;
                                if (c14677e2 == null) {
                                    throw new NullPointerException("Null dynamicRange");
                                }
                                ad3.f19788e = c14677e2;
                                ad3.f19790e = vip2;
                                linkedHashMap24.put(c6355e4, ad3.ad());
                            }
                            linkedHashMap8 = linkedHashMap6;
                        } else {
                            linkedHashMap8 = linkedHashMap6;
                            if (!linkedHashMap8.containsKey(Integer.valueOf(i30))) {
                                throw new AssertionError("SurfaceConfig does not map to any use case");
                            }
                            InterfaceC12438e interfaceC12438e6 = (InterfaceC12438e) linkedHashMap8.get(Integer.valueOf(i30));
                            C6884e c6884e = (C6884e) linkedHashMap23.get(interfaceC12438e6);
                            C11456e vip3 = AbstractC4475e.vip(c6884e.purchase, Long.valueOf(j));
                            if (vip3 != null) {
                                C10017e vip4 = c6884e.vip();
                                vip4.f19790e = vip3;
                                linkedHashMap23.put(interfaceC12438e6, vip4.ad());
                            }
                        }
                        i30++;
                        list3 = list16;
                        linkedHashMap5 = linkedHashMap25;
                        linkedHashMap6 = linkedHashMap8;
                    }
                }
            }
        }
        return new C9984e(linkedHashMap23, linkedHashMap24, c9007e.appmetrica);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0271, code lost:
    
        r12 = r9;
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03bb, code lost:
    
        if (r30 == 4) goto L187;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0454  */
    /* JADX WARN: Type inference failed for: r4v9, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C9984e mopub(int r27, java.util.ArrayList r28, java.util.LinkedHashMap r29, int r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 1133
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14132e.mopub(int, java.util.ArrayList, java.util.LinkedHashMap, int, boolean, boolean):eَؑٔ");
    }

    public final List purchase(C18327e c18327e, ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        C14326e c14326e = AbstractC4475e.ad;
        if (c18327e.ad != 0 || c18327e.vip != 8 || c18327e.purchase) {
            return null;
        }
        Iterator it = this.yandex.iterator();
        while (it.hasNext()) {
            List metrica = ((C6404e) it.next()).metrica(arrayList);
            if (metrica != null) {
                C14326e c14326e2 = AbstractC4475e.ad;
                int size = metrica.size();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= size) {
                        z = true;
                        break;
                    }
                    long j = ((C4637e) metrica.get(i)).metrica.f6112e;
                    boolean containsKey = linkedHashMap.containsKey(Integer.valueOf(i));
                    EnumC12633e enumC12633e = EnumC12633e.f25347e;
                    if (containsKey) {
                        List list = ((C6355e) linkedHashMap.get(Integer.valueOf(i))).appmetrica;
                        if (list.size() == 1) {
                            enumC12633e = (EnumC12633e) list.get(0);
                        }
                        if (!AbstractC4475e.metrica(enumC12633e, j, list)) {
                            break;
                        }
                        i++;
                    } else {
                        if (!linkedHashMap2.containsKey(Integer.valueOf(i))) {
                            throw new AssertionError("SurfaceConfig does not map to any use case");
                        }
                        InterfaceC12438e interfaceC12438e = (InterfaceC12438e) linkedHashMap2.get(Integer.valueOf(i));
                        if (!AbstractC4475e.metrica(interfaceC12438e.mo844while(), j, interfaceC12438e.mo844while() == enumC12633e ? (List) AbstractC0054e.loadAd((C10413e) interfaceC12438e, C10413e.f20583e) : C13664e.f27089e)) {
                            break;
                        }
                        i++;
                    }
                }
                C5363e c5363e = new C5363e(new C5565e(this, metrica, 21));
                if (z && ((Boolean) c5363e.getValue()).booleanValue()) {
                    return metrica;
                }
            }
        }
        return null;
    }

    public final C6331e smaato(int i) {
        Size appmetrica;
        Integer valueOf = Integer.valueOf(i);
        ArrayList arrayList = this.isVip;
        if (!arrayList.contains(valueOf)) {
            C6331e c6331e = this.tapsense;
            if (c6331e == null) {
                c6331e = null;
            }
            admob(c6331e.vip, AbstractC2084e.appmetrica, i);
            C6331e c6331e2 = this.tapsense;
            if (c6331e2 == null) {
                c6331e2 = null;
            }
            admob(c6331e2.license, AbstractC2084e.billing, i);
            C6331e c6331e3 = this.tapsense;
            if (c6331e3 == null) {
                c6331e3 = null;
            }
            Signature(c6331e3.purchase, i, null);
            C6331e c6331e4 = this.tapsense;
            if (c6331e4 == null) {
                c6331e4 = null;
            }
            Signature(c6331e4.billing, i, AbstractC1146e.ad);
            C6331e c6331e5 = this.tapsense;
            if (c6331e5 == null) {
                c6331e5 = null;
            }
            Signature(c6331e5.yandex, i, AbstractC1146e.metrica);
            C6331e c6331e6 = this.tapsense;
            if (c6331e6 == null) {
                c6331e6 = null;
            }
            LinkedHashMap linkedHashMap = c6331e6.startapp;
            if (Build.VERSION.SDK_INT >= 31 && this.remoteconfig) {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((C9000e) this.ad).metrica(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION);
                if (streamConfigurationMap != null && (appmetrica = appmetrica(streamConfigurationMap, i, true, null)) != null) {
                    linkedHashMap.put(Integer.valueOf(i), appmetrica);
                }
            }
            arrayList.add(Integer.valueOf(i));
        }
        C6331e c6331e7 = this.tapsense;
        if (c6331e7 != null) {
            return c6331e7;
        }
        return null;
    }

    public final Size startapp() {
        InterfaceC16104e vip;
        Iterator it = AbstractC6874e.startapp(1, 13, 10, 8, 12, 6, 5, 4).iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            InterfaceC6744e interfaceC6744e = this.vip;
            if (interfaceC6744e.ad(intValue) && (vip = interfaceC6744e.vip(intValue)) != null && !vip.license().isEmpty()) {
                return ((C1900e) vip.license().get(0)).ad();
            }
        }
        return null;
    }

    public final void subscription(C18327e c18327e) {
        int i = c18327e.ad;
        boolean z = c18327e.billing;
        String str = this.license;
        if (i != 0 && c18327e.appmetrica) {
            throw new IllegalArgumentException(AbstractC1786e.signatures(AbstractC8703e.applovin("Camera device Id is ", str, ". Ultra HDR is not currently supported in "), i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode.").toString());
        }
        if (i != 0 && c18327e.vip == 10) {
            throw new IllegalArgumentException(AbstractC1786e.signatures(AbstractC8703e.applovin("Camera device Id is ", str, ". 10 bit dynamic range is not currently supported in "), i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode.").toString());
        }
        if (i != 0 && z) {
            throw new IllegalArgumentException(AbstractC1786e.signatures(AbstractC8703e.applovin("Camera device Id is ", str, ". feature combination is not currently supported in "), i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode.").toString());
        }
        boolean z2 = c18327e.purchase;
        if (z2 && z) {
            throw new IllegalArgumentException("High-speed session is not supported with feature combination");
        }
        if (z2 && !((Boolean) this.subs.vip.getValue()).booleanValue()) {
            throw new IllegalArgumentException("High-speed session is not supported on this device.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r0 != null) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vip() {
        /*
            r11 = this;
            eٟؑٚ r0 = r11.isPro
            android.util.Size r4 = r0.metrica()
            java.lang.String r0 = r11.license     // Catch: java.lang.NumberFormatException -> L13
            java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L13
            android.util.Size r0 = r11.startapp()     // Catch: java.lang.NumberFormatException -> L13
            if (r0 == 0) goto L13
        L11:
            r6 = r0
            goto L6a
        L13:
            eْٕٚ r0 = r11.inmobi
            e٘ۙؒ r0 = r0.metrica
            java.lang.Object r0 = r0.f35233e
            android.hardware.camera2.params.StreamConfigurationMap r0 = (android.hardware.camera2.params.StreamConfigurationMap) r0
            r1 = 0
            if (r0 == 0) goto L2c
            java.lang.Class<android.media.MediaRecorder> r2 = android.media.MediaRecorder.class
            android.util.Size[] r0 = r0.getOutputSizes(r2)     // Catch: java.lang.Throwable -> L25
            goto L2d
        L25:
            r0 = move-exception
            eّۜۖ r2 = new eّۜۖ
            r2.<init>(r0)
            goto L2e
        L2c:
            r0 = r1
        L2d:
            r2 = r0
        L2e:
            boolean r0 = r2 instanceof defpackage.C12763e
            if (r0 == 0) goto L34
            r2 = r1
        L34:
            android.util.Size[] r2 = (android.util.Size[]) r2
            if (r2 != 0) goto L3a
        L38:
            r0 = r1
            goto L64
        L3a:
            eٔۗٙ r0 = new eٔۗٙ
            r3 = 1
            r0.<init>(r3)
            java.util.Arrays.sort(r2, r0)
            int r0 = r2.length
            r3 = 0
        L45:
            if (r3 >= r0) goto L38
            r5 = r2[r3]
            int r6 = r5.getWidth()
            android.util.Size r7 = defpackage.AbstractC2084e.purchase
            int r8 = r7.getWidth()
            if (r6 > r8) goto L61
            int r6 = r5.getHeight()
            int r7 = r7.getHeight()
            if (r6 > r7) goto L61
            r0 = r5
            goto L64
        L61:
            int r3 = r3 + 1
            goto L45
        L64:
            if (r0 == 0) goto L67
            goto L11
        L67:
            android.util.Size r0 = defpackage.AbstractC2084e.license
            goto L11
        L6a:
            android.util.Size r2 = defpackage.AbstractC2084e.metrica
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            eؙُ۟ r1 = new eؙُ۟
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.tapsense = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14132e.vip():void");
    }
}
