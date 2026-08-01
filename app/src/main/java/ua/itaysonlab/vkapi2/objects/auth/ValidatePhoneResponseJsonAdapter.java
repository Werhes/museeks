package ua.itaysonlab.vkapi2.objects.auth;

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
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ValidatePhoneResponseJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("next_sid", "validation_type", "validation_resend", "delay", "external_id", "phone", "masked_email", "code_length", "device_name");
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public ValidatePhoneResponseJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "nextSid");
        this.metrica = c14172e.vip(Integer.TYPE, c3295e, "delayBeforeNextCall");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        ValidatePhoneResponse validatePhoneResponse = (ValidatePhoneResponse) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("next_sid");
        String str = validatePhoneResponse.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("validation_type");
        abstractC13345e.purchase(abstractC3442e, validatePhoneResponse.vip);
        abstractC3442e.loadAd("validation_resend");
        abstractC13345e.purchase(abstractC3442e, validatePhoneResponse.metrica);
        abstractC3442e.loadAd("delay");
        int i = validatePhoneResponse.license;
        AbstractC13345e abstractC13345e2 = this.metrica;
        AbstractC8647e.subs(i, abstractC13345e2, abstractC3442e, "external_id");
        abstractC13345e.purchase(abstractC3442e, validatePhoneResponse.appmetrica);
        abstractC3442e.loadAd("phone");
        abstractC13345e.purchase(abstractC3442e, validatePhoneResponse.purchase);
        abstractC3442e.loadAd("masked_email");
        abstractC13345e.purchase(abstractC3442e, validatePhoneResponse.billing);
        abstractC3442e.loadAd("code_length");
        AbstractC8647e.subs(validatePhoneResponse.yandex, abstractC13345e2, abstractC3442e, "device_name");
        abstractC13345e.purchase(abstractC3442e, validatePhoneResponse.startapp);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ValidatePhoneResponse)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Set set = C3295e.f7451e;
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.metrica;
            AbstractC13345e abstractC13345e2 = this.vip;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    break;
                case 0:
                    obj = abstractC13345e2.vip(abstractC17080e);
                    i &= -2;
                    break;
                case 1:
                    obj2 = abstractC13345e2.vip(abstractC17080e);
                    i &= -3;
                    break;
                case 2:
                    obj3 = abstractC13345e2.vip(abstractC17080e);
                    i &= -5;
                    break;
                case 3:
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("delayBeforeNextCall", "delay", abstractC17080e, set);
                    } else {
                        i2 = ((Number) vip).intValue();
                    }
                    i &= -9;
                    break;
                case 4:
                    obj4 = abstractC13345e2.vip(abstractC17080e);
                    i &= -17;
                    break;
                case 5:
                    obj5 = abstractC13345e2.vip(abstractC17080e);
                    i &= -33;
                    break;
                case 6:
                    obj6 = abstractC13345e2.vip(abstractC17080e);
                    i &= -65;
                    break;
                case 7:
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("codeLength", "code_length", abstractC17080e, set);
                    } else {
                        i3 = ((Number) vip2).intValue();
                    }
                    i &= -129;
                    break;
                case 8:
                    obj7 = abstractC13345e2.vip(abstractC17080e);
                    i &= -257;
                    break;
            }
        }
        abstractC17080e.advert();
        if (set.size() != 0) {
            throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
        }
        Object obj8 = obj4;
        if (i == -512) {
            return new ValidatePhoneResponse((String) obj, (String) obj2, (String) obj3, i2, (String) obj8, (String) obj5, (String) obj6, i3, (String) obj7);
        }
        String str = (String) obj2;
        String str2 = (String) obj3;
        String str3 = (String) obj8;
        String str4 = (String) obj5;
        String str5 = (String) obj6;
        String str6 = (String) obj7;
        String str7 = (i & 1) != 0 ? null : (String) obj;
        String str8 = (i & 2) != 0 ? null : str;
        String str9 = (i & 4) != 0 ? null : str2;
        if ((i & 8) != 0) {
            i2 = 120;
        }
        return new ValidatePhoneResponse(str7, str8, str9, i2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? 0 : i3, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : str6);
    }
}
