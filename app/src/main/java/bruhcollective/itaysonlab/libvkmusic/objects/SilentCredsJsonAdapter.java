package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC1815e;
import defpackage.AbstractC3442e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SilentCredsJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("token", "first_name", "last_name", "ttl", "photo_50", "photo_100", "photo_200", "phone", "weight", "user_hash", "app_service_id");
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public SilentCredsJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "token");
        this.metrica = c14172e.vip(Integer.class, c3295e, "ttl");
        this.license = c14172e.vip(String.class, c3295e, "photo_50");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        SilentCreds silentCreds = (SilentCreds) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("token");
        String str = silentCreds.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("first_name");
        abstractC13345e.purchase(abstractC3442e, silentCreds.vip);
        abstractC3442e.loadAd("last_name");
        abstractC13345e.purchase(abstractC3442e, silentCreds.metrica);
        abstractC3442e.loadAd("ttl");
        Integer num = silentCreds.license;
        AbstractC13345e abstractC13345e2 = this.metrica;
        abstractC13345e2.purchase(abstractC3442e, num);
        abstractC3442e.loadAd("photo_50");
        String str2 = silentCreds.appmetrica;
        AbstractC13345e abstractC13345e3 = this.license;
        abstractC13345e3.purchase(abstractC3442e, str2);
        abstractC3442e.loadAd("photo_100");
        abstractC13345e3.purchase(abstractC3442e, silentCreds.purchase);
        abstractC3442e.loadAd("photo_200");
        abstractC13345e3.purchase(abstractC3442e, silentCreds.billing);
        abstractC3442e.loadAd("phone");
        abstractC13345e3.purchase(abstractC3442e, silentCreds.yandex);
        abstractC3442e.loadAd("weight");
        abstractC13345e2.purchase(abstractC3442e, silentCreds.startapp);
        abstractC3442e.loadAd("user_hash");
        abstractC13345e3.purchase(abstractC3442e, silentCreds.adcel);
        abstractC3442e.loadAd("app_service_id");
        abstractC13345e2.purchase(abstractC3442e, silentCreds.mopub);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SilentCreds)";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0042. Please report as an issue. */
    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Set set = C3295e.f7451e;
        int i = -1;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        boolean z3 = false;
        String str3 = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            boolean z4 = z;
            if (!abstractC17080e.Signature()) {
                boolean z5 = z2;
                String str4 = str;
                String str5 = str2;
                abstractC17080e.advert();
                if ((!z4) & (str4 == null)) {
                    set = AbstractC0869e.isPro("token", "token", abstractC17080e, set);
                }
                if ((!z5) & (str5 == null)) {
                    set = AbstractC0869e.isPro("first_name", "first_name", abstractC17080e, set);
                }
                if ((!z3) & (str3 == null)) {
                    set = AbstractC0869e.isPro("last_name", "last_name", abstractC17080e, set);
                }
                if (set.size() != 0) {
                    throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
                }
                if (i == -2041) {
                    return new SilentCreds(str4, str5, str3, (Integer) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (Integer) obj6, (String) obj7, (Integer) obj8);
                }
                return new SilentCreds(str4, str5, str3, (i & 8) != 0 ? 0 : (Integer) obj, (i & 16) != 0 ? null : (String) obj2, (i & 32) != 0 ? null : (String) obj3, (i & 64) != 0 ? null : (String) obj4, (i & 128) != 0 ? null : (String) obj5, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : (Integer) obj6, (i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? null : (String) obj7, (i & 1024) != 0 ? 0 : (Integer) obj8);
            }
            boolean z6 = z2;
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.vip;
            String str6 = str;
            AbstractC13345e abstractC13345e2 = this.metrica;
            String str7 = str2;
            AbstractC13345e abstractC13345e3 = this.license;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    z2 = z6;
                    z = z4;
                    str = str6;
                    str2 = str7;
                    break;
                case 0:
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("token", "token", abstractC17080e, set);
                        z2 = z6;
                        z = true;
                        str = str6;
                        str2 = str7;
                        break;
                    } else {
                        str = (String) vip;
                        z2 = z6;
                        z = z4;
                        str2 = str7;
                    }
                case 1:
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 != null) {
                        str2 = (String) vip2;
                        z2 = z6;
                        z = z4;
                        str = str6;
                        break;
                    } else {
                        set = AbstractC0869e.subs("first_name", "first_name", abstractC17080e, set);
                        z = z4;
                        z2 = true;
                        str = str6;
                        str2 = str7;
                        break;
                    }
                case 2:
                    Object vip3 = abstractC13345e.vip(abstractC17080e);
                    if (vip3 == null) {
                        set = AbstractC0869e.subs("last_name", "last_name", abstractC17080e, set);
                        z2 = z6;
                        z = z4;
                        z3 = true;
                        str = str6;
                        str2 = str7;
                        break;
                    } else {
                        str3 = (String) vip3;
                        z2 = z6;
                        z = z4;
                        str = str6;
                        str2 = str7;
                    }
                case 3:
                    obj = abstractC13345e2.vip(abstractC17080e);
                    i &= -9;
                    z2 = z6;
                    z = z4;
                    str = str6;
                    str2 = str7;
                    break;
                case 4:
                    obj2 = abstractC13345e3.vip(abstractC17080e);
                    i &= -17;
                    z2 = z6;
                    z = z4;
                    str = str6;
                    str2 = str7;
                    break;
                case 5:
                    obj3 = abstractC13345e3.vip(abstractC17080e);
                    i &= -33;
                    z2 = z6;
                    z = z4;
                    str = str6;
                    str2 = str7;
                    break;
                case 6:
                    obj4 = abstractC13345e3.vip(abstractC17080e);
                    i &= -65;
                    z2 = z6;
                    z = z4;
                    str = str6;
                    str2 = str7;
                    break;
                case 7:
                    obj5 = abstractC13345e3.vip(abstractC17080e);
                    i &= -129;
                    z2 = z6;
                    z = z4;
                    str = str6;
                    str2 = str7;
                    break;
                case 8:
                    obj6 = abstractC13345e2.vip(abstractC17080e);
                    i &= -257;
                    z2 = z6;
                    z = z4;
                    str = str6;
                    str2 = str7;
                    break;
                case 9:
                    obj7 = abstractC13345e3.vip(abstractC17080e);
                    i &= -513;
                    z2 = z6;
                    z = z4;
                    str = str6;
                    str2 = str7;
                    break;
                case 10:
                    obj8 = abstractC13345e2.vip(abstractC17080e);
                    i &= -1025;
                    z2 = z6;
                    z = z4;
                    str = str6;
                    str2 = str7;
                    break;
                default:
                    z2 = z6;
                    z = z4;
                    str = str6;
                    str2 = str7;
                    break;
            }
        }
    }
}
