package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC18453e;
import defpackage.AbstractC3442e;
import defpackage.C13664e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.AudioBookPerson;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemPhoto;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioBookPersonJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("description", "id", "name", "photo", "roles");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public AudioBookPersonJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "description");
        this.metrica = c14172e.vip(Integer.class, c3295e, "id");
        this.license = c14172e.vip(AbstractC18453e.purchase(List.class, CustomCatalogBlockItemPhoto.class), c3295e, "photo");
        this.appmetrica = c14172e.vip(AbstractC18453e.purchase(List.class, AudioBookPerson.AudioBookPersonRole.class), c3295e, "roles");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        AudioBookPerson audioBookPerson = (AudioBookPerson) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("description");
        String str = audioBookPerson.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("id");
        this.metrica.purchase(abstractC3442e, audioBookPerson.vip);
        abstractC3442e.loadAd("name");
        abstractC13345e.purchase(abstractC3442e, audioBookPerson.metrica);
        abstractC3442e.loadAd("photo");
        this.license.purchase(abstractC3442e, audioBookPerson.license);
        abstractC3442e.loadAd("roles");
        this.appmetrica.purchase(abstractC3442e, audioBookPerson.appmetrica);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioBookPerson)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        String str;
        List list;
        abstractC17080e.license();
        Set set = C3295e.f7451e;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        int i = -1;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends != -1) {
                AbstractC13345e abstractC13345e = this.vip;
                if (mo2308extends == 0) {
                    obj = abstractC13345e.vip(abstractC17080e);
                    i &= -2;
                } else if (mo2308extends == 1) {
                    obj2 = this.metrica.vip(abstractC17080e);
                    i &= -3;
                } else if (mo2308extends == 2) {
                    obj3 = abstractC13345e.vip(abstractC17080e);
                    i &= -5;
                } else if (mo2308extends == 3) {
                    Object vip = this.license.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("photo", "photo", abstractC17080e, set);
                    } else {
                        obj4 = vip;
                    }
                    i &= -9;
                } else if (mo2308extends == 4) {
                    Object vip2 = this.appmetrica.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("roles", "roles", abstractC17080e, set);
                    } else {
                        obj5 = vip2;
                    }
                    i &= -17;
                }
            } else {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            }
        }
        abstractC17080e.advert();
        if (set.size() != 0) {
            throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
        }
        if (i == -32) {
            return new AudioBookPerson((String) obj, (Integer) obj2, (String) obj3, (List) obj4, (List) obj5);
        }
        String str2 = (String) obj;
        Integer num = (Integer) obj2;
        String str3 = (String) obj3;
        List list2 = (List) obj4;
        List list3 = (List) obj5;
        if ((i & 1) != 0) {
            str2 = null;
        }
        Integer num2 = (i & 2) != 0 ? null : num;
        String str4 = (i & 4) != 0 ? null : str3;
        int i2 = i & 8;
        C13664e c13664e = C13664e.f27089e;
        if (i2 != 0) {
            list2 = c13664e;
        }
        if ((i & 16) != 0) {
            str = str2;
            list = c13664e;
        } else {
            str = str2;
            list = list3;
        }
        return new AudioBookPerson(str, num2, str4, list2, list);
    }
}
