package ua.itaysonlab.vkapi2.objects.radio;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC3442e;
import defpackage.AbstractC8647e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RadioStationJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("id", "name", "logo_url", "logo_png_url", "background_color", "is_followed", "is_enabled", "stream_url", "liked");
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public RadioStationJsonAdapter(C14172e c14172e) {
        Class cls = Integer.TYPE;
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(cls, c3295e, "id");
        this.metrica = c14172e.vip(String.class, c3295e, "name");
        this.license = c14172e.vip(Boolean.TYPE, c3295e, "is_followed");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        RadioStation radioStation = (RadioStation) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("id");
        AbstractC8647e.subs(radioStation.ad, this.vip, abstractC3442e, "name");
        String str = radioStation.vip;
        AbstractC13345e abstractC13345e = this.metrica;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("logo_url");
        abstractC13345e.purchase(abstractC3442e, radioStation.metrica);
        abstractC3442e.loadAd("logo_png_url");
        abstractC13345e.purchase(abstractC3442e, radioStation.license);
        abstractC3442e.loadAd("background_color");
        abstractC13345e.purchase(abstractC3442e, radioStation.appmetrica);
        abstractC3442e.loadAd("is_followed");
        boolean z = radioStation.purchase;
        AbstractC13345e abstractC13345e2 = this.license;
        AbstractC8647e.m2459native(z, abstractC13345e2, abstractC3442e, "is_enabled");
        AbstractC8647e.m2459native(radioStation.billing, abstractC13345e2, abstractC3442e, "stream_url");
        abstractC13345e.purchase(abstractC3442e, radioStation.yandex);
        abstractC3442e.loadAd("liked");
        abstractC13345e2.purchase(abstractC3442e, Boolean.valueOf(radioStation.purchase));
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(RadioStation)";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x003b. Please report as an issue. */
    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        RadioStation radioStation;
        abstractC17080e.license();
        Integer num = null;
        String str = null;
        Object obj = null;
        String str2 = null;
        Boolean bool = null;
        Set set = C3295e.f7451e;
        int i = -1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            Integer num2 = num;
            Object obj4 = obj2;
            if (!abstractC17080e.Signature()) {
                Object obj5 = obj3;
                String str3 = str;
                abstractC17080e.advert();
                if ((!z) & (num2 == null)) {
                    set = AbstractC0869e.isPro("id", "id", abstractC17080e, set);
                }
                if ((!z2) & (str3 == null)) {
                    set = AbstractC0869e.isPro("name", "name", abstractC17080e, set);
                }
                if ((!z3) & (str2 == null)) {
                    set = AbstractC0869e.isPro("stream_url", "stream_url", abstractC17080e, set);
                }
                if (set.size() != 0) {
                    throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
                }
                if (i == -125) {
                    radioStation = new RadioStation(num2.intValue(), str3, (String) obj4, (String) obj5, (String) obj, z4, z5, str2);
                } else {
                    boolean z6 = z4;
                    boolean z7 = z5;
                    int intValue = num2.intValue();
                    String str4 = (String) obj4;
                    String str5 = (String) obj5;
                    String str6 = (String) obj;
                    if ((i & 4) != 0) {
                        str4 = BuildConfig.FLAVOR;
                    }
                    if ((i & 8) != 0) {
                        str5 = BuildConfig.FLAVOR;
                    }
                    if ((i & 16) != 0) {
                        str6 = BuildConfig.FLAVOR;
                    }
                    if ((i & 32) != 0) {
                        z6 = false;
                    }
                    if ((i & 64) != 0) {
                        z7 = false;
                    }
                    radioStation = new RadioStation(intValue, str3, str4, str5, str6, z6, z7, str2);
                }
                if (bool != null) {
                    radioStation.metrica(bool.booleanValue());
                }
                return radioStation;
            }
            Object obj6 = obj3;
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.license;
            String str7 = str;
            AbstractC13345e abstractC13345e2 = this.metrica;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    obj3 = obj6;
                    num = num2;
                    obj2 = obj4;
                    str = str7;
                    break;
                case 0:
                    Object vip = this.vip.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("id", "id", abstractC17080e, set);
                        obj3 = obj6;
                        num = num2;
                        obj2 = obj4;
                        z = true;
                        str = str7;
                        break;
                    } else {
                        num = (Integer) vip;
                        obj3 = obj6;
                        obj2 = obj4;
                        str = str7;
                    }
                case 1:
                    Object vip2 = abstractC13345e2.vip(abstractC17080e);
                    if (vip2 != null) {
                        str = (String) vip2;
                        obj3 = obj6;
                        num = num2;
                        obj2 = obj4;
                        break;
                    } else {
                        set = AbstractC0869e.subs("name", "name", abstractC17080e, set);
                        obj3 = obj6;
                        num = num2;
                        obj2 = obj4;
                        z2 = true;
                        str = str7;
                        break;
                    }
                case 2:
                    Object vip3 = abstractC13345e2.vip(abstractC17080e);
                    if (vip3 == null) {
                        set = AbstractC0869e.subs("logo_url", "logo_url", abstractC17080e, set);
                        obj2 = obj4;
                    } else {
                        obj2 = vip3;
                    }
                    i &= -5;
                    obj3 = obj6;
                    num = num2;
                    str = str7;
                    break;
                case 3:
                    Object vip4 = abstractC13345e2.vip(abstractC17080e);
                    if (vip4 == null) {
                        set = AbstractC0869e.subs("logo_png_url", "logo_png_url", abstractC17080e, set);
                        obj3 = obj6;
                    } else {
                        obj3 = vip4;
                    }
                    i &= -9;
                    num = num2;
                    obj2 = obj4;
                    str = str7;
                    break;
                case 4:
                    Object vip5 = abstractC13345e2.vip(abstractC17080e);
                    if (vip5 == null) {
                        set = AbstractC0869e.subs("background_color", "background_color", abstractC17080e, set);
                    } else {
                        obj = vip5;
                    }
                    i &= -17;
                    obj3 = obj6;
                    num = num2;
                    obj2 = obj4;
                    str = str7;
                    break;
                case 5:
                    Object vip6 = abstractC13345e.vip(abstractC17080e);
                    if (vip6 == null) {
                        set = AbstractC0869e.subs("is_followed", "is_followed", abstractC17080e, set);
                    } else {
                        z4 = ((Boolean) vip6).booleanValue();
                    }
                    i &= -33;
                    obj3 = obj6;
                    num = num2;
                    obj2 = obj4;
                    str = str7;
                    break;
                case 6:
                    Object vip7 = abstractC13345e.vip(abstractC17080e);
                    if (vip7 == null) {
                        set = AbstractC0869e.subs("is_enabled", "is_enabled", abstractC17080e, set);
                    } else {
                        z5 = ((Boolean) vip7).booleanValue();
                    }
                    i &= -65;
                    obj3 = obj6;
                    num = num2;
                    obj2 = obj4;
                    str = str7;
                    break;
                case 7:
                    Object vip8 = abstractC13345e2.vip(abstractC17080e);
                    if (vip8 == null) {
                        set = AbstractC0869e.subs("stream_url", "stream_url", abstractC17080e, set);
                        obj3 = obj6;
                        num = num2;
                        obj2 = obj4;
                        z3 = true;
                        str = str7;
                        break;
                    } else {
                        str2 = (String) vip8;
                        obj3 = obj6;
                        num = num2;
                        obj2 = obj4;
                        str = str7;
                    }
                case 8:
                    Object vip9 = abstractC13345e.vip(abstractC17080e);
                    if (vip9 == null) {
                        set = AbstractC0869e.subs("liked", "liked", abstractC17080e, set);
                    } else {
                        bool = (Boolean) vip9;
                    }
                    obj3 = obj6;
                    num = num2;
                    obj2 = obj4;
                    str = str7;
                    break;
                default:
                    obj3 = obj6;
                    num = num2;
                    obj2 = obj4;
                    str = str7;
                    break;
            }
        }
    }
}
