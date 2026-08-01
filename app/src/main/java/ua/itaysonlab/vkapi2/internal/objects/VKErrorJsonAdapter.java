package ua.itaysonlab.vkapi2.internal.objects;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC18453e;
import defpackage.AbstractC3442e;
import defpackage.AbstractC8647e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VKErrorJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("error_code", "error_msg", "method", "request_params", "captcha_sid", "captcha_img", "captcha_ts", "captcha_ratio", "captcha_attempt", "redirect_uri");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e billing;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e purchase;
    public final AbstractC13345e vip;

    public VKErrorJsonAdapter(C14172e c14172e) {
        Class cls = Integer.TYPE;
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(cls, c3295e, "error_code");
        this.metrica = c14172e.vip(String.class, c3295e, "error_msg");
        this.license = c14172e.vip(String.class, c3295e, "method");
        this.appmetrica = c14172e.vip(AbstractC18453e.purchase(List.class, VKRequestParameter.class), c3295e, "request_params");
        this.purchase = c14172e.vip(Double.class, c3295e, "captchaTs");
        this.billing = c14172e.vip(Integer.class, c3295e, "captchaAttempt");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        VKError vKError = (VKError) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("error_code");
        AbstractC8647e.subs(vKError.ad, this.vip, abstractC3442e, "error_msg");
        this.metrica.purchase(abstractC3442e, vKError.vip);
        abstractC3442e.loadAd("method");
        String str = vKError.metrica;
        AbstractC13345e abstractC13345e = this.license;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("request_params");
        this.appmetrica.purchase(abstractC3442e, vKError.license);
        abstractC3442e.loadAd("captcha_sid");
        abstractC13345e.purchase(abstractC3442e, vKError.appmetrica);
        abstractC3442e.loadAd("captcha_img");
        abstractC13345e.purchase(abstractC3442e, vKError.purchase);
        abstractC3442e.loadAd("captcha_ts");
        Double d = vKError.billing;
        AbstractC13345e abstractC13345e2 = this.purchase;
        abstractC13345e2.purchase(abstractC3442e, d);
        abstractC3442e.loadAd("captcha_ratio");
        abstractC13345e2.purchase(abstractC3442e, vKError.yandex);
        abstractC3442e.loadAd("captcha_attempt");
        this.billing.purchase(abstractC3442e, vKError.startapp);
        abstractC3442e.loadAd("redirect_uri");
        abstractC13345e.purchase(abstractC3442e, vKError.adcel);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(VKError)";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0037. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        String str;
        abstractC17080e.license();
        Integer num = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Set set = C3295e.f7451e;
        int i = -1;
        boolean z = false;
        boolean z2 = false;
        String str4 = null;
        ?? r5 = 0;
        while (true) {
            Integer num2 = num;
            if (!abstractC17080e.Signature()) {
                String str5 = str4;
                String str6 = r5;
                abstractC17080e.advert();
                if ((!z) & (num2 == null)) {
                    set = AbstractC0869e.isPro("error_code", "error_code", abstractC17080e, set);
                }
                if ((!z2) & (str2 == null)) {
                    set = AbstractC0869e.isPro("error_msg", "error_msg", abstractC17080e, set);
                }
                if (set.size() != 0) {
                    throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
                }
                if (i == -1009) {
                    return new VKError(num2.intValue(), str2, str3, list, str5, str6, (Double) obj, (Double) obj2, (Integer) obj3, (String) obj4);
                }
                return new VKError(num2.intValue(), str2, str3, list, str5, str6, (Double) obj, (Double) obj2, (Integer) obj3, (String) obj4, i);
            }
            String str7 = str4;
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.purchase;
            Object obj5 = r5;
            AbstractC13345e abstractC13345e2 = this.license;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    str = str7;
                    num = num2;
                    str4 = str;
                    r5 = obj5;
                    break;
                case 0:
                    Object vip = this.vip.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("error_code", "error_code", abstractC17080e, set);
                        str4 = str7;
                        num = num2;
                        z = true;
                    } else {
                        num = (Integer) vip;
                        str4 = str7;
                    }
                    r5 = obj5;
                    break;
                case 1:
                    Object vip2 = this.metrica.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("error_msg", "error_msg", abstractC17080e, set);
                        str4 = str7;
                        num = num2;
                        z2 = true;
                        r5 = obj5;
                        break;
                    } else {
                        str2 = (String) vip2;
                        str = str7;
                        num = num2;
                        str4 = str;
                        r5 = obj5;
                    }
                case 2:
                    str3 = (String) abstractC13345e2.vip(abstractC17080e);
                    str = str7;
                    num = num2;
                    str4 = str;
                    r5 = obj5;
                    break;
                case 3:
                    list = (List) this.appmetrica.vip(abstractC17080e);
                    str = str7;
                    num = num2;
                    str4 = str;
                    r5 = obj5;
                    break;
                case 4:
                    i &= -17;
                    str = abstractC13345e2.vip(abstractC17080e);
                    num = num2;
                    str4 = str;
                    r5 = obj5;
                    break;
                case 5:
                    r5 = abstractC13345e2.vip(abstractC17080e);
                    i &= -33;
                    str4 = str7;
                    num = num2;
                    break;
                case 6:
                    obj = abstractC13345e.vip(abstractC17080e);
                    i &= -65;
                    str = str7;
                    num = num2;
                    str4 = str;
                    r5 = obj5;
                    break;
                case 7:
                    obj2 = abstractC13345e.vip(abstractC17080e);
                    i &= -129;
                    str = str7;
                    num = num2;
                    str4 = str;
                    r5 = obj5;
                    break;
                case 8:
                    obj3 = this.billing.vip(abstractC17080e);
                    i &= -257;
                    str = str7;
                    num = num2;
                    str4 = str;
                    r5 = obj5;
                    break;
                case 9:
                    obj4 = abstractC13345e2.vip(abstractC17080e);
                    i &= -513;
                    str = str7;
                    num = num2;
                    str4 = str;
                    r5 = obj5;
                    break;
                default:
                    str = str7;
                    num = num2;
                    str4 = str;
                    r5 = obj5;
                    break;
            }
        }
    }
}
