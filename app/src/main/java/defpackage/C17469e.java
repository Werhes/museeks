package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘ٘ؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17469e {
    public final C3936e ad;
    public final List appmetrica;
    public final C9930e billing;
    public final Set license;
    public final Range metrica;
    public final List purchase;
    public final boolean startapp;
    public final List vip;
    public final ScheduledExecutorServiceC5380e yandex;

    public C17469e(List list, C3936e c3936e, List list2) {
        boolean z;
        Object obj;
        String concat;
        String str;
        String str2;
        boolean Signature;
        Range range = C6884e.yandex;
        this.ad = c3936e;
        this.vip = list2;
        this.metrica = range;
        this.license = C3295e.f7451e;
        this.appmetrica = C13664e.f27089e;
        List premium = AbstractC13480e.premium(list);
        this.purchase = premium;
        this.billing = new C9930e(6);
        this.yandex = AbstractC3062e.amazon();
        if (!AbstractC7890e.billing(range, C6884e.yandex)) {
            Iterator it = premium.iterator();
            while (it.hasNext()) {
                if (((AbstractC16510e) it.next()).purchase.mo841static()) {
                    throw new IllegalArgumentException("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
                }
            }
        }
        List list3 = this.appmetrica;
        Set set = this.license;
        if (!set.isEmpty() || !list3.isEmpty()) {
            Set set2 = set;
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(set2, 10));
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((AbstractC3677e) it2.next()).ad());
            }
            for (EnumC3797e enumC3797e : AbstractC13480e.premium(arrayList)) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : set2) {
                    if (((AbstractC3677e) obj2).ad() == enumC3797e) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2.size() > 1) {
                    throw new IllegalArgumentException(("requiredFeatures has conflicting feature values: " + arrayList2).toString());
                }
            }
            if (AbstractC13480e.premium(list3).size() != list3.size()) {
                throw new IllegalArgumentException(("Duplicate values in preferredFeatures(" + list3 + ')').toString());
            }
            LinkedHashSet m3578extends = AbstractC13480e.m3578extends(set2, list3);
            if (!m3578extends.isEmpty()) {
                throw new IllegalArgumentException(("requiredFeatures and preferredFeatures have duplicate values: " + m3578extends).toString());
            }
            for (AbstractC16510e abstractC16510e : this.purchase) {
                boolean z2 = abstractC16510e instanceof C9301e;
                EnumC8815e enumC8815e = EnumC8815e.f17730e;
                if ((z2 ? EnumC8815e.f17727e : abstractC16510e instanceof C3373e ? EnumC8815e.f17726e : abstractC16510e instanceof C12477e ? EnumC8815e.f17729e : AbstractC13350e.license(abstractC16510e) ? EnumC8815e.f17725e : abstractC16510e instanceof C14402e ? EnumC8815e.f17731e : enumC8815e) == enumC8815e) {
                    throw new IllegalArgumentException((abstractC16510e + " is not supported with feature group").toString());
                }
                String str3 = z2 ? "Preview" : abstractC16510e instanceof C3373e ? "ImageCapture" : abstractC16510e instanceof C12477e ? "ImageAnalysis" : AbstractC13350e.license(abstractC16510e) ? "VideoCapture" : "UseCase";
                Iterator it3 = EnumC3797e.f8405e.iterator();
                while (true) {
                    z = false;
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    int ordinal = ((EnumC3797e) obj).ordinal();
                    if (ordinal == 0) {
                        Signature = abstractC16510e.purchase.Signature();
                    } else if (ordinal == 1) {
                        Signature = abstractC16510e.purchase.mo841static();
                    } else if (ordinal == 2) {
                        Signature = abstractC16510e.purchase.mo812extends(InterfaceC12438e.f24900e) || abstractC16510e.purchase.mo812extends(InterfaceC12438e.f24896e);
                    } else if (ordinal == 3) {
                        Signature = abstractC16510e.purchase.mo812extends(C5753e.f12170e);
                    } else {
                        if (ordinal != 4) {
                            throw new C14803e(10);
                        }
                        Signature = AbstractC7890e.billing(abstractC16510e.purchase.smaato(InterfaceC12438e.f24887e, Boolean.TRUE), Boolean.FALSE);
                    }
                    if (Signature) {
                        break;
                    }
                }
                EnumC3797e enumC3797e2 = (EnumC3797e) obj;
                if (enumC3797e2 == null) {
                    z = true;
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder("A ");
                    sb.append(enumC3797e2.name());
                    sb.append(" value is set to ");
                    sb.append(str3);
                    sb.append(" despite using feature groups. Do not use APIs like ");
                    int ordinal2 = enumC3797e2.ordinal();
                    if (ordinal2 == 0) {
                        concat = str3.concat(".Builder.setDynamicRange");
                    } else if (ordinal2 == 1) {
                        concat = str3.concat(".Builder.setTargetFrameRateRange");
                    } else if (ordinal2 == 2) {
                        concat = AbstractC13350e.license(abstractC16510e) ? str3.concat(".Builder.setVideoStabilizationEnabled") : str3.concat(".Builder.setPreviewStabilizationEnabled");
                    } else if (ordinal2 == 3) {
                        concat = str3.concat(".Builder.setOutputFormat");
                    } else {
                        if (ordinal2 != 4) {
                            throw new C14803e(10);
                        }
                        concat = "Recorder.Builder.setQualitySelector";
                    }
                    sb.append(concat);
                    sb.append(" while using feature groups. If, for example, ");
                    int ordinal3 = enumC3797e2.ordinal();
                    if (ordinal3 == 0) {
                        str = "HDR";
                    } else if (ordinal3 == 1) {
                        str = "60 FPS";
                    } else if (ordinal3 == 2) {
                        str = "stabilization";
                    } else if (ordinal3 == 3) {
                        str = "JPEG_R output format";
                    } else {
                        if (ordinal3 != 4) {
                            throw new C14803e(10);
                        }
                        str = "UHD recording quality";
                    }
                    sb.append(str);
                    sb.append(" is required, instead set ");
                    int ordinal4 = enumC3797e2.ordinal();
                    if (ordinal4 == 0) {
                        str2 = "GroupableFeature.HDR_HLG10";
                    } else if (ordinal4 == 1) {
                        str2 = "GroupableFeature.FPS_60";
                    } else if (ordinal4 == 2) {
                        str2 = "GroupableFeature.PREVIEW_STABILIZATION";
                    } else if (ordinal4 == 3) {
                        str2 = "GroupableFeature.IMAGE_ULTRA_HDR";
                    } else {
                        if (ordinal4 != 4) {
                            throw new C14803e(10);
                        }
                        str2 = "GroupableFeatures.UHD_RECORDING";
                    }
                    throw new IllegalArgumentException(AbstractC1786e.signatures(sb, str2, " as either a required or preferred feature.").toString());
                }
            }
        }
        this.startapp = true;
    }

    public int ad() {
        return 0;
    }

    public final String toString() {
        return "SessionConfig@" + Integer.toHexString(System.identityHashCode(this)) + " {useCases=" + this.purchase + ", frameRateRange=" + this.metrica + ", requiredFeatureGroup=" + this.license + ", preferredFeatureGroup=" + this.appmetrica + ", effects=" + this.vip + ", viewPort=" + this.ad + '}';
    }

    public final boolean vip() {
        return this.startapp;
    }
}
